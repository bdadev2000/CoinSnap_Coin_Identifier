package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import b0.a;
import b0.d;
import com.bumptech.glide.e;
import java.util.ArrayList;
import t9.c;

/* loaded from: classes3.dex */
public class AppBarLayout$ScrollingViewBehavior extends c {

    /* renamed from: c, reason: collision with root package name */
    public int f11550c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void x(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    @Override // b0.a
    public final boolean f(View view, View view2) {
        return false;
    }

    @Override // b0.a
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int o10;
        a aVar = ((d) view2.getLayoutParams()).a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i10 = bottom + 0 + 0;
            int i11 = this.f11550c;
            if (i11 == 0) {
                o10 = 0;
            } else {
                o10 = e.o((int) (i11 * 0.0f), 0, i11);
            }
            ViewCompat.offsetTopAndBottom(view, i10 - o10);
        }
        return false;
    }

    @Override // b0.a
    public final void i() {
    }

    @Override // b0.a
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int i13 = view.getLayoutParams().height;
        if (i13 == -1 || i13 == -2) {
            x(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // b0.a
    public final void q(CoordinatorLayout coordinatorLayout, View view) {
        x(coordinatorLayout.j(view));
    }

    @Override // t9.c
    public final void w(CoordinatorLayout coordinatorLayout, View view, int i10) {
        x(coordinatorLayout.j(view));
        coordinatorLayout.q(i10, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.u);
        this.f11550c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
