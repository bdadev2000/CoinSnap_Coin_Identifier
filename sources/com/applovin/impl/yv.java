package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import com.applovin.impl.ab;
import com.applovin.impl.f4;
import com.applovin.impl.p1;
import com.applovin.impl.vj;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.xq;
import com.applovin.impl.y6;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class yv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9302d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9303f;

    public /* synthetic */ yv(int i10, Object obj, Object obj2, Object obj3) {
        this.f9300b = i10;
        this.f9301c = obj;
        this.f9302d = obj2;
        this.f9303f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9300b;
        Object obj = this.f9303f;
        Object obj2 = this.f9302d;
        Object obj3 = this.f9301c;
        switch (i10) {
            case 0:
                vd.a((vd) obj3, (ab.a) obj2, (wd.a) obj);
                return;
            case 1:
                b5.c((b5) obj3, (List) obj2, (o.s) obj);
                return;
            case 2:
                b5.a((b5) obj3, (com.applovin.impl.sdk.ad.b) obj2, (o.s) obj);
                return;
            case 3:
                bc.o((MaxAdReviewListener) obj3, (String) obj2, (MaxAd) obj);
                return;
            case 4:
                em.e((em) obj3, (wj) obj2, (vj.a) obj);
                return;
            case 5:
                ((f4) obj3).a((Activity) obj2, (f4.c) obj);
                return;
            case 6:
                gb.c((gb) obj3, (com.applovin.impl.sdk.ad.b) obj2, (Runnable) obj);
                return;
            case 7:
                ig.d((ig) obj3, (View) obj2, (List) obj);
                return;
            case 8:
                ig.g((ig) obj3, (String) obj2, (Runnable) obj);
                return;
            case 9:
                l4.b((l4) obj3, (h4) obj2, (Activity) obj);
                return;
            case 10:
                ((p1.a) obj3).b((d9) obj2, (o5) obj);
                return;
            case 11:
                rr.c((rr) obj3, (com.applovin.impl.sdk.network.e) obj2, (AppLovinPostbackListener) obj);
                return;
            case 12:
                ((xd.a) obj3).a((xd) obj2, (pd) obj);
                return;
            case 13:
                ((xq.a) obj3).b((d9) obj2, (o5) obj);
                return;
            default:
                y6.a.a((y6.a) obj3, (y6) obj2, (Exception) obj);
                return;
        }
    }
}
