package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzaaz {
    private final zzaay zza;
    private final zzabd zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdj zzk = zzdj.zza;

    public zzaaz(Context context, zzaay zzaayVar, long j2) {
        this.zza = zzaayVar;
        this.zzb = new zzabd(context);
    }

    private final void zzq(int i2) {
        this.zzd = Math.min(this.zzd, i2);
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
    public final int zza(long r18, long r20, long r22, long r24, boolean r26, com.google.android.gms.internal.ads.zzaax r27) throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaz.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaax):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z2) {
        this.zzi = z2;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z2) {
        this.zzd = z2 ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzeu.zzr(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i2) {
        this.zzb.zzj(i2);
    }

    public final void zzk(zzdj zzdjVar) {
        this.zzk = zzdjVar;
    }

    public final void zzl(float f2) {
        this.zzb.zzc(f2);
    }

    public final void zzm(@Nullable Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f2) {
        if (f2 == this.zzj) {
            return;
        }
        this.zzj = f2;
        this.zzb.zze(f2);
    }

    public final boolean zzo(boolean z2) {
        if (!z2 || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            r2 = this.zzk.zzb() < this.zzh;
            return r2;
        }
        this.zzh = -9223372036854775807L;
        return r2;
    }

    public final boolean zzp() {
        int i2 = this.zzd;
        this.zzd = 3;
        this.zzf = zzeu.zzr(this.zzk.zzb());
        return i2 != 3;
    }
}
