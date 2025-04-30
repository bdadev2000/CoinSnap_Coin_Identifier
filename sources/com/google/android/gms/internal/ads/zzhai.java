package com.google.android.gms.internal.ads;

import Q7.n0;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhai extends zzham {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzhai(InputStream inputStream, int i9, zzhah zzhahVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zzhcb.zzd;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzK(int i9) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int min = Math.min(i9, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.zze.read(bArr, i10, min - i10);
                if (read != -1) {
                    this.zzk += read;
                    i10 += read;
                } else {
                    throw zzhcd.zzj();
                }
            }
            i9 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzL() {
        int i9 = this.zzg + this.zzh;
        this.zzg = i9;
        int i10 = this.zzk + i9;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i9 - i12;
    }

    private final void zzM(int i9) throws IOException {
        if (!zzN(i9)) {
            if (i9 > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
                throw zzhcd.zzi();
            }
            throw zzhcd.zzj();
        }
    }

    private final boolean zzN(int i9) throws IOException {
        int i10 = this.zzi;
        int i11 = i10 + i9;
        int i12 = this.zzg;
        if (i11 > i12) {
            int i13 = this.zzk;
            if (i9 > (Integer.MAX_VALUE - i13) - i10 || i13 + i10 + i9 > this.zzl) {
                return false;
            }
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                i13 = this.zzk + i10;
                this.zzk = i13;
                i12 = this.zzg - i10;
                this.zzg = i12;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.zzg += read;
                    zzL();
                    if (this.zzg >= i9) {
                        return true;
                    }
                    return zzN(i9);
                }
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (zzhcd e4) {
                e4.zzk();
                throw e4;
            }
        }
        throw new IllegalStateException(n0.f(i9, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    private final byte[] zzO(int i9, boolean z8) throws IOException {
        byte[] zzP = zzP(i9);
        if (zzP != null) {
            return zzP;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzK = zzK(i9 - i12);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : zzK) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzP(int i9) throws IOException {
        if (i9 == 0) {
            return zzhcb.zzd;
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i9;
        if ((-2147483647) + i12 <= 0) {
            int i13 = this.zzl;
            if (i12 <= i13) {
                int i14 = this.zzg - i11;
                int i15 = i9 - i14;
                if (i15 >= 4096) {
                    try {
                        if (i15 > this.zze.available()) {
                            return null;
                        }
                    } catch (zzhcd e4) {
                        e4.zzk();
                        throw e4;
                    }
                }
                byte[] bArr = new byte[i9];
                System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
                this.zzk += this.zzg;
                this.zzi = 0;
                this.zzg = 0;
                while (i14 < i9) {
                    try {
                        int read = this.zze.read(bArr, i14, i9 - i14);
                        if (read != -1) {
                            this.zzk += read;
                            i14 += read;
                        } else {
                            throw zzhcd.zzj();
                        }
                    } catch (zzhcd e9) {
                        e9.zzk();
                        throw e9;
                    }
                }
                return bArr;
            }
            zzB((i13 - i10) - i11);
            throw zzhcd.zzj();
        }
        throw zzhcd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzA(int i9) {
        this.zzl = i9;
        zzL();
    }

    public final void zzB(int i9) throws IOException {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i9 <= i12 && i9 >= 0) {
            this.zzi = i11 + i9;
            return;
        }
        if (i9 >= 0) {
            int i13 = this.zzk;
            int i14 = i13 + i11;
            int i15 = this.zzl;
            if (i14 + i9 <= i15) {
                this.zzk = i14;
                this.zzg = 0;
                this.zzi = 0;
                while (i12 < i9) {
                    try {
                        long j7 = i9 - i12;
                        try {
                            long skip = this.zze.skip(j7);
                            if (skip >= 0 && skip <= j7) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i12 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (zzhcd e4) {
                            e4.zzk();
                            throw e4;
                        }
                    } catch (Throwable th) {
                        this.zzk += i12;
                        zzL();
                        throw th;
                    }
                }
                this.zzk += i12;
                zzL();
                if (i12 < i9) {
                    int i16 = this.zzg;
                    int i17 = i16 - this.zzi;
                    this.zzi = i16;
                    zzM(1);
                    while (true) {
                        int i18 = i9 - i17;
                        int i19 = this.zzg;
                        if (i18 > i19) {
                            i17 += i19;
                            this.zzi = i19;
                            zzM(1);
                        } else {
                            this.zzi = i18;
                            return;
                        }
                    }
                }
            } else {
                zzB((i15 - i13) - i11);
                throw zzhcd.zzj();
            }
        } else {
            throw zzhcd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzC() throws IOException {
        if (this.zzi == this.zzg && !zzN(1)) {
            return true;
        }
        return false;
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
        if (this.zzg - this.zzi >= 10) {
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
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
        if (this.zzi == this.zzg) {
            zzM(1);
        }
        byte[] bArr = this.zzf;
        int i9 = this.zzi;
        this.zzi = i9 + 1;
        return bArr[i9];
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
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zze(int i9) throws zzhcd {
        if (i9 >= 0) {
            int i10 = this.zzk + this.zzi;
            int i11 = this.zzl;
            int i12 = i9 + i10;
            if (i12 <= i11) {
                this.zzl = i12;
                zzL();
                return i11;
            }
            throw zzhcd.zzj();
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
        int i9 = this.zzi;
        if (this.zzg - i9 < 4) {
            zzM(4);
            i9 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i9 + 4;
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() throws IOException {
        int i9;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b >= 0) {
                this.zzi = i12;
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
                this.zzi = i13;
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
        int i9 = this.zzi;
        if (this.zzg - i9 < 8) {
            zzM(8);
            i9 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i9 + 8;
        long j7 = bArr[i9];
        long j9 = bArr[i9 + 2];
        long j10 = bArr[i9 + 3];
        return ((bArr[i9 + 7] & 255) << 56) | (j7 & 255) | ((bArr[i9 + 1] & 255) << 8) | ((j9 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public final long zzr() throws IOException {
        long j7;
        long j9;
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i9) {
            byte[] bArr = this.zzf;
            int i11 = i9 + 1;
            byte b = bArr[i9];
            if (b >= 0) {
                this.zzi = i11;
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
                this.zzi = i12;
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
        int i9 = this.zzg;
        int i10 = this.zzi;
        if (zzj <= i9 - i10 && zzj > 0) {
            zzhac zzv = zzhac.zzv(this.zzf, i10, zzj);
            this.zzi += zzj;
            return zzv;
        }
        if (zzj == 0) {
            return zzhac.zzb;
        }
        if (zzj >= 0) {
            byte[] zzP = zzP(zzj);
            if (zzP != null) {
                return zzhac.zzv(zzP, 0, zzP.length);
            }
            int i11 = this.zzi;
            int i12 = this.zzg;
            int i13 = i12 - i11;
            this.zzk += i12;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzK = zzK(zzj - i13);
            byte[] bArr = new byte[zzj];
            System.arraycopy(this.zzf, i11, bArr, 0, i13);
            for (byte[] bArr2 : zzK) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i13, length);
                i13 += length;
            }
            return new zzgzy(bArr);
        }
        throw zzhcd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzx() throws IOException {
        int zzj = zzj();
        if (zzj > 0) {
            int i9 = this.zzg;
            int i10 = this.zzi;
            if (zzj <= i9 - i10) {
                String str = new String(this.zzf, i10, zzj, zzhcb.zzb);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj >= 0) {
            if (zzj <= this.zzg) {
                zzM(zzj);
                String str2 = new String(this.zzf, this.zzi, zzj, zzhcb.zzb);
                this.zzi += zzj;
                return str2;
            }
            return new String(zzO(zzj, false), zzhcb.zzb);
        }
        throw zzhcd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzy() throws IOException {
        byte[] zzO;
        int zzj = zzj();
        int i9 = this.zzi;
        int i10 = this.zzg;
        if (zzj <= i10 - i9 && zzj > 0) {
            zzO = this.zzf;
            this.zzi = i9 + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            if (zzj >= 0) {
                i9 = 0;
                if (zzj <= i10) {
                    zzM(zzj);
                    zzO = this.zzf;
                    this.zzi = zzj;
                } else {
                    zzO = zzO(zzj, false);
                }
            } else {
                throw zzhcd.zzf();
            }
        }
        return zzhff.zzh(zzO, i9, zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzz(int i9) throws zzhcd {
        if (this.zzj == i9) {
        } else {
            throw zzhcd.zzb();
        }
    }
}
