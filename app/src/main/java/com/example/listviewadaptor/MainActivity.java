package com.example.listviewadaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String>name;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        name=new ArrayList<>();

        name.add("Item1");
        name.add("Item2");
        name.add("Item3");
        name.add("Item4");
        name.add("Item5");
        name.add("Item6");
        name.add("Item7");
        name.add("Item8");
        name.add("Item9");
        name.add("Item10");
        name.add("Item11");
        name.add("Item12");
        name.add("Item13");
        name.add("Item14");
        name.add("Item15");
        name.add("Item16");
        name.add("Item17");
        name.add("Item18");
        name.add("Item19");
        name.add("Item20");


        ArrayAdapter <String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(arrayAdapter);
    }
}