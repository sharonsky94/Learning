package com.mycompany.learning;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View;
import android.util.Log;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final TextView textView = findViewById(R.id.mainTextView1);
		final Button button = findViewById(R.id.mainButton1);
		final EditText editText=findViewById(R.id.mainEditText1);
		
		button.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					String temp = editText.getText().toString();
					textView.setText(temp);
					Log.v("myactivity",temp);
					//однострочный комментарий
					
					/*многострочный
					комментарий*/
					
					/**справочная 
					информация*/
				}
			});
	}
}
