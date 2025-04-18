package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface PreloadCallback {
    void onAdsAvailable(@NonNull PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(@NonNull PreloadConfiguration preloadConfiguration);
}
