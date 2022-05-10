package com.auros.service;

import com.auros.model.KPac;
import java.util.List;

public interface KPacService {
    List<KPac> getAll();

    KPac creat(KPac kpac);

    void delete(Long id);
}
