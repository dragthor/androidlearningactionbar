package com.kriskrause.actionbasic;

import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;

public class DisplayMessageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	// setContentView(R.layout.activity_display_message);
	// Get the message from the intent 
 	Intent intent = getIntent(); 
 	String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE); 
 
 	// Create the text view 
 	TextView textView = new TextView(this); 
 	textView.setTextSize(40); 
 	textView.setText(message); 
 
	// Set the text view as the activity layout 
 	setContentView(textView);
    }
}
