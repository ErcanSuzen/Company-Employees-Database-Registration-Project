
import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ERCAN
 */
public class EmployeeOperations {
    private Connection con=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Employee> employeesfill(){
        ArrayList<Employee> output= new ArrayList<Employee>();
        try {
            statement =con.createStatement();
             String query = "select * from calisanlar";
             ResultSet rs = (ResultSet) statement.executeQuery(query);
             while (rs.next()) {
                 int id = rs.getInt("id");
                 String name = rs.getString("name");
                 String surname= rs.getString("surname");
                 String department = rs.getString("department");
                 String salary = rs.getString("salary");
                      
                 output.add(new Employee(id,name,surname,department,salary));
             }
             return output;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
     public void deleteEmployee(int id){
         String query = " Delete from calisanlar where id = ?";
         
        try {
            preparedStatement=con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    public void updateEmployee(int id, String new_name, String new_surname, String new_department, String new_salary){
        String query = "Update calisanlar set name = ? , surname = ?, department = ?, salary = ? where id = ? ";
        try {
            preparedStatement =con.prepareStatement(query);
            
            preparedStatement.setString(1, new_name);
            preparedStatement.setString(2, new_surname);
            preparedStatement.setString(3, new_department);
            preparedStatement.setString(4, new_salary);
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void employeeAdd(String name, String surname, String department, String salary){
        String query = "Insert into calisanlar (name, surname, department, salary) Values (?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, department);
            preparedStatement.setString(4, salary);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public boolean login(String username, String password){
        String query = "Select * from adminler where username = ? and password = ?";
        try {
            preparedStatement=con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = (ResultSet) preparedStatement.executeQuery();
            return rs.next();
            }
        catch (SQLException ex) {
            Logger.getLogger(EmployeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}


    public EmployeeOperations() {
        String url="jdbc:mysql://" + Database.host +":"+Database.port + "/" +Database.databaseName ;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver not found");
        }
        
        try{
            con = DriverManager.getConnection(url,Database.username, Database.password);
       
        }
        catch (SQLException ex){
            System.out.println("Connection failed");
        }
    }
    public static void main(String[] args) {
        EmployeeOperations employeeOperations = new EmployeeOperations();
    }
    
}
