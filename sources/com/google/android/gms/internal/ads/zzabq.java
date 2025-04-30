package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzabq {
    private final zzabp zza;
    private final zzabu zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzer zzk = zzer.zza;

    public zzabq(Context context, zzabp zzabpVar, long j7) {
        this.zza = zzabpVar;
        this.zzb = new zzabu(context);
    }

    private final void zzq(int i9) {
        this.zzd = Math.min(this.zzd, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        if (r17.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.zzabo r27) throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabq.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzabo):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z8) {
        this.zzi = z8;
        this.zzh = C.TIME_UNSET;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z8) {
        this.zzd = z8 ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzgd.zzr(SystemClock.elapsedRealtime());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = C.TIME_UNSET;
        this.zze = C.TIME_UNSET;
        zzq(1);
        this.zzh = C.TIME_UNSET;
    }

    public final void zzj(int i9) {
        this.zzb.zzj(i9);
    }

    public final void zzk(zzer zzerVar) {
        this.zzk = zzerVar;
    }

    public final void zzl(float f9) {
        this.zzb.zzc(f9);
    }

    public final void zzm(@Nullable Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f9) {
        this.zzj = f9;
        this.zzb.zze(f9);
    }

    public final boolean zzo(boolean z8) {
        boolean z9 = true;
        if (!z8 || this.zzd != 3) {
            if (this.zzh == C.TIME_UNSET) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.zzh) {
                z9 = false;
            }
            return z9;
        }
        this.zzh = C.TIME_UNSET;
        return z9;
    }

    public final boolean zzp() {
        int i9 = this.zzd;
        this.zzd = 3;
        this.zzf = zzgd.zzr(SystemClock.elapsedRealtime());
        if (i9 != 3) {
            return true;
        }
        return false;
    }
}
