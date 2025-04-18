package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class zzahz implements zzahy {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahz(long[] jArr, long[] jArr2, long j3, long j10, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j3;
        this.zzd = j10;
        this.zze = i10;
    }

    @Nullable
    public static zzahz zzb(long j3, long j10, zzadj zzadjVar, zzed zzedVar) {
        int i10;
        int zzm;
        zzedVar.zzM(10);
        int zzg = zzedVar.zzg();
        if (zzg > 0) {
            int i11 = zzadjVar.zzd;
            if (i11 >= 32000) {
                i10 = 1152;
            } else {
                i10 = 576;
            }
            long zzu = zzen.zzu(zzg, i10 * 1000000, i11, RoundingMode.FLOOR);
            int zzq = zzedVar.zzq();
            int zzq2 = zzedVar.zzq();
            int zzq3 = zzedVar.zzq();
            zzedVar.zzM(2);
            long j11 = j10 + zzadjVar.zzc;
            long[] jArr = new long[zzq];
            long[] jArr2 = new long[zzq];
            int i12 = 0;
            long j12 = j10;
            while (i12 < zzq) {
                long j13 = zzu;
                jArr[i12] = (i12 * zzu) / zzq;
                jArr2[i12] = Math.max(j12, j11);
                if (zzq3 != 1) {
                    if (zzq3 != 2) {
                        if (zzq3 != 3) {
                            if (zzq3 != 4) {
                                return null;
                            }
                            zzm = zzedVar.zzp();
                        } else {
                            zzm = zzedVar.zzo();
                        }
                    } else {
                        zzm = zzedVar.zzq();
                    }
                } else {
                    zzm = zzedVar.zzm();
                }
                j12 += zzm * zzq2;
                i12++;
                zzu = j13;
                zzq = zzq;
            }
            long j14 = zzu;
            if (j3 != -1 && j3 != j12) {
                StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("VBRI data size mismatch: ", j3, ", ");
                o10.append(j12);
                zzdt.zzf("VbriSeeker", o10.toString());
            }
            return new zzahz(jArr, jArr2, j14, j12, zzadjVar.zzf);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j3) {
        return this.zza[zzen.zzd(this.zzb, j3, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long[] jArr = this.zza;
        int zzd = zzen.zzd(jArr, j3, true, true);
        zzadr zzadrVar = new zzadr(jArr[zzd], this.zzb[zzd]);
        if (zzadrVar.zzb < j3) {
            long[] jArr2 = this.zza;
            if (zzd != jArr2.length - 1) {
                int i10 = zzd + 1;
                return new zzado(zzadrVar, new zzadr(jArr2[i10], this.zzb[i10]));
            }
        }
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
