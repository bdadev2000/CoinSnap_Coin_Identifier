package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a, reason: collision with root package name */
    private final k f10732a;

    public UserServiceImpl(k kVar) {
        this.f10732a = kVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.f10732a.s().g();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f10732a.s().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
