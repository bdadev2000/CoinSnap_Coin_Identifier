package com.applovin.impl;

import com.applovin.impl.cc;
import com.applovin.impl.t4;
import com.applovin.impl.y6;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class I2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6415d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6416f;

    public /* synthetic */ I2(int i9, Object obj, Object obj2, int i10) {
        this.b = i10;
        this.f6415d = obj;
        this.f6416f = obj2;
        this.f6414c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                t4.a((t4) this.f6415d, (t4.c) this.f6416f, this.f6414c);
                return;
            case 1:
                bc.b((AppLovinPostbackListener) this.f6415d, (String) this.f6416f, this.f6414c);
                return;
            case 2:
                bc.b((AppLovinAdRewardListener) this.f6415d, (AppLovinAd) this.f6416f, this.f6414c);
                return;
            case 3:
                cc.b((CopyOnWriteArraySet) this.f6415d, this.f6414c, (cc.a) this.f6416f);
                return;
            default:
                ((y6.a) this.f6415d).a((y6) this.f6416f, this.f6414c);
                return;
        }
    }

    public /* synthetic */ I2(CopyOnWriteArraySet copyOnWriteArraySet, int i9, cc.a aVar) {
        this.b = 3;
        this.f6415d = copyOnWriteArraySet;
        this.f6414c = i9;
        this.f6416f = aVar;
    }
}
