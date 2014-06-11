package com.example.listview_alternativecolors;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Custom_view extends ArrayAdapter<String> {

	private final Context context;
	private final String[] values;

	public Custom_view(Context context, String[] values) {
		super(context, R.layout.activity_main, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View rowView = inflater.inflate(R.layout.activity_main, parent, false);
		TextView tv = (TextView) rowView.findViewById(R.id.label);
		String item_value = values[position];

		tv.setText(item_value);

		if (position % 2 == 0) {
			rowView.setBackgroundColor(Color.parseColor("#A4A4A4"));
		} else {
			rowView.setBackgroundColor(Color.parseColor("#FFBF00"));
		}
		return rowView;
	}
}