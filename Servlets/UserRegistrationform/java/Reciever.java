import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Reciever extends HttpServlet
{
    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw;
        res.setContentType("text/html");
        pw=res.getWriter();
        pw.print("<html>");
        pw.print("<head>");
        pw.print("<title>Welcome to Servlet Example</title></head>");
        pw.print("<body bgcolor='yellow' text='navy'>");
                pw.print("<center>");
                pw.print("<h1><B>User Registration Form <B></h1><br>");
                    pw.print("<table border=2.0 cellspacing=4.0>");       
                         pw.print("<tr>");
                            pw.print("<th align=left>UserName :");
                            String un=req.getParameter("username");
                            pw.print("</th>");
                            pw.print("<td>");
                            pw.print("<input type=text value="+un+" size=32>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Password :");
                            pw.print("</th>");
                            pw.print("<td>");
                            String p=req.getParameter("userpass");
                            pw.print("<input type=text value="+p+" size=32>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                       
                        pw.print("<tr>");
                        pw.print("<td align=left> Sex");
                            
                        pw.print("</td>");
                        pw.print("<td>");
                        String sex=req.getParameter("sex");
                        pw.print("<input type=text value="+sex+" size=32>");
                        pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                        pw.print("<td align=left>Marital Status");
                            
                        pw.print("</td>");
                        pw.print("<td>");
                        String status=req.getParameter("status");
                        pw.print("<input type=text value="+status+" size=32>");
                        pw.print("</td>");
                        pw.print("</tr>");

                           
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Father Name :");
                            pw.print("</th>");
                            pw.print("<td>");
                                String fname=req.getParameter("fname");
                            pw.print("<input type=text value="+fname+" size=32>");
                                pw.print("</td>");
                        pw.print("</tr>");
                        
                         pw.print("<tr>");
                            pw.print("<th align=left>Mother Name :");
                            pw.print("</th>");
                            pw.print("<td>");
                                String mname=req.getParameter("mname");
                            pw.print("<input type=text value="+mname+" size=32>");
                                pw.print("</td>");
                        pw.print("</tr>");
                        
                        
                        
                        pw.print("<tr rowspan=5>");
                            pw.print("<th align=left>Address:");
                            pw.print("</th>");
                            pw.print("<td>");
                            String address=req.getParameter("address");
                            pw.print("<textarea rows=5 cols=29 placeholder="+address+"></textarea>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                            pw.print("<th align=left>Contact Number :");
                            pw.print("</th>");
                            pw.print("<td>");
                            String contact=req.getParameter("contact");
                            pw.print("<input type=text value="+contact+" size=32>");
                            pw.print("</td>");
                        pw.print("</tr>");
                        
                        pw.print("<tr>");
                        pw.print("<td>");
                        String options =req.getParameter("options");
                        pw.print(""+options);
                        pw.print("</td>");
                        pw.print("<td>");
                        String hint=req.getParameter("hintpassword");
                            pw.print("<input type=text value="+hint+" size=32>");
                        pw.print("</td>");
                        pw.print("</tr>");
                        
                        
                    

                    pw.print("</table>");
                pw.print("</center>");
                
        pw.print("</form>");
        pw.print("</body>");
        pw.print("</html>");
    }
}