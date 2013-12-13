package paginasweb.pe.ejemplo_vistas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity {

	EditText txtNombre;
	EditText txtApellidos;
	Spinner cbxSexo;
	Button btnRegistrar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtNombre = (EditText) findViewById(R.id.edNombre);
		txtApellidos = (EditText) findViewById(R.id.edApellidos);
		cbxSexo = (Spinner) findViewById(R.id.spSexo);
		btnRegistrar = (Button) findViewById(R.id.btRegistrar);

		ArrayAdapter<CharSequence> adaptador=ArrayAdapter.createFromResource(getApplicationContext(), R.array.arreglo_sexo, android.R.layout.simple_spinner_item);
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_item);
		cbxSexo.setAdapter(adaptador);
		
		btnRegistrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String nombre, apellidos, sexo;
				nombre= txtNombre.getText().toString();
				apellidos = txtApellidos.getText().toString();
				sexo = cbxSexo.getSelectedItem().toString();
				Toast.makeText(getApplicationContext(), "Su nombre es: "+nombre+" "+apellidos+"; su sexo es: "+sexo, Toast.LENGTH_LONG).show();
			}
		});
		
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/
}
