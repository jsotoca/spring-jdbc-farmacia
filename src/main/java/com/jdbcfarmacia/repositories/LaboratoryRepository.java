package com.jdbcfarmacia.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbcfarmacia.entities.Laboratory;

@Repository
public class LaboratoryRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Laboratory> findAll() {
        return jdbcTemplate.query(
                "select * from laboratorio",
                (rs, row) -> new Laboratory(
                		rs.getLong("id_laboratorio"),
                		rs.getString("nombre"),
                		rs.getBoolean("vigencia")
                )
        );
    }
	
}
