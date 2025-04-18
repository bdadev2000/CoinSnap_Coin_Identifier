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
@RequiresApi
/* loaded from: classes3.dex */
public final class zzsd implements zzst {
    private final MediaCodec zza;
    private final zzsj zzb;
    private final zzsu zzc;

    @Nullable
    private final zzsp zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzsd(MediaCodec mediaCodec, HandlerThread handlerThread, zzsu zzsuVar, zzsp zzspVar, zzsc zzscVar) {
        this.zza = mediaCodec;
        this.zzb = new zzsj(handlerThread);
        this.zzc = zzsuVar;
        this.zzd = zzspVar;
    }

    public static /* synthetic */ String zzd(int i2) {
        return zzt(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int i2) {
        return zzt(i2, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* bridge */ /* synthetic */ void zzh(zzsd zzsdVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        zzsp zzspVar;
        zzsdVar.zzb.zzf(zzsdVar.zza);
        Trace.beginSection("configureCodec");
        zzsdVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i2);
        Trace.endSection();
        zzsdVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzsdVar.zza.start();
        Trace.endSection();
        if (zzeu.zza >= 35 && (zzspVar = zzsdVar.zzd) != null) {
            zzspVar.zza(zzsdVar.zza);
        }
        zzsdVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final MediaFormat zzc() {
        return this.zzb.zzc();
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
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzk(int i2, int i3, int i4, long j2, int i5) {
        this.zzc.zzd(i2, 0, i4, j2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzl(int i2, int i3, zzhn zzhnVar, long j2, int i4) {
        this.zzc.zze(i2, 0, zzhnVar, j2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzm() {
        zzsp zzspVar;
        zzsp zzspVar2;
        zzsp zzspVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i2 = zzeu.zza;
                if (i2 >= 30 && i2 < 33) {
                    this.zza.stop();
                }
                if (i2 >= 35 && (zzspVar3 = this.zzd) != null) {
                    zzspVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th) {
                if (!this.zze) {
                    int i3 = zzeu.zza;
                    if (i3 >= 30 && i3 < 33) {
                        this.zza.stop();
                    }
                    if (i3 >= 35 && (zzspVar2 = this.zzd) != null) {
                        zzspVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (zzeu.zza >= 35 && (zzspVar = this.zzd) != null) {
                zzspVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th2;
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
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final void zzr(int i2) {
        this.zza.setVideoScalingMode(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzst
    public final boolean zzs(zzss zzssVar) {
        this.zzb.zzg(zzssVar);
        return true;
    }
}
