package org.javabase.apps.w3schools.html.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.javabase.apps.w3schools.html.R;


public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    /**
     * calling HtmlActivity onclick action on LEARNHTML button.
     * @param v
     */
    public void htmlActivity(View v){
        Intent intent = new Intent("org.javabase.apps.w3schools.html.learnHtml.HtmlActivity");
        startActivity(intent);
//        finish();
    }

    /**
     * calling htmlrefence activity from htmlref button
     * @param v
     */
    public void htmlReference(View v){
        Intent intent = new Intent("org.javabase.apps.w3schools.html.htmlref.HtmlRef");
        startActivity(intent);
    }

}
