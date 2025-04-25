package com.glority.widget.rulerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.core.view.ViewCompat;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public class GlRulerView extends View {
    private boolean mAlphaEnable;
    private int mDataBase;
    private int mHeight;
    private int mLastX;
    private int mLineColor;
    private float mLineMaxHeight;
    private float mLineMinHeight;
    private Paint mLinePaint;
    private float mLineSpaceWidth;
    private float mLineWidth;
    private OnValueChangeListener mListener;
    private int mMaxOffset;
    private float mMaxValue;
    private float mMinValue;
    private int mMinVelocity;
    private int mMove;
    private float mOffset;
    private float mPerValue;
    private Scroller mScroller;
    private float mSelectorValue;
    private int mStepCount;
    private int mTextColor;
    private float mTextHeight;
    private float mTextMarginTop;
    private Paint mTextPaint;
    private float mTextSize;
    private int mTotalLine;
    private VelocityTracker mVelocityTracker;
    private int mWidth;

    /* loaded from: classes12.dex */
    public interface OnValueChangeListener {
        void onValueChange(float f, int i);
    }

    public static int myfloat(float f) {
        return (int) ((f * 1.0f) + 0.5f);
    }

    public GlRulerView(Context context) {
        this(context, null);
    }

    public GlRulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlRulerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStepCount = 0;
        this.mSelectorValue = 50.0f;
        this.mMaxValue = 200.0f;
        this.mMinValue = 100.0f;
        this.mPerValue = 1.0f;
        this.mDataBase = 10;
        this.mLineSpaceWidth = 5.0f;
        this.mLineWidth = 4.0f;
        this.mLineMaxHeight = 420.0f;
        this.mLineMinHeight = 17.0f;
        this.mTextMarginTop = 10.0f;
        this.mTextSize = 30.0f;
        this.mAlphaEnable = false;
        this.mLineColor = -7829368;
        this.mTextColor = ViewCompat.MEASURED_STATE_MASK;
        init(context, attributeSet);
    }

    protected void init(Context context, AttributeSet attributeSet) {
        this.mScroller = new Scroller(context);
        this.mLineSpaceWidth = myfloat(25.0f);
        this.mLineWidth = myfloat(2.0f);
        this.mLineMaxHeight = myfloat(100.0f);
        this.mLineMinHeight = myfloat(40.0f);
        this.mTextHeight = myfloat(40.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RulerView);
        this.mAlphaEnable = obtainStyledAttributes.getBoolean(R.styleable.RulerView_alphaEnable, this.mAlphaEnable);
        this.mLineSpaceWidth = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineSpaceWidth, this.mLineSpaceWidth);
        this.mLineWidth = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineWidth, this.mLineWidth);
        this.mLineMaxHeight = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineMaxHeight, this.mLineMaxHeight);
        this.mLineMinHeight = obtainStyledAttributes.getDimension(R.styleable.RulerView_lineMinHeight, this.mLineMinHeight);
        this.mLineColor = obtainStyledAttributes.getColor(R.styleable.RulerView_lineColor, this.mLineColor);
        this.mTextSize = obtainStyledAttributes.getDimension(R.styleable.RulerView_textSize, this.mTextSize);
        this.mTextColor = obtainStyledAttributes.getColor(R.styleable.RulerView_textColor, this.mTextColor);
        this.mTextMarginTop = obtainStyledAttributes.getDimension(R.styleable.RulerView_textMarginTop, this.mTextMarginTop);
        this.mSelectorValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_selectorValue, 0.0f);
        this.mMinValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_minValue, 0.0f);
        this.mMaxValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_maxValue, 100.0f);
        this.mPerValue = obtainStyledAttributes.getFloat(R.styleable.RulerView_perValue, 0.1f);
        this.mDataBase = obtainStyledAttributes.getInt(R.styleable.RulerView_dataBase, 10);
        this.mMinVelocity = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        Paint paint = new Paint(1);
        this.mTextPaint = paint;
        paint.setTextSize(this.mTextSize);
        this.mTextPaint.setColor(this.mTextColor);
        this.mTextHeight = getFontHeight(this.mTextPaint);
        Paint paint2 = new Paint(1);
        this.mLinePaint = paint2;
        paint2.setStrokeWidth(this.mLineWidth);
        this.mLinePaint.setColor(this.mLineColor);
    }

    private float getFontHeight(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public void setValue(float f, float f2, float f3, float f4, int i) {
        this.mSelectorValue = f;
        this.mMaxValue = f3;
        this.mMinValue = f2;
        float f5 = (int) (f4 * i);
        this.mPerValue = f5;
        this.mDataBase = i;
        this.mTotalLine = ((int) (((f3 * i) - (i * f2)) / f5)) + 1;
        float f6 = this.mLineSpaceWidth;
        this.mMaxOffset = (int) ((-r4) * f6);
        this.mOffset = ((f2 - f) / f5) * f6 * i;
        invalidate();
        setVisibility(0);
    }

    public void setOnValueChangeListener(OnValueChangeListener onValueChangeListener) {
        this.mListener = onValueChangeListener;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int i = this.mWidth / 2;
        for (int i2 = 0; i2 < this.mTotalLine; i2++) {
            float f2 = i;
            float f3 = this.mOffset + f2 + (i2 * this.mLineSpaceWidth);
            if (f3 >= 0.0f && f3 <= this.mWidth) {
                if (i2 % this.mDataBase == 0) {
                    f = this.mLineMaxHeight;
                } else {
                    f = this.mLineMinHeight;
                }
                if (this.mAlphaEnable) {
                    float abs = 1.0f - (Math.abs(f3 - f2) / f2);
                    this.mLinePaint.setAlpha((int) (255.0f * abs * abs));
                }
                canvas.drawLine(f3, (getHeight() - f) / 2.0f, f3, (getHeight() + f) / 2.0f, this.mLinePaint);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0 != 3) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            float r1 = r5.getX()
            int r1 = (int) r1
            android.view.VelocityTracker r2 = r4.mVelocityTracker
            if (r2 != 0) goto L13
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r4.mVelocityTracker = r2
        L13:
            android.view.VelocityTracker r2 = r4.mVelocityTracker
            r2.addMovement(r5)
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L2e
            r3 = 2
            if (r0 == r3) goto L25
            r3 = 3
            if (r0 == r3) goto L2e
            goto L3e
        L25:
            int r5 = r4.mLastX
            int r5 = r5 - r1
            r4.mMove = r5
            r4.changeMoveAndValue()
            goto L3e
        L2e:
            r4.countMoveEnd()
            r4.countVelocityTracker()
            return r5
        L35:
            android.widget.Scroller r0 = r4.mScroller
            r0.forceFinished(r2)
            r4.mLastX = r1
            r4.mMove = r5
        L3e:
            r4.mLastX = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.rulerview.GlRulerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void countVelocityTracker() {
        this.mVelocityTracker.computeCurrentVelocity(1000);
        float xVelocity = this.mVelocityTracker.getXVelocity();
        if (Math.abs(xVelocity) > this.mMinVelocity) {
            this.mScroller.fling(0, 0, (int) xVelocity, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        }
    }

    private void countMoveEnd() {
        float f = this.mOffset - this.mMove;
        this.mOffset = f;
        int i = this.mMaxOffset;
        if (f <= i) {
            this.mOffset = i;
        } else if (f >= 0.0f) {
            this.mOffset = 0.0f;
        }
        this.mLastX = 0;
        this.mMove = 0;
        float f2 = this.mMinValue;
        float round = Math.round((Math.abs(this.mOffset) * 1.0f) / this.mLineSpaceWidth);
        float f3 = this.mPerValue;
        int i2 = this.mDataBase;
        float f4 = f2 + ((round * f3) / i2);
        this.mSelectorValue = f4;
        float f5 = (((this.mMinValue - f4) * i2) / f3) * this.mLineSpaceWidth;
        this.mOffset = f5;
        this.mStepCount = Math.round((Math.abs(f5) * 1.0f) / this.mLineSpaceWidth);
        notifyValueChange();
        postInvalidate();
    }

    private void changeMoveAndValue() {
        float f = this.mOffset - this.mMove;
        this.mOffset = f;
        int i = this.mMaxOffset;
        if (f <= i) {
            this.mOffset = i;
            this.mMove = 0;
            this.mScroller.forceFinished(true);
        } else if (f >= 0.0f) {
            this.mOffset = 0.0f;
            this.mMove = 0;
            this.mScroller.forceFinished(true);
        }
        this.mSelectorValue = this.mMinValue + ((Math.round((Math.abs(this.mOffset) * 1.0f) / this.mLineSpaceWidth) * this.mPerValue) / this.mDataBase);
        notifyValueChange();
        postInvalidate();
    }

    private void notifyValueChange() {
        OnValueChangeListener onValueChangeListener = this.mListener;
        if (onValueChangeListener != null) {
            onValueChangeListener.onValueChange(this.mSelectorValue, this.mStepCount);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.mScroller.computeScrollOffset()) {
            if (this.mScroller.getCurrX() == this.mScroller.getFinalX()) {
                countMoveEnd();
                return;
            }
            int currX = this.mScroller.getCurrX();
            this.mMove = this.mLastX - currX;
            changeMoveAndValue();
            this.mLastX = currX;
        }
    }
}
