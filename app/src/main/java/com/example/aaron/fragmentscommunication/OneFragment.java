package com.example.aaron.fragmentscommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    EditText text;
    Button button;
    
    
    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_one, container, false);

        text = ((EditText) v.findViewById(R.id.text));
        button = ((Button) v.findViewById(R.id.button));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = text.getText().toString();

                FragmentOne interfaceFragment = (FragmentOne) getActivity();
                interfaceFragment.sendValue(txt);
            }
        });

        return v;
    }

}
