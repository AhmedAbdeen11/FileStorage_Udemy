package com.freelancer.ahmedabdeen11.filestorage_udemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.IOException;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = (TextView) findViewById(R.id.tv);
    }

    public void loadUserName(View view) throws IOException{

        FileInputStream fileInputStream = openFileInput("file.txt");
        int read = -1;
        StringBuffer buffer = new StringBuffer();
        while ((read = fileInputStream.read()) != -1){

            buffer.append((char) read);

        }

        tv.setText(buffer.toString());
        fileInputStream.close();

    }
}
