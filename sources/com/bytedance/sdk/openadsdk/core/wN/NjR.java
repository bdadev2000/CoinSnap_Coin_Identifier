package com.bytedance.sdk.openadsdk.core.wN;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class NjR {
    private static ViewGroup.LayoutParams Sg(View view, ViewGroup.LayoutParams layoutParams) {
        ViewParent parent;
        ViewGroup.LayoutParams layoutParams2;
        if (view == null || layoutParams == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (parent instanceof LinearLayout) {
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        } else {
            layoutParams2 = null;
        }
        if (parent instanceof RelativeLayout) {
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                return null;
            }
            layoutParams2 = new RelativeLayout.LayoutParams(layoutParams);
        }
        if (parent instanceof FrameLayout) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                return null;
            }
            return new FrameLayout.LayoutParams(layoutParams);
        }
        return layoutParams2;
    }

    public static int YFl(int i10) {
        return ((i10 & 3) == 3 || (i10 & 5) == 5) ? i10 | 8388608 : i10;
    }

    private static void YFl(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
            marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = YFl(layoutParams2.gravity);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams3.gravity = YFl(layoutParams3.gravity);
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
            int[] rules = layoutParams4.getRules();
            if (rules[9] != 0) {
                layoutParams4.addRule(20);
            }
            if (rules[11] != 0) {
                layoutParams4.addRule(21);
            }
            int i10 = rules[0];
            if (i10 != 0) {
                layoutParams4.addRule(16, i10);
            }
            int i11 = rules[1];
            if (i11 != 0) {
                layoutParams4.addRule(17, i11);
            }
            int i12 = rules[5];
            if (i12 != 0) {
                layoutParams4.addRule(18, i12);
            }
            int i13 = rules[7];
            if (i13 != 0) {
                layoutParams4.addRule(19, i13);
            }
        }
    }

    public static ViewGroup.LayoutParams YFl(View view, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams Sg = Sg(view, layoutParams);
        if (Sg != null) {
            layoutParams = Sg;
        }
        YFl(layoutParams);
        return layoutParams;
    }
}
