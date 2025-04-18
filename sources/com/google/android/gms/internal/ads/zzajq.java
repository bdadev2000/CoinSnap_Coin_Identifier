package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzajq {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzed zzg = new zzed(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacs zzacsVar, boolean z10) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzacv.zzc(zzacsVar, this.zzg.zzN(), 0, 27, z10) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z10) {
                    return false;
                }
                throw zzbh.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzI(zzm);
            if (zzacv.zzc(zzacsVar, this.zzg.zzN(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzm();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacs zzacsVar, long j3) throws IOException {
        boolean z10;
        if (zzacsVar.zzf() == zzacsVar.zze()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zzg.zzI(4);
        while (true) {
            if ((j3 == -1 || zzacsVar.zzf() + 4 < j3) && zzacv.zzc(zzacsVar, this.zzg.zzN(), 0, 4, true)) {
                this.zzg.zzL(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzacsVar.zzj();
                    return true;
                }
                zzacsVar.zzk(1);
            }
        }
        do {
            if (j3 != -1 && zzacsVar.zzf() >= j3) {
                break;
            }
        } while (zzacsVar.zzc(1) != -1);
        return false;
    }
}
