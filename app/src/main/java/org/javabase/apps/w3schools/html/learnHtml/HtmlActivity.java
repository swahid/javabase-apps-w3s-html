package org.javabase.apps.w3schools.html.learnHtml;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import org.javabase.apps.w3schools.html.R;
import org.javabase.apps.w3schools.html.helper.Comunicator;


public class HtmlActivity extends Activity implements Comunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager = getFragmentManager();
        FrgHtmlDescription htmlDescription = (FrgHtmlDescription) manager.findFragmentById(R.id.htmlDescriptionFragment);
        htmlDescription.changeData(i);
    }
}
