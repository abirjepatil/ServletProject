// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

// Extend HttpServlet class
public class WebService extends HttpServlet {
 
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
	    String title = "Using GET Method to Read Form Data";
      String docType =
      "<!doctype html public \"-//w3c//dtd html 4.0 " +
      "transitional//en\">\n";
      
      // JDBC driver name and database URL
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost/ajay";

   //  Database credentials
    final String USER = "root";
    final String PASS = "root";
     Connection conn = null;
    Statement stmt = null;
    try{
       //STEP 2: Register JDBC driver
       Class.forName("com.mysql.jdbc.Driver");

       //STEP 3: Open a connection
       System.out.println("Connecting to a selected database...");
       conn = DriverManager.getConnection(DB_URL, USER, PASS);
       System.out.println("Connected database successfully...");
       
       //STEP 4: Execute a query
       System.out.println("Creating statement...");
       stmt = conn.createStatement();

       String sql = "SELECT * FROM tbl_users";
       ResultSet rs = stmt.executeQuery(sql);
       //STEP 5: Extract data from result set
       out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "</body></html>");
        out.println("<center><table border='1'>");
       while(rs.next()){
          //Retrieve by column name
          String firstName  = rs.getString("firstName");
          String lastName = rs.getString("lastName");
          int phoneNo = rs.getInt("phoneNo");
          String address = rs.getString("address");

          //Display values
          out.println("<tr>");
          out.println("<td>");
          out.print("\t" + firstName);
           out.println("</td>");
                    out.println("<td>");
          out.print("\t" + lastName);
                   out.println("</td>");
                            out.println("<td>");

          out.print("\t" + phoneNo);
                   out.println("</td>");
                            out.println("<td>");
          out.println("\t" + address);
                   out.println("</td>");
          out.println("</br>");
          out.println("</tr>");
       }

       out.println("</table></center>");
       rs.close();
    }catch(SQLException se){
       //Handle errors for JDBC
       se.printStackTrace();
    }catch(Exception e){
       //Handle errors for Class.forName
       e.printStackTrace();
    }finally{
       //finally block used to close resources
       try{
          if(stmt!=null)
             conn.close();
       }catch(SQLException se){
       }// do nothing
       try{
          if(conn!=null)
             conn.close();
       }catch(SQLException se){
          se.printStackTrace();
       }//end finally try
    }//end try
    System.out.println("Goodbye!");
  
  }

   // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }
/*
    public void Connect()
  {
  // JDBC driver name and database URL
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost/ajay";

   //  Database credentials
    final String USER = "root";
    final String PASS = "root";
     Connection conn = null;
    Statement stmt = null;
    try{
       //STEP 2: Register JDBC driver
       Class.forName("com.mysql.jdbc.Driver");

       //STEP 3: Open a connection
       System.out.println("Connecting to a selected database...");
       conn = DriverManager.getConnection(DB_URL, USER, PASS);
       System.out.println("Connected database successfully...");
       
       //STEP 4: Execute a query
       System.out.println("Creating statement...");
       stmt = conn.createStatement();

       String sql = "SELECT * FROM tbl_users";
       ResultSet rs = stmt.executeQuery(sql);
       //STEP 5: Extract data from result set
       while(rs.next()){
          //Retrieve by column name
          String firstName  = rs.getString("firstName");
          String lastName = rs.getString("lastName");
          int phoneNo = rs.getInt("phoneNo");
          String address = rs.getString("address");

          //Display values
          out.print("First Name: " + firstName);
          out.print(", Last Name: " + lastName);
          out.print(", Phone Number: " + phoneNo);
          out.println(", Address: " + address);
       }
       rs.close();
    }catch(SQLException se){
       //Handle errors for JDBC
       se.printStackTrace();
    }catch(Exception e){
       //Handle errors for Class.forName
       e.printStackTrace();
    }finally{
       //finally block used to close resources
       try{
          if(stmt!=null)
             conn.close();
       }catch(SQLException se){
       }// do nothing
       try{
          if(conn!=null)
             conn.close();
       }catch(SQLException se){
          se.printStackTrace();
       }//end finally try
    }//end try
    System.out.println("Goodbye!");
    
  }*/


}