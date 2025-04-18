package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzacd {
    public static void zza(long j3, zzed zzedVar, zzadx[] zzadxVarArr) {
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (zzedVar.zzb() > 1) {
                int zzc = zzc(zzedVar);
                int zzc2 = zzc(zzedVar);
                int zzd = zzedVar.zzd() + zzc2;
                if (zzc2 != -1 && zzc2 <= zzedVar.zzb()) {
                    if (zzc == 4 && zzc2 >= 8) {
                        int zzm = zzedVar.zzm();
                        int zzq = zzedVar.zzq();
                        if (zzq == 49) {
                            i10 = zzedVar.zzg();
                            zzq = 49;
                        } else {
                            i10 = 0;
                        }
                        int zzm2 = zzedVar.zzm();
                        if (zzq == 47) {
                            zzedVar.zzM(1);
                            zzq = 47;
                        }
                        if (zzm == 181 && ((zzq == 49 || zzq == 47) && zzm2 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (zzq == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            zzb(j3, zzedVar, zzadxVarArr);
                        }
                    }
                } else {
                    zzdt.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzd = zzedVar.zze();
                }
                zzedVar.zzL(zzd);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j3, zzed zzedVar, zzadx[] zzadxVarArr) {
        boolean z10;
        int zzm = zzedVar.zzm();
        if ((zzm & 64) != 0) {
            int i10 = zzm & 31;
            zzedVar.zzM(1);
            int zzd = zzedVar.zzd();
            for (zzadx zzadxVar : zzadxVarArr) {
                int i11 = i10 * 3;
                zzedVar.zzL(zzd);
                zzadxVar.zzq(zzedVar, i11);
                if (j3 != C.TIME_UNSET) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzdb.zzf(z10);
                zzadxVar.zzs(j3, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzed zzedVar) {
        int i10 = 0;
        while (zzedVar.zzb() != 0) {
            int zzm = zzedVar.zzm();
            i10 += zzm;
            if (zzm != 255) {
                return i10;
            }
        }
        return -1;
    }
}
