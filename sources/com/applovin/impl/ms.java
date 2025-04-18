package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.e8;
import com.applovin.impl.fg;
import com.applovin.impl.jb;
import com.applovin.impl.q1;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.tm;
import com.applovin.impl.y5;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class ms implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25612c;

    public /* synthetic */ ms(int i2, Object obj, Object obj2) {
        this.f25610a = i2;
        this.f25611b = obj;
        this.f25612c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25610a;
        Object obj = this.f25612c;
        Object obj2 = this.f25611b;
        switch (i2) {
            case 0:
                ai.h((ai) obj2, (ij) obj);
                return;
            case 1:
                c8.k((c8) obj2, (e8.e) obj);
                return;
            case 2:
                e8.c((e8) obj2, (rh) obj);
                return;
            case 3:
                ((i1) obj2).b((Runnable) obj);
                return;
            case 4:
                ((jb.b) obj2).a((AppLovinAd) obj);
                return;
            case 5:
                tm.b((ScheduledThreadPoolExecutor) obj2, (tm.d) obj);
                return;
            case 6:
                y5.f.a((y5.f) obj2, (f9) obj);
                return;
            case 7:
                am.e((am) obj2, (pe) obj);
                return;
            case 8:
                ((br) obj2).a((WeakReference) obj);
                return;
            case 9:
                ((fg) obj2).a((fg.c) obj);
                return;
            case 10:
                gc.b((AppLovinAdClickListener) obj2, (AppLovinAd) obj);
                return;
            case 11:
                gc.b((AppLovinPostbackListener) obj2, (String) obj);
                return;
            case 12:
                gc.a((AppLovinNativeAdLoadListener) obj2, (AppLovinError) obj);
                return;
            case 13:
                gc.b((AppLovinAdDisplayListener) obj2, (String) obj);
                return;
            case 14:
                gc.a((AppLovinNativeAdEventListener) obj2, (AppLovinNativeAd) obj);
                return;
            case 15:
                gc.b((AppLovinAdVideoPlaybackListener) obj2, (AppLovinAd) obj);
                return;
            case 16:
                ((h4) obj2).a((Activity) obj);
                return;
            case 17:
                ((j2) obj2).a((View) obj);
                return;
            case 18:
                ((mg) obj2).a((String) obj);
                return;
            case 19:
                ((mg) obj2).b((WebView) obj);
                return;
            case 20:
                ((p9) obj2).a((String) obj);
                return;
            case 21:
                ((q1.a) obj2).b((String) obj);
                return;
            case 22:
                ((qr) obj2).c((String) obj);
                return;
            case 23:
                ((qr) obj2).b((WebView) obj);
                return;
            case 24:
                re.b((re) obj2, (Context) obj);
                return;
            case 25:
                rk.b((rk) obj2, (SurfaceTexture) obj);
                return;
            case 26:
                ((tb) obj2).a((AppLovinAd) obj);
                return;
            case 27:
                ((tb) obj2).a((Context) obj);
                return;
            case 28:
                ((u9) obj2).a((String) obj);
                return;
            default:
                ((v9) obj2).a((String) obj);
                return;
        }
    }
}
