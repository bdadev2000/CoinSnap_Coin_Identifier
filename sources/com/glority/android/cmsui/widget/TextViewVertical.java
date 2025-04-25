package com.glority.android.cmsui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.glority.android.cmsui.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes14.dex */
public class TextViewVertical extends View {
    public static final int LEFT_LINE = 1;
    public static final int NONE = 0;
    public static final int RIGHT_LINE = 2;
    public static final int START_LEFT = 1;
    public static final int START_RIGHT = 2;
    private String cutChars;
    int height;
    private float line2TextMargin;
    private int lineColor;
    private boolean lineDashed;
    private int lineOrientation;
    private float lineWidth;
    Paint paint;
    private int startOrientation;
    private String text;
    private int textColor;
    private float textHorizontalMargin;
    private float textSize;
    private float textVerticalMargin;
    int width;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes14.dex */
    public @interface LINE_ORIENTATION {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes14.dex */
    public @interface START_ORIENTATION {
    }

    public TextViewVertical(Context context) {
        super(context);
        this.textSize = 56.0f;
        this.textColor = ViewCompat.MEASURED_STATE_MASK;
        this.text = "";
        this.startOrientation = 1;
        this.lineOrientation = 0;
        this.lineWidth = dip2px(getContext(), 1.0f);
        this.lineColor = ViewCompat.MEASURED_STATE_MASK;
        this.textHorizontalMargin = dip2px(getContext(), 4.0f);
        this.textVerticalMargin = dip2px(getContext(), 3.0f);
        this.line2TextMargin = -1.0f;
        this.lineDashed = false;
        this.height = -1;
        init();
    }

    public TextViewVertical(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textSize = 56.0f;
        this.textColor = ViewCompat.MEASURED_STATE_MASK;
        this.text = "";
        this.startOrientation = 1;
        this.lineOrientation = 0;
        this.lineWidth = dip2px(getContext(), 1.0f);
        this.lineColor = ViewCompat.MEASURED_STATE_MASK;
        this.textHorizontalMargin = dip2px(getContext(), 4.0f);
        this.textVerticalMargin = dip2px(getContext(), 3.0f);
        this.line2TextMargin = -1.0f;
        this.lineDashed = false;
        this.height = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextViewVertical);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.TextViewVertical_v_start) {
                this.startOrientation = obtainStyledAttributes.getInt(index, 1);
            } else if (index == R.styleable.TextViewVertical_v_text) {
                this.text = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.TextViewVertical_v_textColor) {
                this.textColor = obtainStyledAttributes.getColor(index, ViewCompat.MEASURED_STATE_MASK);
            } else if (index == R.styleable.TextViewVertical_v_textSize) {
                this.textSize = obtainStyledAttributes.getDimension(index, 16.0f);
            } else if (index == R.styleable.TextViewVertical_v_cutChars) {
                this.cutChars = obtainStyledAttributes.getString(index);
            } else if (index == R.styleable.TextViewVertical_v_textVerticalMargin) {
                this.textVerticalMargin = obtainStyledAttributes.getDimension(index, this.textVerticalMargin);
            } else if (index == R.styleable.TextViewVertical_v_textHorizontalMargin) {
                this.textHorizontalMargin = obtainStyledAttributes.getDimension(index, this.textHorizontalMargin);
            } else if (index == R.styleable.TextViewVertical_v_line) {
                this.lineOrientation = obtainStyledAttributes.getInt(index, 0);
            } else if (index == R.styleable.TextViewVertical_v_lineWidth) {
                this.lineWidth = obtainStyledAttributes.getDimension(index, this.lineWidth);
            } else if (index == R.styleable.TextViewVertical_v_lineColor) {
                this.lineColor = obtainStyledAttributes.getColor(index, ViewCompat.MEASURED_STATE_MASK);
            } else if (index == R.styleable.TextViewVertical_v_line2TextMargin) {
                this.line2TextMargin = ((this.textHorizontalMargin / 2.0f) + (this.lineWidth / 2.0f)) - obtainStyledAttributes.getDimension(index, 0.0f);
            } else if (index == R.styleable.TextViewVertical_v_line_dashed) {
                this.lineDashed = obtainStyledAttributes.getBoolean(index, false);
            }
        }
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.paint = paint;
        float f = this.textSize;
        if (f > 0.0f) {
            paint.setTextSize(f);
        }
        this.paint.setColor(this.textColor);
        this.paint.setAntiAlias(true);
        this.paint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.height = measureHeight(i2);
        int measureWidth = measureWidth(i);
        this.width = measureWidth;
        setMeasuredDimension(measureWidth, this.height);
    }

    public void setLine2TextMargin(float f) {
        this.line2TextMargin = ((this.textHorizontalMargin / 2.0f) + (this.lineWidth / 2.0f)) - f;
        invalidate();
    }

    public void setStartOrientation(int i) {
        this.startOrientation = i;
        invalidate();
    }

    public void setLineWidth(float f) {
        this.lineWidth = f;
        invalidate();
    }

    public void setLineColor(int i) {
        this.lineColor = i;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.paint.setTypeface(typeface);
        invalidate();
    }

    public void setTextHorizontalMargin(float f) {
        this.textHorizontalMargin = f;
        invalidate();
    }

    public void setTextVerticalMargin(float f) {
        this.textVerticalMargin = f;
        invalidate();
    }

    public void setLineOrientation(int i) {
        this.lineOrientation = i;
        invalidate();
    }

    public void setCutChars(String str) {
        this.cutChars = str;
        invalidate();
    }

    public void setTextSize(float f) {
        this.textSize = f;
        invalidate();
    }

    public void setTextColor(int i) {
        this.textColor = i;
        invalidate();
    }

    public void setText(String str) {
        this.text = str;
        invalidate();
    }

    public void setStart(int i) {
        this.startOrientation = i;
        invalidate();
    }

    private int measureWidth(int i) {
        return View.MeasureSpec.getMode(i) == 1073741824 ? View.MeasureSpec.getSize(i) : (int) measureTextWidth();
    }

    private int measureHeight(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int intValue = BigDecimal.valueOf(getOneWordHeight()).setScale(0, RoundingMode.UP).intValue() * this.text.length();
        return mode == Integer.MIN_VALUE ? Math.min(intValue, size) : intValue;
    }

    private float measureTextWidth() {
        float oneWordWidth;
        int paddingRight;
        if (getColNum() == 1) {
            oneWordWidth = getOneWordWidth() + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            oneWordWidth = (getOneWordWidth() * getColNum()) + getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return oneWordWidth + paddingRight;
    }

    private float getTextBaseLine(RectF rectF) {
        Paint.FontMetricsInt fontMetricsInt = this.paint.getFontMetricsInt();
        return (((rectF.top + rectF.bottom) - fontMetricsInt.top) - fontMetricsInt.bottom) / 2.0f;
    }

    private int getColNum() {
        int i;
        int colWordCount = getColWordCount() == 0 ? 1 : getColWordCount();
        String str = this.cutChars;
        if (str != null) {
            String[] split = this.text.split(str);
            int i2 = 0;
            while (i < split.length) {
                if (split[i].length() > colWordCount) {
                    i2 += split[i].length() / colWordCount;
                    i = split[i].length() % colWordCount <= 0 ? i + 1 : 0;
                }
                i2++;
            }
            return i2;
        }
        int length = this.text.length() / colWordCount;
        return this.text.length() % colWordCount > 0 ? length + 1 : length;
    }

    public float getOneWordWidth() {
        return this.paint.measureText(getResources().getString(R.string.cmsui_module_name)) + this.textHorizontalMargin;
    }

    public float getOneWordHeight() {
        this.paint.getTextBounds(getResources().getString(R.string.cmsui_module_name), 0, 1, new Rect());
        return r0.height() + this.textVerticalMargin;
    }

    private int getColWordCount() {
        return (int) (this.height / getOneWordHeight());
    }

    public int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int colWordCount = getColWordCount();
        float oneWordWidth = getOneWordWidth();
        float oneWordHeight = getOneWordHeight();
        int colNum = getColNum();
        String str = this.cutChars;
        int i = 0;
        if ((str == null ? null : str.split("|")) != null) {
            String[] split = this.text.split(this.cutChars);
            int i2 = 0;
            int i3 = 0;
            while (i3 < split.length) {
                String str2 = split[i3];
                int i4 = i2;
                int i5 = 0;
                int i6 = 0;
                while (i6 < str2.length()) {
                    String valueOf = String.valueOf(str2.charAt(i6));
                    int i7 = colNum == 1 ? i6 : i6 % colWordCount;
                    if (colNum > 1) {
                        i5 = i4 + (i6 / colWordCount);
                    }
                    int i8 = i5;
                    String str3 = str2;
                    drawText(oneWordWidth, oneWordHeight, i8, i7, valueOf, canvas);
                    i6++;
                    if (i6 == str3.length()) {
                        i4 = i8 + 1;
                    }
                    str2 = str3;
                    i5 = i8;
                }
                i3++;
                i2 = i4;
            }
            return;
        }
        int i9 = 0;
        while (i < this.text.length()) {
            String valueOf2 = String.valueOf(this.text.charAt(i));
            int i10 = colNum == 1 ? i : i % colWordCount;
            if (colNum > 1) {
                i9 = i / colWordCount;
            }
            int i11 = i9;
            drawText(oneWordWidth, oneWordHeight, i11, i10, valueOf2, canvas);
            i++;
            i9 = i11;
        }
    }

    private void drawText(float f, float f2, int i, int i2, String str, Canvas canvas) {
        RectF rectF;
        if (this.startOrientation == 1) {
            float f3 = i * f;
            float f4 = i2 * f2;
            rectF = new RectF(f3, f4, f + f3, f2 + f4);
        } else {
            int i3 = this.width;
            float f5 = (i + 1) * f;
            float f6 = i2 * f2;
            rectF = new RectF(i3 - f5, f6, (i3 - f5) + f, f2 + f6);
        }
        float textBaseLine = getTextBaseLine(rectF);
        this.paint.setColor(this.textColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawText(str, rectF.centerX(), textBaseLine, this.paint);
        this.paint.setColor(this.lineColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.lineWidth);
        if (this.lineDashed) {
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{10.0f, 5.0f}, 1.0f);
            this.paint.setAntiAlias(true);
            this.paint.setPathEffect(dashPathEffect);
        }
        if (this.line2TextMargin == -1.0f) {
            this.line2TextMargin = (this.lineWidth * 1.0f) / 2.0f;
        }
        int i4 = this.lineOrientation;
        if (i4 == 2) {
            Path path = new Path();
            path.moveTo(rectF.right - this.line2TextMargin, rectF.top);
            path.lineTo(rectF.right - this.line2TextMargin, rectF.bottom);
            canvas.drawPath(path, this.paint);
            return;
        }
        if (i4 == 1) {
            Path path2 = new Path();
            path2.moveTo(rectF.left + this.line2TextMargin, rectF.top);
            path2.lineTo(rectF.left + this.line2TextMargin, rectF.bottom);
            canvas.drawPath(path2, this.paint);
        }
    }
}
