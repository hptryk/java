/*public class Slip18 extends Thread 
{ 
    public void run()
     { 
     System.out.println("running thread name is:"+Thread.currentThread().getName()); 
     System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
     } 
    public static void main(String args[])
    { 
        Slip18 m1=new Slip18(); 
        Slip18 m2=new Slip18(); 
        m1.setPriority(Thread.MIN_PRIORITY); 
        m2.setPriority(Thread.MAX_PRIORITY); 
        m1.start(); 
        m2.start(); 
    } 
    }
*/

/*
import java.io.*; 
import javax.servlet.*;
import javax.servlet.http.*;
public class count extends HttpServlet 
{
    static int count=0,c2=0;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException 
    {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String name=request.getParameter("t1"); 
      Cookie c1=new Cookie("count",String.valueOf(count));
      c2=Integer.parseInt(c1.getValue());
      if(c2==0)
      {
        out.println("Welcome="+name); 
        count++;
      }
      else
      { 
        c1=new Cookie("count",String.valueOf(count)); 
        count++;
        out.println("Welcome="+name+"\t"+count); 
      }
    }
}


HTML Code
<html>
<body>
<form action="http://localhost:8080" method="get">
      Username:<input type="text" name="t1">
<input type="submit" >
</form>
</body>
</html>
*/