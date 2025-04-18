package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes4.dex */
public final class zzbtb extends zzbhp {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbtb(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zze(zzbhz zzbhzVar) {
        this.zza.onNativeAdLoaded(new zzbsu(zzbhzVar));
    }
}
