package org.javabase.apps.w3schools.html.htmlTags;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.javabase.apps.w3schools.html.R;
import org.javabase.apps.w3schools.html.helper.Comunicator;


public class HtmlTagsActivity extends AppCompatActivity implements Comunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_tags);
    }

    @Override
    public void respond(int i) {
        FragmentManager manager = getFragmentManager();
        FrgHtmlTagDescription description = (FrgHtmlTagDescription) manager.findFragmentById(R.id.htmlTagsDesFragment);
        description.changeData(i);
    }
}

