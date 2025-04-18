package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zztn implements zzsn {
    private final MediaCodec zza;

    @Nullable
    private final zzsj zzb;

    public /* synthetic */ zztn(MediaCodec mediaCodec, zzsj zzsjVar, zztm zztmVar) {
        this.zza = mediaCodec;
        this.zzb = zzsjVar;
        if (zzen.zza >= 35 && zzsjVar != null) {
            zzsjVar.zza(mediaCodec);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @Nullable
    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @Nullable
    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @RequiresApi(MotionEventCompat.AXIS_GENERIC_4)
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzk(int i10, int i11, int i12, long j3, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j3, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzl(int i10, int i11, zzhj zzhjVar, long j3, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzhjVar.zza(), j3, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzm() {
        zzsj zzsjVar;
        zzsj zzsjVar2;
        try {
            int i10 = zzen.zza;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zzsjVar2 = this.zzb) != null) {
                zzsjVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th2) {
            if (zzen.zza >= 35 && (zzsjVar = this.zzb) != null) {
                zzsjVar.zzc(this.zza);
            }
            this.zza.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzn(int i10, long j3) {
        this.zza.releaseOutputBuffer(i10, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzo(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    @RequiresApi(23)
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzq(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzr(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final /* synthetic */ boolean zzs(zzsm zzsmVar) {
        return false;
    }
}
