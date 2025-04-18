package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes3.dex */
public final class zzbst {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;

    @Nullable
    private final NativeCustomFormatAd.OnCustomClickListener zzb;

    @Nullable
    private NativeCustomFormatAd zzc;

    public zzbst(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzbgs zzbgsVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbsu zzbsuVar = new zzbsu(zzbgsVar);
        this.zzc = zzbsuVar;
        return zzbsuVar;
    }

    @Nullable
    public final zzbhc zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbsq(this, null);
    }

    public final zzbhf zzb() {
        return new zzbsr(this, null);
    }
}
