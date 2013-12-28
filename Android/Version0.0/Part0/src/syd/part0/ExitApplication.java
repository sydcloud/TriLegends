/**
*@功能　实现整个程序的退出
*@原理　生成一个activity容器，容纳程序运行中实例化的每一个activity，结束程序时遍历容器中每一个activity，实现整个程序的退出
*/　

package syd.part0;

import android.app.Application;
import android.app.Activity;

import java.util.LinkedList;
import java.util.List;

public class ExitApplication extends Application {
	private List<Activity> activityList = new LinkedList<Activity>();//　生成容器
	private static ExitApplication instance;
	private ExitApplication(){	
		/* 构造函数 */
	}
	public static ExitApplication getInstance(){
		/* 单例模式实例化 */
		if(null == instance)
			instance = new ExitApplication();
		return instance;
	}
	public void addActivity(Activity activity){
		/* 将activity加入容器，需在每个activity的oncreate方法中调用 */
		activityList.add(activity);
	}
	public void exit(){
		/* 实现退出程序 */
		for(Activity activity:activityList)
			activity.finish();
		System.exit(0);
	}
}
