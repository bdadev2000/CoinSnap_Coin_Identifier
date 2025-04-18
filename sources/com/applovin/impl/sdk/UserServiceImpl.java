package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {
    private final k a;

    public UserServiceImpl(k kVar) {
        this.a = kVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.a.s().g();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.a.s().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
