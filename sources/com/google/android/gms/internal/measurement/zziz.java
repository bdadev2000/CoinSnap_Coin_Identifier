package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziz extends zziw {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final void zzaa() {
        int i2 = this.zze + this.zzf;
        this.zze = i2;
        int i3 = i2 - this.zzh;
        int i4 = this.zzj;
        if (i3 <= i4) {
            this.zzf = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzf = i5;
        this.zze = i2 - i5;
    }

    private final byte zzv() throws IOException {
        int i2 = this.zzg;
        if (i2 == this.zze) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 1;
        return bArr[i2];
    }

    private final int zzw() throws IOException {
        int i2 = this.zzg;
        if (this.zze - i2 < 4) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 4;
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    private final int zzx() throws IOException {
        int i2;
        int i3 = this.zzg;
        int i4 = this.zze;
        if (i4 != i3) {
            byte[] bArr = this.zzd;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzg = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                if (i7 < 0) {
                    i2 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b3 = bArr[i10];
                            int i12 = (i11 ^ (b3 << 28)) ^ 266354560;
                            if (b3 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.zzg = i6;
                return i2;
            }
        }
        return (int) zzm();
    }

    private final long zzy() throws IOException {
        int i2 = this.zzg;
        if (this.zze - i2 < 8) {
            throw zzkb.zzi();
        }
        byte[] bArr = this.zzd;
        this.zzg = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    private final long zzz() throws IOException {
        long j2;
        long j3;
        long j4;
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzg = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                if (i6 < 0) {
                    j2 = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        j2 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            long j5 = (-2080896) ^ i10;
                            i5 = i9;
                            j2 = j5;
                        } else {
                            long j6 = i10;
                            i5 = i2 + 5;
                            long j7 = j6 ^ (bArr[i9] << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i11 = i2 + 6;
                                long j8 = j7 ^ (bArr[i5] << 35);
                                if (j8 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i2 + 7;
                                    j7 = j8 ^ (bArr[i11] << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j8 = j7 ^ (bArr[i5] << 49);
                                        if (j8 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            long j9 = (j8 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i5] >= 0) {
                                                    i5 = i12;
                                                }
                                            }
                                            j2 = j9;
                                        }
                                    }
                                }
                                j2 = j8 ^ j3;
                                i5 = i11;
                            }
                            j2 = j7 ^ j4;
                        }
                    }
                }
                this.zzg = i5;
                return j2;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzh() throws IOException {
        return zziw.zza(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzi = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzkb.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzm() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((zzv() & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j2;
            }
        }
        throw zzkb.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzo() throws IOException {
        return zziw.zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final long zzp() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final zzik zzq() throws IOException {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (zzx <= i2 - i3) {
                zzik zza = zzik.zza(this.zzd, i3, zzx);
                this.zzg += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzik.zza;
        }
        if (zzx > 0) {
            int i4 = this.zze;
            int i5 = this.zzg;
            if (zzx <= i4 - i5) {
                int i6 = zzx + i5;
                this.zzg = i6;
                bArr = Arrays.copyOfRange(this.zzd, i5, i6);
                return zzik.zzb(bArr);
            }
        }
        if (zzx > 0) {
            throw zzkb.zzi();
        }
        if (zzx != 0) {
            throw zzkb.zzf();
        }
        bArr = zzjv.zzb;
        return zzik.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzr() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (zzx <= i2 - i3) {
                String str = new String(this.zzd, i3, zzx, zzjv.zza);
                this.zzg += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final String zzs() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i2 = this.zze;
            int i3 = this.zzg;
            if (zzx <= i2 - i3) {
                String zzb = zzmp.zzb(this.zzd, i3, zzx);
                this.zzg += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzt() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zzu() throws IOException {
        return zzz() != 0;
    }

    private zziz(byte[] bArr, int i2, int i3, boolean z2) {
        super();
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i3 + i2;
        this.zzg = i2;
        this.zzh = i2;
    }

    private final void zzf(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.zze;
            int i4 = this.zzg;
            if (i2 <= i3 - i4) {
                this.zzg = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzkb.zzf();
        }
        throw zzkb.zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb(int i2) throws zzkb {
        if (i2 >= 0) {
            int zzc = i2 + zzc();
            if (zzc < 0) {
                throw zzkb.zzg();
            }
            int i3 = this.zzj;
            if (zzc <= i3) {
                this.zzj = zzc;
                zzaa();
                return i3;
            }
            throw zzkb.zzi();
        }
        throw zzkb.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzc(int i2) throws zzkb {
        if (this.zzi != i2) {
            throw zzkb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final void zzd(int i2) {
        this.zzj = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final boolean zze(int i2) throws IOException {
        boolean zze;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.zzd;
                    int i5 = this.zzg;
                    this.zzg = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzkb.zze();
            }
            while (i4 < 10) {
                if (zzv() < 0) {
                    i4++;
                }
            }
            throw zzkb.zze();
            return true;
        }
        if (i3 == 1) {
            zzf(8);
            return true;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    return false;
                }
                if (i3 == 5) {
                    zzf(4);
                    return true;
                }
                throw zzkb.zza();
            }
            do {
                int zzi = zzi();
                if (zzi == 0) {
                    break;
                }
                int i6 = this.zza;
                if (i6 < this.zzb) {
                    this.zza = i6 + 1;
                    zze = zze(zzi);
                    this.zza--;
                } else {
                    throw zzkb.zzh();
                }
            } while (zze);
            zzc(((i2 >>> 3) << 3) | 4);
            return true;
        }
        zzf(zzx());
        return true;
    }
}
