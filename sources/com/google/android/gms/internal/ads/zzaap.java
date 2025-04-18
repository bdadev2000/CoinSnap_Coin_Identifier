package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzaap {
    private final zzaao zza;
    private final zzaat zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzdc zzk = zzdc.zza;

    public zzaap(Context context, zzaao zzaaoVar, long j3) {
        this.zza = zzaaoVar;
        this.zzb = new zzaat(context);
    }

    private final void zzq(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0079, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0084, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0089, code lost:
    
        if (r17.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.zzaan r27) throws com.google.android.gms.internal.ads.zzig {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaap.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaan):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zzh = C.TIME_UNSET;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z10) {
        this.zzd = z10 ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzen.zzs(this.zzk.zzb());
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

    public final void zzj(int i10) {
        this.zzb.zzj(i10);
    }

    public final void zzk(zzdc zzdcVar) {
        this.zzk = zzdcVar;
    }

    public final void zzl(float f10) {
        this.zzb.zzc(f10);
    }

    public final void zzm(@Nullable Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f10) {
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }

    public final boolean zzo(boolean z10) {
        if (!z10 || this.zzd != 3) {
            if (this.zzh == C.TIME_UNSET) {
                return false;
            }
            r0 = this.zzk.zzb() < this.zzh;
            return r0;
        }
        this.zzh = C.TIME_UNSET;
        return r0;
    }

    public final boolean zzp() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzen.zzs(this.zzk.zzb());
        return i10 != 3;
    }
}
