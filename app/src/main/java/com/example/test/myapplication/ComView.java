package com.example.test.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class ComView extends View {
    public ComView(Context context) {
        super(context);
    }

    public ComView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ComView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ComView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }




    private Paint bgPaint = new Paint();
    private RectF bgRect = new RectF();
    private Paint textPaint = new Paint();
    private RectF rectF2 = new RectF();
    @Override
    protected void onDraw(Canvas canvas) {
        Context context = this.getContext();
        // 顶部描述底层画布
        bgPaint.setStyle(Paint.Style.FILL);
        bgPaint.setColor(context.getColor(R.color.blue));
        float width = getWidth();
        int height = getHeight();
        float heightHalf = height / 2.0f;
        bgRect.set(0, 0, width, heightHalf);
        canvas.drawRect(bgRect, bgPaint);
        // 文字paint
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(context.getColor(R.color.white));
        textPaint.setTextSize(30.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        //横向居中
        String text = context.getString(R.string.refresh);
        canvas.drawText(text, bgRect.centerX(), 100.0f, textPaint);

        //底部描述底层画布
        bgPaint.setColor(context.getColor(R.color.line_default_color));
        float top = heightHalf + 10;
        rectF2.set(0, top, width, heightHalf * 2);
        canvas.drawRect(rectF2, bgPaint);

        // 文字paint
        textPaint.setColor(context.getColor(R.color.black));
        textPaint.setTextSize(30.0f);
        //横向居中
        String text2 = context.getString(R.string.rf);
        canvas.drawText(text2, rectF2.centerX(), heightHalf * 2 - 100.0f, textPaint);

        textPaint.setColor(context.getColor(R.color.gray));
        textPaint.setTextSize(30.0f);
        String text3 = context.getString(R.string.rf2);
        canvas.drawText(text3, rectF2.centerX(), heightHalf * 2 - 50.0f, textPaint);

        super.onDraw(canvas);
    }

}
