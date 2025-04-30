package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class zzij {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzij zzijVar, int i9, int i10) {
        zzijVar.zzb.set(i9, i10);
        zzijVar.zza.setPattern(zzijVar.zzb);
    }
}
