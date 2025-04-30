package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class zzbuv extends zzbji {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbuv(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zze(zzbjs zzbjsVar) {
        this.zza.onNativeAdLoaded(new zzbuo(zzbjsVar));
    }
}
