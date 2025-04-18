package com.applovin.impl.sdk;

import android.app.Activity;
import android.view.InputEvent;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinUserService;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8018d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8019f;

    public /* synthetic */ y(int i10, Object obj, Object obj2, Object obj3) {
        this.f8016b = i10;
        this.f8017c = obj;
        this.f8019f = obj2;
        this.f8018d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8016b;
        Object obj = this.f8018d;
        Object obj2 = this.f8019f;
        Object obj3 = this.f8017c;
        switch (i10) {
            case 0:
                ((AppLovinAdServiceImpl) obj3).a((AppLovinError) obj2, (AppLovinAdLoadListener) obj);
                return;
            case 1:
                ((AppLovinAdServiceImpl) obj3).a((AppLovinAdLoadListener) obj, (AppLovinAd) obj2);
                return;
            case 2:
                j.a((j) obj3, (AppLovinUserService.OnConsentDialogDismissListener) obj2, (Activity) obj);
                return;
            case 3:
                q.b((q) obj3, (Long) obj2, obj);
                return;
            default:
                ((w) obj3).a((List) obj2, (InputEvent) obj);
                return;
        }
    }

    public /* synthetic */ y(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8016b = 1;
        this.f8017c = appLovinAdServiceImpl;
        this.f8018d = appLovinAdLoadListener;
        this.f8019f = appLovinAd;
    }
}
