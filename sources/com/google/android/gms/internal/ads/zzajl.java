package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import y.AbstractC2933a;

/* loaded from: classes2.dex */
final class zzajl implements zzaji {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzajl(long j7, int i9, long j9, int i10, long j10, @Nullable long[] jArr) {
        this.zza = j7;
        this.zzb = i9;
        this.zzc = j9;
        this.zzd = i10;
        this.zze = j10;
        this.zzg = jArr;
        this.zzf = j10 != -1 ? j7 + j10 : -1L;
    }

    @Nullable
    public static zzajl zzb(long j7, zzajk zzajkVar, long j9) {
        long j10 = zzajkVar.zzb;
        if (j10 == -1) {
            j10 = -1;
        }
        long zzs = zzgd.zzs((j10 * r7.zzg) - 1, zzajkVar.zza.zzd);
        long j11 = zzajkVar.zzc;
        if (j11 != -1 && zzajkVar.zzf != null) {
            if (j7 != -1) {
                long j12 = j9 + j11;
                if (j7 != j12) {
                    StringBuilder a6 = AbstractC2933a.a("XING data size mismatch: ", j7, ", ");
                    a6.append(j12);
                    zzfk.zzf("XingSeeker", a6.toString());
                }
            }
            zzaen zzaenVar = zzajkVar.zza;
            return new zzajl(j9, zzaenVar.zzc, zzs, zzaenVar.zzf, zzajkVar.zzc, zzajkVar.zzf);
        }
        zzaen zzaenVar2 = zzajkVar.zza;
        return new zzajl(j9, zzaenVar2.zzc, zzs, zzaenVar2.zzf, -1L, null);
    }

    private final long zzf(int i9) {
        return (this.zzc * i9) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    public final long zze(long j7) {
        long j9;
        double d2;
        if (zzh()) {
            long j10 = j7 - this.zza;
            if (j10 > this.zzb) {
                long[] jArr = this.zzg;
                zzeq.zzb(jArr);
                double d9 = (j10 * 256.0d) / this.zze;
                int zzc = zzgd.zzc(jArr, (long) d9, true, true);
                long zzf = zzf(zzc);
                long j11 = jArr[zzc];
                int i9 = zzc + 1;
                long zzf2 = zzf(i9);
                if (zzc == 99) {
                    j9 = 256;
                } else {
                    j9 = jArr[i9];
                }
                if (j11 == j9) {
                    d2 = 0.0d;
                } else {
                    d2 = (d9 - j11) / (j9 - j11);
                }
                return Math.round(d2 * (zzf2 - zzf)) + zzf;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        double d2;
        if (!zzh()) {
            zzaeu zzaeuVar = new zzaeu(0L, this.zza + this.zzb);
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        long max = Math.max(0L, Math.min(j7, this.zzc));
        double d9 = (max * 100.0d) / this.zzc;
        double d10 = 0.0d;
        if (d9 > 0.0d) {
            if (d9 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i9 = (int) d9;
                long[] jArr = this.zzg;
                zzeq.zzb(jArr);
                double d11 = jArr[i9];
                if (i9 == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = jArr[i9 + 1];
                }
                d10 = ((d2 - d11) * (d9 - i9)) + d11;
            }
        }
        long j9 = this.zze;
        zzaeu zzaeuVar2 = new zzaeu(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d10 / 256.0d) * j9), j9 - 1)));
        return new zzaer(zzaeuVar2, zzaeuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return this.zzg != null;
    }
}
