package com.auros.service;

import com.auros.model.KPacSet;
import java.util.List;

public interface KPacSetService {
    KPacSet create(KPacSet kpacSet);

    List<KPacSet> getAll();

    void delete(Long id);

    KPacSet getById(Long kpacSetId);
}
