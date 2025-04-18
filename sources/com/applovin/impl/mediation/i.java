package com.applovin.impl.mediation;

import com.applovin.impl.fi;
import com.applovin.impl.ge;
import com.applovin.impl.mediation.ads.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements fi.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f25530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25531c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(MediationServiceImpl mediationServiceImpl, Object obj, Object obj2, int i2) {
        this.f25529a = i2;
        this.f25530b = mediationServiceImpl;
        this.f25531c = obj;
        this.d = obj2;
    }

    @Override // com.applovin.impl.fi.a
    public final void a(Object obj) {
        int i2 = this.f25529a;
        MediationServiceImpl mediationServiceImpl = this.f25530b;
        Object obj2 = this.d;
        Object obj3 = this.f25531c;
        switch (i2) {
            case 0:
                mediationServiceImpl.a((ge) obj3, (a.InterfaceC0085a) obj2, (String) obj);
                return;
            default:
                mediationServiceImpl.a((g) obj3, (fi) obj2, (String) obj);
                return;
        }
    }
}
