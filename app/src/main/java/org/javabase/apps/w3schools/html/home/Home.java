package org.javabase.apps.w3schools.html.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.javabase.apps.w3schools.html.R;
import org.javabase.apps.w3schools.html.htmlref.HtmlRef;
import org.javabase.apps.w3schools.html.learnHtml.HtmlActivity;


public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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
        Intent intent = new Intent(this, HtmlRef.class);
        startActivity(intent);
    }

}
