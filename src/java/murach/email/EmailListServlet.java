package murach.email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import murach.business.User;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String date = request.getParameter("date");
            String appointment = request.getParameter("appointment");
            String location = request.getParameter("location");
           

            // store data in User object
            User user = new User();
            user.setDate(date);
            user.setAppointment(appointment);
            user.setLocation(location);

            // validate the parameters
            String message;
            if (UserDB.emailExists(user.getDate())) {
                message = "This date has been used.<br>" +
                          "Please enter another date.";
                url = "/index.jsp";
            }
            else {
                message = "";
                url = "/thanks.jsp";
                System.out.println("THIS IS IN doPOST" );
                System.out.println("email: " + user.getDate());
                System.out.println("userId: " + user.getApptId());
                System.out.println("FirstName: " + user.getAppointment());
                System.out.println("LastName" + user.getLocation());
                UserDB.insert(user);
            }
            request.setAttribute("user", user);
            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
}