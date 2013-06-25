package hs.mirim;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Messege extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		Button givepower = (Button)findViewById(R.id.btn2);
		givepower.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				ImageView view=(ImageView)findViewById(R.id.imageView);
				view.setImageResource(randomizeRssId());
			}
		});
	}
	
	int randomizeRssId(){
		int n=(int)(Math.random()*30)+1;
		int rssId=0;
		switch (n) {
		case 1:
			rssId=R.drawable.ic_launcher;
			break;

		default:
			rssId=R.drawable.button;
			break;
		}
		return rssId;		
	}
}