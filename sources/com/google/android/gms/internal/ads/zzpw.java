package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzpw {

    @Nullable
    private final zzpv zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpw(AudioTrack audioTrack) {
        this.zza = new zzpv(audioTrack);
        zzh(0);
    }

    private final void zzh(int i10) {
        this.zzb = i10;
        long j3 = 10000;
        if (i10 == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        } else {
            if (i10 == 1) {
                this.zzd = 10000L;
                return;
            }
            j3 = (i10 == 2 || i10 == 3) ? 10000000L : 500000L;
        }
        this.zzd = j3;
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    public final boolean zzg(long j3) {
        if (j3 - this.zze < this.zzd) {
            return false;
        }
        this.zze = j3;
        boolean zzc = this.zza.zzc();
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return zzc;
                    }
                    if (!zzc) {
                        return false;
                    }
                    zzh(0);
                    return true;
                }
                if (!zzc) {
                    zzh(0);
                    return false;
                }
            } else if (zzc) {
                if (this.zza.zza() > this.zzf) {
                    zzh(2);
                    return true;
                }
            } else {
                zzh(0);
                return false;
            }
            return true;
        }
        if (zzc) {
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        }
        if (j3 - this.zzc <= 500000) {
            return false;
        }
        zzh(3);
        return false;
    }
}
