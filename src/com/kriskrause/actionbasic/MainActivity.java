package com.kriskrause.actionbasic;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "com.kriskrause.ationbasic.MESSAGE";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

   @Override 
   public boolean onCreateOptionsMenu(Menu menu) { 
 	// Inflate the menu items for use in the action bar 
 	MenuInflater inflater = getMenuInflater(); 
 	inflater.inflate(R.menu.main_activity_actions, menu); 
 	return super.onCreateOptionsMenu(menu); 
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) { 
 	Context context = getApplicationContext();

	// Handle presses on the action bar items 
  	switch (item.getItemId()) { 
 		case R.id.action_search: 
 			openSearch(context); 
 			return true; 
 		case R.id.action_settings: 
 			openSettings(context); 
 			return true; 
 		default: 
 			return super.onOptionsItemSelected(item); 
 	} 
   } 

   private void openSearch(Context context) {
	Toast toast = Toast.makeText(context, "Search...", Toast.LENGTH_SHORT);
        toast.show();

	openChildActivity("Search");
   }

   private void openSettings(Context context) {
	Toast toast = Toast.makeText(context, "Settings...", Toast.LENGTH_SHORT);
        toast.show();

	openChildActivity("Settings");
   }

   private void openChildActivity(String settingName) {
  	Intent intent = new Intent(this, DisplayMessageActivity.class);

        intent.putExtra(EXTRA_MESSAGE, settingName);

        startActivity(intent);
   }
}
