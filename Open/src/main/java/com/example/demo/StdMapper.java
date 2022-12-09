package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class StdMapper implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
		Student std = new Student();
		std.setSeq(rs.getInt("seq"));
		std.setItemname(rs.getString("itemname"));
		std.setStdnum(rs.getString("stdnum"));
		std.setName(rs.getString("name"));
		std.setPhonenum(rs.getString("phonenum"));
		std.setDate(rs.getDate("date"));
		return std;
	}

}
