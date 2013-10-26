package com.algebra.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	RadioGroup rg;
	
	RadioButton rc,rp;
	
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rg = (RadioGroup) findViewById(R.id.rg);
		rc = (RadioButton) findViewById(R.id.rc);
		rp = (RadioButton) findViewById(R.id.rp);
		b =  (Button) findViewById(R.id.b);
		
		b.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			int selectedOption = rg.getCheckedRadioButtonId();
			 
			rc = (RadioButton) findViewById(selectedOption);
			
			rp = (RadioButton) findViewById(selectedOption);
			 
		Toast.makeText(MainActivity.this, rc.getText(), Toast.LENGTH_SHORT).show();
		Toast.makeText(MainActivity.this, rp.getText(), Toast.LENGTH_SHORT).show();
			}
		});
	}
}
		
		        
	
		



	
	

