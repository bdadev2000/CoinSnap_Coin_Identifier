package com.glority.widget.calender;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public class GlMonthView extends MonthView {
    private int mPadding;
    private float mRadio;
    private int mRadius;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.widget.calender.BaseMonthView
    public void onLoopStart(int i, int i2) {
    }

    public GlMonthView(Context context) {
        super(context);
        this.mRadio = dipToPx(getContext(), 2.0f);
        this.mPadding = dipToPx(getContext(), 2.0f);
    }

    private int dipToPx(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.widget.calender.BaseMonthView, com.glority.widget.calender.BaseView
    public void onPreviewHook() {
        this.mRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 5) * 2;
        this.mSchemePaint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.glority.widget.calender.MonthView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        canvas.drawCircle((this.mItemWidth / 2) + i, (this.mItemHeight / 2) + i2, this.mRadius, this.mSelectedPaint);
        if (!z) {
            return false;
        }
        canvas.drawCircle(i + (this.mItemWidth / 2), (i2 + this.mItemHeight) - this.mPadding, this.mRadio, this.mSchemeBasicPaint);
        return false;
    }

    @Override // com.glority.widget.calender.MonthView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        canvas.drawCircle(i + (this.mItemWidth / 2), (i2 + this.mItemHeight) - this.mPadding, this.mRadio, this.mSchemeBasicPaint);
    }

    @Override // com.glority.widget.calender.MonthView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        float f = this.mTextBaseLine + i2;
        int i3 = i + (this.mItemWidth / 2);
        if (z2) {
            canvas.drawText(String.valueOf(calendar.getDay()), i3, f, this.mSelectTextPaint);
            return;
        }
        if (z) {
            String valueOf = String.valueOf(calendar.getDay());
            float f2 = i3;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                paint2 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f2, f, paint2);
            return;
        }
        String valueOf2 = String.valueOf(calendar.getDay());
        float f3 = i3;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf2, f3, f, paint);
    }
}
