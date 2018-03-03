package com.example.aaron.listviewproject;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] brands = {"Black Scale", "Fear of God", "Reebok", " \"Off - White\"", "Pictures" };

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.brands,brands));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://black-scale.com")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://fearofgod.com")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://off---white.com")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://reebok.com")));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, Pictures.class));
                break;

        }
    }
}
