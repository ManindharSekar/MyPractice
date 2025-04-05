package com.bzf.service;

public class TutorialFinderService {
	
	public String getTutorialBestSite(String language){
		if(language.equals("java")){
		return "Java T Point";
		}else{
			return "language not supported";
		}
	}

}
