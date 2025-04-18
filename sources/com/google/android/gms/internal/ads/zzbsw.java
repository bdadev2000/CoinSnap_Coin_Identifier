package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes3.dex */
public final class zzbsw extends zzbhr {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbsw(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbhs
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
