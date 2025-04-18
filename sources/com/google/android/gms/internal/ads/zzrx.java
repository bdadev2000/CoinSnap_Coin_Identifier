package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes3.dex */
public final class zzrx implements zzsn {
    private final MediaCodec zza;
    private final zzsd zzb;
    private final zzso zzc;

    @Nullable
    private final zzsj zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzrx(MediaCodec mediaCodec, HandlerThread handlerThread, zzso zzsoVar, zzsj zzsjVar, zzrw zzrwVar) {
        this.zza = mediaCodec;
        this.zzb = new zzsd(handlerThread);
        this.zzc = zzsoVar;
        this.zzd = zzsjVar;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzrx zzrxVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzsj zzsjVar;
        zzrxVar.zzb.zzf(zzrxVar.zza);
        Trace.beginSection("configureCodec");
        zzrxVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        zzrxVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzrxVar.zza.start();
        Trace.endSection();
        if (zzen.zza >= 35 && (zzsjVar = zzrxVar.zzd) != null) {
            zzsjVar.zza(zzrxVar.zza);
        }
        zzrxVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final MediaFormat zzc() {
        return this.zzb.zzc();
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
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzk(int i10, int i11, int i12, long j3, int i13) {
        this.zzc.zzd(i10, 0, i12, j3, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzl(int i10, int i11, zzhj zzhjVar, long j3, int i12) {
        this.zzc.zze(i10, 0, zzhjVar, j3, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzm() {
        zzsj zzsjVar;
        zzsj zzsjVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    int i10 = zzen.zza;
                    if (i10 >= 30 && i10 < 33) {
                        this.zza.stop();
                    }
                    if (i10 >= 35 && (zzsjVar = this.zzd) != null) {
                        zzsjVar.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (Throwable th2) {
            if (zzen.zza >= 35 && (zzsjVar2 = this.zzd) != null) {
                zzsjVar2.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
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
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void zzr(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final boolean zzs(zzsm zzsmVar) {
        this.zzb.zzg(zzsmVar);
        return true;
    }
}
