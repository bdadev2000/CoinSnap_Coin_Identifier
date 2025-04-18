package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class zzsv extends zzho {

    @Nullable
    public final String zza;
    public final int zzb;

    public zzsv(Throwable th, @Nullable zzsw zzswVar) {
        super("Decoder failed: ".concat(String.valueOf(zzswVar == null ? null : zzswVar.zza)), th);
        boolean z2 = th instanceof MediaCodec.CodecException;
        String diagnosticInfo = z2 ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.zza = diagnosticInfo;
        this.zzb = zzeu.zza >= 23 ? z2 ? ((MediaCodec.CodecException) th).getErrorCode() : 0 : zzeu.zzl(diagnosticInfo);
    }
}
