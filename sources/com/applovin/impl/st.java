package com.applovin.impl;

import com.applovin.impl.fb;
import com.applovin.impl.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class st implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8089d;

    public /* synthetic */ st(int i10, int i11, Object obj) {
        this.f8087b = i11;
        this.f8089d = obj;
        this.f8088c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8087b;
        int i11 = this.f8088c;
        Object obj = this.f8089d;
        switch (i10) {
            case 0:
                fb.b.b((fb.b) obj, i11);
                return;
            case 1:
                n1.a.a((n1.a) obj, i11);
                return;
            default:
                ((ob) obj).a(i11);
                return;
        }
    }
}
