package org.javabase.apps.w3schools.html.learnHtml;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import org.javabase.apps.w3schools.html.R;


public class HtmlActivity extends Activity implements Comunicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager = getFragmentManager();
        HtmlDescription htmlDescription = (HtmlDescription) manager.findFragmentById(R.id.htmlDescriptionFragment);
        htmlDescription.changeData(i);
    }
}
