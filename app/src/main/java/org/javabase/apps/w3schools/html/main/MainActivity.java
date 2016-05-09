package org.javabase.apps.w3schools.html.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.javabase.apps.w3schools.html.R;
import org.javabase.apps.w3schools.html.htmlTags.HtmlTagsActivity;
import org.javabase.apps.w3schools.html.learnHtml.HtmlActivity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * calling HtmlActivity onclick action on LEARNHTML button.
     */
    public void htmlActivity(View v){
        Intent intent = new Intent(this, HtmlActivity.class);
        startActivity(intent);
    }

    /**
     * calling htmlrefence activity from htmlref button
     */
    public void htmlReference(View v){
        Intent intent = new Intent(this, HtmlTagsActivity.class);
        startActivity(intent);
    }

}
