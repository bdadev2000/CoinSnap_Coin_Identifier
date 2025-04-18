package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes4.dex */
public final class zzbsz {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;

    @Nullable
    private final NativeCustomFormatAd.OnCustomClickListener zzb;

    @Nullable
    @GuardedBy
    private NativeCustomFormatAd zzc;

    public zzbsz(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzbgw zzbgwVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbta zzbtaVar = new zzbta(zzbgwVar);
        this.zzc = zzbtaVar;
        return zzbtaVar;
    }

    @Nullable
    public final zzbhg zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbsw(this, null);
    }

    public final zzbhj zzb() {
        return new zzbsy(this, null);
    }
}
