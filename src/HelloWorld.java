import java.sql.*;
public class HelloWorld {
	
	
	
	
	private static final String url = "jdbc:mysql://localhost:3306/demo";
	
	private static final String username = "root";
	
	private static final String password = "Lalitmysql21";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
//		try {
//			Connection connection = DriverManager.getConnection(url, username, password);
//			Statement statement = connection.createStatement();
//			String Query = "SELECT * FROM studentdemo";
//			ResultSet resultset = statement.executeQuery(Query);
//			while(resultset.next()) {
//				int ID = resultset.getInt("ID");
//				String Name = resultset.getString("Name");
//				int RollNo = resultset.getInt("RollNo");
//				int MobileNo = resultset.getInt("MobileNo");
//				String City = resultset.getString("City");
//				String Field = resultset.getString("Field");
//				
//				System.out.println("Id : " + ID);
//				System.out.println("Name : " + Name);
//				System.out.println("RollNo : "+ RollNo);
//				System.out.println("MobileNo : " + MobileNo);
//				System.out.println("City : " + City);
//				System.out.println("Field : " + Field);	
//			}
//		}catch(SQLException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stem = con.createStatement();
			String query = String.format("INSERT INTO studentdemo(ID, Name, RollNo, MobileNo, City, Field)"
					+ " VALUES(%o, '%s', %o, %o, '%s', '%s')", 02, "Aashish", 9, 99, "Shirpur", "ETC");   
			int rowsAffected = stem.executeUpdate(query);
			if(rowsAffected > 0) {
				System.out.println("DATA INSERTED SUCCESSFULLY");
			}else {
				System.out.println("DATA NOT INSERTED");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String Query = "SELECT * FROM studentdemo";
			ResultSet resultset = statement.executeQuery(Query);
			while(resultset.next()) {
				int ID = resultset.getInt("ID");
				String Name = resultset.getString("Name");
				int RollNo = resultset.getInt("RollNo");
				int MobileNo = resultset.getInt("MobileNo");
				String City = resultset.getString("City");
				String Field = resultset.getString("Field");
				
				System.out.println("Id : " + ID);
				System.out.println("Name : " + Name);
				System.out.println("RollNo : "+ RollNo);
				System.out.println("MobileNo : " + MobileNo);
				System.out.println("City : " + City);
				System.out.println("Field : " + Field);	
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
