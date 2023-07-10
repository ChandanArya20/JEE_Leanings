
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestLitsenerDemo implements ServletRequestListener {
	public static int count=0;
	
	static {
		System.out.println("RequestDemoListener.class file is loading...");
	}

	public RequestLitsenerDemo() {
		System.out.println("RequestDemoListener object is instantiated..");
	}
	
    public void requestInitialized(ServletRequestEvent sre)  { 
        count++;
        System.out.println("Request object is created at :: "+new java.util.Date());
		System.out.println("Hit count of the application is :: "+count);
    }
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	
    	System.out.println("RequestObject is destroyed at :: "+new java.util.Date());
		System.out.println("RequestDemoListener.requestDestroyed()");
    }
	
}
