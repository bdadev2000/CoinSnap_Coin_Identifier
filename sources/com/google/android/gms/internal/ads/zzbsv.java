package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes3.dex */
public final class zzbsv extends zzbhl {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbsv(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhv zzbhvVar) {
        this.zza.onNativeAdLoaded(new zzbsp(zzbhvVar));
    }
}
