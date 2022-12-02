package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class AdminMapper implements RowMapper<Admin> {
	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException{
		Admin ad= new Admin();
		ad.setSeq(rs.getInt("seq"));
		ad.setItem(rs.getString("item"));
		ad.setItemcount(rs.getInt("itemcount"));
		ad.setDate(rs.getDate("date"));
		return ad;
	}

}
