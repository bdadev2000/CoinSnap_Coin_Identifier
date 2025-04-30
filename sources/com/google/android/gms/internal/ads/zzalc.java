package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzalc {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfu zzg = new zzfu(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzadv zzadvVar, boolean z8) throws IOException {
        zza();
        this.zzg.zzH(27);
        if (zzady.zzc(zzadvVar, this.zzg.zzM(), 0, 27, z8) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z8) {
                    return false;
                }
                throw zzch.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzH(zzm);
            if (zzady.zzc(zzadvVar, this.zzg.zzM(), 0, this.zzc, z8)) {
                for (int i9 = 0; i9 < this.zzc; i9++) {
                    this.zzf[i9] = this.zzg.zzm();
                    this.zze += this.zzf[i9];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzadv zzadvVar, long j7) throws IOException {
        boolean z8;
        if (zzadvVar.zzf() == zzadvVar.zze()) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzg.zzH(4);
        while (true) {
            if ((j7 == -1 || zzadvVar.zzf() + 4 < j7) && zzady.zzc(zzadvVar, this.zzg.zzM(), 0, 4, true)) {
                this.zzg.zzK(0);
                if (this.zzg.zzu() != 1332176723) {
                    ((zzadi) zzadvVar).zzo(1, false);
                } else {
                    zzadvVar.zzj();
                    return true;
                }
            }
        }
        do {
            if (j7 != -1 && zzadvVar.zzf() >= j7) {
                break;
            }
        } while (zzadvVar.zzc(1) != -1);
        return false;
    }
}
