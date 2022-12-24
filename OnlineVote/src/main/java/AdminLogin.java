

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		DatabaseManager db=new DatabaseManager();
		Connection con=db.getConnection();
		
		String Name=request.getParameter("aName");
		String pass=request.getParameter("password");
		
		try
		{
			PreparedStatement stmp=con.prepareStatement("select * from Admin where adminName = '"+Name+"' and adminPass = '"+pass+"'");
			ResultSet rs=(ResultSet) ((java.sql.Statement) stmp.executeQuery());
					if(rs.next())
					{
						HttpSession session=request.getSession();
						session.setAttribute("aName", Name);
						out.write("working");
						response.sendRedirect("adminWelcome.jsp");
						
					}
					else
					{
						System.out.println("Not Authorize");
					}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
