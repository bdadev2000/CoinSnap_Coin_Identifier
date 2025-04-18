package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.fi;
import com.applovin.impl.ge;
import com.applovin.impl.ie;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.g;
import com.applovin.impl.zj;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f25523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f25524c;
    public final /* synthetic */ Activity d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f25526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f25527h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f25528i;

    public /* synthetic */ h(MediationServiceImpl mediationServiceImpl, g gVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, ge geVar, Activity activity, a.InterfaceC0085a interfaceC0085a) {
        this.f25522a = 1;
        this.f25523b = mediationServiceImpl;
        this.f25524c = gVar;
        this.f25526g = str;
        this.f25527h = maxAdapterParametersImpl;
        this.f25528i = geVar;
        this.d = activity;
        this.f25525f = interfaceC0085a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25522a;
        Object obj = this.f25525f;
        Object obj2 = this.f25528i;
        Object obj3 = this.f25527h;
        Object obj4 = this.f25526g;
        switch (i2) {
            case 0:
                this.f25523b.a((ie) obj4, this.f25524c, (ViewGroup) obj3, (Lifecycle) obj2, this.d, (a.InterfaceC0085a) obj);
                return;
            case 1:
                this.f25523b.a(this.f25524c, (String) obj4, (MaxAdapterParametersImpl) obj3, (ge) obj2, this.d, (a.InterfaceC0085a) obj);
                return;
            default:
                this.f25523b.a((fi) obj4, this.f25524c, (MaxAdapterParametersImpl) obj3, (zj) obj2, this.d, (g.c) obj);
                return;
        }
    }

    public /* synthetic */ h(MediationServiceImpl mediationServiceImpl, Object obj, g gVar, Object obj2, Object obj3, Activity activity, Object obj4, int i2) {
        this.f25522a = i2;
        this.f25523b = mediationServiceImpl;
        this.f25526g = obj;
        this.f25524c = gVar;
        this.f25527h = obj2;
        this.f25528i = obj3;
        this.d = activity;
        this.f25525f = obj4;
    }
}
