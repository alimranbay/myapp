package com.example.myapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapp.models.Module;
import com.example.myapp.R;

/**
 * Created by Ali Imran on 26/03/2015.
 */
public class MyArrayAdapter extends ArrayAdapter<Module> {
	private final Context context;
	private final Module[] values;

	public MyArrayAdapter(Context context, Module[] values) {
		super(context, R.layout.rowlayout, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
		TextView textView1 = (TextView) rowView.findViewById(R.id.secondLine);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position].getTitle());
		textView1.setText(values[position].getDescription());
		imageView.setImageResource(values[position].getImage());
		return rowView;
	}
}
