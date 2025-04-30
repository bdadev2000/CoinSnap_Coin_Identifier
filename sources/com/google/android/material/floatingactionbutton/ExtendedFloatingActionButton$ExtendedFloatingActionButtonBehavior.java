package com.google.android.material.floatingactionbutton;

import G.b;
import G.e;
import Q7.n0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // G.b
    public final /* bridge */ /* synthetic */ boolean e(View view) {
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

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23666f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
