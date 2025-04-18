package com.applovin.sdk;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface AppLovinUserService {

    /* loaded from: classes2.dex */
    public interface OnConsentDialogDismissListener {
        void onDismiss();
    }

    void preloadConsentDialog();

    void showConsentDialog(Activity activity, OnConsentDialogDismissListener onConsentDialogDismissListener);
}
