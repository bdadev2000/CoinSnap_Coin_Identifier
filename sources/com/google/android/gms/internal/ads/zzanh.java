package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes2.dex */
final class zzanh {
    private final zzaeh zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzanh(zzaeh zzaehVar) {
        this.zza = zzaehVar;
    }

    private final void zzf(int i2) {
        long j2 = this.zzl;
        if (j2 == -9223372036854775807L) {
            return;
        }
        boolean z2 = this.zzm;
        long j3 = this.zzb - this.zzk;
        this.zza.zzs(j2, z2 ? 1 : 0, (int) j3, i2, null);
    }

    public final void zza(long j2) {
        this.zzm = this.zzc;
        zzf((int) (j2 - this.zzb));
        this.zzk = this.zzb;
        this.zzb = j2;
        zzf(0);
        this.zzi = false;
    }

    public final void zzb(long j2, int i2, boolean z2) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z2 && this.zzi) {
                zzf(i2 + ((int) (j2 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) {
        if (this.zzf) {
            int i4 = this.zzd;
            int i5 = (i2 + 2) - i4;
            if (i5 >= i3) {
                this.zzd = (i3 - i2) + i4;
            } else {
                this.zzg = (bArr[i5] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zze(long j2, int i2, int i3, long j3, boolean z2) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j3;
        this.zzd = 0;
        this.zzb = j2;
        if (i3 >= 32 && i3 != 40) {
            if (this.zzi && !this.zzj) {
                if (z2) {
                    zzf(i2);
                }
                this.zzi = false;
            }
            if (i3 <= 35 || i3 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z3 = i3 >= 16 && i3 <= 21;
        this.zzc = z3;
        this.zzf = z3 || i3 <= 9;
    }
}
