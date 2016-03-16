package org.baxter_academy.step;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Dates
        SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE, MMM");
            String timeDay = sdfDay.format(new Date());
            TextView textDay = (TextView) findViewById(R.id.day);
            textDay.setText(timeDay);
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd");
            String timeDate = sdfDate.format(new Date());
            TextView textDate = (TextView) findViewById(R.id.date);
            textDate.setText(timeDate);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
