package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList = new ArrayList<>();

    //Button button = findViewById(R.id.buttonForAdding);
    ArrayAdapter<String> arrayAdapter;
    public void buttonFunction(View view) {
        System.out.println("zzzzz");
//        int x = arrayList.size();
//        arrayList.remove(x-1);
//        arrayAdapter.("Apa plata");
        Toast.makeText(getApplicationContext(), "mergeeee2", Toast.LENGTH_LONG).show();
    }

    public void onClick(View view) {
        System.out.println("ssfff");
        arrayAdapter.remove("Apa plata");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        onTouchEvent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        arrayList.add("Supa la plic");
        arrayList.add("Coca-Cola");
        arrayList.add("Apa plata");

//        ArrayAdapter<String>
                arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
//         arrayAdapter.
        listView.setAdapter(arrayAdapter);
//        AdapterView.OnItemLongClickListener onItemClickListener = new AdapterView.OnItemLongClickListener() {
//
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//                System.out.println("ssss" + i);
//                arrayAdapter.remove(arrayList.get(i));
//            }
//        };
//        listView.se
//        listView.setOnItemClickListener(onItemClickListener);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int i, long id) {
                System.out.println("ssss" + i);
                arrayAdapter.remove(arrayList.get(i));
                return true;
            }
        });
    }
}
