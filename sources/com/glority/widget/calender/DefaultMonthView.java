package com.glority.widget.calender;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public final class DefaultMonthView extends MonthView {
    private int mPadding;
    private float mRadio;
    private float mSchemeBaseLine;
    private Paint mSchemeBasicPaint;
    private Paint mTextPaint;

    public DefaultMonthView(Context context) {
        super(context);
        this.mTextPaint = new Paint();
        this.mSchemeBasicPaint = new Paint();
        this.mTextPaint.setTextSize(CalendarUtil.dipToPx(context, 8.0f));
        this.mTextPaint.setColor(-1);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setFakeBoldText(true);
        this.mSchemeBasicPaint.setAntiAlias(true);
        this.mSchemeBasicPaint.setStyle(Paint.Style.FILL);
        this.mSchemeBasicPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeBasicPaint.setColor(-1223853);
        this.mSchemeBasicPaint.setFakeBoldText(true);
        this.mRadio = CalendarUtil.dipToPx(getContext(), 7.0f);
        this.mPadding = CalendarUtil.dipToPx(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = this.mSchemeBasicPaint.getFontMetrics();
        this.mSchemeBaseLine = (this.mRadio - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + CalendarUtil.dipToPx(getContext(), 1.0f);
    }

    @Override // com.glority.widget.calender.MonthView
    protected boolean onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        int i3 = this.mPadding;
        canvas.drawRect(i + i3, i3 + i2, (i + this.mItemWidth) - this.mPadding, (i2 + this.mItemHeight) - this.mPadding, this.mSelectedPaint);
        return true;
    }

    @Override // com.glority.widget.calender.MonthView
    protected void onDrawScheme(Canvas canvas, Calendar calendar, int i, int i2) {
        this.mSchemeBasicPaint.setColor(calendar.getSchemeColor());
        int i3 = this.mItemWidth + i;
        int i4 = this.mPadding;
        float f = this.mRadio;
        canvas.drawCircle((i3 - i4) - (f / 2.0f), i4 + i2 + f, f, this.mSchemeBasicPaint);
        canvas.drawText(calendar.getScheme(), (((i + this.mItemWidth) - this.mPadding) - (this.mRadio / 2.0f)) - (getTextWidth(calendar.getScheme()) / 2.0f), i2 + this.mPadding + this.mSchemeBaseLine, this.mTextPaint);
    }

    private float getTextWidth(String str) {
        return this.mTextPaint.measureText(str);
    }

    @Override // com.glority.widget.calender.MonthView
    protected void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        Paint paint;
        Paint paint2;
        int i3 = i + (this.mItemWidth / 2);
        int i4 = i2 - (this.mItemHeight / 6);
        if (z2) {
            canvas.drawText(String.valueOf(calendar.getDay()), i3, this.mTextBaseLine + i4, this.mSelectTextPaint);
            return;
        }
        if (z) {
            String valueOf = String.valueOf(calendar.getDay());
            float f = i3;
            float f2 = this.mTextBaseLine + i4;
            if (calendar.isCurrentDay()) {
                paint2 = this.mCurDayTextPaint;
            } else {
                paint2 = calendar.isCurrentMonth() ? this.mSchemeTextPaint : this.mOtherMonthTextPaint;
            }
            canvas.drawText(valueOf, f, f2, paint2);
            return;
        }
        String valueOf2 = String.valueOf(calendar.getDay());
        float f3 = i3;
        float f4 = this.mTextBaseLine + i4;
        if (calendar.isCurrentDay()) {
            paint = this.mCurDayTextPaint;
        } else {
            paint = calendar.isCurrentMonth() ? this.mCurMonthTextPaint : this.mOtherMonthTextPaint;
        }
        canvas.drawText(valueOf2, f3, f4, paint);
    }
}
