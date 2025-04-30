package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class zzbuw extends zzbjo {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbuw(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
