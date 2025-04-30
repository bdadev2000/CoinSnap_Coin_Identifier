package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzabe {
    private boolean zzc;
    private int zze;
    private zzabd zza = new zzabd();
    private zzabd zzb = new zzabd();
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

    public final void zze(long j7) {
        this.zza.zzc(j7);
        int i9 = 0;
        if (this.zza.zzf()) {
            this.zzc = false;
        } else if (this.zzd != C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zze()) {
                this.zzb.zzd();
                this.zzb.zzc(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzc(j7);
        }
        if (this.zzc && this.zzb.zzf()) {
            zzabd zzabdVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzabdVar;
            this.zzc = false;
        }
        this.zzd = j7;
        if (!this.zza.zzf()) {
            i9 = this.zze + 1;
        }
        this.zze = i9;
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
