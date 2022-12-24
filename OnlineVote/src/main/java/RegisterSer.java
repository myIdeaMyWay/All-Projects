

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterSer
 */
@WebServlet("/RegisterSer")
public class RegisterSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		DatabaseManager db=new DatabaseManager();
		java.sql.Connection con=db.getConnection();
		String name=request.getParameter("vName");
		String pnumber=request.getParameter("pNumber");
		String email=request.getParameter("eMail");
		String vcnumber=request.getParameter("vcNumber");
		String vaddress=request.getParameter("vAddress");
		//(vName,pNumber,eMail,vcNumber,vAddress)values(
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = con.prepareStatement("insert into New_Register (vName,pNumber,eMail,vcNumber,vAddress) values('"+name+"','"+pnumber+"','"+email+"','"+vcnumber+"','"+vaddress+"')");
			preparedStatement.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		response.sendRedirect("index.jsp");
	}

}
