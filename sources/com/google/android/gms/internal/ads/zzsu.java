package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import eb.j;

/* loaded from: classes3.dex */
public final class zzsu extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzsq zzc;

    @Nullable
    public final String zzd;

    public zzsu(zzad zzadVar, @Nullable Throwable th2, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + zzadVar.toString(), th2, zzadVar.zzo, false, null, j.i("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i10)), null);
    }

    public static /* bridge */ /* synthetic */ zzsu zza(zzsu zzsuVar, zzsu zzsuVar2) {
        return new zzsu(zzsuVar.getMessage(), zzsuVar.getCause(), zzsuVar.zza, false, zzsuVar.zzc, zzsuVar.zzd, zzsuVar2);
    }

    public zzsu(zzad zzadVar, @Nullable Throwable th2, boolean z10, zzsq zzsqVar) {
        this(j.l("Decoder init failed: ", zzsqVar.zza, ", ", zzadVar.toString()), th2, zzadVar.zzo, false, zzsqVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zzsu(@Nullable String str, @Nullable Throwable th2, @Nullable String str2, boolean z10, @Nullable zzsq zzsqVar, @Nullable String str3, @Nullable zzsu zzsuVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsqVar;
        this.zzd = str3;
    }
}
