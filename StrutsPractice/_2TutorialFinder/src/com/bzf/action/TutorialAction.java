package com.bzf.action;

import com.bzf.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialIs;
	private String language;
	
	public String execute(){
		TutorialFinderService tfs=new TutorialFinderService();
		setBestTutorialIs(tfs.getTutorialBestSite(getLanguage()));
		
		return "success";
	
	}
	public String getBestTutorialIs() {
		return bestTutorialIs;
	}
	public void setBestTutorialIs(String bestTutorialIs) {
		this.bestTutorialIs = bestTutorialIs;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
