package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        EditText editText = (EditText) findViewById(R.id.input);
        //Toast.makeText(MainActivity.this, editText.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(editText.getText().toString());
    }

    private void goToActivity2(String input){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", input);
        startActivity(intent);
    }
}
