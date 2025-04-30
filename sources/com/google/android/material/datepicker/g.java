package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l0;

/* loaded from: classes2.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14022a;
    public final /* synthetic */ j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context, int i9, int i10) {
        super(context, i9, false);
        this.b = jVar;
        this.f14022a = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(l0 l0Var, int[] iArr) {
        int i9 = this.f14022a;
        j jVar = this.b;
        if (i9 == 0) {
            iArr[0] = jVar.f14032j.getWidth();
            iArr[1] = jVar.f14032j.getWidth();
        } else {
            iArr[0] = jVar.f14032j.getHeight();
            iArr[1] = jVar.f14032j.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.W
    public final void smoothScrollToPosition(RecyclerView recyclerView, l0 l0Var, int i9) {
        B b = new B(recyclerView.getContext());
        b.f5018a = i9;
        startSmoothScroll(b);
    }
}
