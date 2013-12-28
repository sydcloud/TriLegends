/**
*@功能　全体activity的父类，提供菜单，设置textview滚动条
*@原理　
*/　
package syd.part0;

import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class ParentActivity extends Activity {

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		/* 创建选项菜单 */
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		/* 设置选项响应 */
		switch (item.getItemId()) {
		case R.id.action_settings:
			Toast t1 = Toast.makeText(this, R.string.settings_text, Toast.LENGTH_LONG);
			t1.show();
			break;
		case R.id.action_about:
			Toast t2 = Toast.makeText(this, R.string.about_text, Toast.LENGTH_LONG);
			t2.show();
			break;
		case R.id.action_exit:
			ExitApplication.getInstance().exit();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	void setScrollBar(int id){
		/* 创建滚动条 */
		TextView textView = (TextView)findViewById(id);  
		textView.setMovementMethod(ScrollingMovementMethod.getInstance());
	}
}
