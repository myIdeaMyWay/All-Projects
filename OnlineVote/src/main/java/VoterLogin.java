

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class VoterLogin
 */
@WebServlet("/VoterLogin")
public class VoterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoterLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		DatabaseManager db=new DatabaseManager();
		java.sql.Connection con=db.getConnection();
		
		String VNumber=request.getParameter("voternumber");
		
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from Voter where V_Number = '"+VNumber+"'");
			//ResultSet rs1=(ResultSet) ((java.sql.Statement)
			ResultSet rs1=ps.executeQuery();
			
			if(rs1.next())
			{
				if(rs1.next())
				{
					
					HttpSession session=request.getSession();
					String n=(String)session.getAttribute("VNumber"); 
					if(n==VNumber) response.sendRedirect("userWelcome.jsp");
					//session.setAttribute("V_Number", VNumber);
					//out.write("working");
					else
					System.out.println("Not Authorize");
					
				}
				else
				{
					System.out.println("Not Authorize");
				}
				//response.sendRedirect("voted.jsp");
			}
			else
			{
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
