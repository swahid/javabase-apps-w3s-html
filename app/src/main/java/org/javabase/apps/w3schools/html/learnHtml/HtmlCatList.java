package org.javabase.apps.w3schools.html.learnHtml;




import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.javabase.apps.w3schools.html.R;

public class HtmlCatList extends Fragment implements AdapterView.OnItemClickListener{

    ListView listView;
    Comunicator comunicator;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_html_cat_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comunicator = (Comunicator) getActivity();
        listView = (ListView) getActivity().findViewById(R.id.htmlCatList);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.htmlCatListIem, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

        comunicator.respond(i);
    }
}
