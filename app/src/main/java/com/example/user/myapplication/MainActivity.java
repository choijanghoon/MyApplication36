package com.example.user.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(new MyGraphicView(this));
    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setStrokeWidth(20);
            canvas.drawLine(50,50,300,50,paint);

            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(50,100,300,100,paint);

            RectF rectF = new RectF();
            rectF.set(60, 120, 60 + 200, 100 + 100);
            canvas.drawOval(rectF, paint);

            RectF rect = new RectF();
            rect.set(10, 70, 310, 370);
            canvas.drawArc(rect, 40, 110, true, paint);

            paint.setColor(Color.BLUE);
            rectF.set(60, 280, 60 + 100, 280 + 100);
            canvas.drawRect(rectF, paint);

            paint.setColor(Color.argb(120, 255, 0, 0));
            rectF.set(90, 310, 90 + 100, 310 + 100);
            canvas.drawRect(rectF, paint);
        }
    }

}
