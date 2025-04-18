package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.a7;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import com.applovin.impl.eb;
import com.applovin.impl.h4;
import com.applovin.impl.q1;
import com.applovin.impl.wq;
import com.applovin.impl.yj;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ks implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24945c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ks(Object obj, int i2, Object obj2, Object obj3) {
        this.f24943a = i2;
        this.f24944b = obj;
        this.f24945c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24943a;
        Object obj = this.d;
        Object obj2 = this.f24945c;
        Object obj3 = this.f24944b;
        switch (i2) {
            case 0:
                ae.a((ae) obj3, (eb.a) obj2, (be.a) obj);
                return;
            case 1:
                ((a7.a) obj3).a((a7) obj2, (Exception) obj);
                return;
            case 2:
                ((ce.a) obj3).a((ce) obj2, (ud) obj);
                return;
            case 3:
                d5.b((d5) obj3, (com.applovin.impl.sdk.ad.b) obj2, (CustomTabsSession) obj);
                return;
            case 4:
                d5.c((d5) obj3, (List) obj2, (CustomTabsSession) obj);
                return;
            case 5:
                fm.e((fm) obj3, (zj) obj2, (yj.a) obj);
                return;
            case 6:
                gc.a((MaxAdReviewListener) obj3, (String) obj2, (MaxAd) obj);
                return;
            case 7:
                ((h4) obj3).a((Activity) obj2, (h4.c) obj);
                return;
            case 8:
                ((kb) obj3).a((com.applovin.impl.sdk.ad.b) obj2, (Runnable) obj);
                return;
            case 9:
                ((mg) obj3).a((String) obj2, (Runnable) obj);
                return;
            case 10:
                ((mg) obj3).a((View) obj2, (List) obj);
                return;
            case 11:
                n4.b((n4) obj3, (j4) obj2, (Activity) obj);
                return;
            case 12:
                ((q1.a) obj3).b((f9) obj2, (q5) obj);
                return;
            case 13:
                ((qr) obj3).b((com.applovin.impl.sdk.network.e) obj2, (AppLovinPostbackListener) obj);
                return;
            default:
                ((wq.a) obj3).b((f9) obj2, (q5) obj);
                return;
        }
    }
}
