package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zztu implements zzst {
    private final MediaCodec zza;

    @Nullable
    private final zzsp zzb;

    public /* synthetic */ zztu(MediaCodec mediaCodec, zzsp zzspVar, zztt zzttVar) {
        this.zza = mediaCodec;
        this.zzb = zzspVar;
        if (zzeu.zza < 35 || zzspVar == null) {
            return;
        }
        zzspVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    @Nullable
    public final ByteBuffer zzf(int i2) {
        return this.zza.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    @Nullable
    public final ByteBuffer zzg(int i2) {
        return this.zza.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    @RequiresApi
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzk(int i2, int i3, int i4, long j2, int i5) {
        this.zza.queueInputBuffer(i2, 0, i4, j2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzl(int i2, int i3, zzhn zzhnVar, long j2, int i4) {
        this.zza.queueSecureInputBuffer(i2, 0, zzhnVar.zza(), j2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzm() {
        zzsp zzspVar;
        zzsp zzspVar2;
        try {
            int i2 = zzeu.zza;
            if (i2 >= 30 && i2 < 33) {
                this.zza.stop();
            }
            if (i2 >= 35 && (zzspVar2 = this.zzb) != null) {
                zzspVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (zzeu.zza >= 35 && (zzspVar = this.zzb) != null) {
                zzspVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzn(int i2, long j2) {
        this.zza.releaseOutputBuffer(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzo(int i2, boolean z2) {
        this.zza.releaseOutputBuffer(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    @RequiresApi
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzq(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzr(int i2) {
        this.zza.setVideoScalingMode(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final /* synthetic */ boolean zzs(zzss zzssVar) {
        return false;
    }
}
