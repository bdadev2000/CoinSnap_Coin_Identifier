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
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class zztb implements zztm {
    private final MediaCodec zza;
    private final zzth zzb;
    private final zztn zzc;
    private boolean zzd;
    private int zze = 0;

    public /* synthetic */ zztb(MediaCodec mediaCodec, HandlerThread handlerThread, zztn zztnVar, zzta zztaVar) {
        this.zza = mediaCodec;
        this.zzb = new zzth(handlerThread);
        this.zzc = zztnVar;
    }

    public static /* synthetic */ String zzd(int i9) {
        return zzr(i9, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int i9) {
        return zzr(i9, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* bridge */ /* synthetic */ void zzh(zztb zztbVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i9) {
        zztbVar.zzb.zzf(zztbVar.zza);
        Trace.beginSection("configureCodec");
        zztbVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i9);
        Trace.endSection();
        zztbVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zztbVar.zza.start();
        Trace.endSection();
        zztbVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzr(int i9, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i9 == 1) {
            sb.append("Audio");
        } else if (i9 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i9);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    @Nullable
    public final ByteBuffer zzf(int i9) {
        return this.zza.getInputBuffer(i9);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    @Nullable
    public final ByteBuffer zzg(int i9) {
        return this.zza.getOutputBuffer(i9);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzj(int i9, int i10, int i11, long j7, int i12) {
        this.zzc.zzd(i9, 0, i11, j7, i12);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk(int i9, int i10, zzik zzikVar, long j7, int i11) {
        this.zzc.zze(i9, 0, zzikVar, j7, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zzg();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzm(int i9, long j7) {
        this.zza.releaseOutputBuffer(i9, j7);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzn(int i9, boolean z8) {
        this.zza.releaseOutputBuffer(i9, false);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzp(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzq(int i9) {
        this.zza.setVideoScalingMode(i9);
    }
}
