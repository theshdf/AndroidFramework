package fun.shdf.androidframework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * code-time: 2018/9/4
 * code-author: by shdf
 * coder-wechat: zcm656025633
 * exp: 自定义圆柱体  实现简单的双柱子
 **/
public class ChartView extends View{
    private int mWidth,mHeight;//todo 控件的宽高
    private int MAX_Value = 200;//todo  表示view中y轴高度的得值为200,
    private List<Float> datas;
    private Paint paint,textPaint;
    private int mCircleWidth;//定义每个圆柱体的地步长度
    private int padding = 40;//todo 左右边距
    private int space = 10;
    private int startWidth;
    private int centerWidth;
    private int y1 = 50;
    private int y2 = 120;


    public ChartView(Context context) {
        this(context,null);
    }

    public ChartView(Context context, @Nullable AttributeSet attrs) {
       this(context,attrs,0);
    }

    public ChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context,attrs,defStyleAttr);
        //todo 获取属性

        datas = new ArrayList<>();
        init();
    }

    /**
     * 初始化画笔
     */
    private void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(3);
        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(2);
    }

    /**
     * 填充要绘制的数据
     * @param data
     */
    public void setData(List<Float> data){
        datas.clear();
        datas.addAll(data);
        y1 = 80;
        y2 = 140;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width,height;
        int mWidth = MeasureSpec.getSize(widthMeasureSpec);
        int mHeight = MeasureSpec.getSize(heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        if(widthMode == MeasureSpec.EXACTLY){
           width = mWidth;
        }
        else{
            width = mWidth/2;
        }
        if(heightMode == MeasureSpec.EXACTLY){
            height = mHeight;
        }
        else{
            height = mHeight/2;
        }
        setMeasuredDimension(width,height);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        mCircleWidth = getWidth()/10;
        centerWidth = getWidth()/2;
        startWidth = 2*padding;
        mHeight = getHeight()-padding;
        mWidth = getWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制横纵坐标
        paint.setColor(Color.RED);
        canvas.drawLine(padding,mHeight,mWidth-padding,mHeight,paint);//x轴
        canvas.drawLine(padding,padding,padding,mHeight,paint);//y轴

        //todo  绘制柱体
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        Rect rect = new Rect();
        rect.top = getHeight()-y1;
        rect.left = startWidth;
        rect.bottom = mHeight;
        rect.right = startWidth+mCircleWidth;
        canvas.drawRect(rect,paint);

        //todo 绘制当前柱体的相关文字
        canvas.drawText("人数",startWidth,mHeight+padding,textPaint);


        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        Rect rect2 = new Rect();
        rect2.top = mHeight-y2;
        rect2.left = startWidth+space+mCircleWidth;
        rect2.bottom = mHeight;
        rect2.right = startWidth+2*mCircleWidth+space;
        canvas.drawRect(rect2,paint);

        //todo 绘制当前柱体的相关文字
        canvas.drawText("工程数",rect2.left,mHeight+padding,textPaint);
    }
}
