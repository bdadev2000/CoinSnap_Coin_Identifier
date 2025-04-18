package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.a;
import b0.d;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // b0.a
    public final /* bridge */ /* synthetic */ boolean e(View view) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.u(view);
        throw null;
    }

    @Override // b0.a
    public final void g(d dVar) {
        if (dVar.f2254h == 0) {
            dVar.f2254h = 80;
        }
    }

    @Override // b0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.u(view);
        throw null;
    }

    @Override // b0.a
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.u(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24024f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
