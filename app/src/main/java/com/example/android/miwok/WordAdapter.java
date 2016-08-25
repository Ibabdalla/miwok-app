package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nkumar on 8/11/16.
 */
public class WordAdapter extends ArrayAdapter<Word>{

    private int mcolorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mcolorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(word.getDefaultTranslation());


        ImageView miwok_image_view = (ImageView) listItemView.findViewById(R.id.miwok_image_view);
        if (word.isImageProvided()) {
            miwok_image_view.setImageResource(word.getImageResourceID());
        } else {
            miwok_image_view.setVisibility(View.GONE);
        }

        View text_container = listItemView.findViewById(R.id.text_container);
        //color that resource id maps to
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        text_container.setBackgroundColor(color);

        return listItemView;
    }

    @Override
    public String toString() {
        return "WordAdapter{" +
                "mcolorResourceId=" + mcolorResourceId +
                '}';
    }
}
