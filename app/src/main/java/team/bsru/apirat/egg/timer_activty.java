package team.bsru.apirat.egg;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class timer_activty extends AppCompatActivity {
    private TextView timeTextView;
    private int time = 0;
    private int min,sec = 59;
    private TextView minTextView, secTextView;
    private boolean status = true;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_activty);
        minTextView = (TextView) findViewById(R.id.min);
        secTextView = (TextView) findViewById(R.id.sec);
        button = (Button) findViewById(R.id.click);
        final MediaPlayer mediaPlayer = MediaPlayer.create(timer_activty.this, R.raw.myalert);
        min = Integer.parseInt(getIntent().getStringExtra("min"));
        min=min-1;


        myloop(mediaPlayer);
        //Toast.makeText(timer_activty.this,getIntent().getStringExtra("min"),Toast.LENGTH_SHORT).show();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });


    }

    private void myloop(final MediaPlayer md) {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if(status == true){

                    if(min == 0 && sec == 0){
                        md.start();
                        Toast.makeText(timer_activty.this, "ได้เวลากินแล้ว", Toast.LENGTH_SHORT).show();
                        status =false;
                    }else{

                        if (sec == 0){
                            sec = 59;
                            min--;
                        }
                        sec--;
                    }

                }


                String minString = Integer.toString(min);
                String secString = Integer.toString(sec);

                minTextView.setText(minString);
                secTextView.setText(secString);

                myloop(md);
            }
        }, 1000);
    }
}
