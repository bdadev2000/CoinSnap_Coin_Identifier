package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.impl.r;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final /* synthetic */ class T2 implements r.b, zb.a, NativeAd.OnNativeAdLoadedListener, OnPaidEventListener {
    public final /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6488d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6489f;

    public /* synthetic */ T2(AbstractActivityC0773x abstractActivityC0773x, com.applovin.impl.sdk.k kVar, C0781z c0781z, C0668a0 c0668a0) {
        this.f6489f = abstractActivityC0773x;
        this.b = kVar;
        this.f6487c = c0781z;
        this.f6488d = c0668a0;
    }

    @Override // com.applovin.impl.r.b
    public void a(Activity activity) {
        AbstractActivityC0773x.a((yb) this.f6489f, (C0781z) this.f6487c, (C0668a0) this.f6488d, (com.applovin.impl.sdk.k) this.b, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        m1.g gVar = (m1.g) this.f6489f;
        gVar.getClass();
        ((F2.h) this.f6487c).O(nativeAd);
        nativeAd.setOnPaidEventListener(new T2(gVar, (Context) this.f6488d, (String) this.b, nativeAd));
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        m1.g gVar = (m1.g) this.f6489f;
        gVar.getClass();
        String mediationAdapterClassName = ((NativeAd) this.b).getResponseInfo().getMediationAdapterClassName();
        Context context = (Context) this.f6487c;
        String str = (String) this.f6488d;
        w4.v0.v(context, adValue, str, mediationAdapterClassName);
        String str2 = gVar.l;
        if (str2 != null) {
            w4.v0.w(adValue, str, str2);
        }
    }

    public /* synthetic */ T2(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6489f = obj;
        this.f6487c = obj2;
        this.f6488d = obj3;
        this.b = obj4;
    }

    @Override // com.applovin.impl.zb.a
    public void a(hb hbVar, yb ybVar) {
        ((AbstractActivityC0773x) this.f6489f).a((com.applovin.impl.sdk.k) this.b, (C0781z) this.f6487c, (C0668a0) this.f6488d, hbVar, ybVar);
    }
}
