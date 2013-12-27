package syd.part0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Text04Activity extends ParentActivity {
	Button bt1;
	Button bt2;
	Button bt3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text04);
		ExitApplication.getInstance().addActivity(this);
		setScrollBar(R.id.textView4);
		bt1 = (Button)findViewById(R.id.text04_activity_button1);
		bt2 = (Button)findViewById(R.id.text04_activity_button2);
		bt3 = (Button)findViewById(R.id.text04_activity_button3);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent();
				it.setClass(Text04Activity.this, Text05_1Activity.class);
				Text04Activity.this.startActivity(it);
			}
		});
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent();
				it.setClass(Text04Activity.this, Text05_2Activity.class);
				Text04Activity.this.startActivity(it);
			}
		});
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent();
				it.setClass(Text04Activity.this, Text05_3Activity.class);
				Text04Activity.this.startActivity(it);
			}
		});
	}

}
