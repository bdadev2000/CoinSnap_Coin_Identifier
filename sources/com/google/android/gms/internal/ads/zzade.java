package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzade {
    protected final zzacy zza;
    protected final zzadd zzb;

    @Nullable
    protected zzada zzc;
    private final int zzd;

    public zzade(zzadb zzadbVar, zzadd zzaddVar, long j7, long j9, long j10, long j11, long j12, long j13, int i9) {
        this.zzb = zzaddVar;
        this.zzd = i9;
        this.zza = new zzacy(zzadbVar, j7, 0L, j10, j11, j12, j13);
    }

    public static final int zzf(zzadv zzadvVar, long j7, zzaeq zzaeqVar) {
        if (j7 == zzadvVar.zzf()) {
            return 0;
        }
        zzaeqVar.zza = j7;
        return 1;
    }

    public static final boolean zzg(zzadv zzadvVar, long j7) throws IOException {
        long zzf = j7 - zzadvVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzadi) zzadvVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        long j7;
        long j9;
        long j10;
        long j11;
        int i9;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        while (true) {
            zzada zzadaVar = this.zzc;
            zzeq.zzb(zzadaVar);
            j7 = zzadaVar.zzf;
            j9 = zzadaVar.zzg;
            long j19 = j9 - j7;
            int i10 = this.zzd;
            j10 = zzadaVar.zzh;
            if (j19 <= i10) {
                zzc(false, j7);
                return zzf(zzadvVar, j7, zzaeqVar);
            }
            if (!zzg(zzadvVar, j10)) {
                return zzf(zzadvVar, j10, zzaeqVar);
            }
            zzadvVar.zzj();
            zzadd zzaddVar = this.zzb;
            j11 = zzadaVar.zzb;
            zzadc zza = zzaddVar.zza(zzadvVar, j11);
            i9 = zza.zzb;
            if (i9 != -3) {
                if (i9 != -2) {
                    if (i9 != -1) {
                        j12 = zza.zzd;
                        zzg(zzadvVar, j12);
                        j13 = zza.zzd;
                        zzc(true, j13);
                        j14 = zza.zzd;
                        return zzf(zzadvVar, j14, zzaeqVar);
                    }
                    j15 = zza.zzc;
                    j16 = zza.zzd;
                    zzada.zzg(zzadaVar, j15, j16);
                } else {
                    j17 = zza.zzc;
                    j18 = zza.zzd;
                    zzada.zzh(zzadaVar, j17, j18);
                }
            } else {
                zzc(false, j10);
                return zzf(zzadvVar, j10, zzaeqVar);
            }
        }
    }

    public final zzaet zzb() {
        return this.zza;
    }

    public final void zzc(boolean z8, long j7) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j7) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        zzada zzadaVar = this.zzc;
        if (zzadaVar != null) {
            j13 = zzadaVar.zza;
            if (j13 == j7) {
                return;
            }
        }
        zzacy zzacyVar = this.zza;
        long zzf = zzacyVar.zzf(j7);
        j9 = zzacyVar.zzc;
        j10 = zzacyVar.zzd;
        j11 = zzacyVar.zze;
        j12 = zzacyVar.zzf;
        this.zzc = new zzada(j7, zzf, 0L, j9, j10, j11, j12);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
