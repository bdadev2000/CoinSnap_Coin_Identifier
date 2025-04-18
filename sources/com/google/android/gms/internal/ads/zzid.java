package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzid implements zzkl {
    private final zzys zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzid() {
        zzys zzysVar = new zzys(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzk(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 0, "bufferForPlaybackMs", "0");
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzk(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, "minBufferMs", "bufferForPlaybackMs");
        zzk(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", "0");
        this.zza = zzysVar;
        this.zzb = zzen.zzs(50000L);
        this.zzc = zzen.zzs(50000L);
        this.zzd = zzen.zzs(2500L);
        this.zze = zzen.zzs(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        this.zzf = zzen.zzs(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzk(int i10, int i11, String str, String str2) {
        boolean z10;
        String m10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, " cannot be less than ", str2);
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zze(z10, m10);
    }

    private final void zzl(zzoj zzojVar) {
        if (this.zzg.remove(zzojVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    public final int zza() {
        Iterator it = this.zzg.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zzib) it.next()).zzb;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zzb(zzoj zzojVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzc(zzoj zzojVar) {
        long id2 = Thread.currentThread().getId();
        long j3 = this.zzh;
        boolean z10 = true;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        }
        zzdb.zzg(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id2;
        if (!this.zzg.containsKey(zzojVar)) {
            this.zzg.put(zzojVar, new zzib(null));
        }
        zzib zzibVar = (zzib) this.zzg.get(zzojVar);
        zzibVar.getClass();
        zzibVar.zzb = C.DEFAULT_VIDEO_BUFFER_SIZE;
        zzibVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzoj zzojVar) {
        zzl(zzojVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zze(zzoj zzojVar) {
        zzl(zzojVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzf(zzoj zzojVar, zzbv zzbvVar, zzur zzurVar, zzln[] zzlnVarArr, zzwr zzwrVar, zzyd[] zzydVarArr) {
        zzib zzibVar = (zzib) this.zzg.get(zzojVar);
        zzibVar.getClass();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzlnVarArr.length;
            int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
            if (i10 < 2) {
                if (zzydVarArr[i10] != null) {
                    if (zzlnVarArr[i10].zzb() != 1) {
                        i12 = 131072000;
                    }
                    i11 += i12;
                }
                i10++;
            } else {
                zzibVar.zzb = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i11);
                zzm();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzg(zzoj zzojVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzh(zzkk zzkkVar) {
        zzib zzibVar = (zzib) this.zzg.get(zzkkVar.zza);
        zzibVar.getClass();
        int zza = this.zza.zza();
        int zza2 = zza();
        long j3 = this.zzb;
        float f10 = zzkkVar.zzc;
        if (f10 > 1.0f) {
            j3 = Math.min(zzen.zzq(j3, f10), this.zzc);
        }
        long j10 = zzkkVar.zzb;
        long max = Math.max(j3, 500000L);
        boolean z10 = false;
        if (j10 < max) {
            if (zza < zza2) {
                z10 = true;
            }
            zzibVar.zza = z10;
            if (!z10 && j10 < 500000) {
                zzdt.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.zzc || zza >= zza2) {
            zzibVar.zza = false;
        }
        return zzibVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzi(zzkk zzkkVar) {
        long j3;
        boolean z10 = zzkkVar.zzd;
        long zzr = zzen.zzr(zzkkVar.zzb, zzkkVar.zzc);
        if (z10) {
            j3 = this.zze;
        } else {
            j3 = this.zzd;
        }
        long j10 = zzkkVar.zze;
        if (j10 != C.TIME_UNSET) {
            j3 = Math.min(j10 / 2, j3);
        }
        if (j3 > 0 && zzr < j3 && this.zza.zza() < zza()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzys zzj() {
        return this.zza;
    }
}
