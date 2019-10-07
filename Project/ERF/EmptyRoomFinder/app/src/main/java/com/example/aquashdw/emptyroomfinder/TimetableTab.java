package com.example.aquashdw.emptyroomfinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by aquashdw on 18. 5. 14.
 */

public class TimetableTab extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View thisView = inflater.inflate(R.layout.timetable_layout, container, false);

        Button editButton = thisView.findViewById(R.id.editButton);
        Button delButton = thisView.findViewById(R.id.delButton);

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Method to find through database to set up timetable
                Toast.makeText(getContext().getApplicationContext(), "edit hit", Toast.LENGTH_SHORT).show();
            }
        });

        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Method to reset timetable
                Toast.makeText(getContext().getApplicationContext(), "delete hit", Toast.LENGTH_SHORT).show();
            }
        });

        return thisView;
    }


}
