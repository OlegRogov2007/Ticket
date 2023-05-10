package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button2);
        textView=findViewById(R.id.textView2);

        Bundle bundle= getIntent().getExtras();


        if(bundle!= null){
            Ticket ticket=(Ticket) bundle.getSerializable("ticket");
            textView.setText("Id пользователя "+ticket.getUserId()+"\n"+
                    "Место отправления "+ ticket.getDeparturePoint()+"\n"+
                    "Время отправления "+ticket.getDepartureTime()+"\n"+
                    "Место прибытия "+ticket.getArrivalPoint()+"\n"+
                    "Время прибытия "+ticket.getArrivalTime());
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}