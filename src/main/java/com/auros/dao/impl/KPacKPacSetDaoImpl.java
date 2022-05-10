package com.auros.dao.impl;

import com.auros.dao.KPacKPacSetDao;
import com.auros.dao.mapper.KPacRowMapper;
import com.auros.model.KPac;
import com.auros.model.KPacSet;
import java.util.List;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class KPacKPacSetDaoImpl implements KPacKPacSetDao {
    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    public KPacKPacSetDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(KPacSet kpacSet) {
        String query = "INSERT INTO k_pac_k_pac_set (kPacId, kPacSetId) VALUES (?, ?);";
        List<Long> kpacIdList = kpacSet.getKpacList().stream()
                .map(KPac::getId)
                .collect(Collectors.toList());
        Long kpacSetId = kpacSet.getId();
        for (Long kpacId: kpacIdList) {
            jdbcTemplate.update(query, kpacId, kpacSetId);
        }
    }

    @Override
    public List<KPac> getAllById(Long id) {
        return jdbcTemplate.query("SELECT kp.id AS id, kp.title AS title, "
                        + "kp.description AS description, kp.creationDate AS creationDate "
                        + "FROM k_pac_k_pac_set kpkps JOIN k_pac kp on kp.id = kpkps.kPacId "
                        + "WHERE kPacSetId = ?;",
                new Object[] {id}, new KPacRowMapper());
    }

}
