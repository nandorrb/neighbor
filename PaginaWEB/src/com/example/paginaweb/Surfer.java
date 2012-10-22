package com.example.paginaweb;

import android.app.Activity;
import android.os.Bundle;
/* README
surfer es la clase que esta destinada a navegar entre producto y producto, caracteristicas:
-producto de menor precio
-producto de mayor calidad
-producto equivalente
*/

public class Surfer extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.surfer);
	}

}
