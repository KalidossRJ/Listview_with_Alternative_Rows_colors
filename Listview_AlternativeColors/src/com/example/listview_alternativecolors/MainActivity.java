package com.example.listview_alternativecolors;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	
	String[] mob = new String[] { "Chennai", "New Delhi", "Mumbai", "kolkata",
			"Bangalore", "Hyderabad", "Srinagar","Mysore","Chidambaram","Mayiladuthurai","Tiruvarur" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Custom_view cv = new Custom_view(this, mob);
		setListAdapter(cv);

        
    }
    @Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		super.onListItemClick(l, v, position, id);

		// getting the value of clicked item
		String clicked_item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, "You clicked : " + clicked_item, Toast.LENGTH_SHORT)
				.show();
	}
}
