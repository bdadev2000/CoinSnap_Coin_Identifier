package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f16027a = false;

    private static int a(View view, ViewGroup viewGroup) {
        int i9 = 0;
        while (i9 < viewGroup.getChildCount() && viewGroup.getChildAt(i9) != view) {
            i9++;
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if (((r7 * r3) * 2) < (r6.getMeasuredWidth() * r6.getMeasuredHeight())) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(android.view.View r6, android.view.View r7, int r8) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.getGlobalVisibleRect(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r7.getGlobalVisibleRect(r1)
            boolean r7 = android.graphics.Rect.intersects(r0, r1)
            r2 = 0
            if (r7 == 0) goto L5a
            int r7 = r0.right
            int r3 = r1.right
            int r7 = java.lang.Math.min(r7, r3)
            int r3 = r0.left
            int r4 = r1.left
            int r3 = java.lang.Math.max(r3, r4)
            int r7 = r7 - r3
            int r3 = r0.bottom
            int r4 = r1.bottom
            int r3 = java.lang.Math.min(r3, r4)
            int r0 = r0.top
            int r1 = r1.top
            int r0 = java.lang.Math.max(r0, r1)
            int r3 = r3 - r0
            r0 = 1
            if (r8 == r0) goto L4b
            int r1 = r7 * r3
            int r1 = r1 * 2
            int r4 = r6.getMeasuredHeight()
            int r5 = r6.getMeasuredWidth()
            int r5 = r5 * r4
            if (r1 >= r5) goto L59
        L4b:
            if (r8 != r0) goto L5a
            int r7 = r7 * r3
            int r8 = r6.getMeasuredHeight()
            int r6 = r6.getMeasuredWidth()
            int r6 = r6 * r8
            if (r7 < r6) goto L5a
        L59:
            r2 = r0
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.aq.a(android.view.View, android.view.View, int):boolean");
    }

    private static boolean a(View view, ViewGroup viewGroup, int i9) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            ad.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && a(view, childAt, i9)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    ad.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f16027a = true;
                }
                if (a(childAt)) {
                    ad.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f16027a = true;
                }
                if (f16027a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, i9);
                }
            }
        }
        return f16027a;
    }

    public static boolean a(View view, int i9) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            ad.b("ViewUtils", "Banner Judge : Banner's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            ad.b("ViewUtils", "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            ad.b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        boolean z8 = ((float) ((rect.right - rect.left) * (rect.bottom - rect.top))) > ((float) (view.getMeasuredWidth() * view.getMeasuredHeight())) * (i9 == 1 ? 0.0f : 0.5f);
        boolean z9 = globalVisibleRect && z8;
        ad.b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z8);
        StringBuilder sb = new StringBuilder("View Judge : totalViewVisible is ");
        sb.append(z9);
        ad.b("ViewUtils", sb.toString());
        if (!z9) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int a6 = a(view2, viewGroup) + 1; a6 < viewGroup.getChildCount(); a6++) {
                View childAt = viewGroup.getChildAt(a6);
                if (childAt.getVisibility() == 0 && a(view, childAt, i9)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            ad.b("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean a9 = a(view, viewGroup2, i9);
                            f16027a = false;
                            if (a9) {
                                return true;
                            }
                        }
                    }
                    if (a(childAt)) {
                        ad.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        ad.b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    private static boolean a(View view) {
        return !(view != null && (view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getBackground() != null && view.getBackground().getAlpha() > 127 && view.getAlpha() > 0.5f;
    }
}
