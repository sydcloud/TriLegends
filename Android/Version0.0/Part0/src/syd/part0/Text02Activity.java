package syd.part0;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Text02Activity extends ParentActivity {
	private Button bt = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text02);
		setScrollBar(R.id.textView2);
		bt = (Button)findViewById(R.id.button2);
		bt.setOnClickListener(new btOnClickListener());
		ExitApplication.getInstance().addActivity(this);
	}
	
	class btOnClickListener implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			Intent it = new Intent();
			it.setClass(Text02Activity.this, Game01Activity.class);
			Text02Activity.this.startActivity(it);
		}
		
	}

}
