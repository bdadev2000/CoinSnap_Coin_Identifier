package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.t4;
import com.applovin.impl.y6;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class sv implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8097d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8098f;

    public /* synthetic */ sv(Object obj, Object obj2, int i10, int i11) {
        this.f8095b = i11;
        this.f8097d = obj;
        this.f8098f = obj2;
        this.f8096c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8095b;
        int i11 = this.f8096c;
        Object obj = this.f8098f;
        Object obj2 = this.f8097d;
        switch (i10) {
            case 0:
                t4.a((t4) obj2, (t4.c) obj, i11);
                return;
            case 1:
                bc.b((AppLovinAdRewardListener) obj2, (AppLovinAd) obj, i11);
                return;
            case 2:
                bc.b((AppLovinPostbackListener) obj2, (String) obj, i11);
                return;
            case 3:
                cc.b((CopyOnWriteArraySet) obj2, i11, (cc.a) obj);
                return;
            default:
                ((y6.a) obj2).a((y6) obj, i11);
                return;
        }
    }

    public /* synthetic */ sv(CopyOnWriteArraySet copyOnWriteArraySet, int i10, cc.a aVar) {
        this.f8095b = 3;
        this.f8097d = copyOnWriteArraySet;
        this.f8096c = i10;
        this.f8098f = aVar;
    }
}
