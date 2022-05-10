package com.auros.dao.impl;

import com.auros.dao.KPacSetDao;
import com.auros.dao.mapper.KPacSetRowMapper;
import com.auros.model.KPacSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class KPacSetDaoImpl implements KPacSetDao {
    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    public KPacSetDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public KPacSet create(KPacSet kpacSet) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "INSERT INTO k_pac_set (title) VALUES (?);";
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, kpacSet.getTitle());
            return ps;
        }, keyHolder);
        kpacSet.setId(Objects.requireNonNull(keyHolder.getKey()).longValue());
        return kpacSet;
    }

    @Override
    public List<KPacSet> getAll() {
        return jdbcTemplate.query("SELECT * FROM k_pac_set", new KPacSetRowMapper());
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM k_pac_set WHERE id = ?;", id);
    }

    @Override
    public KPacSet getById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM k_pac_set WHERE id = ?;",
                new Object[] {id}, new KPacSetRowMapper());
    }
}
