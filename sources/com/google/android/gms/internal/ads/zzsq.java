package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzsq {
    public final zzsw zza;
    public final MediaFormat zzb;
    public final zzaf zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    @Nullable
    public final zzsp zzf;

    private zzsq(zzsw zzswVar, MediaFormat mediaFormat, zzaf zzafVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzsp zzspVar) {
        this.zza = zzswVar;
        this.zzb = mediaFormat;
        this.zzc = zzafVar;
        this.zzd = surface;
        this.zzf = zzspVar;
    }

    public static zzsq zza(zzsw zzswVar, MediaFormat mediaFormat, zzaf zzafVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzsp zzspVar) {
        return new zzsq(zzswVar, mediaFormat, zzafVar, null, null, zzspVar);
    }

    public static zzsq zzb(zzsw zzswVar, MediaFormat mediaFormat, zzaf zzafVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzsq(zzswVar, mediaFormat, zzafVar, surface, null, null);
    }
}
