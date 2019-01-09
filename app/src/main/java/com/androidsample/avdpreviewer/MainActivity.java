package com.androidsample.avdpreviewer;

import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.androidsample.vectormorphing.R;


public class MainActivity extends AppCompatActivity {
    private AnimatedVectorDrawable mSingleAVD;
    private ImageView mSingleView;
    private boolean isBlack = true;
    private static final int XML_FILE_PICKER_RESULT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deleteBars();
        setContentView(R.layout.activity_main);
        bindSingleView();
    }


    private void bindSingleView(){
        mSingleView = findViewById(R.id.single_view);
        mSingleAVD = (AnimatedVectorDrawable) ContextCompat.getDrawable(this, R.drawable.data);
        setupAVDView(mSingleAVD,mSingleView);
    }

    private void setupAVDView(AnimatedVectorDrawable animatedVectorDrawable,ImageView imageView){
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageDrawable(animatedVectorDrawable);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setAlpha(1.0f);
        listenAVD(animatedVectorDrawable);
    }
    public void listenAVD(AnimatedVectorDrawable animatedVectorDrawable){
        animatedVectorDrawable.registerAnimationCallback (new AnimatedVectorDrawable.AnimationCallback(){
            public void onAnimationEnd(Drawable drawable){ Log.e("Finished","Finished");}
            public void onAnimationStart(Drawable drawable){
                Log.e("Start","Start");
            }
        });
    }


    public void resetAVD(View view){
        mSingleAVD.reset();
    }
    public void playAVD(View view){

        mSingleAVD.start();
    }

    public void bgChange(View view){

        if(isBlack){
            findViewById(R.id.container).setBackgroundColor(Color.WHITE);
        }
        else{
            findViewById(R.id.container).setBackgroundColor(Color.GRAY);
        }

        isBlack = !isBlack;
    }

    private void deleteBars(){
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
    }

}
