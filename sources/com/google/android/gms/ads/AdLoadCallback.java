package com.google.android.gms.ads;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public abstract class AdLoadCallback<AdT> {
    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
    }

    public void onAdLoaded(@NonNull AdT adt) {
    }
}
