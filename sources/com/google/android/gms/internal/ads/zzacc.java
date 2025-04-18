package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzacc {
    protected final zzabw zza;
    protected final zzacb zzb;

    @Nullable
    protected zzaby zzc;
    private final int zzd;

    public zzacc(zzabz zzabzVar, zzacb zzacbVar, long j3, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.zzb = zzacbVar;
        this.zzd = i10;
        this.zza = new zzabw(zzabzVar, j3, 0L, j11, j12, j13, j14);
    }

    public static final int zzf(zzacs zzacsVar, long j3, zzadn zzadnVar) {
        if (j3 == zzacsVar.zzf()) {
            return 0;
        }
        zzadnVar.zza = j3;
        return 1;
    }

    public static final boolean zzg(zzacs zzacsVar, long j3) throws IOException {
        long zzf = j3 - zzacsVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        zzacsVar.zzk((int) zzf);
        return true;
    }

    public final int zza(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        long j3;
        long j10;
        long j11;
        long j12;
        int i10;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        while (true) {
            zzaby zzabyVar = this.zzc;
            zzdb.zzb(zzabyVar);
            j3 = zzabyVar.zzf;
            j10 = zzabyVar.zzg;
            j11 = zzabyVar.zzh;
            if (j10 - j3 <= this.zzd) {
                zzc(false, j3);
                return zzf(zzacsVar, j3, zzadnVar);
            }
            if (!zzg(zzacsVar, j11)) {
                return zzf(zzacsVar, j11, zzadnVar);
            }
            zzacsVar.zzj();
            zzacb zzacbVar = this.zzb;
            j12 = zzabyVar.zzb;
            zzaca zza = zzacbVar.zza(zzacsVar, j12);
            i10 = zza.zzb;
            if (i10 != -3) {
                if (i10 != -2) {
                    if (i10 != -1) {
                        j13 = zza.zzd;
                        zzg(zzacsVar, j13);
                        j14 = zza.zzd;
                        zzc(true, j14);
                        j15 = zza.zzd;
                        return zzf(zzacsVar, j15, zzadnVar);
                    }
                    j16 = zza.zzc;
                    j17 = zza.zzd;
                    zzaby.zzg(zzabyVar, j16, j17);
                } else {
                    j18 = zza.zzc;
                    j19 = zza.zzd;
                    zzaby.zzh(zzabyVar, j18, j19);
                }
            } else {
                zzc(false, j11);
                return zzf(zzacsVar, j11, zzadnVar);
            }
        }
    }

    public final zzadq zzb() {
        return this.zza;
    }

    public final void zzc(boolean z10, long j3) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j3) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        zzaby zzabyVar = this.zzc;
        if (zzabyVar != null) {
            j14 = zzabyVar.zza;
            if (j14 == j3) {
                return;
            }
        }
        zzabw zzabwVar = this.zza;
        long zzf = zzabwVar.zzf(j3);
        j10 = zzabwVar.zzc;
        j11 = zzabwVar.zzd;
        j12 = zzabwVar.zze;
        j13 = zzabwVar.zzf;
        this.zzc = new zzaby(j3, zzf, 0L, j10, j11, j12, j13);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
