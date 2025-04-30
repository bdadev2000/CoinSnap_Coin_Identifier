package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;

@Deprecated
/* loaded from: classes2.dex */
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(@NonNull Context context, @NonNull CustomEventBannerListener customEventBannerListener, @Nullable String str, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle);
}
