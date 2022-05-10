package com.auros.dao.mapper;

import com.auros.model.KPacSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class KPacSetRowMapper implements RowMapper<KPacSet> {
    @Override
    public KPacSet mapRow(ResultSet rs, int rowNum) throws SQLException {
        KPacSet kpacSet = new KPacSet();
        kpacSet.setId(rs.getLong("id"));
        kpacSet.setTitle(rs.getString("title"));
        return kpacSet;
    }
}
