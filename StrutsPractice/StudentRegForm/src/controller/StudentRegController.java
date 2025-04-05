package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import formbean.Student;

public class StudentRegController extends Action {
	
	public StudentRegController(){
		System.out.println("StudentRegController Object...");
	}
	
	public ActionForward execute(ActionMapping am,ActionForm bean,HttpServletRequest request, HttpServletResponse response ){
		Student st=(Student) bean;
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		System.out.println(st.getAddress());
		return am.findForward("success") ;
	}

}
