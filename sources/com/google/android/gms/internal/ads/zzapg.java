package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzapg {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzgb zza = new zzgb(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzfu zzb = new zzfu();

    public zzapg(int i9) {
    }

    private final int zze(zzadv zzadvVar) {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadvVar.zzj();
        return 0;
    }

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar, int i9) throws IOException {
        if (i9 <= 0) {
            zze(zzadvVar);
            return 0;
        }
        boolean z8 = this.zze;
        long j7 = C.TIME_UNSET;
        if (!z8) {
            long zzd = zzadvVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j9 = zzd - min;
            if (zzadvVar.zzf() != j9) {
                zzaeqVar.zza = j9;
            } else {
                this.zzb.zzH(min);
                zzadvVar.zzj();
                ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, min, false);
                zzfu zzfuVar = this.zzb;
                int zzd2 = zzfuVar.zzd();
                int zze = zzfuVar.zze();
                int i10 = zze - 188;
                while (true) {
                    if (i10 < zzd2) {
                        break;
                    }
                    byte[] zzM = zzfuVar.zzM();
                    int i11 = -4;
                    int i12 = 0;
                    while (true) {
                        if (i11 > 4) {
                            break;
                        }
                        int i13 = (i11 * 188) + i10;
                        if (i13 < zzd2 || i13 >= zze || zzM[i13] != 71) {
                            i12 = 0;
                        } else {
                            i12++;
                            if (i12 == 5) {
                                long zzb = zzapq.zzb(zzfuVar, i10, i9);
                                if (zzb != C.TIME_UNSET) {
                                    j7 = zzb;
                                    break;
                                }
                            }
                        }
                        i11++;
                    }
                    i10--;
                }
                this.zzg = j7;
                this.zze = true;
                return 0;
            }
        } else {
            if (this.zzg == C.TIME_UNSET) {
                zze(zzadvVar);
                return 0;
            }
            if (!this.zzd) {
                int min2 = (int) Math.min(112800L, zzadvVar.zzd());
                if (zzadvVar.zzf() != 0) {
                    zzaeqVar.zza = 0L;
                } else {
                    this.zzb.zzH(min2);
                    zzadvVar.zzj();
                    ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, min2, false);
                    zzfu zzfuVar2 = this.zzb;
                    int zzd3 = zzfuVar2.zzd();
                    int zze2 = zzfuVar2.zze();
                    while (true) {
                        if (zzd3 >= zze2) {
                            break;
                        }
                        if (zzfuVar2.zzM()[zzd3] == 71) {
                            long zzb2 = zzapq.zzb(zzfuVar2, zzd3, i9);
                            if (zzb2 != C.TIME_UNSET) {
                                j7 = zzb2;
                                break;
                            }
                        }
                        zzd3++;
                    }
                    this.zzf = j7;
                    this.zzd = true;
                    return 0;
                }
            } else {
                long j10 = this.zzf;
                if (j10 == C.TIME_UNSET) {
                    zze(zzadvVar);
                    return 0;
                }
                zzgb zzgbVar = this.zza;
                this.zzh = zzgbVar.zzc(this.zzg) - zzgbVar.zzb(j10);
                zze(zzadvVar);
                return 0;
            }
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzgb zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
