package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzadf {
    public static void zza(long j7, zzfu zzfuVar, zzafa[] zzafaVarArr) {
        int i9;
        boolean z8;
        while (true) {
            boolean z9 = true;
            if (zzfuVar.zzb() > 1) {
                int zzc = zzc(zzfuVar);
                int zzc2 = zzc(zzfuVar);
                int zzd = zzfuVar.zzd() + zzc2;
                if (zzc2 != -1 && zzc2 <= zzfuVar.zzb()) {
                    if (zzc == 4 && zzc2 >= 8) {
                        int zzm = zzfuVar.zzm();
                        int zzq = zzfuVar.zzq();
                        if (zzq == 49) {
                            i9 = zzfuVar.zzg();
                            zzq = 49;
                        } else {
                            i9 = 0;
                        }
                        int zzm2 = zzfuVar.zzm();
                        if (zzq == 47) {
                            zzfuVar.zzL(1);
                            zzq = 47;
                        }
                        if (zzm != 181 || ((zzq != 49 && zzq != 47) || zzm2 != 3)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (zzq == 49) {
                            if (i9 != 1195456820) {
                                z9 = false;
                            }
                            z8 &= z9;
                        }
                        if (z8) {
                            zzb(j7, zzfuVar, zzafaVarArr);
                        }
                    }
                } else {
                    zzfk.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzd = zzfuVar.zze();
                }
                zzfuVar.zzK(zzd);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j7, zzfu zzfuVar, zzafa[] zzafaVarArr) {
        boolean z8;
        int zzm = zzfuVar.zzm();
        if ((zzm & 64) != 0) {
            int i9 = zzm & 31;
            zzfuVar.zzL(1);
            int zzd = zzfuVar.zzd();
            for (zzafa zzafaVar : zzafaVarArr) {
                int i10 = i9 * 3;
                zzfuVar.zzK(zzd);
                zzafaVar.zzq(zzfuVar, i10);
                if (j7 != C.TIME_UNSET) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzeq.zzf(z8);
                zzafaVar.zzs(j7, 1, i10, 0, null);
            }
        }
    }

    private static int zzc(zzfu zzfuVar) {
        int i9 = 0;
        while (zzfuVar.zzb() != 0) {
            int zzm = zzfuVar.zzm();
            i9 += zzm;
            if (zzm != 255) {
                return i9;
            }
        }
        return -1;
    }
}
