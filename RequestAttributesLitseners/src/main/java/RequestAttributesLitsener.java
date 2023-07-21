

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class RequestAttributesLitsener implements ServletRequestAttributeListener {

	static {
		System.out.println("RequestAttributeListener.class file is loading...");
	}

	public RequestAttributesLitsener() {
		System.out.println("RequestAttributeListener object is created...");
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " ... attribute removed...");
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " ... attribute added...");
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println(srae.getName() + " ... attribute replaced...");
	}
}
