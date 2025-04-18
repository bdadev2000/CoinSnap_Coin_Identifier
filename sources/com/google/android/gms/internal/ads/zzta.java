package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.support.v4.media.d;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzta extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzsw zzc;

    @Nullable
    public final String zzd;

    public zzta(zzaf zzafVar, @Nullable Throwable th, boolean z2, int i2) {
        this("Decoder init failed: [" + i2 + "], " + zzafVar.toString(), th, zzafVar.zzn, false, null, d.i("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i2)), null);
    }

    public static /* bridge */ /* synthetic */ zzta zza(zzta zztaVar, zzta zztaVar2) {
        return new zzta(zztaVar.getMessage(), zztaVar.getCause(), zztaVar.zza, false, zztaVar.zzc, zztaVar.zzd, zztaVar2);
    }

    public zzta(zzaf zzafVar, @Nullable Throwable th, boolean z2, zzsw zzswVar) {
        this(androidx.compose.foundation.text.input.a.l("Decoder init failed: ", zzswVar.zza, ", ", zzafVar.toString()), th, zzafVar.zzn, false, zzswVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzta(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z2, @Nullable zzsw zzswVar, @Nullable String str3, @Nullable zzta zztaVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzswVar;
        this.zzd = str3;
    }
}
