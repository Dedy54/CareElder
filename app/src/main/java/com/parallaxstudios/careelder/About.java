package com.parallaxstudios.careelder;

import com.parallaxstudios.careelder.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);
    }
    
    public void onAbout2Click(View v) {
    	startActivity(new Intent(this, kontak.class));
	}
}
