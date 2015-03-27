package com.example.tabsswipe.adapter;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AfgeslotenFragment extends ListFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		String[] values = new String[] { "Plaatsing speelplaats", "vergroening", "vermeerderen van patrouilles",
				"plaatsing van feestzaal", "gebouwen renoveren of vervangen", "indeling verkeer",
				"investeren in verwijderen van grafitti", "nieuwe weg", "investeren in nieuwe trams", "camerabewaking" };
		ArrayAdapter<String> adapter = new MyArrayAdapter(getActivity(), values);
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// do something with the data
	}
}
