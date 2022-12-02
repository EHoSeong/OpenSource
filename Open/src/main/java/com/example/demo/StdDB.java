package com.example.demo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StdDB {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public void create(Student std) {
		String sql = "INSERT INTO info (stdnum, name, phonenum) values (?, ?, ?)";
		jdbcTemplate.update(sql, std.getStdnum(), std.getName(), std.getPhonenum());
	}
	public List<Student> select() {
		String sql = "select * from info";
		List<Student> std = jdbcTemplate.query(sql, new StdMapper());
		System.out.println("select값 :" + std);
		
		return std;
	}
	
	public Student select(int seq) {
		String sql = "select * from info where seq=?";
		
		Student std = jdbcTemplate.queryForObject(sql, new StdMapper(), seq);
		System.out.println("select 값 : " + std);
		
		return std;
	}
	public Student select(String stdnum) {
		String sql = "select * from info where stdnum=?";
		
		Student std = jdbcTemplate.queryForObject(sql, new StdMapper(), stdnum);
		System.out.println("select 값 : " + std);
		
		return std;
	}

	public int delete(int seq) {
		String sql = "delete from student where seq=?";
		return jdbcTemplate.update(sql,seq);
	}
}
