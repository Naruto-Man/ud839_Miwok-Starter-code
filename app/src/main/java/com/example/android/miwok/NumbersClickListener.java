package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Naruto on 05/03/2018.
 */

public class NumbersClickListener implements View.OnClickListener {

    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
