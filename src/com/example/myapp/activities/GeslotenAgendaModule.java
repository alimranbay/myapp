package com.example.myapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapp.R;

public class GeslotenAgendaModule extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.afgesloten_agendamodule);

		Button button = (Button) findViewById(R.id.toon_antwoorden);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GeslotenAgendaModule.this, AgendaAntwoorden.class);
				startActivity(intent);
			}
		});
	}
}
