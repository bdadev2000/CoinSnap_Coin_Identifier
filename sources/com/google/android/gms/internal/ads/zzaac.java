package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzaac {
    private boolean zzc;
    private int zze;
    private zzaab zza = new zzaab();
    private zzaab zzb = new zzaab();
    private long zzd = C.TIME_UNSET;

    public final float zza() {
        if (this.zza.zzf()) {
            return (float) (1.0E9d / this.zza.zza());
        }
        return -1.0f;
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc() {
        if (this.zza.zzf()) {
            return this.zza.zza();
        }
        return C.TIME_UNSET;
    }

    public final long zzd() {
        if (this.zza.zzf()) {
            return this.zza.zzb();
        }
        return C.TIME_UNSET;
    }

    public final void zze(long j3) {
        this.zza.zzc(j3);
        int i10 = 0;
        if (this.zza.zzf()) {
            this.zzc = false;
        } else if (this.zzd != C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zze()) {
                this.zzb.zzd();
                this.zzb.zzc(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzc(j3);
        }
        if (this.zzc && this.zzb.zzf()) {
            zzaab zzaabVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzaabVar;
            this.zzc = false;
        }
        this.zzd = j3;
        if (!this.zza.zzf()) {
            i10 = this.zze + 1;
        }
        this.zze = i10;
    }

    public final void zzf() {
        this.zza.zzd();
        this.zzb.zzd();
        this.zzc = false;
        this.zzd = C.TIME_UNSET;
        this.zze = 0;
    }

    public final boolean zzg() {
        return this.zza.zzf();
    }
}
