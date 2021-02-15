package com.teja.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.teja.bean.userdetails;




public class dao {
	JdbcTemplate template; 
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 
	
	public int register(userdetails p) {
		String sql = "insert into userdata values(?,?,?,)";

	    return template.update(sql, new Object[] {p.getUsername(), p.getPassword(), p.getEmail()});
	    
	}
	
	public userdetails validateUser(userdetails login) {
		// TODO Auto-generated method stub
		 String sql = "select * from userdata where username='" + login.getUsername() + "' and password='" + login.getPassword()
	        + "'";
	    List<userdetails> users = template.query(sql,  new userMapper());

	    return users.size() > 0 ? users.get(0) : null;
		
	}
	
	public class userMapper implements RowMapper<userdetails> {

		  public userdetails mapRow(ResultSet rs, int arg1) throws SQLException {
		    userdetails user = new userdetails();

		    user.setUsername(rs.getString("username"));
		    user.setPassword(rs.getString("password"));
		    user.setEmail(rs.getString("email"));
		    return user;
		  }
	}
}
