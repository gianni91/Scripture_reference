package com.example.jjob2.scripture_reference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public final static String extra = "com.example.jjob2.scripture_reference.MESSAGE";
    public final static String myChapter = "com.example.jjob2.scripture_reference.CHAPTER";
    public final static String myVerse = "com.example.jjob2.scripture_reference.VERSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareButtonHandler(View myView) {

        Intent myIntent = new Intent(this,Page_2.class);

        EditText bookInput = (EditText)findViewById(R.id.book_input);
        String sBookInput = bookInput.getText().toString();

        EditText chapterInput = (EditText)findViewById(R.id.chapter_input);
        String sChapterInput = chapterInput.getText().toString();

        EditText verseInput = (EditText)findViewById(R.id.verse_input);
        String sVerseInput = verseInput.getText().toString();

        myIntent.putExtra(extra,sBookInput)  ;
        myIntent.putExtra(myChapter,sChapterInput);
        myIntent.putExtra(myVerse,sVerseInput);

        startActivity(myIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
