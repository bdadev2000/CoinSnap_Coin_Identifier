package com.applovin.impl.mediation;

import com.applovin.impl.ie;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25567c;

    public /* synthetic */ t(int i2, Object obj, Object obj2) {
        this.f25565a = i2;
        this.f25566b = obj;
        this.f25567c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25565a;
        Object obj = this.f25567c;
        Object obj2 = this.f25566b;
        switch (i2) {
            case 0:
                ((g.d) obj2).a((MaxError) obj);
                return;
            case 1:
                ((MediationServiceImpl.d) obj2).a((MaxAd) obj);
                return;
            case 2:
                b.a((b) obj2, (ie) obj);
                return;
            case 3:
                c.a((c) obj2, (ie) obj);
                return;
            default:
                ((g) obj2).a((Runnable) obj);
                return;
        }
    }
}
