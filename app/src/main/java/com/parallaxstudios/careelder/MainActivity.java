/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.parallaxstudios.careelder;

import com.parallaxstudios.careelder.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;


@SuppressLint("NewApi")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onCekKondisiClick(View v) {
    	startActivity(new Intent(this, CekKondisi.class));
	}
    
    public void onSayHelloClick(View v) {
    	startActivity(new Intent(this, SayHello.class));
	}
    
    public void onPanicClick(View v) {
    	Snackbar.make(v, "Tombol Panic Di Tekan", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show();
	}
    
    public void onAboutClick(View v) {
    	startActivity(new Intent(this, About.class));
	}
}
