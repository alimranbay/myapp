package com.example.myapp.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.example.myapp.R;

public class ActieveDossierModule extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actieve_dossier_module);

		ActionBar actionBar = getActionBar();
	}

	@Override
	public  boolean onCreateOptionsMenu(Menu menu){

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
}
