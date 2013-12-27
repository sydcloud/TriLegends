package syd.part0;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;


public class Text03Activity extends ParentActivity {
	private Button bt1;
	private Button bt2;
	private Button bt3;
	int bt1_click;
	int bt2_click;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text03);
		ExitApplication.getInstance().addActivity(this);
		setScrollBar(R.id.textView3);
//		TextView textView = (TextView)findViewById(R.id.textView3);  
//		textView.setMovementMethod(ScrollingMovementMethod.getInstance());
		bt1_click = 0;
		bt2_click = 0;
		bt1 = (Button)findViewById(R.id.button_activity_text03_1);
		bt2 = (Button)findViewById(R.id.button_activity_text03_2);
		bt3 = (Button)findViewById(R.id.button_activity_text03_3);
		bt1.setOnClickListener(new bt1OnClickListener());
		bt2.setOnClickListener(new bt2OnClickListener());
		bt3.setOnClickListener(new bt3OnClickListener());
		
	}
	
	void toNextActivity(){
		if(bt1_click == 3 && bt2_click == 1){
			Intent it = new Intent();
			it.setClass(Text03Activity.this, Text04Activity.class);
			Text03Activity.this.startActivity(it);	
		}
	}
	
	class bt1OnClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			bt1_click ++;
			toNextActivity();
		}
	}
	class bt2OnClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			bt2_click ++;
			toNextActivity();
		}
	}class bt3OnClickListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			bt1_click = 0;
			bt2_click = 0;
		}
	}
}
