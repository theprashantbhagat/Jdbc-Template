package com.kmrl.transit.controller;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




	@RestController
	@RequestMapping("/api")
	public class UserController {
		
		 @Autowired
		    @Qualifier("jdbcTemplate1")
		    private JdbcTemplate jdbcTemplate1;

		    @Autowired
		    @Qualifier("jdbcTemplate2")
		    private JdbcTemplate jdbcTemplate2;

		@GetMapping("/hello")
		public String getMessage() {
			return "hello message";
		}
		
//		@Autowired
//	    private JdbcTemplate jdbcTemplate;

		@GetMapping("/your-endpoint1")
		public List<User> yourEndpoint1() {
			//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource1);
		    List<User> users = jdbcTemplate1.query("SELECT * FROM users", new UserRowMapper());
		    return users;
		}
		@GetMapping("/your-endpoint2")
		public List<Map<String, Object>> yourEndpoint2() {
			//JdbcTemplate jdbcTemplate1 = new JdbcTemplate(dataSource2);
		     List<Map<String, Object>> list = jdbcTemplate2.queryForList("SELECT * FROM products");
		    return list;
		}
		
		/*
		 * @GetMapping("/your-endpoint1") public List<User>
		 * yourEndpoint1(@RequestParam("Id") String Id,
		 * 
		 * @RequestParam("Name") String Name ) { // Execute your SQL query with input
		 * parameters String query =
		 * "SELECT * FROM users WHERE user_Id =? and user_name=?"; List<User> users =
		 * jdbcTemplate.query(query, new Object[]{Id, Name}, new UserRowMapper());
		 * return users; }
		 */

		
}
