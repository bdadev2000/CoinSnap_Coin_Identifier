package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzqx {

    @Nullable
    private final zzqw zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzqx(AudioTrack audioTrack) {
        this.zza = new zzqw(audioTrack);
        zzh(0);
    }

    private final void zzh(int i9) {
        this.zzb = i9;
        long j7 = 10000;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2 && i9 != 3) {
                    j7 = 500000;
                } else {
                    j7 = 10000000;
                }
            } else {
                this.zzd = 10000L;
                return;
            }
        } else {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        }
        this.zzd = j7;
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

    public final boolean zzg(long j7) {
        if (j7 - this.zze < this.zzd) {
            return false;
        }
        this.zze = j7;
        boolean zzc = this.zza.zzc();
        int i9 = this.zzb;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
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
        if (j7 - this.zzc <= 500000) {
            return false;
        }
        zzh(3);
        return false;
    }
}
