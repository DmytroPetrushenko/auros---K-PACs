package com.auros.dao.mapper;

import com.auros.model.KPac;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class KPacRowMapper implements RowMapper<KPac> {
    @Override
    public KPac mapRow(ResultSet rs, int rowNum) throws SQLException {
        KPac kpac = new KPac();
        kpac.setId(rs.getLong("id"));
        kpac.setTitle(rs.getString("title"));
        kpac.setDescription(rs.getString("description"));
        kpac.setCreationDate(rs.getString("creationDate"));
        return kpac;
    }
}
