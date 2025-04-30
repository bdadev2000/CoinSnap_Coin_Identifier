package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzaom {
    private final zzafa zza;
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

    public zzaom(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    private final void zze(int i9) {
        long j7 = this.zzl;
        if (j7 == C.TIME_UNSET) {
            return;
        }
        boolean z8 = this.zzm;
        long j9 = this.zzb - this.zzk;
        this.zza.zzs(j7, z8 ? 1 : 0, (int) j9, i9, null);
    }

    public final void zza(long j7, int i9, boolean z8) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else {
            if (!this.zzh && !this.zzg) {
                return;
            }
            if (z8 && this.zzi) {
                zze(i9 + ((int) (j7 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i9, int i10) {
        boolean z8;
        if (this.zzf) {
            int i11 = this.zzd;
            int i12 = (i9 + 2) - i11;
            if (i12 < i10) {
                if ((bArr[i12] & 128) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.zzg = z8;
                this.zzf = false;
                return;
            }
            this.zzd = (i10 - i9) + i11;
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j7, int i9, int i10, long j9, boolean z8) {
        boolean z9;
        boolean z10 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j9;
        this.zzd = 0;
        this.zzb = j7;
        if (i10 >= 32 && i10 != 40) {
            if (this.zzi && !this.zzj) {
                if (z8) {
                    zze(i9);
                }
                this.zzi = false;
            }
            if (i10 <= 35 || i10 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        if (i10 >= 16 && i10 <= 21) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.zzc = z9;
        if (z9 || i10 <= 9) {
            z10 = true;
        }
        this.zzf = z10;
    }
}
