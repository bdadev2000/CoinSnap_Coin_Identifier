package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes4.dex */
public final class zzbtc extends zzbhv {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbtc(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
