package com.example.serg.dz14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = findViewById(R.id.text);
        text1.setText("New Hello");

        TextView text2 = new TextView(this);
        ViewGroup group = findViewById(R.id.content);
        text2.setText("Picture2");
        FrameLayout.LayoutParams lpText = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        text2.setLayoutParams(lpText);
        group.addView(text2);


        ImageView im2 = new ImageView(this);

        im2.setImageDrawable(getResources().getDrawable(R.drawable.image2));
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(300, 300);
        im2.setLayoutParams(lp);
        group.addView(im2);

    }

}
