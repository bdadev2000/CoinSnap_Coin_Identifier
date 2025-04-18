package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzacn {
    public static void zza(long j2, zzek zzekVar, zzaeh[] zzaehVarArr) {
        int i2;
        while (true) {
            if (zzekVar.zzb() <= 1) {
                return;
            }
            int zzc = zzc(zzekVar);
            int zzc2 = zzc(zzekVar);
            int zzd = zzekVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzekVar.zzb()) {
                zzea.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzd = zzekVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzm = zzekVar.zzm();
                int zzq = zzekVar.zzq();
                if (zzq == 49) {
                    i2 = zzekVar.zzg();
                    zzq = 49;
                } else {
                    i2 = 0;
                }
                int zzm2 = zzekVar.zzm();
                if (zzq == 47) {
                    zzekVar.zzM(1);
                    zzq = 47;
                }
                boolean z2 = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                if (zzq == 49) {
                    z2 &= i2 == 1195456820;
                }
                if (z2) {
                    zzb(j2, zzekVar, zzaehVarArr);
                }
            }
            zzekVar.zzL(zzd);
        }
    }

    public static void zzb(long j2, zzek zzekVar, zzaeh[] zzaehVarArr) {
        int zzm = zzekVar.zzm();
        if ((zzm & 64) != 0) {
            int i2 = zzm & 31;
            zzekVar.zzM(1);
            int zzd = zzekVar.zzd();
            for (zzaeh zzaehVar : zzaehVarArr) {
                int i3 = i2 * 3;
                zzekVar.zzL(zzd);
                zzaehVar.zzq(zzekVar, i3);
                zzdi.zzf(j2 != -9223372036854775807L);
                zzaehVar.zzs(j2, 1, i3, 0, null);
            }
        }
    }

    private static int zzc(zzek zzekVar) {
        int i2 = 0;
        while (zzekVar.zzb() != 0) {
            int zzm = zzekVar.zzm();
            i2 += zzm;
            if (zzm != 255) {
                return i2;
            }
        }
        return -1;
    }
}
