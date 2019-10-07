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

public class RecommendTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstanceState){
        final View thisView = inflater.inflate(R.layout.recommend_layout,container,false);

        Button recomButton = thisView.findViewById(R.id.recommendButton);

        recomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Method to set data input based on user timetable

                // Method to move to SearchResultActivity

                Toast.makeText(getContext().getApplicationContext(), "recommend hit", Toast.LENGTH_SHORT).show();
            }
        });

        return thisView;
    }
}
