package com.auros.service.impl;

import com.auros.dao.KPacKPacSetDao;
import com.auros.dao.KPacSetDao;
import com.auros.model.KPacSet;
import com.auros.service.KPacSetService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class KPacSetServiceImpl implements KPacSetService {
    private final KPacSetDao kpacSetDao;
    private final KPacKPacSetDao kpacKpacSetDao;

    public KPacSetServiceImpl(KPacSetDao kpacSetDao, KPacKPacSetDao kpacKpacSetDao) {
        this.kpacSetDao = kpacSetDao;
        this.kpacKpacSetDao = kpacKpacSetDao;
    }

    @Override
    public KPacSet create(KPacSet kpacSet) {
        kpacSet = kpacSetDao.create(kpacSet);
        if (kpacSet.getKpacList() != null) {
            kpacKpacSetDao.create(kpacSet);
        }
        return kpacSet;
    }

    @Override
    public List<KPacSet> getAll() {
        return kpacSetDao.getAll();
    }

    @Override
    public void delete(Long id) {
        kpacSetDao.delete(id);
    }

    @Override
    public KPacSet getById(Long id) {
        KPacSet kpacSet = kpacSetDao.getById(id);
        kpacSet.setKpacList(kpacKpacSetDao.getAllById(id));
        return kpacSet;
    }
}
