

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 
		response.setContentType("text/html");
		DatabaseManager db=new DatabaseManager();
		Connection conn=db.getConnection();
		
		String Name=request.getParameter("uName");
		String pnumber=request.getParameter("pNumber");
		String email=request.getParameter("eMail");
		String comment=request.getParameter("comment");
		
		try
		{
			//insert into contact(name,pnumber,)values();
			//PreparedStatement stmt=con.prepareStatement("insert into contact(uName,pNumber,eMail,comment) values("'+Name+'","'+pnumber+'","'+email+'","'+comment+'")");
			PreparedStatement st = (PreparedStatement)conn.prepareStatement("insert into contact(uName,pNumber,eMail,comment)values('"+Name+"','"+pnumber+"','"+email+"','"+comment+"')");
	
					st.executeUpdate();
			response.sendRedirect("index.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}

}
