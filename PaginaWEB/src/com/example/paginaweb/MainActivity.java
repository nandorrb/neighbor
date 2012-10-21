package com.example.paginaweb;

import com.example.paginaweb.R;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabHost tabHost = getTabHost();

		// Tab for Browser
				TabSpec browserspec = tabHost.newTabSpec("Browser");
				// setting Title and Icon for the Tab
				browserspec.setIndicator("Browser",
						getResources().getDrawable(R.drawable.icon_ofertas));
				Intent browserIntent = new Intent(this, Browser.class);
				browserspec.setContent(browserIntent);
				
		// Tab for Ofertas
		TabSpec ofertaspec = tabHost.newTabSpec("Ofertas");
		// setting Title and Icon for the Tab
		ofertaspec.setIndicator("Ofertas",
				getResources().getDrawable(R.drawable.icon_ofertas));
		Intent ofertaIntent = new Intent(this, Ofertas.class);
		ofertaspec.setContent(ofertaIntent);

		// Tab for Place
		TabSpec placespec = tabHost.newTabSpec("Place");
		// setting Title and Icon for the Tab
		placespec.setIndicator("Place",
				getResources().getDrawable(R.drawable.icon_place));
		Intent placeIntent = new Intent(this, Place.class);
		placespec.setContent(placeIntent);

		// Adding all TabSpec to TabHost
		tabHost.addTab(browserspec); // Adding browser tab
		tabHost.addTab(ofertaspec); // Adding offer tab
		tabHost.addTab(placespec); // Adding place tab

	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.cool_menu, menu);
		return true;
		
	}

	
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.aboutUs:
		//	Intent i = new Intent("android.intent.action.ABOUT");
		//	startActivity(i);
			break;
		case R.id.preferences:
		//	Intent p = new Intent("android.intent.action.PREFS");
		//	startActivity(p);

			break;

		case R.id.exit:
			finish();
			break;
		}
		return false;
	
}
}


