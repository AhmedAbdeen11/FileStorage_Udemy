package com.freelancer.ahmedabdeen11.filestorage_udemy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.et_username);
    }

    public void saveUsername(View view) throws IOException{

        String usernameValue = userName.getText().toString();
        FileOutputStream fileOutputStream = openFileOutput("file.txt", MODE_PRIVATE);
        fileOutputStream.write(usernameValue.getBytes());
        fileOutputStream.close();
        Toast.makeText(this, "Saved file " + getFilesDir().toString() + "/file.txt", Toast.LENGTH_LONG).show();

    }

    public void goToNext(View view) {
        startActivity(new Intent(getApplicationContext(), SecondActivity.class));
    }
}
