package com.applovin.impl;

import com.applovin.impl.a7;
import com.applovin.impl.hc;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class gw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24175c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gw(int i2, Object obj, Object obj2, int i3) {
        this.f24173a = i3;
        this.f24175c = obj;
        this.d = obj2;
        this.f24174b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24173a;
        int i3 = this.f24174b;
        Object obj = this.d;
        Object obj2 = this.f24175c;
        switch (i2) {
            case 0:
                v4.a((v4) obj2, (v4.c) obj, i3);
                return;
            case 1:
                ((a7.a) obj2).a((a7) obj, i3);
                return;
            case 2:
                gc.b((AppLovinPostbackListener) obj2, (String) obj, i3);
                return;
            case 3:
                gc.b((AppLovinAdRewardListener) obj2, (AppLovinAd) obj, i3);
                return;
            default:
                hc.b((CopyOnWriteArraySet) obj2, i3, (hc.a) obj);
                return;
        }
    }

    public /* synthetic */ gw(CopyOnWriteArraySet copyOnWriteArraySet, int i2, hc.a aVar) {
        this.f24173a = 4;
        this.f24175c = copyOnWriteArraySet;
        this.f24174b = i2;
        this.d = aVar;
    }
}
