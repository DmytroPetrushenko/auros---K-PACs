package com.auros.dao;

import com.auros.model.KPac;
import java.util.List;

public interface KPacDao {
    List<KPac> getAll();

    KPac create(KPac kpac);

    void delete(Long id);
}
