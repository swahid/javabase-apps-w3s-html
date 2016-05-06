package org.javabase.apps.html;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends Activity {

    @Override
    protected void onStart() {
        super.onStart();
        setTitle("Hello apps");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    private void logo(){
        ImageView iv = (ImageView)findViewById(R.id.banner);
        iv.setImageResource(R.mipmap.logo);
    }
    public void htmlActivity(View view){

    }
}
