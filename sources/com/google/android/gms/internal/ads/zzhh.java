package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes3.dex */
final class zzhh {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzhh zzhhVar, int i10, int i11) {
        zzhhVar.zzb.set(i10, i11);
        zzhhVar.zza.setPattern(zzhhVar.zzb);
    }
}
