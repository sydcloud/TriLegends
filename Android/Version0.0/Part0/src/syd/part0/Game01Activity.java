/**
*@功能　根据剧情展示一个主角在沙漠中行走的动画
*@原理　对sidebar进行监听，根据sidebar进度逐帧改变activity布局背景图
*/　

package syd.part0;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class Game01Activity extends ParentActivity {
	private RelativeLayout rlo;
	private SeekBar sb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game01);
		ExitApplication.getInstance().addActivity(this);
		//
		rlo = (RelativeLayout)findViewById(R.id.layout_activity_game01);// Game01Activity的布局
		sb = (SeekBar)findViewById(R.id.seekBar_game01_1);// sideBar
		//
		sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			/* 设置监听 */
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				int p = progress/5;
				switch (p) {
					/* 将sidebar二十等分，当sidebar进度到达相应区间时，改变布局背景 */
				case 0:
					rlo.setBackgroundResource(R.drawable.book_blue_game1);
					break;
				case 1:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_1);
					break;
				case 2:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_2);
					break;
				case 3:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_3);
					break;
				case 4:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_4);
					break;
				case 5:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_5);
					break;
				//
				case 6:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_6);
					break;
				case 7:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_7);
					break;
				case 8:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_8);
					break;
				case 9:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_9);
					break;
				case 10:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_10);
					break;
				//
				case 11:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_11);
					break;
				case 12:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_12);
					break;
				case 13:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_13);
					break;
				case 14:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_14);
					break;
				case 15:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_15);
					break;
				//
				case 16:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_16);
					break;
				case 17:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_17);
					break;
				case 18:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_18);
					break;
				case 19:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_19);
					break;
				case 20:
					rlo.setBackgroundResource(R.drawable.book_blue_game1_20);
					Intent it = new Intent();
					it.setClass(Game01Activity.this, Text03Activity.class);
					Game01Activity.this.startActivity(it);
					break;
				//	
				default:
					break;
				}
			}
		});
	}
	
}
