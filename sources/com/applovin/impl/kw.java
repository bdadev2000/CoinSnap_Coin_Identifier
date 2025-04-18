package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.wq;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24953c;

    public /* synthetic */ kw(int i2, Object obj, Object obj2) {
        this.f24951a = i2;
        this.f24952b = obj;
        this.f24953c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24951a;
        Object obj = this.f24953c;
        Object obj2 = this.f24952b;
        switch (i2) {
            case 0:
                wm.m((wm) obj2, (MaxError) obj);
                return;
            case 1:
                ((wq.a) obj2).b((String) obj);
                return;
            case 2:
                ((wq.a) obj2).a((xq) obj);
                return;
            case 3:
                ((wq.a) obj2).a((Exception) obj);
                return;
            case 4:
                xm.i((xm) obj2, (MaxError) obj);
                return;
            default:
                yp.c((Context) obj2, (String) obj);
                return;
        }
    }
}
