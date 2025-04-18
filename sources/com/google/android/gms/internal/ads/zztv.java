package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes2.dex */
public final class zztv implements zzsu {
    private final MediaCodec zza;

    public zztv(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzd(int i2, int i3, int i4, long j2, int i5) {
        this.zza.queueInputBuffer(i2, 0, i4, j2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zze(int i2, int i3, zzhn zzhnVar, long j2, int i4) {
        this.zza.queueSecureInputBuffer(i2, 0, zzhnVar.zza(), j2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzh() {
    }
}
