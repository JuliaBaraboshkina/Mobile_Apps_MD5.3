package com.example.md53;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Всплывающее сообщение", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
    public void onClick2(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast_layout));
        Toast toast2 = new Toast(getApplicationContext());
        toast2.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast2.setDuration(Toast.LENGTH_LONG);
        toast2.setView(layout);
        toast2.show();
    }
}