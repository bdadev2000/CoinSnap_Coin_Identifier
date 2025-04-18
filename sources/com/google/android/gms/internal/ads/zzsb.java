package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzsb implements zzsr {
    private final zzfyp zza;
    private final zzfyp zzb;
    private boolean zzc;

    public zzsb(int i2) {
        zzrz zzrzVar = new zzrz(i2);
        zzsa zzsaVar = new zzsa(i2);
        this.zza = zzrzVar;
        this.zzb = zzsaVar;
        this.zzc = true;
    }

    public static /* synthetic */ HandlerThread zza(int i2) {
        String zzt;
        zzt = zzsd.zzt(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzt);
    }

    public static /* synthetic */ HandlerThread zzb(int i2) {
        String zzt;
        zzt = zzsd.zzt(i2, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzt);
    }

    public final zzsd zzc(zzsq zzsqVar) throws IOException {
        MediaCodec mediaCodec;
        zzsu zzshVar;
        int i2;
        int i3;
        zzsd zzsdVar;
        Surface surface;
        String str = zzsqVar.zza.zza;
        zzsd zzsdVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            if (this.zzc) {
                zzaf zzafVar = zzsqVar.zzc;
                int i4 = zzeu.zza;
                if (i4 >= 34) {
                    if (i4 < 35) {
                        if (zzbn.zzi(zzafVar.zzn)) {
                        }
                    }
                    zzshVar = new zztv(mediaCodec);
                    i2 = 4;
                    zzsu zzsuVar = zzshVar;
                    i3 = i2;
                    zzsdVar = new zzsd(mediaCodec, zza(((zzrz) this.zza).zza), zzsuVar, zzsqVar.zzf, null);
                    Trace.endSection();
                    surface = zzsqVar.zzd;
                    if (surface == null && zzsqVar.zza.zzh && zzeu.zza >= 35) {
                        i3 |= 8;
                    }
                    zzsd.zzh(zzsdVar, zzsqVar.zzb, surface, null, i3);
                    return zzsdVar;
                }
            }
            Trace.endSection();
            surface = zzsqVar.zzd;
            if (surface == null) {
                i3 |= 8;
            }
            zzsd.zzh(zzsdVar, zzsqVar.zzb, surface, null, i3);
            return zzsdVar;
        } catch (Exception e3) {
            e = e3;
            zzsdVar2 = zzsdVar;
            if (zzsdVar2 != null) {
                zzsdVar2.zzm();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
        zzshVar = new zzsh(mediaCodec, zzb(((zzsa) this.zzb).zza));
        i2 = 0;
        zzsu zzsuVar2 = zzshVar;
        i3 = i2;
        zzsdVar = new zzsd(mediaCodec, zza(((zzrz) this.zza).zza), zzsuVar2, zzsqVar.zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final /* bridge */ /* synthetic */ zzst zzd(zzsq zzsqVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z2) {
        this.zzc = true;
    }
}
