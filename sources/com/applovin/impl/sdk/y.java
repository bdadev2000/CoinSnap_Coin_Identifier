package com.applovin.impl.sdk;

import android.app.Activity;
import android.view.InputEvent;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinUserService;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11183d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11184f;

    public /* synthetic */ y(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b = 1;
        this.f11182c = appLovinAdServiceImpl;
        this.f11184f = appLovinError;
        this.f11183d = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((AppLovinAdServiceImpl) this.f11182c).a((AppLovinAdLoadListener) this.f11183d, (AppLovinAd) this.f11184f);
                return;
            case 1:
                ((AppLovinAdServiceImpl) this.f11182c).a((AppLovinError) this.f11184f, (AppLovinAdLoadListener) this.f11183d);
                return;
            case 2:
                ((j) this.f11182c).a((AppLovinUserService.OnConsentDialogDismissListener) this.f11183d, (Activity) this.f11184f);
                return;
            case 3:
                q.b((q) this.f11182c, (Long) this.f11183d, this.f11184f);
                return;
            default:
                ((w) this.f11182c).a((List) this.f11183d, (InputEvent) this.f11184f);
                return;
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f11182c = obj;
        this.f11183d = obj2;
        this.f11184f = obj3;
    }
}
