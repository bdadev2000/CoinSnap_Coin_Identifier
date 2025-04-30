package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import y.AbstractC2933a;

/* loaded from: classes2.dex */
final class zzajj implements zzaji {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajj(long[] jArr, long[] jArr2, long j7, long j9, int i9) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = i9;
    }

    @Nullable
    public static zzajj zzb(long j7, long j9, zzaen zzaenVar, zzfu zzfuVar) {
        int i9;
        int zzm;
        zzfuVar.zzL(10);
        int zzg = zzfuVar.zzg();
        if (zzg > 0) {
            int i10 = zzaenVar.zzd;
            if (i10 >= 32000) {
                i9 = 1152;
            } else {
                i9 = 576;
            }
            long zzt = zzgd.zzt(zzg, i9 * 1000000, i10, RoundingMode.FLOOR);
            int zzq = zzfuVar.zzq();
            int zzq2 = zzfuVar.zzq();
            int zzq3 = zzfuVar.zzq();
            zzfuVar.zzL(2);
            long j10 = j9 + zzaenVar.zzc;
            long[] jArr = new long[zzq];
            long[] jArr2 = new long[zzq];
            int i11 = 0;
            long j11 = j9;
            while (i11 < zzq) {
                long j12 = zzt;
                jArr[i11] = (i11 * zzt) / zzq;
                jArr2[i11] = Math.max(j11, j10);
                if (zzq3 != 1) {
                    if (zzq3 != 2) {
                        if (zzq3 != 3) {
                            if (zzq3 != 4) {
                                return null;
                            }
                            zzm = zzfuVar.zzp();
                        } else {
                            zzm = zzfuVar.zzo();
                        }
                    } else {
                        zzm = zzfuVar.zzq();
                    }
                } else {
                    zzm = zzfuVar.zzm();
                }
                j11 += zzm * zzq2;
                i11++;
                zzt = j12;
            }
            long j13 = zzt;
            if (j7 != -1 && j7 != j11) {
                StringBuilder a6 = AbstractC2933a.a("VBRI data size mismatch: ", j7, ", ");
                a6.append(j11);
                zzfk.zzf("VbriSeeker", a6.toString());
            }
            return new zzajj(jArr, jArr2, j13, j11, zzaenVar.zzf);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zze(long j7) {
        return this.zza[zzgd.zzc(this.zzb, j7, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long[] jArr = this.zza;
        int zzc = zzgd.zzc(jArr, j7, true, true);
        zzaeu zzaeuVar = new zzaeu(jArr[zzc], this.zzb[zzc]);
        if (zzaeuVar.zzb < j7) {
            long[] jArr2 = this.zza;
            if (zzc != jArr2.length - 1) {
                int i9 = zzc + 1;
                return new zzaer(zzaeuVar, new zzaeu(jArr2[i9], this.zzb[i9]));
            }
        }
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
