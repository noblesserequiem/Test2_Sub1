package Test_Sub1;

import java.sql.*;
import java.util.*;

import javax.swing.*;


public class MainApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Collection<Local> lista_restaurante = new Vector<Local>();
		String url = "jdbc:mysql://localhost:3306/work";
		Connection con = DriverManager.getConnection(url, "root", "root");
		Statement sql;
		sql = (Statement)con.createStatement();
		ResultSet rs;
		rs = sql.executeQuery("select * from restaurante");
		while(rs.next())
		{
			Local obj = new Local(rs.getString("Denumire"), rs.getString("Specificul"), rs.getString("Zona"));
			lista_restaurante.add(obj);
		}
		
		JFrame myframe = new Fereastra("Aplicatie", lista_restaurante);
		myframe.setVisible(true);
	}

}
