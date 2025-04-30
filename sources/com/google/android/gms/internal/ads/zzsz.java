package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzsz implements zztl {
    private final zzfyw zzb;
    private final zzfyw zzc;
    private boolean zzd;

    public zzsz(int i9) {
        zzsx zzsxVar = new zzsx(i9);
        zzsy zzsyVar = new zzsy(i9);
        this.zzb = zzsxVar;
        this.zzc = zzsyVar;
        this.zzd = true;
    }

    public static /* synthetic */ HandlerThread zza(int i9) {
        String zzr;
        zzr = zztb.zzr(i9, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzr);
    }

    public static /* synthetic */ HandlerThread zzb(int i9) {
        String zzr;
        zzr = zztb.zzr(i9, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzr);
    }

    public final zztb zzc(zztk zztkVar) throws IOException {
        MediaCodec mediaCodec;
        zztn zztfVar;
        int i9;
        zztb zztbVar;
        String str = zztkVar.zza.zza;
        zztb zztbVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
            } catch (Exception e4) {
                e = e4;
            }
            try {
                if (this.zzd) {
                    zzan zzanVar = zztkVar.zzc;
                    int i10 = zzgd.zza;
                    if (i10 >= 34) {
                        if (i10 < 35) {
                            if (zzcg.zzh(zzanVar.zzn)) {
                            }
                        }
                        zztfVar = new zzum(mediaCodec);
                        i9 = 4;
                        zztbVar = new zztb(mediaCodec, zza(((zzsx) this.zzb).zza), zztfVar, null);
                        Trace.endSection();
                        zztb.zzh(zztbVar, zztkVar.zzb, zztkVar.zzd, null, i9);
                        return zztbVar;
                    }
                }
                Trace.endSection();
                zztb.zzh(zztbVar, zztkVar.zzb, zztkVar.zzd, null, i9);
                return zztbVar;
            } catch (Exception e9) {
                e = e9;
                zztbVar2 = zztbVar;
                if (zztbVar2 == null) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                } else {
                    zztbVar2.zzl();
                }
                throw e;
            }
            zztfVar = new zztf(mediaCodec, zzb(((zzsy) this.zzc).zza));
            i9 = 0;
            zztbVar = new zztb(mediaCodec, zza(((zzsx) this.zzb).zza), zztfVar, null);
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final /* bridge */ /* synthetic */ zztm zzd(zztk zztkVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z8) {
        this.zzd = true;
    }
}
