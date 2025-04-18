package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzacm {
    protected final zzacg zza;
    protected final zzacl zzb;

    @Nullable
    protected zzaci zzc;
    private final int zzd;

    public zzacm(zzacj zzacjVar, zzacl zzaclVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.zzb = zzaclVar;
        this.zzd = i2;
        this.zza = new zzacg(zzacjVar, j2, 0L, j4, j5, j6, j7);
    }

    public static final int zzf(zzadc zzadcVar, long j2, zzadx zzadxVar) {
        if (j2 == zzadcVar.zzf()) {
            return 0;
        }
        zzadxVar.zza = j2;
        return 1;
    }

    public static final boolean zzg(zzadc zzadcVar, long j2) throws IOException {
        long zzf = j2 - zzadcVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        zzadcVar.zzk((int) zzf);
        return true;
    }

    public final int zza(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        while (true) {
            zzaci zzaciVar = this.zzc;
            zzdi.zzb(zzaciVar);
            j2 = zzaciVar.zzf;
            j3 = zzaciVar.zzg;
            j4 = zzaciVar.zzh;
            if (j3 - j2 <= this.zzd) {
                zzc(false, j2);
                return zzf(zzadcVar, j2, zzadxVar);
            }
            if (!zzg(zzadcVar, j4)) {
                return zzf(zzadcVar, j4, zzadxVar);
            }
            zzadcVar.zzj();
            zzacl zzaclVar = this.zzb;
            j5 = zzaciVar.zzb;
            zzack zza = zzaclVar.zza(zzadcVar, j5);
            i2 = zza.zzb;
            if (i2 == -3) {
                zzc(false, j4);
                return zzf(zzadcVar, j4, zzadxVar);
            }
            if (i2 == -2) {
                j11 = zza.zzc;
                j12 = zza.zzd;
                zzaci.zzh(zzaciVar, j11, j12);
            } else {
                if (i2 != -1) {
                    j6 = zza.zzd;
                    zzg(zzadcVar, j6);
                    j7 = zza.zzd;
                    zzc(true, j7);
                    j8 = zza.zzd;
                    return zzf(zzadcVar, j8, zzadxVar);
                }
                j9 = zza.zzc;
                j10 = zza.zzd;
                zzaci.zzg(zzaciVar, j9, j10);
            }
        }
    }

    public final zzaea zzb() {
        return this.zza;
    }

    public final void zzc(boolean z2, long j2) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzaci zzaciVar = this.zzc;
        if (zzaciVar != null) {
            j7 = zzaciVar.zza;
            if (j7 == j2) {
                return;
            }
        }
        zzacg zzacgVar = this.zza;
        long zzf = zzacgVar.zzf(j2);
        j3 = zzacgVar.zzc;
        j4 = zzacgVar.zzd;
        j5 = zzacgVar.zze;
        j6 = zzacgVar.zzf;
        this.zzc = new zzaci(j2, zzf, 0L, j3, j4, j5, j6);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
