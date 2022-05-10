package com.auros.dao;

import com.auros.model.KPac;
import com.auros.model.KPacSet;
import java.util.List;

public interface KPacKPacSetDao {
    void create(KPacSet kpacSet);

    List<KPac> getAllById(Long id);
}
