package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* loaded from: classes4.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i12 - i10) {
                paddingLeft = getPaddingLeft();
                paddingTop += i14;
                i14 = getChildAt(i15).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i14 = Math.max(i14, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i16 = marginLayoutParams.leftMargin + paddingLeft;
            int i17 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i16, i17, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + i17);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        measureChildren(i10, i11);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i18 = i16 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i18 > size) {
                int max = Math.max(i16, i13);
                i14 += i15;
                i15 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v("FeedbackRadioGroup", "maxHeight:" + i14 + "---maxWidth:" + max);
                i12 = max;
                i16 = measuredWidth;
            } else {
                i15 = Math.max(i15, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i12 = i13;
                i16 = i18;
            }
            if (i17 == childCount - 1) {
                i14 += i15;
                i13 = Math.max(i16, i13);
            } else {
                i13 = i12;
            }
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i13;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i14;
        if (mode != 1073741824) {
            size = paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
