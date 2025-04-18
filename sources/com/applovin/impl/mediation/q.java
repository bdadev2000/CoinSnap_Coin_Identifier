package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.g;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.d f25557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f25558c;

    public /* synthetic */ q(g.d dVar, Bundle bundle, int i2) {
        this.f25556a = i2;
        this.f25557b = dVar;
        this.f25558c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25556a;
        Bundle bundle = this.f25558c;
        g.d dVar = this.f25557b;
        switch (i2) {
            case 0:
                g.d.d(dVar, bundle);
                return;
            case 1:
                g.d.j(dVar, bundle);
                return;
            case 2:
                g.d.p(dVar, bundle);
                return;
            case 3:
                g.d.a(dVar, bundle);
                return;
            case 4:
                g.d.k(dVar, bundle);
                return;
            case 5:
                g.d.b(dVar, bundle);
                return;
            case 6:
                g.d.g(dVar, bundle);
                return;
            case 7:
                g.d.n(dVar, bundle);
                return;
            case 8:
                g.d.i(dVar, bundle);
                return;
            case 9:
                g.d.f(dVar, bundle);
                return;
            default:
                g.d.m(dVar, bundle);
                return;
        }
    }
}
