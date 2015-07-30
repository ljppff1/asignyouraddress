package com.example.asignyouaddress;

import com.webdesign688.emsd.R;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		SharedPreferences mySharedPreferences1 = getSharedPreferences(
				"ASIGN", Activity.MODE_PRIVATE);
		String flag = mySharedPreferences1.getString("FLAG", "0");
		startActivity(new Intent(getApplicationContext(), LoginActivity.class));

	/*	if(flag.equals("0")){
		startActivity(new Intent(getApplicationContext(), LoginActivity.class));
		}
		else{
			startActivity(new Intent(getApplicationContext(), SignActivity.class));

		}*/
		finish();
		
	}


	
}
