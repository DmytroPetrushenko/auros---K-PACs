package com.auros.convertor;

import com.auros.model.KPac;
import java.beans.PropertyEditorSupport;
import java.util.List;

public class KPacEditor extends PropertyEditorSupport {
    private final List<KPac> kpacList;

    public KPacEditor(List<KPac> kpacList) {
        this.kpacList = kpacList;
    }

    @Override
    public void setAsText(String id) throws IllegalArgumentException {
        KPac kpac;
        for (KPac element: kpacList) {
            if (element.getId() == Long.parseLong(id)) {
                this.setValue(element);
                return;
            }
        }
        this.setValue(null);
    }
}
