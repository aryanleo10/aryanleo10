package com.example.concat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btnFirst = (Button) findViewById(R.id.edittext2);
        final EditText edittext1 = (EditText) findViewById(R.id.edittext1);
        final EditText edittext2 = (EditText) findViewById(R.id.edittext2);
        final EditText edittext3 = (EditText) findViewById(R.id.edittext3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        Button button = (Button) findViewById(R.id.button);
        edittext1.requestFocus();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                textView4.setText(edittext1.getText().toString() + " " + edittext2.getText().toString() + " " +edittext3.getText().toString());
            }
        });
    }
}
