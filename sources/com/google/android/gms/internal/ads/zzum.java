package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class zzum implements zztn {
    private final MediaCodec zza;

    public zzum(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzd(int i9, int i10, int i11, long j7, int i12) {
        this.zza.queueInputBuffer(i9, 0, i11, j7, i12);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zze(int i9, int i10, zzik zzikVar, long j7, int i11) {
        this.zza.queueSecureInputBuffer(i9, 0, zzikVar.zza(), j7, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzh() {
    }
}
