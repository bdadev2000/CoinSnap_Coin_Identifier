package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzaox {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzgb zza = new zzgb(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzfu zzb = new zzfu();

    public static long zzc(zzfu zzfuVar) {
        int zzd = zzfuVar.zzd();
        if (zzfuVar.zzb() >= 9) {
            byte[] bArr = new byte[9];
            zzfuVar.zzG(bArr, 0, 9);
            zzfuVar.zzK(zzd);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b8 = bArr[2];
                if ((b8 & 4) == 4) {
                    byte b9 = bArr[4];
                    if ((b9 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j7 = b;
                        long j9 = b8;
                        long j10 = (248 & j9) >> 3;
                        long j11 = (j9 & 3) << 13;
                        return j11 | ((bArr[1] & 255) << 20) | ((j7 & 3) << 28) | (((j7 & 56) >> 3) << 30) | (j10 << 15) | ((bArr[3] & 255) << 5) | ((b9 & 248) >> 3);
                    }
                    return C.TIME_UNSET;
                }
                return C.TIME_UNSET;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private final int zzf(zzadv zzadvVar) {
        byte[] bArr = zzgd.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzadvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean z8 = this.zze;
        long j7 = C.TIME_UNSET;
        if (!z8) {
            long zzd = zzadvVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j9 = zzd - min;
            if (zzadvVar.zzf() != j9) {
                zzaeqVar.zza = j9;
                return 1;
            }
            this.zzb.zzH(min);
            zzadvVar.zzj();
            ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, min, false);
            zzfu zzfuVar = this.zzb;
            int zzd2 = zzfuVar.zzd();
            int zze = zzfuVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzfuVar.zzM(), zze) == 442) {
                    zzfuVar.zzK(zze + 4);
                    long zzc = zzc(zzfuVar);
                    if (zzc != C.TIME_UNSET) {
                        j7 = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j7;
            this.zze = true;
        } else {
            if (this.zzg == C.TIME_UNSET) {
                zzf(zzadvVar);
                return 0;
            }
            if (!this.zzd) {
                int min2 = (int) Math.min(20000L, zzadvVar.zzd());
                if (zzadvVar.zzf() != 0) {
                    zzaeqVar.zza = 0L;
                    return 1;
                }
                this.zzb.zzH(min2);
                zzadvVar.zzj();
                ((zzadi) zzadvVar).zzm(this.zzb.zzM(), 0, min2, false);
                zzfu zzfuVar2 = this.zzb;
                int zzd3 = zzfuVar2.zzd();
                int zze2 = zzfuVar2.zze();
                while (true) {
                    if (zzd3 >= zze2 - 3) {
                        break;
                    }
                    if (zzg(zzfuVar2.zzM(), zzd3) == 442) {
                        zzfuVar2.zzK(zzd3 + 4);
                        long zzc2 = zzc(zzfuVar2);
                        if (zzc2 != C.TIME_UNSET) {
                            j7 = zzc2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j7;
                this.zzd = true;
            } else {
                long j10 = this.zzf;
                if (j10 == C.TIME_UNSET) {
                    zzf(zzadvVar);
                    return 0;
                }
                zzgb zzgbVar = this.zza;
                this.zzh = zzgbVar.zzc(this.zzg) - zzgbVar.zzb(j10);
                zzf(zzadvVar);
                return 0;
            }
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzgb zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
