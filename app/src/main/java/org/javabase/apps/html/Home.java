package org.javabase.apps.html;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    /**
     * calling html activity onclick action on LEARNHTML button.
     * @param v
     */
    public void htmlActivity(View v){
        Intent intent = new Intent("org.javabase.apps.html.learnHtml.HtmlActivity");
        startActivity(intent);
//        finish();
    }

    /**
     * calling htmlrefence activity from htmlref button
     * @param v
     */
    public void htmlReference(View v){
        Intent intent = new Intent("org.javabase.apps.html.htmlref.HtmlRef");
        startActivity(intent);
    }

}
