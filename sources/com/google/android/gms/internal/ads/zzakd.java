package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzakd {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzek zzg = new zzek(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzadc zzadcVar, boolean z2) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzadf.zzc(zzadcVar, this.zzg.zzN(), 0, 27, z2) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z2) {
                    return false;
                }
                throw zzbo.zzc("unsupported bit stream revision");
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
            if (zzadf.zzc(zzadcVar, this.zzg.zzN(), 0, this.zzc, z2)) {
                for (int i2 = 0; i2 < this.zzc; i2++) {
                    this.zzf[i2] = this.zzg.zzm();
                    this.zze += this.zzf[i2];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzadc zzadcVar, long j2) throws IOException {
        zzdi.zzd(zzadcVar.zzf() == zzadcVar.zze());
        this.zzg.zzI(4);
        while (true) {
            if ((j2 == -1 || zzadcVar.zzf() + 4 < j2) && zzadf.zzc(zzadcVar, this.zzg.zzN(), 0, 4, true)) {
                this.zzg.zzL(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzadcVar.zzj();
                    return true;
                }
                zzadcVar.zzk(1);
            }
        }
        do {
            if (j2 != -1 && zzadcVar.zzf() >= j2) {
                break;
            }
        } while (zzadcVar.zzc(1) != -1);
        return false;
    }
}
