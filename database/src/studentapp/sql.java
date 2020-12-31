package studentapp;
import java.sql.*;


public class sql {
    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/student";
    static final String user = "root";
    static final String password = "zhx130113";
    public static void main(String[] args){
        try{
            Class.forName(driver);
            System.out.println("Connecting.........");
            Connection conn = DriverManager.getConnection(url,user,password);
            if(!conn.isClosed())
                System.out.println("succeeded connecting to the database！");
            Statement state = conn.createStatement();

            String sql = "select* from stu";

            ResultSet rs = state.executeQuery(sql);

            System.out.println("---------------");
            System.out.println("执行结果如下：");
            System.out.println("---------------");
        System.out.println("s_no "+"s_name "+"s_age "+"s_sex ");
            System.out.println("---------------");
            String name = null;
            while(rs.next()){
                name = rs.getString( "s_name");
                System.out.print(rs.getString("s_no") + " ");
                System.out.print(rs.getString("s_name") + " ");
                System.out.print(rs.getString("s_age") + " ");
                System.out.println(rs.getString("s_sex") + " ");

            }
            rs.close();
            conn.close();
        }catch (ClassNotFoundException e ){
            System.out.println("Sorry,can't find driver");
            e.printStackTrace();

        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
