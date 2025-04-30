package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzul implements zztm {
    private final MediaCodec zza;

    public /* synthetic */ zzul(MediaCodec mediaCodec, zzuk zzukVar) {
        this.zza = mediaCodec;
        int i9 = zzgd.zza;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                int i9 = zzgd.zza;
                dequeueOutputBuffer = -3;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    @Nullable
    public final ByteBuffer zzf(int i9) {
        int i10 = zzgd.zza;
        return this.zza.getInputBuffer(i9);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    @Nullable
    public final ByteBuffer zzg(int i9) {
        int i10 = zzgd.zza;
        return this.zza.getOutputBuffer(i9);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzi() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzj(int i9, int i10, int i11, long j7, int i12) {
        this.zza.queueInputBuffer(i9, 0, i11, j7, i12);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk(int i9, int i10, zzik zzikVar, long j7, int i11) {
        this.zza.queueSecureInputBuffer(i9, 0, zzikVar.zza(), j7, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl() {
        this.zza.release();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    @RequiresApi(21)
    public final void zzm(int i9, long j7) {
        this.zza.releaseOutputBuffer(i9, j7);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzn(int i9, boolean z8) {
        this.zza.releaseOutputBuffer(i9, false);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    @RequiresApi(23)
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzq(int i9) {
        this.zza.setVideoScalingMode(i9);
    }
}
