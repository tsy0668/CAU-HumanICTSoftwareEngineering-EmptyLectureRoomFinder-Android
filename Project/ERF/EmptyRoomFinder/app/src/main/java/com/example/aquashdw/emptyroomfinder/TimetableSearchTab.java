package com.example.aquashdw.emptyroomfinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by aquashdw on 18. 5. 14.
 */

public class TimetableSearchTab extends Fragment {
    Spinner daySpin;
    Spinner buildSpin;
    Spinner floorSpin;
    Spinner startSpin;
    Spinner endSpin;

    ArrayAdapter<CharSequence> dayAdapt;
    ArrayAdapter<CharSequence> buildAdapt;
    ArrayAdapter<CharSequence> floorAdapt;
    ArrayAdapter<CharSequence> startAdapt;
    ArrayAdapter<CharSequence> endAdapt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.timetablesearch_layout, container, false);

        daySpin = view.findViewById(R.id.day_spin);
        buildSpin = view.findViewById(R.id.build_spin);
        floorSpin = view.findViewById(R.id.floor_spin);
        startSpin = view.findViewById(R.id.start_spin);
        endSpin = view.findViewById(R.id.end_spin);

        dayAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.day_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        buildAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.build_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        floorAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.floor_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        startAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.time_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        endAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.time_spin_ini, android.R.layout.simple_spinner_dropdown_item);

        daySpin.setAdapter(dayAdapt);
        buildSpin.setAdapter(buildAdapt);
        floorSpin.setAdapter(floorAdapt);
        startSpin.setAdapter(startAdapt);
        endSpin.setAdapter(endAdapt);

        this.spinnerInitialize(view);
        this.spinnerListenerInitialize();

        Button searchButton = view.findViewById(R.id.catSearchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Method to collect input data

                // Method to move to SearchResultActivity
                Toast.makeText(getContext().getApplicationContext(), "search hit", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private void spinnerInitialize(View view) {
        daySpin = view.findViewById(R.id.day_spin);
        buildSpin = view.findViewById(R.id.build_spin);
        floorSpin = view.findViewById(R.id.floor_spin);
        startSpin = view.findViewById(R.id.start_spin);
        endSpin = view.findViewById(R.id.end_spin);

        dayAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.day_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        buildAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.build_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        floorAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.floor_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        startAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.time_spin_ini, android.R.layout.simple_spinner_dropdown_item);
        endAdapt = ArrayAdapter.createFromResource(view.getContext(),
                R.array.time_spin_ini, android.R.layout.simple_spinner_dropdown_item);

        daySpin.setAdapter(dayAdapt);
        buildSpin.setAdapter(buildAdapt);
        floorSpin.setAdapter(floorAdapt);
        startSpin.setAdapter(startAdapt);
        endSpin.setAdapter(endAdapt);

        buildSpin.setEnabled(false);
        floorSpin.setEnabled(false);
        startSpin.setEnabled(false);
        endSpin.setEnabled(false);
    }

    private void spinnerListenerInitialize(){
        daySpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                        buildSpin.setEnabled(false);
                        floorSpin.setEnabled(false);
                        startSpin.setEnabled(false);
                        endSpin.setEnabled(false);
                }
                else if(i >0){
                    buildAdapt = ArrayAdapter.createFromResource(view.getContext(),
                            R.array.build_spin, android.R.layout.simple_spinner_dropdown_item);
                    buildSpin.setAdapter(buildAdapt);
                    buildSpin.setEnabled(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buildSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        floorSpin.setEnabled(false);
                        startSpin.setEnabled(false);
                        endSpin.setEnabled(false);
                        break;
                    case 1:
                        floorAdapt = ArrayAdapter.createFromResource(view.getContext(),
                                R.array.floor_spin_1, android.R.layout.simple_spinner_dropdown_item);
                        floorSpin.setAdapter(floorAdapt);
                        floorSpin.setEnabled(true);
                        break;
                    case 2:
                        floorAdapt = ArrayAdapter.createFromResource(view.getContext(),
                                R.array.floor_spin_2, android.R.layout.simple_spinner_dropdown_item);
                        floorSpin.setAdapter(floorAdapt);
                        floorSpin.setEnabled(true);
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        floorSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    startSpin.setEnabled(false);
                    endSpin.setEnabled(false);
                }
                else {
                    startAdapt = ArrayAdapter.createFromResource(view.getContext(),
                            R.array.time_spin, android.R.layout.simple_spinner_dropdown_item);
                    startSpin.setAdapter(startAdapt);
                    startSpin.setEnabled(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        startSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0) {
                    endSpin.setEnabled(false);
                }
                else{
                    endAdapt = ArrayAdapter.createFromResource(view.getContext(),
                            R.array.time_spin, android.R.layout.simple_spinner_dropdown_item);
                    for(int j = 0; j < i+1 ; j++){
                        endAdapt.remove(endAdapt.getItem(0));
                        endAdapt.notifyDataSetChanged();
                    }
                    endSpin.setAdapter(endAdapt);
                    endSpin.setEnabled(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    // end of class
}
