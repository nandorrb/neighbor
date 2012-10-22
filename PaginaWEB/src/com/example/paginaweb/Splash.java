package com.example.paginaweb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/*README
Primera ventana en aparecer; login de usuarios, funciones: 
mediante JSON, permitir que los usuarios accedan a su cuenta, o de no tenerlas crear una.
*/

public class Splash extends Activity implements OnClickListener {
	Button btnAccess;
	TextView tvQuestion;
	TextView tvUsr;
	TextView tvPsw;
	TextView tvAN;
	Typeface type;
	EditText user;
	EditText pass;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		/* //   BUG
		 * user = (EditText) findViewById(R.id.tvUsuario_Splash); pass =
		 * (EditText) findViewById(R.id.tvPassword_Splash); type =
		 * Typeface.createFromAsset(this.getAssets(), "Origami.ttf"); tvAN =
		 * (TextView) findViewById(R.id.tvAppName_Splash);
		 * tvAN.setTypeface(type); tvPsw = (TextView)
		 * findViewById(R.id.tvPassword_Splash);
		 * tvPsw.setTextColor(Color.WHITE); tvUsr = (TextView)
		 * findViewById(R.id.tvUsuario_Splash); tvUsr.setTextColor(Color.WHITE);
		 */
		tvQuestion = (TextView) findViewById(R.id.tvQuestion_Splash);
		tvQuestion.setTextColor(Color.BLUE);
		tvQuestion.setOnClickListener(this);
		btnAccess = (Button) findViewById(R.id.btn);
		btnAccess.setOnClickListener(this);
	}

	@SuppressWarnings({ "rawtypes" })
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.btn:

			Toast.makeText(getBaseContext(), "Usuario correcto. ",
					Toast.LENGTH_SHORT).show();

			// Llamada a la ventana
			try {
				Class menu = Class
						.forName("com.example.paginaweb.MainActivity");
				Intent start = new Intent(Splash.this, menu);
				startActivity(start);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;

		case R.id.tvQuestion_Splash:
			// Link de la Pagina WEB
			String url = "http://www.peru21.pe";
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(url));
			startActivity(i);

			break;
		}
	}

	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		// Cierra la aplicacion
		finish();
	}

}
