package com.example.demo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AdminDB {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public void create(Admin ad) {
		String sql = "INSERT INTO admin (item, itemcount) values (?, ?)";
		jdbcTemplate.update(sql, ad.getItem(), ad.getItemcount());
	}
	public List<Admin> select() {
		String sql = "select * from admin";
		List<Admin> ad = jdbcTemplate.query(sql, new AdminMapper());
		System.out.println("select값 :" + ad);
		
		return ad;
	}
	public Admin select(int seq) {
		String sql = "select * from admin where seq=?";
		
		Admin ad = jdbcTemplate.queryForObject(sql, new AdminMapper(), seq);
		System.out.println("select 값 : " + ad);
		
		return ad;
	}
	public int delete(int seq) {
		String sql = "delete from admin where seq=?";
		return jdbcTemplate.update(sql,seq);
	}
	
}
