package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzqa {

    @Nullable
    private final zzpz zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzqa(AudioTrack audioTrack) {
        this.zza = new zzpz(audioTrack);
        zzh(0);
    }

    private final void zzh(int i2) {
        this.zzb = i2;
        long j2 = 10000;
        if (i2 == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        } else {
            if (i2 == 1) {
                this.zzd = 10000L;
                return;
            }
            j2 = (i2 == 2 || i2 == 3) ? 10000000L : 500000L;
        }
        this.zzd = j2;
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

    public final boolean zzg(long j2) {
        if (j2 - this.zze < this.zzd) {
            return false;
        }
        this.zze = j2;
        boolean zzc = this.zza.zzc();
        int i2 = this.zzb;
        if (i2 == 0) {
            if (!zzc) {
                if (j2 - this.zzc <= 500000) {
                    return false;
                }
                zzh(3);
                return false;
            }
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
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
        } else {
            if (!zzc) {
                zzh(0);
                return false;
            }
            if (this.zza.zza() > this.zzf) {
                zzh(2);
                return true;
            }
        }
        return true;
    }
}
