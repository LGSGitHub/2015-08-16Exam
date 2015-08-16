package com.hand.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl {

	public boolean isExist(Connection conn, String first_name) {
		PreparedStatement ps;
		ResultSet rs;
		try {

			ps = conn.prepareStatement("select * from customer where first_name=?");
			ps.setString(1, first_name);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
