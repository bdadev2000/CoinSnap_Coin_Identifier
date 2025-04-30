package com.applovin.impl;

import com.applovin.impl.C0728n1;
import com.applovin.impl.fb;

/* loaded from: classes.dex */
public final /* synthetic */ class K0 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6425d;

    public /* synthetic */ K0(int i9, int i10, Object obj) {
        this.b = i10;
        this.f6425d = obj;
        this.f6424c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                fb.b.b((fb.b) this.f6425d, this.f6424c);
                return;
            case 1:
                C0728n1.a.a((C0728n1.a) this.f6425d, this.f6424c);
                return;
            default:
                ((ob) this.f6425d).a(this.f6424c);
                return;
        }
    }
}
