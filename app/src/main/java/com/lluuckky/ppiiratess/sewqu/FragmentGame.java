package com.lluuckky.ppiiratess.sewqu;

import android.graphics.Rect;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FragmentGame extends Fragment {

    private ConstraintLayout constraintLayout;
    private TextView textView;
    private ImageView imageView,imageViewPlayer;
    private int count;
    private Display display;
    private Handler handler;
    private int w;
    private int h;
    private int a;
    private int size;
    public static LP lp;

    List<ImageView> listImage;
    List<Integer> listInt;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game, container, false);
        constraintLayout =(ConstraintLayout) view.findViewById(R.id.constrainLayout);
        textView = (TextView) view.findViewById(R.id.textView);
        imageViewPlayer = (ImageView) view.findViewById(R.id.imageViewPayer);
        display = lp.getWindowManager().getDefaultDisplay();
        w = display.getWidth();
        h = display.getHeight();
        size = w/5;
        handler = new Handler();
        listImage = new ArrayList<ImageView>();
        listInt = new ArrayList<Integer>();

        handler.post(new Runnable() {
            @Override
            public void run() {

                int max = w-size;
                int min = 0 + size ;
                max -= min;
                a = (int) ((Math.random() * ++max) + min);
                listInt.add(a);
                handler.postDelayed(this::run,20);
            }
        });

        handler.post(new Runnable() {
            @Override
            public void run() {

                imageView = new ImageView(lp.getApplicationContext());
                Random random = new Random();
                int e = random.nextInt(4);
                switch (e){
                    case 0:
                        imageView.setImageResource(R.drawable.a1);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.a2);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.a3);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.a5);

                        break;
                }

                ConstraintLayout.LayoutParams imageViewLayoutParams =
                        new ConstraintLayout.LayoutParams(size,size);
                imageView.setLayoutParams(imageViewLayoutParams);
                constraintLayout.addView(imageView);
                listImage.add(imageView);
                imageView.setY(0 + size);
                for (int i = 0; i<listInt.size(); i++){
                    imageView.setX(listInt.get(i));
                }
                handler.postDelayed(this::run,1000);
            }
        });

        handler.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i< listImage.size();i++){
                    ImageView imageView = listImage.get(i);
                    int b = (int) imageView.getY();
                    imageView.setY(b+10);
                    Rect rect1 = new Rect();
                    imageView.getHitRect(rect1);
                    Rect rect2 = new Rect();
                    imageViewPlayer.getHitRect(rect2);
                    if (Rect.intersects(rect1,rect2)){
                        constraintLayout.removeView(imageView);
                        listInt.remove(i);
                        count++;
                        textView.setText(""+count);
                    }
                    if (imageView.getY()>h){
                        constraintLayout.removeView(imageView);
                        listImage.remove(imageView);
                        listInt.remove(i);
                        textView.setText(""+count);
                    }

                }
                handler.postDelayed(this::run,10);
            }
        });

        constraintLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int c =(int) motionEvent.getX();
                imageViewPlayer.setX(c);
                return true;
            }
        });

        return view;
    }


    public static void ffbb(String [] sds){
        FragmentButt.jdus = sds[0];
        FragmentButt.jhshdado = sds[1];
        FragmentButt.udsba = sds[2];
    }

}