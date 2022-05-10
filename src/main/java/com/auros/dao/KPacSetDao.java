package com.auros.dao;

import com.auros.model.KPacSet;
import java.util.List;

public interface KPacSetDao {
    KPacSet create(KPacSet kpacSet);

    List<KPacSet> getAll();

    void delete(Long id);

    KPacSet getById(Long id);
}
