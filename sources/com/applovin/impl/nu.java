package com.applovin.impl;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.ViewCompat;
import com.applovin.impl.p1;

/* loaded from: classes.dex */
public final /* synthetic */ class nu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6443d;

    public /* synthetic */ nu(int i10, Object obj, boolean z10) {
        this.f6441b = i10;
        this.f6443d = obj;
        this.f6442c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0.w2 windowInsetsController;
        int i10 = this.f6441b;
        int i11 = 1;
        boolean z10 = this.f6442c;
        Object obj = this.f6443d;
        switch (i10) {
            case 0:
                og.u((og) obj, z10);
                return;
            case 1:
                ((p1.a) obj).a(z10);
                return;
            case 2:
                s7.f0 f0Var = (s7.f0) ((r4.c) obj).f24000d;
                int i12 = n9.h0.a;
                s7.i0 i0Var = f0Var.f24350b;
                if (i0Var.Z != z10) {
                    i0Var.Z = z10;
                    i0Var.f24411l.k(23, new s7.c0(z10, i11));
                    return;
                }
                return;
            default:
                View view = (View) obj;
                if (z10 && (windowInsetsController = ViewCompat.getWindowInsetsController(view)) != null) {
                    windowInsetsController.a.v();
                    return;
                } else {
                    ((InputMethodManager) d0.h.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                    return;
                }
        }
    }
}
