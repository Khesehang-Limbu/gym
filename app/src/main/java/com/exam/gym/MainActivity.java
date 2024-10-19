package com.exam.gym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        GifImageView gifImageView = findViewById(R.id.pppGif);
        GifImageView gifImageView1 = findViewById(R.id.bbGif);
        GifImageView gifImageView2 = findViewById(R.id.cccGif);
        GifImageView gifImageView3 = findViewById(R.id.tttGif);
        GifImageView gifImageView4 = findViewById(R.id.pic3Gif);
        GifImageView gifImageView5 = findViewById(R.id.lllGif);

        if (gifImageView.getDrawable() instanceof GifDrawable && gifImageView1.getDrawable() instanceof  GifDrawable && gifImageView2.getDrawable() instanceof GifDrawable && gifImageView3.getDrawable() instanceof GifDrawable && gifImageView4.getDrawable() instanceof GifDrawable && gifImageView5.getDrawable() instanceof GifDrawable) {
            ((GifDrawable) gifImageView.getDrawable()).recycle();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =findViewById(R.id.tool);
        setSupportActionBar(toolbar);


        button1=findViewById(R.id.backbutton);
        button2=findViewById(R.id.bicepsbutton);
        button3=findViewById(R.id.chestbutton);
        button4=findViewById(R.id.tricepbutton);
        button5=findViewById(R.id.shoulderbutton);
        button6=findViewById(R.id.legbutton);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,backActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,bicepActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,chestActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,tricepActivity.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,shoulderActivity.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,legActivity.class);
                startActivity(intent);
            }
        });

    }


    public void back(View view) {
        Intent intent=new Intent(MainActivity.this,backActivity.class);
        startActivity(intent);

    }

    public void bicep(View view) {
        Intent intent=new Intent(MainActivity.this,bicepActivity.class);
        startActivity(intent);
    }

    public void chest(View view) {
        Intent intent=new Intent(MainActivity.this,chestActivity.class);
        startActivity(intent);
    }

    public void tricep(View view) {
        Intent intent=new Intent(MainActivity.this,tricepActivity.class);
        startActivity(intent);
    }

    public void shoulder(View view) {
        Intent intent=new Intent(MainActivity.this,shoulderActivity.class);
        startActivity(intent);



    }

    public void leg(View view) {
        Intent intent=new Intent(MainActivity.this,legActivity.class);
        startActivity(intent);
    }
}