package com.example.ar0422;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private Animation animation;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ImageView iv = findViewById(R.id.bear);
        mImageView =(ImageView) findViewById(R.id.cloud);

        final Animation animationLeft = AnimationUtils.loadAnimation(this,R.anim.translate_left);
        mImageView.startAnimation(animationLeft);


        final AnimationDrawable drawable =
                (AnimationDrawable) iv.getBackground();
        if (drawable.isRunning()) { // 동작중일 경우
            drawable.stop();  // 멈추기
        } else { // 멈춰있는 경우
            drawable.start(); // 애니메이션 동작 개시
        }
    }

    public void onClick_study(View view) {
        ImageButton go_study = (ImageButton)findViewById(R.id.go_study);

        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }

    public void onClick_game(View view) {
        ImageButton go_game = (ImageButton)findViewById(R.id.go_game);

        //go_game.setEnabled(false);
        Intent intent = new Intent(getApplicationContext(), CardActivity.class);
        startActivity(intent);

        //유니티 플레이어 액티비티 실행
    }

    public void onClick_exercise(View view) {
        ImageButton go_game = (ImageButton)findViewById(R.id.go_exercise);

        //go_game.setEnabled(false);
        Intent intent = new Intent(getApplicationContext(), CardActivity.class);
        startActivity(intent);

        //유니티 플레이어 액티비티 실행
    }


}

