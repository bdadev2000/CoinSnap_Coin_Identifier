package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zztk {
    public final zztp zza;
    public final MediaFormat zzb;
    public final zzan zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    private zztk(zztp zztpVar, MediaFormat mediaFormat, zzan zzanVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i9) {
        this.zza = zztpVar;
        this.zzb = mediaFormat;
        this.zzc = zzanVar;
        this.zzd = surface;
    }

    public static zztk zza(zztp zztpVar, MediaFormat mediaFormat, zzan zzanVar, @Nullable MediaCrypto mediaCrypto) {
        return new zztk(zztpVar, mediaFormat, zzanVar, null, null, 0);
    }

    public static zztk zzb(zztp zztpVar, MediaFormat mediaFormat, zzan zzanVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zztk(zztpVar, mediaFormat, zzanVar, surface, null, 0);
    }
}
