package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import com.applovin.impl.InterfaceC0736p1;
import com.applovin.impl.ab;
import com.applovin.impl.f4;
import com.applovin.impl.vj;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.xq;
import com.applovin.impl.y6;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.List;
import u.C2744m;

/* loaded from: classes.dex */
public final /* synthetic */ class O2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6448d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6449f;

    public /* synthetic */ O2(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f6447c = obj;
        this.f6448d = obj2;
        this.f6449f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                vd.a((vd) this.f6447c, (ab.a) this.f6448d, (wd.a) this.f6449f);
                return;
            case 1:
                b5.d((b5) this.f6447c, (com.applovin.impl.sdk.ad.b) this.f6448d, (C2744m) this.f6449f);
                return;
            case 2:
                b5.b((b5) this.f6447c, (List) this.f6448d, (C2744m) this.f6449f);
                return;
            case 3:
                bc.a((MaxAdReviewListener) this.f6447c, (String) this.f6448d, (MaxAd) this.f6449f);
                return;
            case 4:
                em.e((em) this.f6447c, (wj) this.f6448d, (vj.a) this.f6449f);
                return;
            case 5:
                ((f4) this.f6447c).a((Activity) this.f6448d, (f4.c) this.f6449f);
                return;
            case 6:
                ((gb) this.f6447c).a((com.applovin.impl.sdk.ad.b) this.f6448d, (Runnable) this.f6449f);
                return;
            case 7:
                ((ig) this.f6447c).a((String) this.f6448d, (Runnable) this.f6449f);
                return;
            case 8:
                ((ig) this.f6447c).a((View) this.f6448d, (List) this.f6449f);
                return;
            case 9:
                l4.b((l4) this.f6447c, (h4) this.f6448d, (Activity) this.f6449f);
                return;
            case 10:
                ((InterfaceC0736p1.a) this.f6447c).b((d9) this.f6448d, (o5) this.f6449f);
                return;
            case 11:
                rr.c((rr) this.f6447c, (com.applovin.impl.sdk.network.e) this.f6448d, (AppLovinPostbackListener) this.f6449f);
                return;
            case 12:
                ((xd.a) this.f6447c).a((xd) this.f6448d, (pd) this.f6449f);
                return;
            case 13:
                ((xq.a) this.f6447c).b((d9) this.f6448d, (o5) this.f6449f);
                return;
            default:
                ((y6.a) this.f6447c).a((y6) this.f6448d, (Exception) this.f6449f);
                return;
        }
    }
}
