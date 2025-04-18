package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes3.dex */
final class zzhm {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzhm zzhmVar, int i2, int i3) {
        zzhmVar.zzb.set(i2, i3);
        zzhmVar.zza.setPattern(zzhmVar.zzb);
    }
}
