package Test_Sub1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

public class ButtonApasat implements ActionListener {
	
	JTextField textfi;
	public ButtonApasat(JTextField textfield1) {
		// TODO Auto-generated constructor stub
		this.textfi = textfield1;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		
		try {
			String url = "jdbc:mysql://localhost:3306/work";
			Connection con;
			con = DriverManager.getConnection(url, "root", "root");
			Statement sql;
			sql = (Statement)con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs;
			rs = sql.executeQuery("select * from restaurante");
			String nume = textfi.getText();
			
			while(rs.next())
			{
				if(nume.equals(rs.getString("Denumire")))
					rs.deleteRow();
				
			}
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
