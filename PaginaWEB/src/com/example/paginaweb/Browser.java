package com.example.paginaweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Browser extends Activity implements OnClickListener {
	Button btn;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.browser);
      btn= (Button)findViewById(R.id.btnSearch_Browser);
      btn.setOnClickListener(this);
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		//enviar datos mediante JSON
		//test envio githublocalpck
		//por ahora lo que hace es abrir la siguiente ventana
		try {
			@SuppressWarnings("rawtypes")
			Class menu = Class.forName("com.example.paginaweb.Search");
			Intent start =  new Intent(Browser.this, menu);
			startActivity(start);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
