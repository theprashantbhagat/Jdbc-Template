package com.kmrl.transit.controller;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		 User user = new User();
		 user.setUser_Id(rs.getString("user_id"));
	       user.setUser_email(rs.getString("user_email"));
	       user.setUser_about(rs.getString("user_about"));
	       user.setUser_gender(rs.getString("user_gender"));
	       user.setUser_image_name(rs.getString("user_image_name"));
	       user.setUser_name(rs.getString("user_name"));
	       user.setUser_password(rs.getString("user_password"));
	        return user;
	}

}
