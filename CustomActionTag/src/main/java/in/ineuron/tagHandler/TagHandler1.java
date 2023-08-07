package in.ineuron.tagHandler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class TagHandler1 implements IterationTag {

	private int value;
	PageContext pageContext=null;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int doStartTag() throws JspException {
//		JspWriter out=pageContext.getOut();
//		try {
//			out.println("<h1 style='color:green; text-align:center;'>The value is : "+value+"</h1>");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}


	@Override
	public Tag getParent() {
		
		return null;
	}

	@Override
	public void release() {
		

	}

	@Override
	public void setPageContext(PageContext arg0) {
		pageContext=arg0;
	}

	@Override
	public void setParent(Tag arg0) {
		

	}

	@Override
	public int doAfterBody() throws JspException {
		System.out.println("doAfterBoddy()");
		if(--value>0)
			return EVAL_BODY_AGAIN;
		
		return SKIP_BODY;
	}

}
