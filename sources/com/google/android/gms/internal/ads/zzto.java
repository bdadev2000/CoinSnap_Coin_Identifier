package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes3.dex */
public final class zzto implements zzso {
    private final MediaCodec zza;

    public zzto(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzd(int i10, int i11, int i12, long j3, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j3, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zze(int i10, int i11, zzhj zzhjVar, long j3, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzhjVar.zza(), j3, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzso
    public final void zzh() {
    }
}
