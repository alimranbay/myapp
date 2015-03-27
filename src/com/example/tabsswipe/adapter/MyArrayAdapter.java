package com.example.tabsswipe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapp.R;

/**
 * Created by Ali Imran on 26/03/2015.
 */
public class MyArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public MyArrayAdapter(Context context, String[] values) {
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
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position]);
		// change the icon for Windows and iPhone
		String s = values[position];
		if (s.startsWith("iPhone")) {
			imageView.setImageResource(R.drawable.ic_launcher);
		} else {
			imageView.setImageResource(R.drawable.ic_launcher);
		}

		return rowView;
	}
}
