package bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloController extends Action {
	
	public ActionForward execute(ActionMapping mapping,ActionForm from,HttpServletRequest request,HttpServletResponse response){
		
		//String name=request.getParameter("name");
		//request.setAttribute("req","hello.."+name);
		
		return mapping.findForward("success") ;
		
	}

}
