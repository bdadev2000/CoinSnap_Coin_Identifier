package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.webkit.WebView;
import com.applovin.impl.ag;
import com.applovin.impl.c8;
import com.applovin.impl.fb;
import com.applovin.impl.p1;
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
public final /* synthetic */ class rs implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7403d;

    public /* synthetic */ rs(int i10, Object obj, Object obj2) {
        this.f7401b = i10;
        this.f7402c = obj;
        this.f7403d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7401b;
        Object obj = this.f7403d;
        Object obj2 = this.f7402c;
        switch (i10) {
            case 0:
                a8.l((a8) obj2, (c8.e) obj);
                return;
            case 1:
                c8.a((c8) obj2, (oh) obj);
                return;
            case 2:
                fb.b.a((fb.b) obj2, (AppLovinAd) obj);
                return;
            case 3:
                h1.a((h1) obj2, (Runnable) obj);
                return;
            case 4:
                sm.b((ScheduledThreadPoolExecutor) obj2, (sm.d) obj);
                return;
            case 5:
                w5.f.a((w5.f) obj2, (d9) obj);
                return;
            case 6:
                xh.i((xh) obj2, (ej) obj);
                return;
            case 7:
                ag.a((ag) obj2, (ag.c) obj);
                return;
            case 8:
                b5.b((b5) obj2, (ComponentName) obj);
                return;
            case 9:
                bc.L((AppLovinAdClickListener) obj2, (AppLovinAd) obj);
                return;
            case 10:
                bc.z((AppLovinNativeAdEventListener) obj2, (AppLovinNativeAd) obj);
                return;
            case 11:
                bc.A((AppLovinAdVideoPlaybackListener) obj2, (AppLovinAd) obj);
                return;
            case 12:
                bc.r((AppLovinAdDisplayListener) obj2, (String) obj);
                return;
            case 13:
                bc.l((AppLovinPostbackListener) obj2, (String) obj);
                return;
            case 14:
                bc.n((AppLovinNativeAdLoadListener) obj2, (AppLovinError) obj);
                return;
            case 15:
                cr.a((cr) obj2, (WeakReference) obj);
                return;
            case 16:
                ((f4) obj2).a((Activity) obj);
                return;
            case 17:
                ig.b((ig) obj2, (WebView) obj);
                return;
            case 18:
                ig.f((ig) obj2, (String) obj);
                return;
            case 19:
                ((me) obj2).a((Context) obj);
                return;
            case 20:
                n9.a((n9) obj2, (String) obj);
                return;
            case 21:
                ob.d((ob) obj2, (Context) obj);
                return;
            case 22:
                ob.e((ob) obj2, (AppLovinAd) obj);
                return;
            case 23:
                ob.i((ob) obj2, (com.applovin.impl.sdk.ad.b) obj);
                return;
            case 24:
                ok.b((ok) obj2, (SurfaceTexture) obj);
                return;
            case 25:
                p1.a.j((p1.a) obj2, (String) obj);
                return;
            case 26:
                rr.b((rr) obj2, (WebView) obj);
                return;
            case 27:
                rr.a((rr) obj2, (String) obj);
                return;
            case 28:
                s9.K((s9) obj2, (String) obj);
                return;
            default:
                t9.G((t9) obj2, (String) obj);
                return;
        }
    }
}
