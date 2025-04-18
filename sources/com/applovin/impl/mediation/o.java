package com.applovin.impl.mediation;

import com.applovin.impl.mediation.g;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6253c;

    public /* synthetic */ o(Object obj, int i10) {
        this.f6252b = i10;
        this.f6253c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6252b;
        Object obj = this.f6253c;
        switch (i10) {
            case 0:
                g.c.r((g.c) obj);
                return;
            case 1:
                g.c.j((g.c) obj);
                return;
            case 2:
                g.c.n((g.c) obj);
                return;
            case 3:
                g.c.q((g.c) obj);
                return;
            case 4:
                g.c.b((g.c) obj);
                return;
            default:
                g.k((g) obj);
                return;
        }
    }
}
