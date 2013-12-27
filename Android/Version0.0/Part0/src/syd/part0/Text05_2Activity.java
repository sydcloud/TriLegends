package syd.part0;

import android.os.Bundle;


public class Text05_2Activity extends ParentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text05_2);
		ExitApplication.getInstance().addActivity(this);
		setScrollBar(R.id.textView5_2);
	}


}
