

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    @PersistenceUnit
    EntityManagerFactory emf;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if (request.getParameter("page_id").equals("signin") || request.getParameter("page_id").equals("signinfailed")) {
                String userName = request.getParameter("user_name");
                String password = request.getParameter("password");
                SignInManager signinManager = new SignInManager();
                if (signinManager.validate(userName, password)) {
                    response.sendRedirect("admin.jsp");
                } else {
                    response.sendRedirect("form/fail.jsp");
                }
            } else if (request.getParameter("page_id").equals("registration")) {
                
                String firstName = request.getParameter("first_name");
                
                String lastName = request.getParameter("last_name");
                String name = firstName+" "+lastName;
                
                String gender = request.getParameter("gender");
                
                String age = request.getParameter("age");
                
                String maritalStatus = request.getParameter("marital_status");
                
                String childernsNumber = request.getParameter("childerns_number");
                
                String addressLine1 = request.getParameter("address_line1");
                
                String addressLine2 = request.getParameter("address_line2");
                String address = addressLine1+ " " + addressLine2;
                
                String city = request.getParameter("city");
                
                String spr = request.getParameter("state_province_region");
                
                String zp = request.getParameter("zip_postal");
                
                String country = request.getParameter("country");
                
                String nic = request.getParameter("NIC");
                
                String bloodGroup = request.getParameter("blood_group");
                
                String mobile = request.getParameter("mobile");
                
                String vaccination = request.getParameter("vaccination");
                
                String smoking = request.getParameter("smoking");
                
                String drinking = request.getParameter("drinking");
                
                String otherDrugs = request.getParameter("other_drougs");
                
                String allergies = request.getParameter("allergies");
                
                String pregnant = request.getParameter("pragnant");
                
                String pragnancyDuration = request.getParameter("pragnancy_duration");
                
                String pragnancyStage = request.getParameter("pragnancy_stage");
                
                String chronicDisease = request.getParameter("chronic_disease");
                
                String contagiousDisease = request.getParameter("contagious_disease");
                
                String genderDisorder = request.getParameter("gender_disorder");
                
                String termsAcception = request.getParameter("terms_acception");
                
                String signature = request.getParameter("signature");
                
                RegistrationManager regManager = new RegistrationManager();
                
                CallPLSQLFunc mainPrg = new CallPLSQLFunc();
                 mainPrg.addPublicUserForm(Integer.parseInt(mobile),3,name,gender,
                    address,maritalStatus, bloodGroup,Integer.parseInt(age),null
                    ,null,"General",allergies,true
                    ,false,true);
                    mainPrg.closeConnection();
                
                    out.println("<html>");
                    out.println("<h2>User Has Been Registered </h2>");
                    out.println("<br>"+"First Name:             " + firstName);
                    out.println("<br>" +"Last Name:             "+ lastName);
                    out.println("<br>" +"Gender:                "+ gender);
                    out.println("<br>" +"Age:                   "+ age);
                    out.println("<br>" +"Marital Status:        "+ maritalStatus);
                    out.println("<br>" + "Children:             "+childernsNumber);
                    out.println("<br>" + "Address Line1:        "+addressLine1);
                    out.println("<br>" + "Address Line2:        "+addressLine2);
                    out.println("<br>" + "City:                 "+city);
                    out.println("<br>" + "State/Province:       "+spr);
                    out.println("<br>" +"Postal Code:           "+ zp);
                    out.println("<br>" + "Country:              "+country);
                    out.println("<br>" + "N.I.C# :              " + nic);
                    out.println("<br>" +"Blood Group:           "+ bloodGroup);
                    out.println("<br>" + "Mobile Number:        "+mobile);
                    out.println("<br>" + "Vaccination:          "+vaccination);
                     if (vaccination.equals("other")) {
                    String vaccination_other = request.getParameter("vaccination_other");
                      out.println("<br>" +"Vaccination:         "+ vaccination_other);
                    }
                    out.println("<br>" +"Smoking:               "+ smoking);
                    out.println("<br>" +"Drinking:              " + drinking);
                    out.println("<br>" + "Other Drugs:          "+otherDrugs);
                    out.println("<br>" + "Allergies:            "+allergies);
                    out.println("<br>" + "Pregenancy :          "+ pregnant);
                    out.println("<br>" + "Pregnancy Duration:   " + pragnancyDuration);
                    out.println("<br>" + "Pregnancy Stage:      "+pragnancyStage);
                    out.println("<br>" + "Chronic Disease:      "+chronicDisease);
                    out.println("<br>" + "Contagious Disease:   "+contagiousDisease);
                    out.println("<br>" + "Gender Disorder:      "+genderDisorder);
                    out.println("<br>" + "Terms:                "+termsAcception);
                    out.println("<br>" + "Signature:            "+signature);
                    out.println("</html>");
                    
                    
                    
                
                //regManager.add();
            } else if (request.getParameter("page_id").equals("outgoing_message_page")) {
                //out.println("<html>");
                String phoneNumber = request.getParameter("phn_number");
                //out.println("<br> phone Number:" + phoneNumber);
                String outMessage = request.getParameter("outgoing_message");
                //out.println("<br>" + outMessage);
                //out.println("</html>");
                CallPLSQLFunc mainPrg = new CallPLSQLFunc();
                mainPrg.SaveSMS(Integer.parseInt(phoneNumber), outMessage,0);

            }else if (request.getParameter("page_id").equals("user_info_page")){
                //Publicuser pbUser = (Publicuser) emf.createEntityManager().createNamedQuery("Publicuser.findAll").getResultList().get(5);
               out.println("<html>");
                out.println("<head>");
                out.println("<title>"+"User Info"+"</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>"+ "User Information" + "</h2>");
               // out.println("<p>: Name"+pbUser.getName()+"</p>");
                //out.println("<p> Address: "+pbUser.getAddress()+"</p>");
               // out.println("<p> Mobile: "+pbUser.getMobileNumber()+"</p>");
               // out.println("<p>: BloodGroup: "+pbUser.getBloodGroup()+"</p>");
               // out.println("<p> Gender: "+pbUser.getGender()+"</p>");
                //out.println("<p> Age: "+pbUser.getAge()+"</p>");
               // out.println("<p> Marital Status: "+pbUser.getMaritalStatus()+"</p>");
                out.println("</body>");
                out.println("</html>");
            }else {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Controller</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
                out.println("<p> you are not getting in any of the if or else if statement </p>");
                out.println("</body>");
                out.println("</html>");
            }


        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
}
