package com.google.android.material.appbar;

import F2.h;
import G.b;
import G.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import w3.AbstractC2861a;
import y3.AbstractC2950a;

/* loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC2950a {

    /* renamed from: c, reason: collision with root package name */
    public final int f13893c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
        }
    }

    @Override // G.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int f9;
        b bVar = ((e) view2.getLayoutParams()).f1225a;
        if (bVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) bVar).getClass();
            int i9 = this.f13893c;
            if (i9 == 0) {
                f9 = 0;
            } else {
                f9 = h.f((int) (0.0f * i9), 0, i9);
            }
            ViewCompat.offsetTopAndBottom(view, bottom - f9);
        }
        return false;
    }

    @Override // G.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        int i12 = view.getLayoutParams().height;
        if (i12 == -1 || i12 == -2) {
            w(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // G.b
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // y3.AbstractC2950a
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i9) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i9);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23679u);
        this.f13893c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // G.b
    public final void f(View view) {
    }
}
