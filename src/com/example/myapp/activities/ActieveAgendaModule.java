package com.example.myapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapp.R;

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
