package com.auros.service.impl;

import com.auros.dao.KPacDao;
import com.auros.model.KPac;
import com.auros.service.KPacService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class KPacServiceImpl implements KPacService {
    private final KPacDao kpacDao;

    public KPacServiceImpl(KPacDao kpacDao) {
        this.kpacDao = kpacDao;
    }

    @Override
    public List<KPac> getAll() {
        return kpacDao.getAll();
    }

    @Override
    public KPac creat(KPac kpac) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        kpac.setCreationDate(formatter.format(LocalDate.now()));
        return kpacDao.create(kpac);
    }

    @Override
    public void delete(Long id) {
        kpacDao.delete(id);
    }
}
