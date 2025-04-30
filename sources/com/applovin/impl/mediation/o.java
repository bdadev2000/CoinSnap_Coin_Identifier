package com.applovin.impl.mediation;

import com.applovin.impl.mediation.g;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9193c;

    public /* synthetic */ o(Object obj, int i9) {
        this.b = i9;
        this.f9193c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g.c.d((g.c) this.f9193c);
                return;
            case 1:
                g.c.l((g.c) this.f9193c);
                return;
            case 2:
                g.c.e((g.c) this.f9193c);
                return;
            case 3:
                g.c.i((g.c) this.f9193c);
                return;
            case 4:
                g.c.m((g.c) this.f9193c);
                return;
            default:
                g.k((g) this.f9193c);
                return;
        }
    }
}
