package com.auros.model;

import java.util.List;
import lombok.Data;

@Data
public class KPacSet {
    private Long id;
    private String title;
    private List<KPac> kpacList;
}
