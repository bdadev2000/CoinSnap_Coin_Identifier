package com.google.android.material.floatingactionbutton;

import G.b;
import G.e;
import Q7.n0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends b {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // G.b
    public final boolean e(View view) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final void g(e eVar) {
        if (eVar.f1231h == 0) {
            eVar.f1231h = 80;
        }
    }

    @Override // G.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        n0.r(view);
        throw null;
    }

    @Override // G.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        n0.r(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23667g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
