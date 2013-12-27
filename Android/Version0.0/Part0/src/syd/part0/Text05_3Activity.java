package syd.part0;

import android.os.Bundle;


public class Text05_3Activity extends ParentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text05_3);
		ExitApplication.getInstance().addActivity(this);
		setScrollBar(R.id.textView5_3);
	}

}
