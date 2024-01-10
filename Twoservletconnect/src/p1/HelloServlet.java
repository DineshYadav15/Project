package p1;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HelloServlet", urlPatterns= {"/hello"},
initParams= {@WebInitParam(name="email",value="ravi134@gmail.com")})

public class HelloServlet extends HttpServlet{
	ServletConfig cfg=null;
	
	public void init(ServletConfig config) {
		this.cfg=cfg;
		System.out.println("init() metho of helloservelt");

	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("service() method of helloServlet");
		String fname=req.getParameter("fname");
		String phone=req.getParameter("phone");
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1>Response from hello servlet");
		out.write("<hr/>request parameter");
		out.write("<br/>fname:"+fname);
		out.write("<br/>phone:"+phone);
		out.write("<hr/> Servlet config parameter");
		ServletConfig cfg=getServletConfig();
		String eml=cfg.getInitParameter("email");
		out.write("<br/>"+cfg);
		out.write("<br/>Email"+eml);
		out.write("<hr/> Servlet cotext parameters");
		ServletContext ctx=getServletContext();
		String web=ctx.getInitParameter("website");
		out.write("<br/>"+ctx);
		out.write("<br/>website"+web);
		
	}

}
