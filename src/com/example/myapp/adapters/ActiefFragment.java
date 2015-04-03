package com.example.myapp.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.myapp.activities.ActieveAgendaModule;
import com.example.myapp.activities.ActieveDossierModule;
import com.example.myapp.models.Module;
import com.example.myapp.R;

public class ActiefFragment extends ListFragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Module[] values = new Module[] { new Module("Plaatsing speelplaats", "Description", R.drawable.ic_launcher) };
		ArrayAdapter<Module> adapter = new MyArrayAdapter(getActivity(), values);
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
