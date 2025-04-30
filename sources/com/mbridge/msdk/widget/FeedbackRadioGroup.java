package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* loaded from: classes3.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i11 - i9) {
                paddingLeft = getPaddingLeft();
                paddingTop += i13;
                i13 = getChildAt(i14).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i13 = Math.max(i13, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i15 = marginLayoutParams.leftMargin + paddingLeft;
            int i16 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i15, i16, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + i16);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        measureChildren(i9, i10);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i17 = i15 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i17 > size) {
                int max = Math.max(i15, i12);
                i13 += i14;
                i14 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v("FeedbackRadioGroup", "maxHeight:" + i13 + "---maxWidth:" + max);
                i11 = max;
                i15 = measuredWidth;
            } else {
                i14 = Math.max(i14, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i11 = i12;
                i15 = i17;
            }
            if (i16 == childCount - 1) {
                i13 += i14;
                i12 = Math.max(i15, i12);
            } else {
                i12 = i11;
            }
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i13;
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
