package com.example.myapp.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import com.example.myapp.R;

public class InloggenActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inloggen);

		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

}