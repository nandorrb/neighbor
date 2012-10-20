package com.example.paginaweb;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ofertas extends ListActivity {
	String classes[] = { "Calculadora HP50G", "Computadora HP i7","Atun REAL caja x12" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// set FullScreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setListAdapter(new ArrayAdapter<String>(Ofertas.this,
				android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		try {
			@SuppressWarnings("rawtypes")
			Class menu = Class.forName("com.example.paginaweb.Search");
			Intent start =  new Intent(Ofertas.this, menu);
			startActivity(start);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
}
