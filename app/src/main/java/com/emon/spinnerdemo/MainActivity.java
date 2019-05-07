package com.emon.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;
    Button button;
    String [] bloodGroup ;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);

        bloodGroup=getResources().getStringArray(R.array.bloodGroup);
        adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,bloodGroup);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=spinner.getSelectedItem().toString();
                textView.setText(text);
            }
        });
    }
}
