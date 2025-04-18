package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
final class zzamu {
    private final zzadx zza;
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

    public zzamu(zzadx zzadxVar) {
        this.zza = zzadxVar;
    }

    private final void zzf(int i10) {
        long j3 = this.zzl;
        if (j3 == C.TIME_UNSET) {
            return;
        }
        boolean z10 = this.zzm;
        long j10 = this.zzb - this.zzk;
        this.zza.zzs(j3, z10 ? 1 : 0, (int) j10, i10, null);
    }

    public final void zza(long j3) {
        this.zzm = this.zzc;
        zzf((int) (j3 - this.zzb));
        this.zzk = this.zzb;
        this.zzb = j3;
        zzf(0);
        this.zzi = false;
    }

    public final void zzb(long j3, int i10, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z10 && this.zzi) {
                zzf(i10 + ((int) (j3 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.zzd = (i11 - i10) + i12;
            } else {
                this.zzg = (bArr[i13] & ByteCompanionObject.MIN_VALUE) != 0;
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

    public final void zze(long j3, int i10, int i11, long j10, boolean z10) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j10;
        this.zzd = 0;
        this.zzb = j3;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zzf(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        this.zzc = z11;
        this.zzf = z11 || i11 <= 9;
    }
}
