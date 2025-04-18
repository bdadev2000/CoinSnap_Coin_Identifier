package com.applovin.impl.sdk;

import android.app.Activity;
import android.view.InputEvent;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinUserService;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26849c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f26847a = 1;
        this.f26848b = appLovinAdServiceImpl;
        this.f26849c = appLovinAdLoadListener;
        this.d = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26847a;
        Object obj = this.f26849c;
        Object obj2 = this.d;
        Object obj3 = this.f26848b;
        switch (i2) {
            case 0:
                ((AppLovinAdServiceImpl) obj3).a((AppLovinError) obj2, (AppLovinAdLoadListener) obj);
                return;
            case 1:
                ((AppLovinAdServiceImpl) obj3).a((AppLovinAdLoadListener) obj, (AppLovinAd) obj2);
                return;
            case 2:
                ((i) obj3).a((AppLovinUserService.OnConsentDialogDismissListener) obj2, (Activity) obj);
                return;
            case 3:
                m.a((m) obj3, (Long) obj2, obj);
                return;
            default:
                ((q) obj3).a((List) obj2, (InputEvent) obj);
                return;
        }
    }

    public /* synthetic */ r(Object obj, int i2, Object obj2, Object obj3) {
        this.f26847a = i2;
        this.f26848b = obj;
        this.d = obj2;
        this.f26849c = obj3;
    }
}
