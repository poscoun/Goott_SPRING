package spring_app05_maven;

import java.sql.Connection;

public interface CommonDAO {
	public Connection connect();
	public void selectAll();
}
