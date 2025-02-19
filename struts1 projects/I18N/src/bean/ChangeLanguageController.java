package bean;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class ChangeLanguageController extends Action {
	
	@Override
	public ActionForward execute(ActionMapping map, ActionForm from,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
	String parameter = req.getParameter("Language");
	Locale locale = new Locale(parameter);
	HttpSession session= req.getSession();
	session.setAttribute("org.apache.struts.action.LOCALE",locale);
		
		return map.findForward("index");
	}

}
