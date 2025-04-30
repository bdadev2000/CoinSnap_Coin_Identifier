package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzjd implements zzlk {
    private final zzzv zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final HashMap zzh;
    private long zzi;

    public zzjd() {
        zzzv zzzvVar = new zzzv(true, 65536);
        zzk(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 0, "bufferForPlaybackMs", "0");
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzk(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, "minBufferMs", "bufferForPlaybackMs");
        zzk(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzzvVar;
        this.zzc = zzgd.zzr(50000L);
        this.zzd = zzgd.zzr(50000L);
        this.zze = zzgd.zzr(2500L);
        this.zzf = zzgd.zzr(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        this.zzg = zzgd.zzr(0L);
        this.zzh = new HashMap();
        this.zzi = -1L;
    }

    private static void zzk(int i9, int i10, String str, String str2) {
        boolean z8;
        String k6 = o.k(str, " cannot be less than ", str2);
        if (i9 >= i10) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zze(z8, k6);
    }

    private final void zzl(zzpj zzpjVar) {
        if (this.zzh.remove(zzpjVar) != null) {
            zzm();
        }
    }

    private final void zzm() {
        if (this.zzh.isEmpty()) {
            this.zzb.zze();
        } else {
            this.zzb.zzf(zza());
        }
    }

    public final int zza() {
        Iterator it = this.zzh.values().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 += ((zzjc) it.next()).zzb;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final long zzb(zzpj zzpjVar) {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzc(zzpj zzpjVar) {
        long id = Thread.currentThread().getId();
        long j7 = this.zzi;
        boolean z8 = true;
        if (j7 != -1 && j7 != id) {
            z8 = false;
        }
        zzeq.zzg(z8, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzi = id;
        if (!this.zzh.containsKey(zzpjVar)) {
            this.zzh.put(zzpjVar, new zzjc(null));
        }
        zzjc zzjcVar = (zzjc) this.zzh.get(zzpjVar);
        zzjcVar.getClass();
        zzjcVar.zzb = C.DEFAULT_VIDEO_BUFFER_SIZE;
        zzjcVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzd(zzpj zzpjVar) {
        zzl(zzpjVar);
        if (this.zzh.isEmpty()) {
            this.zzi = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zze(zzpj zzpjVar) {
        zzl(zzpjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzf(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, zzmn[] zzmnVarArr, zzxr zzxrVar, zzzg[] zzzgVarArr) {
        zzjc zzjcVar = (zzjc) this.zzh.get(zzpjVar);
        zzjcVar.getClass();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int length = zzmnVarArr.length;
            int i11 = C.DEFAULT_VIDEO_BUFFER_SIZE;
            if (i9 < 2) {
                if (zzzgVarArr[i9] != null) {
                    if (zzmnVarArr[i9].zzb() != 1) {
                        i11 = 131072000;
                    }
                    i10 += i11;
                }
                i9++;
            } else {
                zzjcVar.zzb = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i10);
                zzm();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzg(zzpj zzpjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzh(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j7, long j9, float f9) {
        zzjc zzjcVar = (zzjc) this.zzh.get(zzpjVar);
        zzjcVar.getClass();
        int zza = this.zzb.zza();
        int zza2 = zza();
        long j10 = this.zzc;
        if (f9 > 1.0f) {
            j10 = Math.min(zzgd.zzp(j10, f9), this.zzd);
        }
        boolean z8 = false;
        if (j9 < Math.max(j10, 500000L)) {
            if (zza < zza2) {
                z8 = true;
            }
            zzjcVar.zza = z8;
            if (!z8 && j9 < 500000) {
                zzfk.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.zzd || zza >= zza2) {
            zzjcVar.zza = false;
        }
        return zzjcVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzi(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j7, float f9, boolean z8, long j9) {
        long j10;
        long zzq = zzgd.zzq(j7, f9);
        if (z8) {
            j10 = this.zzf;
        } else {
            j10 = this.zze;
        }
        if (j9 != C.TIME_UNSET) {
            j10 = Math.min(j9 / 2, j10);
        }
        if (j10 > 0 && zzq < j10 && this.zzb.zza() < zza()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final zzzv zzj() {
        return this.zzb;
    }
}
