package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.g;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.c f6255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f6256d;

    public /* synthetic */ p(g.c cVar, Bundle bundle, int i10) {
        this.f6254b = i10;
        this.f6255c = cVar;
        this.f6256d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6254b;
        Bundle bundle = this.f6256d;
        g.c cVar = this.f6255c;
        switch (i10) {
            case 0:
                g.c.i(cVar, bundle);
                return;
            case 1:
                g.c.c(cVar, bundle);
                return;
            case 2:
                g.c.k(cVar, bundle);
                return;
            case 3:
                g.c.f(cVar, bundle);
                return;
            case 4:
                g.c.m(cVar, bundle);
                return;
            case 5:
                g.c.s(cVar, bundle);
                return;
            case 6:
                g.c.p(cVar, bundle);
                return;
            case 7:
                g.c.e(cVar, bundle);
                return;
            case 8:
                g.c.t(cVar, bundle);
                return;
            default:
                g.c.d(cVar, bundle);
                return;
        }
    }
}
