package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userIdEdText;
    private EditText departurePointEdText;
    private EditText departureTimeEdText;
    private EditText arrivalPointEdText;
    private EditText arrivalTimeEdText;

    private String userId,departurePoint,departureTime,arrivalPoint,arrivalTime;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdEdText=findViewById(R.id.userId);
        departurePointEdText=findViewById(R.id.departurePoint);
        departureTimeEdText=findViewById(R.id.departureTime);
        arrivalPointEdText=findViewById(R.id.arrivalPoint);
        arrivalTimeEdText=findViewById(R.id.arrivalTime);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userId=userIdEdText.getText().toString();
                departurePoint=departurePointEdText.getText().toString();
                departureTime=departureTimeEdText.getText().toString();
                arrivalPoint=arrivalPointEdText.getText().toString();
                arrivalTime=arrivalTimeEdText.getText().toString();

                Ticket ticket=new Ticket(userId,departurePoint,departureTime,arrivalPoint,arrivalTime);

                Intent intent=new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("ticket",ticket);
                startActivity(intent);
            }
        });

    }
}

















