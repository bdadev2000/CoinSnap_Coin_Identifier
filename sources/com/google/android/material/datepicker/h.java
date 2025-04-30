package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.l0;

/* loaded from: classes2.dex */
public final class h extends S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f14023a;

    public h(j jVar) {
        this.f14023a = jVar;
        u.d(null);
        u.d(null);
    }

    @Override // androidx.recyclerview.widget.S
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, l0 l0Var) {
        if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f14023a.getClass();
            throw null;
        }
    }
}
