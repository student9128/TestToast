package com.jing.testtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
private Button button;
private Toast toast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.toclick);
		
	}
	int i = 0;
	public void toToast(View view){
		if(toast == null){	
			toast = Toast.makeText(getApplicationContext(), "我是吐司", Toast.LENGTH_SHORT);
		}	
		toast.setText("我是吐司"+i++);
		toast.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
