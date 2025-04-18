package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzsk {
    public final zzsq zza;
    public final MediaFormat zzb;
    public final zzad zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    @Nullable
    public final zzsj zzf;

    private zzsk(zzsq zzsqVar, MediaFormat mediaFormat, zzad zzadVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzsj zzsjVar) {
        this.zza = zzsqVar;
        this.zzb = mediaFormat;
        this.zzc = zzadVar;
        this.zzd = surface;
        this.zzf = zzsjVar;
    }

    public static zzsk zza(zzsq zzsqVar, MediaFormat mediaFormat, zzad zzadVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzsj zzsjVar) {
        return new zzsk(zzsqVar, mediaFormat, zzadVar, null, null, zzsjVar);
    }

    public static zzsk zzb(zzsq zzsqVar, MediaFormat mediaFormat, zzad zzadVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzsk(zzsqVar, mediaFormat, zzadVar, surface, null, null);
    }
}
