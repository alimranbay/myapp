package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActieveAgendaModule extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actieve_agenda_module);

		Button button = (Button) findViewById(R.id.toon_antwoorden);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActieveAgendaModule.this, AgendaAntwoorden.class);
				startActivity(intent);
			}
		});
	}
}
