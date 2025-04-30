package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhae extends zzham {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzhae(byte[] bArr, int i9, int i10, boolean z8, zzhad zzhadVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i10 + i9;
        this.zzh = i9;
        this.zzi = i9;
    }

    private final void zzK() {
        int i9 = this.zzf + this.zzg;
        this.zzf = i9;
        int i10 = i9 - this.zzi;
        int i11 = this.zzk;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i9 - i12;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzA(int i9) {
        this.zzk = i9;
        zzK();
    }

    public final void zzB(int i9) throws IOException {
        if (i9 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i9 <= i10 - i11) {
                this.zzh = i11 + i9;
                return;
            }
        }
        if (i9 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzD() throws IOException {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzE(int i9) throws IOException {
        int zzm;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            zzB(4);
                            return true;
                        }
                        throw zzhcd.zza();
                    }
                    do {
                        zzm = zzm();
                        if (zzm == 0) {
                            break;
                        }
                    } while (zzE(zzm));
                    zzz(((i9 >>> 3) << 3) | 4);
                    return true;
                }
                zzB(zzj());
                return true;
            }
            zzB(8);
            return true;
        }
        if (this.zzf - this.zzh >= 10) {
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzhcd.zze();
        }
        while (i11 < 10) {
            if (zza() < 0) {
                i11++;
            }
        }
        throw zzhcd.zze();
        return true;
    }

    public final byte zza() throws IOException {
        int i9 = this.zzh;
        if (i9 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i9 + 1;
            return bArr[i9];
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzd() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zze(int i9) throws zzhcd {
        if (i9 >= 0) {
            int i10 = (this.zzh - this.zzi) + i9;
            if (i10 >= 0) {
                int i11 = this.zzk;
                if (i10 <= i11) {
                    this.zzk = i10;
                    zzK();
                    return i11;
                }
                throw zzhcd.zzj();
            }
            throw zzhcd.zzg();
        }
        throw zzhcd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i9 = this.zzh;
        if (this.zzf - i9 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i9 + 4;
            int i10 = bArr[i9] & 255;
            int i11 = bArr[i9 + 1] & 255;
            int i12 = bArr[i9 + 2] & 255;
            return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
        }
        throw zzhcd.zzj();
    }

    public final int zzj() throws IOException {
        int i9;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b >= 0) {
                this.zzh = i12;
                return b;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b8 = bArr[i17];
                            int i19 = (i18 ^ (b8 << Ascii.FS)) ^ 266354560;
                            if (b8 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzh = i13;
                return i9;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzl() throws IOException {
        return zzham.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzhcd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i9 = this.zzh;
        if (this.zzf - i9 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i9 + 8;
            long j7 = bArr[i9];
            long j9 = bArr[i9 + 2];
            long j10 = bArr[i9 + 3];
            return ((bArr[i9 + 7] & 255) << 56) | (j7 & 255) | ((bArr[i9 + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
        }
        throw zzhcd.zzj();
    }

    public final long zzr() throws IOException {
        long j7;
        long j9;
        int i9 = this.zzh;
        int i10 = this.zzf;
        if (i10 != i9) {
            byte[] bArr = this.zze;
            int i11 = i9 + 1;
            byte b = bArr[i9];
            if (b >= 0) {
                this.zzh = i11;
                return b;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b;
                if (i13 < 0) {
                    j7 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                    if (i15 >= 0) {
                        j7 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                        if (i17 < 0) {
                            long j10 = (-2080896) ^ i17;
                            i12 = i16;
                            j7 = j10;
                        } else {
                            i14 = i9 + 5;
                            long j11 = (bArr[i16] << 28) ^ i17;
                            if (j11 >= 0) {
                                j7 = j11 ^ 266354560;
                            } else {
                                i12 = i9 + 6;
                                long j12 = (bArr[i14] << 35) ^ j11;
                                if (j12 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    int i18 = i9 + 7;
                                    long j13 = j12 ^ (bArr[i12] << 42);
                                    if (j13 >= 0) {
                                        j7 = j13 ^ 4363953127296L;
                                    } else {
                                        i12 = i9 + 8;
                                        j12 = j13 ^ (bArr[i18] << 49);
                                        if (j12 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i18 = i9 + 9;
                                            long j14 = (j12 ^ (bArr[i12] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                i12 = i9 + 10;
                                                if (bArr[i18] >= 0) {
                                                    j7 = j14;
                                                }
                                            } else {
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzh = i12;
                return j7;
            }
        }
        return zzs();
    }

    public final long zzs() throws IOException {
        long j7 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            j7 |= (r3 & Ascii.DEL) << i9;
            if ((zza() & 128) == 0) {
                return j7;
            }
        }
        throw zzhcd.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzu() throws IOException {
        return zzham.zzH(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final zzhac zzw() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (zzj <= i9 - i10) {
                zzhac zzv = zzhac.zzv(this.zze, i10, zzj);
                this.zzh += zzj;
                return zzv;
            }
        }
        if (zzj != 0) {
            if (zzj > 0) {
                int i11 = this.zzf;
                int i12 = this.zzh;
                if (zzj <= i11 - i12) {
                    int i13 = zzj + i12;
                    this.zzh = i13;
                    return new zzgzy(Arrays.copyOfRange(this.zze, i12, i13));
                }
            }
            if (zzj <= 0) {
                throw zzhcd.zzf();
            }
            throw zzhcd.zzj();
        }
        return zzhac.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzx() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (zzj <= i9 - i10) {
                String str = new String(this.zze, i10, zzj, zzhcb.zzb);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzy() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (zzj <= i9 - i10) {
                String zzh = zzhff.zzh(this.zze, i10, zzj);
                this.zzh += zzj;
                return zzh;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzz(int i9) throws zzhcd {
        if (this.zzj == i9) {
        } else {
            throw zzhcd.zzb();
        }
    }
}
