package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView dice ;
    Random r =new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice =findViewById(R.id.dice);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotatedice();
            }
        });
    }

    private void rotatedice() {
        int i = r.nextInt(6)+1;   // +1 is done to now allow value as zero
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.rotate);
         dice.startAnimation(anim);
         switch(i){
             case 1 :
                 dice.setImageResource(R.drawable.a1);
                 break;
             case 2 :
                 dice.setImageResource(R.drawable.a2);
                 break;
             case 3 :
                 dice.setImageResource(R.drawable.a3);
                 break;
             case 4 :
                 dice.setImageResource(R.drawable.a4);
                 break;
             case 5 :
                 dice.setImageResource(R.drawable.a5);
                 break;
             case 6 :
                 dice.setImageResource(R.drawable.a6);
                 break;

         }

    }
}