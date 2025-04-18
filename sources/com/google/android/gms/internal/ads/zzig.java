package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.appevents.AppEventsConstants;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzig implements zzko {
    private final zzza zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzig() {
        zzza zzzaVar = new zzza(true, 65536);
        zzk(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 0, "bufferForPlaybackMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzk(5000, 0, "bufferForPlaybackAfterRebufferMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzk(50000, DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, "minBufferMs", "bufferForPlaybackMs");
        zzk(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzk(50000, 50000, "maxBufferMs", "minBufferMs");
        zzk(0, 0, "backBufferDurationMs", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.zza = zzzaVar;
        this.zzb = zzeu.zzr(50000L);
        this.zzc = zzeu.zzr(50000L);
        this.zzd = zzeu.zzr(2500L);
        this.zze = zzeu.zzr(5000L);
        this.zzf = zzeu.zzr(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzk(int i2, int i3, String str, String str2) {
        zzdi.zze(i2 >= i3, androidx.compose.foundation.text.input.a.k(str, " cannot be less than ", str2));
    }

    private final void zzl(zzom zzomVar) {
        if (this.zzg.remove(zzomVar) != null) {
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

    @VisibleForTesting
    public final int zza() {
        Iterator it = this.zzg.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((zzif) it.next()).zzb;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zzb(zzom zzomVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzc(zzom zzomVar) {
        long id = Thread.currentThread().getId();
        long j2 = this.zzh;
        boolean z2 = true;
        if (j2 != -1 && j2 != id) {
            z2 = false;
        }
        zzdi.zzg(z2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        if (!this.zzg.containsKey(zzomVar)) {
            this.zzg.put(zzomVar, new zzif(null));
        }
        zzif zzifVar = (zzif) this.zzg.get(zzomVar);
        zzifVar.getClass();
        zzifVar.zzb = 13107200;
        zzifVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzd(zzom zzomVar) {
        zzl(zzomVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zze(zzom zzomVar) {
        zzl(zzomVar);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzf(zzom zzomVar, zzcc zzccVar, zzuy zzuyVar, zzlr[] zzlrVarArr, zzwy zzwyVar, zzyl[] zzylVarArr) {
        zzif zzifVar = (zzif) this.zzg.get(zzomVar);
        zzifVar.getClass();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = zzlrVarArr.length;
            if (i2 >= 2) {
                zzifVar.zzb = Math.max(13107200, i3);
                zzm();
                return;
            } else {
                if (zzylVarArr[i2] != null) {
                    i3 += zzlrVarArr[i2].zzb() != 1 ? 131072000 : 13107200;
                }
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzg(zzom zzomVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzh(zzkn zzknVar) {
        zzif zzifVar = (zzif) this.zzg.get(zzknVar.zza);
        zzifVar.getClass();
        int zza = this.zza.zza();
        int zza2 = zza();
        long j2 = this.zzb;
        float f2 = zzknVar.zzc;
        if (f2 > 1.0f) {
            j2 = Math.min(zzeu.zzp(j2, f2), this.zzc);
        }
        long j3 = zzknVar.zzb;
        if (j3 < Math.max(j2, 500000L)) {
            boolean z2 = zza < zza2;
            zzifVar.zza = z2;
            if (!z2 && j3 < 500000) {
                zzea.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.zzc || zza >= zza2) {
            zzifVar.zza = false;
        }
        return zzifVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzi(zzkn zzknVar) {
        boolean z2 = zzknVar.zzd;
        long zzq = zzeu.zzq(zzknVar.zzb, zzknVar.zzc);
        long j2 = z2 ? this.zze : this.zzd;
        long j3 = zzknVar.zze;
        if (j3 != -9223372036854775807L) {
            j2 = Math.min(j3 / 2, j2);
        }
        return j2 <= 0 || zzq >= j2 || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzza zzj() {
        return this.zza;
    }
}
