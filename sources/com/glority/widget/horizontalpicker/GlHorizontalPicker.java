package com.glority.widget.horizontalpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.glority.widget.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class GlHorizontalPicker extends View {
    private List<String> data;
    private float downX;
    private Context mContext;
    private int mItemSize;
    private float mOffset;
    private OnRollingListener mOnRollingListener;
    private Paint mOthers;
    private Rect mRect;
    private Paint mSelect;
    private Rect mSelectRect;
    private int otherColor;
    private float otherTextSize;
    private int seeSize;
    private int selectColor;
    private int selectNum;
    private float selectTextSize;

    /* loaded from: classes12.dex */
    public interface OnRollingListener {
        void onRolling(int i, String str);
    }

    public GlHorizontalPicker(Context context) {
        this(context, null);
    }

    public GlHorizontalPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlHorizontalPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.data = new ArrayList();
        this.mRect = new Rect();
        this.mSelectRect = new Rect();
        this.selectNum = 0;
        this.selectColor = ViewCompat.MEASURED_STATE_MASK;
        this.otherColor = SupportMenu.CATEGORY_MASK;
        this.mContext = context;
        initAttrs(attributeSet);
        initPaint();
    }

    private void initAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, R.styleable.GlHorizontalPicker);
        this.otherTextSize = obtainStyledAttributes.getDimension(R.styleable.GlHorizontalPicker_otherTextSize, 36.0f);
        this.selectTextSize = obtainStyledAttributes.getDimension(R.styleable.GlHorizontalPicker_selectTextSize, 36.0f);
        this.seeSize = obtainStyledAttributes.getInteger(R.styleable.GlHorizontalPicker_seeSize, 1);
        this.otherColor = obtainStyledAttributes.getColor(R.styleable.GlHorizontalPicker_otherColor, SupportMenu.CATEGORY_MASK);
        this.selectColor = obtainStyledAttributes.getColor(R.styleable.GlHorizontalPicker_selectColor, ViewCompat.MEASURED_STATE_MASK);
        obtainStyledAttributes.recycle();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mOthers = paint;
        paint.setAntiAlias(true);
        this.mOthers.setTextSize(this.otherTextSize);
        this.mOthers.setColor(this.otherColor);
        Paint paint2 = new Paint();
        this.mSelect = paint2;
        paint2.setAntiAlias(true);
        this.mSelect.setColor(this.selectColor);
        this.mSelect.setTextSize(this.selectTextSize);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = this.seeSize;
        if (i == 0) {
            return;
        }
        this.mItemSize = width / i;
        int i2 = 0;
        for (String str : this.data) {
            this.mOthers.getTextBounds(str, 0, str.length(), this.mRect);
            int width2 = this.mRect.width();
            if (width2 > i2) {
                i2 = width2;
            }
        }
        int max = Math.max(this.mItemSize, i2);
        this.mItemSize = max;
        this.seeSize = width / max;
        for (int i3 = 0; i3 < this.data.size(); i3++) {
            String str2 = this.data.get(i3);
            this.mOthers.getTextBounds(str2, 0, str2.length(), this.mRect);
            this.mSelect.getTextBounds(str2, 0, str2.length(), this.mSelectRect);
            int width3 = this.mRect.width();
            int height2 = this.mRect.height();
            int width4 = this.mSelectRect.width();
            int height3 = this.mSelectRect.height();
            int i4 = this.selectNum;
            if (i3 == i4) {
                canvas.drawText(str2, (((this.mItemSize * this.seeSize) / 2) - (width4 / 2)) + this.mOffset, (height3 + height) / 2, this.mSelect);
            } else if (i3 < i4) {
                int i5 = this.mItemSize;
                canvas.drawText(str2, ((((this.seeSize * i5) / 2) - (width3 / 2)) - ((i4 - i3) * i5)) + this.mOffset, (height2 + height) / 2, this.mOthers);
            } else {
                int i6 = this.mItemSize;
                canvas.drawText(str2, (((this.seeSize * i6) / 2) - (width3 / 2)) + ((i3 - i4) * i6) + this.mOffset, (height2 + height) / 2, this.mOthers);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.downX = motionEvent.getX();
        } else if (action == 1) {
            this.mOffset = 0.0f;
            invalidate();
        } else if (action == 2) {
            float x = motionEvent.getX();
            float f = this.downX;
            this.mOffset = x - f;
            if (x > f) {
                if (x - f >= this.mItemSize && (i = this.selectNum) > 0) {
                    this.mOffset = 0.0f;
                    int i2 = i - 1;
                    this.selectNum = i2;
                    this.downX = x;
                    OnRollingListener onRollingListener = this.mOnRollingListener;
                    if (onRollingListener != null) {
                        onRollingListener.onRolling(i2, this.data.get(i2));
                    }
                }
            } else if (f - x >= this.mItemSize && this.selectNum < this.data.size() - 1) {
                this.mOffset = 0.0f;
                int i3 = this.selectNum + 1;
                this.selectNum = i3;
                this.downX = x;
                OnRollingListener onRollingListener2 = this.mOnRollingListener;
                if (onRollingListener2 != null) {
                    onRollingListener2.onRolling(i3, this.data.get(i3));
                }
            }
            invalidate();
        }
        return true;
    }

    public int getSelectNum() {
        return this.selectNum;
    }

    public void setSelectNum(int i) {
        if (i > this.data.size()) {
            i = this.data.size() - 1;
        }
        this.selectNum = i;
        invalidate();
    }

    public void setSelectTextColor(int i) {
        this.selectColor = i;
        invalidate();
    }

    public int getSelectColor() {
        return this.selectColor;
    }

    public void setOtherTextColor(int i) {
        this.otherColor = i;
        invalidate();
    }

    public String getSelectText() {
        return this.data.get(this.selectNum);
    }

    public void setData(List<String> list) {
        this.data = list;
        invalidate();
    }

    public void setSeeSize(int i) {
        this.seeSize = i;
        invalidate();
    }

    public void setOnRollingListener(OnRollingListener onRollingListener) {
        this.mOnRollingListener = onRollingListener;
    }

    public void setOtherTextSize(float f) {
        this.otherTextSize = f;
    }

    public void setSelectTextSize(float f) {
        this.selectTextSize = f;
    }
}
