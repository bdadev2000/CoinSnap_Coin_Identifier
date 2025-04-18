package com.applovin.impl.mediation;

import com.applovin.impl.de;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6268d;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f6266b = i10;
        this.f6267c = obj;
        this.f6268d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6266b;
        Object obj = this.f6268d;
        Object obj2 = this.f6267c;
        switch (i10) {
            case 0:
                ((g.c) obj2).a((MaxError) obj);
                return;
            case 1:
                ((MediationServiceImpl.b) obj2).a((MaxAd) obj);
                return;
            case 2:
                b.a((b) obj2, (de) obj);
                return;
            case 3:
                c.a((c) obj2, (de) obj);
                return;
            default:
                ((g) obj2).a((Runnable) obj);
                return;
        }
    }
}
