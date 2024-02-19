//Challenge

/*A table called book is created with the following DDL command:
create table book(id int, name varchar(20), author varchar(20), publishedyear int);
Write the Java code using JDBC APIs to select the name and author for
each book whose publishedyear is NOT equal to 2009.
Note:
The order of the columns in the result set must be name and author.
The result set must be ordered by the column name in ascending order.
IMPORTANT:
1. Place your code inside the execute method. You need not code/implement the main method.
2. DO NOT close the Database Connection conn in your code
*/

//Solution

import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; import java.sql.SQLException; 
import java.util.Scanner; 
public class Hello 
{ 
  public static void execute(Connection conn, Scanner sc) { 
    try{
        String sql="SELECT name, author FROM book where publishedyear!=2009 ORDER BY name ASC";
        PreparedStatement statement=conn.prepareStatement(sql);
        ResultSet resultSet=statement.executeQuery();
        while(resultSet.next()){
          String name=resultSet.getString("name");
          String author=resultSet.getString("author");
          System.out.println(name+" "+author);
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
  }//end of execute method 
}//end of Hello class
