package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.g;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.c f9191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f9192d;

    public /* synthetic */ n(g.c cVar, Bundle bundle, int i9) {
        this.b = i9;
        this.f9191c = cVar;
        this.f9192d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g.c.o(this.f9191c, this.f9192d);
                return;
            case 1:
                g.c.n(this.f9191c, this.f9192d);
                return;
            case 2:
                g.c.s(this.f9191c, this.f9192d);
                return;
            case 3:
                g.c.h(this.f9191c, this.f9192d);
                return;
            case 4:
                g.c.q(this.f9191c, this.f9192d);
                return;
            case 5:
                g.c.b(this.f9191c, this.f9192d);
                return;
            case 6:
                g.c.k(this.f9191c, this.f9192d);
                return;
            case 7:
                g.c.a(this.f9191c, this.f9192d);
                return;
            case 8:
                g.c.f(this.f9191c, this.f9192d);
                return;
            default:
                g.c.r(this.f9191c, this.f9192d);
                return;
        }
    }
}
