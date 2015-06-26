package com.example.jjob2.scripture_reference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class Page_2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_page_2);   //removed this

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.extra);
        String chapter = intent.getStringExtra(MainActivity.myChapter);
        String verse = intent.getStringExtra(MainActivity.myVerse);

        TextView myTextView = new TextView(this);
        myTextView.setTextSize(30);
        myTextView.setText("Your favorite scripture is: " + message + " " + chapter + ":" + verse);

        setContentView(myTextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
