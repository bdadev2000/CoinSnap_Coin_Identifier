package com.applovin.mediation;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface MaxAdViewAdListener extends MaxAdListener {
    void onAdCollapsed(@NonNull MaxAd maxAd);

    void onAdExpanded(@NonNull MaxAd maxAd);
}
