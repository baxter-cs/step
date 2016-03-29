package org.baxter_academy.step;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

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

        // Intro
        setTodayDates();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_add:
                Toast.makeText(this, "Adding", Toast.LENGTH_SHORT).show();
                Intent addActivity = new Intent(MainActivity.this, AddActivity.class);
                startActivity(addActivity);
                return true;
            case R.id.menu_edit:
                Toast.makeText(this, "Editing", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void setTodayDates() {
        SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE, MMM");
            String timeDay = sdfDay.format(new Date());
            TextView textDay = (TextView) findViewById(R.id.day);
            textDay.setText(timeDay);
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd");
            String timeDate = sdfDate.format(new Date());
            TextView textDate = (TextView) findViewById(R.id.date);
            textDate.setText(timeDate);
    }
}
