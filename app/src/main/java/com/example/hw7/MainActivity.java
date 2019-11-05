package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        boolean change_T = intent.getBooleanExtra("Ctime",false);
        if(change_T==true) {

            String string = intent.getStringExtra("level2");
            TextView text2 = (TextView) findViewById(R.id.textView2);
            text2.setText("目前畫面A_從畫面B傳來" + string);
        }
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText edittext = (EditText) findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("level", edittext .getText().toString());
                startActivity(intent);

            }
        });

    }
}
