package com.example.shapedrableprogramaticallyjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(ImageButton)findViewById(R.id.image1);
        btn1.setBackgroundColor(Color.WHITE);
        btn2=(ImageButton)findViewById(R.id.image2);
        btn2.setBackgroundColor(Color.WHITE);
        btn3=(ImageButton)findViewById(R.id.image3);
        btn3.setBackgroundColor(Color.WHITE);
        btn4=(ImageButton)findViewById(R.id.image4);
        btn4.setBackgroundColor(Color.WHITE);
        ShapeDrawable o=new ShapeDrawable(new OvalShape());
        ShapeDrawable re=new ShapeDrawable(new RectShape());
        ShapeDrawable a=new ShapeDrawable(new ArcShape(0,180));
        ShapeDrawable rr=new ShapeDrawable(new RoundRectShape(new float[]
                {5,5,5,5,5,5,5,5},null,null));
        o.setIntrinsicHeight(100);
        o.setIntrinsicWidth(100);
        o.getPaint().setColor(Color.CYAN);

        re.setIntrinsicHeight(100);
        re.setIntrinsicWidth(100);
        re.getPaint().setColor(Color.CYAN);

        a.setIntrinsicHeight(100);
        a.setIntrinsicWidth(100);
        a.getPaint().setColor(Color.CYAN);

        rr.setIntrinsicHeight(100);
        rr.setIntrinsicWidth(100);
        rr.getPaint().setColor(Color.CYAN);

        btn1.setImageDrawable(o);
        btn2.setImageDrawable(re);
        btn3.setImageDrawable(a);
        btn4.setImageDrawable(rr);
    }
}