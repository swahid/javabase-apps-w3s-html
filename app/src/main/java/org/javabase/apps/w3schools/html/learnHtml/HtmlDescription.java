package org.javabase.apps.w3schools.html.learnHtml;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.javabase.apps.w3schools.html.R;

public class HtmlDescription extends Fragment{

    TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_html_description, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text= (TextView) getActivity().findViewById(R.id.htmlDescriptionText);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.catDescription, android.R.layout.simple_list_item_1);
        text.setText(adapter.getItem(0).toString());
    }

    public void changeData(int i){
        Resources resources = getResources();
        String[] description =  resources.getStringArray(R.array.catDescription);
        text.setText(description[i]);
    }
}
