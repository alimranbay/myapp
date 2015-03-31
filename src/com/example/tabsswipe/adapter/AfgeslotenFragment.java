package com.example.tabsswipe.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.myapp.GeslotenAgendaModule;
import com.example.myapp.ModuleRow;
import com.example.myapp.R;

public class AfgeslotenFragment extends ListFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ModuleRow[] values = new ModuleRow[] { new ModuleRow("Plaatsing speelplaats", "", R.drawable.ic_launcher) };
		ArrayAdapter<ModuleRow> adapter = new MyArrayAdapter(getActivity(), values);
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = new Intent(getActivity(), GeslotenAgendaModule.class);
		startActivity(intent);
	}
}
