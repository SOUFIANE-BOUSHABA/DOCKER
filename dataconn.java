import java.sql.*;

public class dataconn {   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   final String DB_URL = "jdbc:mysql://db:3306/Employee";
   try{
      Class.forName("com.mysql.cj.jdbc.Driver");

      conn = DriverManager.getConnection(DB_URL,"root","123");

      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * FROM Employee.Employee_detail";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         int id  = rs.getInt("EmpID");
         String first = rs.getString("FirstName");
         String last = rs.getString("LastName");

         System.out.print("ID- " + id +", FirstName- " + first + ", LastName- " +last);
		 System.out.println();
      }
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }
 }
}