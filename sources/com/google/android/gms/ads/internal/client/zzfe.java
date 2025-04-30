package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* loaded from: classes2.dex */
public final class zzfe extends zzdf {

    @Nullable
    private final OnPaidEventListener zza;

    public zzfe(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzsVar) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzsVar.zzb, zzsVar.zzc, zzsVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        return this.zza == null;
    }
}
