package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.de;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9197d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9199g;

    public /* synthetic */ q(MediationServiceImpl mediationServiceImpl, de deVar, Long l, MaxAdListener maxAdListener) {
        this.b = 2;
        this.f9196c = mediationServiceImpl;
        this.f9197d = deVar;
        this.f9199g = l;
        this.f9198f = maxAdListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((g.c) this.f9196c).a((Runnable) this.f9197d, (MaxAdListener) this.f9198f, (String) this.f9199g);
                return;
            case 1:
                ((g.c) this.f9196c).a((de) this.f9197d, (MaxReward) this.f9198f, (Bundle) this.f9199g);
                return;
            case 2:
                ((MediationServiceImpl) this.f9196c).a((de) this.f9197d, (Long) this.f9199g, (MaxAdListener) this.f9198f);
                return;
            case 3:
                ((g) this.f9196c).a((MaxAdapterResponseParameters) this.f9197d, (MaxAdFormat) this.f9198f, (Activity) this.f9199g);
                return;
            default:
                ((g) this.f9196c).a((Runnable) this.f9197d, (MaxAdapterInitializationParameters) this.f9198f, (Activity) this.f9199g);
                return;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.b = i9;
        this.f9196c = obj;
        this.f9197d = obj2;
        this.f9198f = obj3;
        this.f9199g = obj4;
    }
}
