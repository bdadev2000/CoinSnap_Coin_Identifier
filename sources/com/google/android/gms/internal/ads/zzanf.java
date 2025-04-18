package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
final class zzanf {
    private final zzaeh zza;
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

    public zzanf(zzaeh zzaehVar, boolean z2, boolean z3) {
        this.zza = zzaehVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzft(bArr, 0, 0);
        this.zzh = false;
    }

    private final void zzg(int i2) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L) {
            return;
        }
        boolean z2 = this.zzk;
        long j3 = this.zzf - this.zzi;
        this.zza.zzs(j2, z2 ? 1 : 0, (int) j3, i2, null);
    }

    private final void zzh() {
        boolean z2 = this.zzl;
        boolean z3 = this.zzk;
        int i2 = this.zze;
        boolean z4 = true;
        if (i2 != 5 && (!z2 || i2 != 1)) {
            z4 = false;
        }
        this.zzk = z3 | z4;
    }

    public final void zza(long j2) {
        zzh();
        this.zzf = j2;
        zzg(0);
        this.zzh = false;
    }

    public final void zzb(zzfq zzfqVar) {
        this.zzc.append(zzfqVar.zza, zzfqVar);
    }

    public final void zzc(zzfr zzfrVar) {
        this.zzb.append(zzfrVar.zzd, zzfrVar);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long j2, int i2, long j3, boolean z2) {
        this.zze = i2;
        this.zzg = j3;
        this.zzf = j2;
        this.zzl = z2;
    }

    public final boolean zzf(long j2, int i2, boolean z2) {
        if (this.zze == 9) {
            if (z2 && this.zzh) {
                zzg(i2 + ((int) (j2 - this.zzf)));
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
