package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes3.dex */
final class zzank {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzek zza = new zzek(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzed zzb = new zzed();

    public static long zzc(zzed zzedVar) {
        int zzd = zzedVar.zzd();
        if (zzedVar.zzb() >= 9) {
            byte[] bArr = new byte[9];
            zzedVar.zzH(bArr, 0, 9);
            zzedVar.zzL(zzd);
            byte b3 = bArr[0];
            if ((b3 & 196) == 68) {
                byte b10 = bArr[2];
                if ((b10 & 4) == 4) {
                    byte b11 = bArr[4];
                    if ((b11 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j3 = b3;
                        long j10 = b10;
                        long j11 = (248 & j10) >> 3;
                        long j12 = (j10 & 3) << 13;
                        return j12 | ((bArr[1] & 255) << 20) | ((j3 & 3) << 28) | (((j3 & 56) >> 3) << 30) | (j11 << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
                    }
                    return C.TIME_UNSET;
                }
                return C.TIME_UNSET;
            }
            return C.TIME_UNSET;
        }
        return C.TIME_UNSET;
    }

    private final int zzf(zzacs zzacsVar) {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacsVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public final int zza(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        boolean z10 = this.zze;
        long j3 = C.TIME_UNSET;
        if (!z10) {
            long zzd = zzacsVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j10 = zzd - min;
            if (zzacsVar.zzf() != j10) {
                zzadnVar.zza = j10;
                return 1;
            }
            this.zzb.zzI(min);
            zzacsVar.zzj();
            zzacsVar.zzh(this.zzb.zzN(), 0, min);
            zzed zzedVar = this.zzb;
            int zzd2 = zzedVar.zzd();
            int zze = zzedVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzedVar.zzN(), zze) == 442) {
                    zzedVar.zzL(zze + 4);
                    long zzc = zzc(zzedVar);
                    if (zzc != C.TIME_UNSET) {
                        j3 = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j3;
            this.zze = true;
        } else {
            if (this.zzg == C.TIME_UNSET) {
                zzf(zzacsVar);
                return 0;
            }
            if (!this.zzd) {
                int min2 = (int) Math.min(20000L, zzacsVar.zzd());
                if (zzacsVar.zzf() != 0) {
                    zzadnVar.zza = 0L;
                    return 1;
                }
                this.zzb.zzI(min2);
                zzacsVar.zzj();
                zzacsVar.zzh(this.zzb.zzN(), 0, min2);
                zzed zzedVar2 = this.zzb;
                int zzd3 = zzedVar2.zzd();
                int zze2 = zzedVar2.zze();
                while (true) {
                    if (zzd3 >= zze2 - 3) {
                        break;
                    }
                    if (zzg(zzedVar2.zzN(), zzd3) == 442) {
                        zzedVar2.zzL(zzd3 + 4);
                        long zzc2 = zzc(zzedVar2);
                        if (zzc2 != C.TIME_UNSET) {
                            j3 = zzc2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j3;
                this.zzd = true;
            } else {
                long j11 = this.zzf;
                if (j11 == C.TIME_UNSET) {
                    zzf(zzacsVar);
                    return 0;
                }
                zzek zzekVar = this.zza;
                this.zzh = zzekVar.zzc(this.zzg) - zzekVar.zzb(j11);
                zzf(zzacsVar);
                return 0;
            }
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzek zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
