package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int i9);

    void onAdFailedToLoad(@NonNull AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
