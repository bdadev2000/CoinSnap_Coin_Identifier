package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.k1;

/* loaded from: classes3.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f11683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Context context, int i10, int i11) {
        super(context, i10, false);
        this.f11683b = kVar;
        this.a = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(k1 k1Var, int[] iArr) {
        int i10 = this.a;
        k kVar = this.f11683b;
        if (i10 == 0) {
            iArr[0] = kVar.f11693j.getWidth();
            iArr[1] = kVar.f11693j.getWidth();
        } else {
            iArr[0] = kVar.f11693j.getHeight();
            iArr[1] = kVar.f11693j.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.v0
    public final void smoothScrollToPosition(RecyclerView recyclerView, k1 k1Var, int i10) {
        e0 e0Var = new e0(2, recyclerView.getContext(), this);
        e0Var.a = i10;
        startSmoothScroll(e0Var);
    }
}
