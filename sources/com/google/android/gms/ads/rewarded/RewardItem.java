package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface RewardItem {

    @NonNull
    public static final RewardItem DEFAULT_REWARD = new zza();

    int getAmount();

    @NonNull
    String getType();
}
