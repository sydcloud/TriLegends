/**
*@功能　程序入口avtivity
*@原理　
*/　

package syd.part0;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.*;



public class MainActivity extends ParentActivity {
	private Button bt = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ExitApplication.getInstance().addActivity(this);
		//
		bt = (Button)findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener(){
			/* 设置监听 */
			@Override
			public void onClick(View arg0) {
				Intent it = new Intent();
				it.setClass(MainActivity.this, Text01Activity.class);
				MainActivity.this.startActivity(it);
			}
		});
	}
}
