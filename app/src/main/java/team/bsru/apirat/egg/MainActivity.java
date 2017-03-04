package team.bsru.apirat.egg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton min_3Button,min_4Button,min_6Button,
            min_10Button, min_15Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget

        min_3Button = (ImageButton) findViewById(R.id.min_3);
        min_4Button = (ImageButton) findViewById(R.id.min_4);
        min_6Button = (ImageButton) findViewById(R.id.min_6);
        min_10Button = (ImageButton) findViewById(R.id.min_10);
        min_15Button = (ImageButton) findViewById(R.id.min_15);

        /////////////////////////////////
        min_3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, timer_activty.class);
                intent.putExtra("min","3");
                startActivity(intent);
            }
        });
        ///////////////////////////////////
        min_4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, timer_activty.class);
                intent.putExtra("min","4");
                startActivity(intent);
            }
        });
        ////////////////////////////////
        min_6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, timer_activty.class);
                intent.putExtra("min", "6");
                startActivity(intent);
            }
        });
        ////////////////////////////////
        min_10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, timer_activty.class);
                intent.putExtra("min", "10");
                startActivity(intent);
            }
        });
        //////////////////////////////////
        min_15Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, timer_activty.class);
                intent.putExtra("min", "15");
                startActivity(intent);
            }
        });
    }
}
