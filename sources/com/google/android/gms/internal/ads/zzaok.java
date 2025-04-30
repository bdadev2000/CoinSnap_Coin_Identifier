package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzaok {
    private final zzafa zza;
    private final zzgs zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzaoj zzi = new zzaoj(null);
    private final zzaoj zzj = new zzaoj(null);
    private boolean zzk = false;

    public zzaok(zzafa zzafaVar, boolean z8, boolean z9) {
        this.zza = zzafaVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzgs(bArr, 0, 0);
    }

    public final void zza(zzgp zzgpVar) {
        this.zzc.append(zzgpVar.zza, zzgpVar);
    }

    public final void zzb(zzgq zzgqVar) {
        this.zzb.append(zzgqVar.zzd, zzgqVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j7, int i9, long j9, boolean z8) {
        this.zzf = i9;
        this.zzh = j9;
        this.zzg = j7;
        this.zzo = z8;
    }

    public final boolean zze(long j7, int i9, boolean z8) {
        boolean z9 = false;
        if (this.zzf == 9) {
            if (z8 && this.zzk) {
                long j9 = this.zzg;
                int i10 = i9 + ((int) (j7 - j9));
                long j10 = this.zzm;
                if (j10 != C.TIME_UNSET) {
                    this.zza.zzs(j10, this.zzn ? 1 : 0, (int) (j9 - this.zzl), i10, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z10 = this.zzo;
        boolean z11 = this.zzn;
        int i11 = this.zzf;
        if (i11 == 5 || (z10 && i11 == 1)) {
            z9 = true;
        }
        boolean z12 = z11 | z9;
        this.zzn = z12;
        return z12;
    }
}
