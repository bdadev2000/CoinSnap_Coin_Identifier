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

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6259d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6261g;

    public /* synthetic */ q(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6257b = i10;
        this.f6258c = obj;
        this.f6259d = obj2;
        this.f6260f = obj3;
        this.f6261g = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6257b;
        Object obj = this.f6261g;
        Object obj2 = this.f6260f;
        Object obj3 = this.f6259d;
        Object obj4 = this.f6258c;
        switch (i10) {
            case 0:
                ((g.c) obj4).a((Runnable) obj3, (MaxAdListener) obj2, (String) obj);
                return;
            case 1:
                ((g.c) obj4).a((de) obj3, (MaxReward) obj2, (Bundle) obj);
                return;
            case 2:
                ((MediationServiceImpl) obj4).a((de) obj3, (Long) obj, (MaxAdListener) obj2);
                return;
            case 3:
                ((g) obj4).a((MaxAdapterResponseParameters) obj3, (MaxAdFormat) obj2, (Activity) obj);
                return;
            default:
                ((g) obj4).a((Runnable) obj3, (MaxAdapterInitializationParameters) obj2, (Activity) obj);
                return;
        }
    }

    public /* synthetic */ q(MediationServiceImpl mediationServiceImpl, de deVar, Long l10, MaxAdListener maxAdListener) {
        this.f6257b = 2;
        this.f6258c = mediationServiceImpl;
        this.f6259d = deVar;
        this.f6261g = l10;
        this.f6260f = maxAdListener;
    }
}
