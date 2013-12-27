package syd.part0;

import android.app.Application;
import android.app.Activity;

import java.util.LinkedList;
import java.util.List;

public class ExitApplication extends Application {
	private List<Activity> activityList = new LinkedList<Activity>();
	private static ExitApplication instance;
	private ExitApplication(){	
	}
	public static ExitApplication getInstance(){
		if(null == instance)
			instance = new ExitApplication();
		return instance;
	}
	public void addActivity(Activity activity){
		activityList.add(activity);
	}
	public void exit(){
		for(Activity activity:activityList)
			activity.finish();
		System.exit(0);
	}
}
