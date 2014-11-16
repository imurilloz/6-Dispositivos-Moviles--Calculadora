package com.cut.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	TextView total;
	String valorTotal;
	float primerNumero;
	float calculo;
	String tipoCalculo;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnpunto,btnigual,btndiv,btnmul,btnres,btnsuma,btn0;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn5 = (Button) findViewById(R.id.btn5);
		btn6 = (Button) findViewById(R.id.btn6);
		btn7 = (Button) findViewById(R.id.btn7);
		btn8 = (Button) findViewById(R.id.btn8);
		btn9 = (Button) findViewById(R.id.btn9);
		btn0 = (Button) findViewById(R.id.btn0);
		btnpunto = (Button) findViewById(R.id.btnpunto);
		btnigual = (Button) findViewById(R.id.btnigual);
		btndiv = (Button) findViewById(R.id.btndiv);
		btnmul = (Button) findViewById(R.id.btnmul);
		btnsuma = (Button) findViewById(R.id.btnsuma);
		btnres = (Button) findViewById(R.id.btnres);
		
		total = (TextView) findViewById(R.id.textView1);
		
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn1.getText());
			}
			
		});
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn2.getText());
			}
			
		});
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn3.getText());
			}
			
		});
		
		btn4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn4.getText());
			}
			
		});
		
		btn5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn5.getText());
			}
			
		});
		
		btn6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn6.getText());
			}
			
		});
		
		btn7.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn7.getText());
			}
			
		});
		
		btn8.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn8.getText());
			}
			
		});
		
		btn9.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn9.getText());
			}
			
		});
		
		btn0.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btn0.getText());
			}
			
		});
		
		btnpunto.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				valorTotal = (String) total.getText();
				total.setText((String) valorTotal + (String) btnpunto.getText());
			}
			
		});
		
		btnsuma.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				total.setText("");
				tipoCalculo = "suma";
				primerNumero = Float.valueOf(total.getText().toString());
			}
			
		});
		
		btnres.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				total.setText("");
				tipoCalculo = "resta";
				primerNumero = Float.valueOf(total.getText().toString());
			}
			
		});
		
		btndiv.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				total.setText("");
				tipoCalculo = "division";
				primerNumero = Float.valueOf(total.getText().toString());
			}
			
		});
		
		btnmul.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				total.setText("");
				tipoCalculo = "multiplicacion";
				primerNumero = Float.valueOf(total.getText().toString());
			}
			
		});
		
		btnigual.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (tipoCalculo == "suma"){
					calculo = primerNumero + Float.valueOf(total.getText().toString());
				}else if (tipoCalculo == "multiplicacion"){
					calculo = primerNumero * Float.valueOf(total.getText().toString());
				}else if (tipoCalculo == "division"){
					calculo = primerNumero / Float.valueOf(total.getText().toString());
				}else if (tipoCalculo == "resta"){
					calculo = primerNumero - Float.valueOf(total.getText().toString());
				}
				total.setText(Float.toString(calculo));
				primerNumero = 0;
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
