package com.example.tabsswipe.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.myapp.ActieveAgendaModule;
import com.example.myapp.ActieveDossierModule;

public class ActiefFragment extends ListFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String[] values = new String[] { "plaatsing speelplaats", "vergroening", "vermeerderen van patrouilles",
				"plaatsing van feestzaal", "gebouwen renoveren of vervangen", "indeling verkeer",
				"investeren in verwijderen van grafitti", "nieuwe weg", "investeren in nieuwe trams", "camerabewaking" };
		ArrayAdapter<String> adapter = new MyArrayAdapter(getActivity(), values);

		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = new Intent(getActivity(), ActieveAgendaModule.class);
		if(id%2 == 0){
			intent =  new Intent(getActivity(), ActieveDossierModule.class);
		}
		startActivity(intent);
	}
}