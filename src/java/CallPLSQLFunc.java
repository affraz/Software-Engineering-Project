import com.mysql.jdbc.PreparedStatement;
import java.sql.*;


public class CallPLSQLFunc {

   // final static String driverClass    = "oracle.jdbc.driver.OracleDriver";
    final static String driverClass    = "com.mysql.jdbc.Driver";
    //final static String connectionURL  = "jdbc:oracle:thin:@localhost:1521:project";
    final static String connectionURL= "jdbc:mysql://localhost:3306/project";
    final static String userID         = "root";
    final static String userPassword   = "jalil123";
    Connection   con  = null;


    /**
     * Construct a CallPLSQLFunc object. This constructor will create an Oracle
     * database connection.
     */
    public CallPLSQLFunc() throws SQLException, ClassNotFoundException {

       // try {

            System.out.print("  Loading JDBC Driver  -> " + driverClass + "\n");
            Class.forName(driverClass);//.newInstance();

            System.out.print("  Connecting to        -> " + connectionURL + "\n");
            this.con = DriverManager.getConnection(connectionURL, userID, userPassword);
            System.out.print("  Connected as         -> " + userID + "\n\n");

    }


    /**
     * Method to call the PL/SQL function "get_employee_salary"
     */
    public void performFuncCall() {

        CallableStatement cstmt = null;
        double monthlySalary;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call get_employee_salary(?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setInt(2, 1001);
            cstmt.execute();
            monthlySalary = cstmt.getDouble(1);
            cstmt.close();
            
            System.out.println("  Monthly salary is $" + monthlySalary + ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

       public void addDocFuncCall(long number,int type, String name,
               String address,String gender,String special,String designation,String depart) {
          
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_adddoc(?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.setString(4, name);
            cstmt.setString(5, address);
            cstmt.setString(6, gender);
            cstmt.setString(7, special);
            cstmt.setString(8, designation);
            cstmt.setString(9, depart);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
       
    public void addPatient(long number, String disease,
               String description) {
        
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_addPatient(?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setString(3, disease);
            cstmt.setString(4, description);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
     
    
    //// to be checked. why is duration in Date??
    public void addPregnancy(long number, int stage,String duration){
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_addPregnancy(?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, stage);
            cstmt.setString(4, duration);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void addPublicUserForm(long number, int type,String name,String gender,
       String address,String maritalStatus,String bGroup,int my_age,String bDate
       ,String Edate,String Categ,String aller,boolean PatFlag,boolean pregFlag
       ,boolean vacFlag){
        
        
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_addPublicUserForm(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.setString(4, name);
            cstmt.setString(5, gender);
            cstmt.setString(6, address);
            cstmt.setString(7, maritalStatus);
            cstmt.setString(8, bGroup);
            cstmt.setInt(9, my_age);
            cstmt.setString(10, bDate);
            cstmt.setString(11, Edate);
            cstmt.setString(12, Categ);
            cstmt.setString(13, aller);
            cstmt.setBoolean(14, PatFlag);
            cstmt.setBoolean(15, pregFlag);
            cstmt.setBoolean(16, vacFlag);
            
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void addPublicUserSMS(long number, int type){
        
        
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            //cstmt = con.prepareCall("{? = call fun_addPublicUserSMS(?,?)}");
            cstmt = con.prepareCall("{? = call fun_addPublicUserSMS(?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
     public void addStaff(long number,int type, String name,
               String gender,String address,String designation,String depart) {
          
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_addStaff(?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.setString(4, name);
            cstmt.setString(5, gender);
            cstmt.setString(6, address);
            cstmt.setString(7, designation);
            cstmt.setString(8, depart);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
      public void addVaccination(long number,String polio, String measles,
               String tb) {
            
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_addVaccination(?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setString(3, polio);
            cstmt.setString(4, measles);
            cstmt.setString(5, tb);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
      
    public void updateDoc(long number,int type, String name,
               String address,String gender,String special,String designation,String depart) {
          
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_updateDoctor(?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.setString(4, name);
            cstmt.setString(5, address);
            cstmt.setString(6, gender);
            cstmt.setString(7, special);
            cstmt.setString(8, designation);
            cstmt.setString(9, depart);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void updatePatient(long number, String disease,
               String description) {
        
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_updatePatient(?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setString(3, disease);
            cstmt.setString(4, description);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void updatePregnancy(long number, int stage,String duration){
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_updatePregnancy(?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, stage);
            cstmt.setString(4, duration);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
    public void updatePublicUser(long number, int type,String name,String gender,
       String address,String maritalStatus,String bGroup,int my_age,String bDate
       ,String Edate,String Categ,String aller,boolean PatFlag,boolean pregFlag
       ,boolean vacFlag){
        
        
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_updatePublicUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.setString(4, name);
            cstmt.setString(5, gender);
            cstmt.setString(6, address);
            cstmt.setString(7, maritalStatus);
            cstmt.setString(8, bGroup);
            cstmt.setInt(9, my_age);
            cstmt.setString(10, bDate);
            cstmt.setString(11, Edate);
            cstmt.setString(12, Categ);
            cstmt.setString(13, aller);
            cstmt.setBoolean(14, PatFlag);
            cstmt.setBoolean(15, pregFlag);
            cstmt.setBoolean(16, vacFlag);
            
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    
     public void updateStaff(long number,int type, String name,
               String gender,String address,String designation,String depart) {
          
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_updateStaff(?,?,?,?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setInt(3, type);
            cstmt.setString(4, name);
            cstmt.setString(5, gender);
            cstmt.setString(6, address);
            cstmt.setString(7, designation);
            cstmt.setString(8, depart);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
     
     public void updateVaccination(long number,String polio, String measles,
               String tb) {
            
        CallableStatement cstmt = null;
        int result;

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            cstmt = con.prepareCall("{? = call fun_updateVaccination(?,?,?,?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setLong(2, number);
            cstmt.setString(3, polio);
            cstmt.setString(4, measles);
            cstmt.setString(5, tb);
            cstmt.execute();
            result = cstmt.getInt(1);
            cstmt.close();
            
            System.out.println("result of Operation is: " + result+ ".\n");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
     
     public void SaveSMS(long number,String message,int tag) {

        try {

            // -------------------------------------------------------------
            // Call PL/SQL Function to retrieve an employee’s monthly salary
            // -------------------------------------------------------------
            java.sql.PreparedStatement pstmt = null;
            ResultSet result = null;
            pstmt = con.prepareStatement("Insert into project.outgoingmessage "
                + "Values(?,?,?) ");
            pstmt.setLong(1, number);
            pstmt.setString(2, message);
            pstmt.setInt(3, tag);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
     
     
    
    /**
     * Close down Oracle connection.
     */
    public void closeConnection() {

        try {
            System.out.print("  Closing Connection...\n");
            con.close();
            
        } catch (SQLException e) {
        
            e.printStackTrace();
            
        }

    }


    /**
     * Sole entry point to the class and application.
     * @param args Array of String arguments.
     * @exception java.lang.InterruptedException
     *            Thrown from the Thread class.
     */
  /*  public static void main(String[] args)
            throws java.lang.InterruptedException, SQLException, ClassNotFoundException {

        CallPLSQLFunc mainPrg = new CallPLSQLFunc();
       // mainPrg.addPublicUserForm(111,3,"jalil",null,
        //            "LUMS Pakistan", null, "B+",24,null
       //             ,null,"General","None",true
         //           ,true,true);
        mainPrg.SaveSMS(12345, "Hey How Are You");
                    mainPrg.closeConnection();

    }*/

}

