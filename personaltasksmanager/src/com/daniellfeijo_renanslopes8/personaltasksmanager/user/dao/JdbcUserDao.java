package com.daniellfeijo_renanslopes8.personaltasksmanager.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.daniellfeijo_renanslopes8.personaltasksmanager.user.model.Users;

@Repository
public class JdbcUserDao {
	private final Connection connection;

	@Inject
	public JdbcUserDao(DataSource dataSource) {
		try {
			this.connection = dataSource.getConnection();
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}

	
	public boolean existUser(Users user) {
		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from users where login = ? and password = ?");
			stmt.setString(1, user.getLogin());
			stmt.setString(2, user.getPassword());
			
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				rs.close();
				stmt.close();
				return true;
			}
			rs.close();
			stmt.close();
			return false;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


}
