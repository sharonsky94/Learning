package com.mycompany.learning;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final TextView textView = findViewById(R.id.textView_id);
		final Button button = findViewById(R.id.button_id);
		
		button.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					textView.setText("awesome");
				}
			});
	}
}
