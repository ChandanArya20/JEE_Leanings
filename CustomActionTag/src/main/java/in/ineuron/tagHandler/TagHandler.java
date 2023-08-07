package in.ineuron.tagHandler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class TagHandler implements Tag {

	@Override
	public int doEndTag() throws JspException {
		
		return SKIP_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		
		return EVAL_BODY_INCLUDE;
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
		
	}

	@Override
	public void setParent(Tag arg0) {
		

	}

}
