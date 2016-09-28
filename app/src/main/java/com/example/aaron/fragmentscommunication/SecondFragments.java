package com.example.aaron.fragmentscommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragments extends Fragment {
    
    TextView textView;

    public SecondFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second_fragments, container, false);

        textView = ((TextView) v.findViewById(R.id.text));

        return v;
    }

    public void setTextValue(String text){
        textView.setText(text);
    }

}
