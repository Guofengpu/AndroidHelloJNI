package com.example.androidhellojni;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
	
	private TextView test;
	private HelloJni helloJni;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    helloJni = new HelloJni();
	
	    test = (TextView)findViewById(R.id.text);
	    
		test.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Toast.makeText(MainActivity.this, helloJni.stringFromJNI(), 3000).show();;
			}
		});
		
	}
			
static {
		
		System.loadLibrary("hello-jni");
	}
	
	
}
