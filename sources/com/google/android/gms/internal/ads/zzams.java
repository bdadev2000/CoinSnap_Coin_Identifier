package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzams {
    private final zzadx zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzams(zzadx zzadxVar, boolean z10, boolean z11) {
        this.zza = zzadxVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfq(bArr, 0, 0);
        this.zzh = false;
    }

    private final void zzg(int i10) {
        long j3 = this.zzj;
        if (j3 == C.TIME_UNSET) {
            return;
        }
        boolean z10 = this.zzk;
        long j10 = this.zzf - this.zzi;
        this.zza.zzs(j3, z10 ? 1 : 0, (int) j10, i10, null);
    }

    private final void zzh() {
        boolean z10 = this.zzl;
        boolean z11 = this.zzk;
        int i10 = this.zze;
        boolean z12 = true;
        if (i10 != 5 && (!z10 || i10 != 1)) {
            z12 = false;
        }
        this.zzk = z11 | z12;
    }

    public final void zza(long j3) {
        zzh();
        this.zzf = j3;
        zzg(0);
        this.zzh = false;
    }

    public final void zzb(zzfn zzfnVar) {
        this.zzc.append(zzfnVar.zza, zzfnVar);
    }

    public final void zzc(zzfo zzfoVar) {
        this.zzb.append(zzfoVar.zzd, zzfoVar);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long j3, int i10, long j10, boolean z10) {
        this.zze = i10;
        this.zzg = j10;
        this.zzf = j3;
        this.zzl = z10;
    }

    public final boolean zzf(long j3, int i10, boolean z10) {
        if (this.zze == 9) {
            if (z10 && this.zzh) {
                zzg(i10 + ((int) (j3 - this.zzf)));
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        zzh();
        return this.zzk;
    }
}
