package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int insert(Student student) {
	  	//Insert Query
    	String query = "Insert into tblStudent(name,address)Values(?,?)";
    	int r = this.jdbcTemplate.update(query, student.getName(), student.getAddress());
		return r;
	}



}
