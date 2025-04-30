package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes2.dex */
public final class zzbut {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;

    @Nullable
    private final NativeCustomFormatAd.OnCustomClickListener zzb;

    @Nullable
    private NativeCustomFormatAd zzc;

    public zzbut(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzbip zzbipVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbuu zzbuuVar = new zzbuu(zzbipVar);
        this.zzc = zzbuuVar;
        return zzbuuVar;
    }

    @Nullable
    public final zzbiz zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbuq(this, null);
    }

    public final zzbjc zzb() {
        return new zzbus(this, null);
    }
}
