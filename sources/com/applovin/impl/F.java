package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.webkit.WebView;
import com.applovin.impl.InterfaceC0736p1;
import com.applovin.impl.ag;
import com.applovin.impl.c8;
import com.applovin.impl.fb;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sm;
import com.applovin.impl.w5;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6388d;

    public /* synthetic */ F(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f6387c = obj;
        this.f6388d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                a8.C((a8) this.f6387c, (c8.e) this.f6388d);
                return;
            case 1:
                c8.c((c8) this.f6387c, (oh) this.f6388d);
                return;
            case 2:
                ((fb.b) this.f6387c).a((AppLovinAd) this.f6388d);
                return;
            case 3:
                ((C0704h1) this.f6387c).b((Runnable) this.f6388d);
                return;
            case 4:
                sm.b((ScheduledThreadPoolExecutor) this.f6387c, (sm.d) this.f6388d);
                return;
            case 5:
                w5.f.a((w5.f) this.f6387c, (d9) this.f6388d);
                return;
            case 6:
                xh.h((xh) this.f6387c, (ej) this.f6388d);
                return;
            case 7:
                ag.a((ag) this.f6387c, (ag.c) this.f6388d);
                return;
            case 8:
                b5.c((b5) this.f6387c, (ComponentName) this.f6388d);
                return;
            case 9:
                bc.a((AppLovinNativeAdLoadListener) this.f6387c, (AppLovinError) this.f6388d);
                return;
            case 10:
                bc.a((AppLovinNativeAdEventListener) this.f6387c, (AppLovinNativeAd) this.f6388d);
                return;
            case 11:
                bc.b((AppLovinAdClickListener) this.f6387c, (AppLovinAd) this.f6388d);
                return;
            case 12:
                bc.b((AppLovinPostbackListener) this.f6387c, (String) this.f6388d);
                return;
            case 13:
                bc.b((AppLovinAdDisplayListener) this.f6387c, (String) this.f6388d);
                return;
            case 14:
                bc.b((AppLovinAdVideoPlaybackListener) this.f6387c, (AppLovinAd) this.f6388d);
                return;
            case 15:
                ((cr) this.f6387c).a((WeakReference) this.f6388d);
                return;
            case 16:
                ((f4) this.f6387c).a((Activity) this.f6388d);
                return;
            case 17:
                ((ig) this.f6387c).b((WebView) this.f6388d);
                return;
            case 18:
                ((ig) this.f6387c).a((String) this.f6388d);
                return;
            case 19:
                me.b((me) this.f6387c, (Context) this.f6388d);
                return;
            case 20:
                ((n9) this.f6387c).a((String) this.f6388d);
                return;
            case 21:
                ((ob) this.f6387c).a((AppLovinAd) this.f6388d);
                return;
            case 22:
                ((ob) this.f6387c).a((Context) this.f6388d);
                return;
            case 23:
                ((ob) this.f6387c).a((com.applovin.impl.sdk.ad.b) this.f6388d);
                return;
            case 24:
                ok.b((ok) this.f6387c, (SurfaceTexture) this.f6388d);
                return;
            case 25:
                ((InterfaceC0736p1.a) this.f6387c).b((String) this.f6388d);
                return;
            case 26:
                rr.b((rr) this.f6387c, (WebView) this.f6388d);
                return;
            case 27:
                rr.d((rr) this.f6387c, (String) this.f6388d);
                return;
            case 28:
                ((s9) this.f6387c).e((String) this.f6388d);
                return;
            default:
                ((t9) this.f6387c).e((String) this.f6388d);
                return;
        }
    }
}
