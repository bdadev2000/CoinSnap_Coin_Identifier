package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzrv implements zzsl {
    private final zzfxg zza;
    private final zzfxg zzb;
    private boolean zzc;

    public zzrv(int i10) {
        zzrt zzrtVar = new zzrt(i10);
        zzru zzruVar = new zzru(i10);
        this.zza = zzrtVar;
        this.zzb = zzruVar;
        this.zzc = true;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        String zzt;
        zzt = zzrx.zzt(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzt);
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        String zzt;
        zzt = zzrx.zzt(i10, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzt);
    }

    public final zzrx zzc(zzsk zzskVar) throws IOException {
        MediaCodec mediaCodec;
        zzso zzsbVar;
        int i10;
        int i11;
        zzrx zzrxVar;
        Surface surface;
        String str = zzskVar.zza.zza;
        zzrx zzrxVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.zzc) {
                        zzad zzadVar = zzskVar.zzc;
                        int i12 = zzen.zza;
                        if (i12 >= 34 && (i12 >= 35 || zzbg.zzi(zzadVar.zzo))) {
                            zzsbVar = new zzto(mediaCodec);
                            i10 = 4;
                            zzso zzsoVar = zzsbVar;
                            i11 = i10;
                            zzrxVar = new zzrx(mediaCodec, zza(((zzrt) this.zza).zza), zzsoVar, zzskVar.zzf, null);
                            Trace.endSection();
                            surface = zzskVar.zzd;
                            if (surface == null && zzskVar.zza.zzh && zzen.zza >= 35) {
                                i11 |= 8;
                            }
                            zzrx.zzh(zzrxVar, zzskVar.zzb, surface, null, i11);
                            return zzrxVar;
                        }
                    }
                    Trace.endSection();
                    surface = zzskVar.zzd;
                    if (surface == null) {
                        i11 |= 8;
                    }
                    zzrx.zzh(zzrxVar, zzskVar.zzb, surface, null, i11);
                    return zzrxVar;
                } catch (Exception e2) {
                    e = e2;
                    zzrxVar2 = zzrxVar;
                    if (zzrxVar2 == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        zzrxVar2.zzm();
                    }
                    throw e;
                }
                zzsbVar = new zzsb(mediaCodec, zzb(((zzru) this.zzb).zza));
                i10 = 0;
                zzso zzsoVar2 = zzsbVar;
                i11 = i10;
                zzrxVar = new zzrx(mediaCodec, zza(((zzrt) this.zza).zza), zzsoVar2, zzskVar.zzf, null);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final /* bridge */ /* synthetic */ zzsn zzd(zzsk zzskVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z10) {
        this.zzc = true;
    }
}
