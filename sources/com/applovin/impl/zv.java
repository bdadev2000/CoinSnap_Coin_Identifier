package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.xq;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class zv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9509d;

    public /* synthetic */ zv(int i10, Object obj, Object obj2) {
        this.f9507b = i10;
        this.f9508c = obj;
        this.f9509d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9507b;
        Object obj = this.f9509d;
        Object obj2 = this.f9508c;
        switch (i10) {
            case 0:
                vm.e((vm) obj2, (MaxError) obj);
                return;
            case 1:
                w1.a((w1) obj2, (Runnable) obj);
                return;
            case 2:
                wm.i((wm) obj2, (MaxError) obj);
                return;
            case 3:
                ((xq.a) obj2).b((String) obj);
                return;
            case 4:
                ((xq.a) obj2).a((yq) obj);
                return;
            case 5:
                ((xq.a) obj2).a((Exception) obj);
                return;
            case 6:
                zl.e((zl) obj2, (ke) obj);
                return;
            default:
                zp.a((Context) obj2, (String) obj);
                return;
        }
    }
}
