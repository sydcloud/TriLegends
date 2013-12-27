package syd.part0;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class Text01Activity extends ParentActivity {
	private Button bt = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text01);
		setScrollBar(R.id.textView1);
		bt = (Button)findViewById(R.id.button1);
		bt.setOnClickListener(new btOnClickListener());
		ExitApplication.getInstance().addActivity(this);
	}
	
	class btOnClickListener implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			Intent it = new Intent();
			it.setClass(Text01Activity.this, Text02Activity.class);
			Text01Activity.this.startActivity(it);
		}
		
	}

}
