
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpDBHandler {
    
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj", "root", "root");
        
        }catch(ClassNotFoundException | SQLException e){System.out.println(e);}  
        return con;  
    }  
    public static int AddEmp(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into employee(id,employee_firstname,employee_lastname,is_active,employee_email) values (?,?,?,?,?)");  
            ps.setInt(1,e.getId());  
            ps.setString(2,e.getFirstName());  
            ps.setString(3,e.getLastName());  
            ps.setInt(4,e.getIsActive());  
              ps.setString(5,e.getEmail());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update employee set employee_firstname=?,employee_lastname=?,is_active=?,employee_email=? where id=?");  
           ps.setInt(1,e.getId());  
            ps.setString(2,e.getFirstName());  
            ps.setString(3,e.getLastName());  
            ps.setInt(4,e.getIsActive());  
              ps.setString(5,e.getEmail());  
              
            status=ps.executeUpdate();  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=EmpDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from employee where id=?");  
            ps.setInt(0,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Emp getEmployeeById(int id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee where id=?");  
            ps.setInt(0,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
              ps.setInt(1,e.getId());  
            ps.setString(2,e.getFirstName());  
            ps.setString(3,e.getLastName());  
            ps.setInt(4,e.getIsActive());  
              ps.setString(5,e.getEmail()); 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                ps.setInt(1,e.getId());  
            ps.setString(2,e.getFirstName());  
            ps.setString(3,e.getLastName());  
            ps.setInt(4,e.getIsActive());  
            ps.setString(5,e.getEmail()); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }

  
}

