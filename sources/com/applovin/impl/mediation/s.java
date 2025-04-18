package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.ie;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25563c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25564f;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f25561a = i2;
        this.f25562b = obj;
        this.f25563c = obj2;
        this.d = obj3;
        this.f25564f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25561a;
        Object obj = this.f25564f;
        Object obj2 = this.d;
        Object obj3 = this.f25563c;
        Object obj4 = this.f25562b;
        switch (i2) {
            case 0:
                ((g.d) obj4).a((ie) obj3, (MaxReward) obj2, (Bundle) obj);
                return;
            case 1:
                ((g.d) obj4).a((Runnable) obj3, (MaxAdListener) obj2, (String) obj);
                return;
            case 2:
                ((MediationServiceImpl) obj4).a((ie) obj3, (Long) obj2, (MaxAdListener) obj);
                return;
            case 3:
                ((g) obj4).a((MaxAdapter.OnCompletionListener) obj3, (MaxAdapterInitializationParameters) obj2, (Activity) obj);
                return;
            default:
                ((g) obj4).a((MaxAdapterResponseParameters) obj3, (MaxAdFormat) obj2, (Activity) obj);
                return;
        }
    }
}
