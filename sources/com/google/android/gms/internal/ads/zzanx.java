package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzanx {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzer zza = new zzer(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzek zzb = new zzek();

    public static long zzc(zzek zzekVar) {
        int zzd = zzekVar.zzd();
        if (zzekVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzekVar.zzH(bArr, 0, 9);
        zzekVar.zzL(zzd);
        byte b2 = bArr[0];
        if ((b2 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[2];
        if ((b3 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b4 = bArr[4];
        if ((b4 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j2 = b2;
        long j3 = b3;
        long j4 = (248 & j3) >> 3;
        long j5 = (j3 & 3) << 13;
        return j5 | ((bArr[1] & 255) << 20) | ((j2 & 3) << 28) | (((j2 & 56) >> 3) << 30) | (j4 << 15) | ((bArr[3] & 255) << 5) | ((b4 & 248) >> 3);
    }

    private final int zzf(zzadc zzadcVar) {
        byte[] bArr = zzeu.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzadcVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public final int zza(zzadc zzadcVar, zzadx zzadxVar) throws IOException {
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzadcVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j3 = zzd - min;
            if (zzadcVar.zzf() != j3) {
                zzadxVar.zza = j3;
                return 1;
            }
            this.zzb.zzI(min);
            zzadcVar.zzj();
            zzadcVar.zzh(this.zzb.zzN(), 0, min);
            zzek zzekVar = this.zzb;
            int zzd2 = zzekVar.zzd();
            int zze = zzekVar.zze() - 4;
            while (true) {
                if (zze < zzd2) {
                    break;
                }
                if (zzg(zzekVar.zzN(), zze) == 442) {
                    zzekVar.zzL(zze + 4);
                    long zzc = zzc(zzekVar);
                    if (zzc != -9223372036854775807L) {
                        j2 = zzc;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j2;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzadcVar);
                return 0;
            }
            if (this.zzd) {
                long j4 = this.zzf;
                if (j4 == -9223372036854775807L) {
                    zzf(zzadcVar);
                    return 0;
                }
                zzer zzerVar = this.zza;
                this.zzh = zzerVar.zzc(this.zzg) - zzerVar.zzb(j4);
                zzf(zzadcVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, zzadcVar.zzd());
            if (zzadcVar.zzf() != 0) {
                zzadxVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(min2);
            zzadcVar.zzj();
            zzadcVar.zzh(this.zzb.zzN(), 0, min2);
            zzek zzekVar2 = this.zzb;
            int zzd3 = zzekVar2.zzd();
            int zze2 = zzekVar2.zze();
            while (true) {
                if (zzd3 >= zze2 - 3) {
                    break;
                }
                if (zzg(zzekVar2.zzN(), zzd3) == 442) {
                    zzekVar2.zzL(zzd3 + 4);
                    long zzc2 = zzc(zzekVar2);
                    if (zzc2 != -9223372036854775807L) {
                        j2 = zzc2;
                        break;
                    }
                }
                zzd3++;
            }
            this.zzf = j2;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzer zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
