package com.applovin.impl.mediation;

import com.applovin.impl.de;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9194c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9195d;

    public /* synthetic */ p(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f9194c = obj;
        this.f9195d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((g.c) this.f9194c).a((MaxError) this.f9195d);
                return;
            case 1:
                ((MediationServiceImpl.b) this.f9194c).a((MaxAd) this.f9195d);
                return;
            case 2:
                b.a((b) this.f9194c, (de) this.f9195d);
                return;
            case 3:
                c.a((c) this.f9194c, (de) this.f9195d);
                return;
            default:
                ((g) this.f9194c).a((Runnable) this.f9195d);
                return;
        }
    }
}
