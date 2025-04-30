package com.google.android.gms.internal.ads;

import Q7.n0;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfu {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgbh zzc = zzgbh.zzr(zzfxs.zza, zzfxs.zzc, zzfxs.zzf, zzfxs.zzd, zzfxs.zze);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzfu(byte[] bArr, int i9) {
        this.zzd = bArr;
        this.zzf = i9;
    }

    private final char zzN(Charset charset, char[] cArr) {
        int zzO = zzO(charset);
        if (zzO != 0) {
            int i9 = zzO >> 16;
            for (char c9 : cArr) {
                char c10 = (char) i9;
                if (c9 == c10) {
                    this.zze += (char) zzO;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    private final int zzO(Charset charset) {
        byte zza2;
        char zzb2;
        int i9 = 1;
        if (charset.equals(zzfxs.zzc) || charset.equals(zzfxs.zza)) {
            if (this.zzf - this.zze > 0) {
                zza2 = (byte) zzgdx.zza(this.zzd[r2] & 255);
                return (zzgdx.zza(zza2) << 16) + i9;
            }
        }
        if (charset.equals(zzfxs.zzf) || charset.equals(zzfxs.zzd)) {
            int i10 = this.zzf;
            int i11 = this.zze;
            if (i10 - i11 >= 2) {
                byte[] bArr = this.zzd;
                zzb2 = zzgdx.zzb(bArr[i11], bArr[i11 + 1]);
                zza2 = (byte) zzb2;
                i9 = 2;
                return (zzgdx.zza(zza2) << 16) + i9;
            }
        }
        if (charset.equals(zzfxs.zze)) {
            int i12 = this.zzf;
            int i13 = this.zze;
            if (i12 - i13 >= 2) {
                byte[] bArr2 = this.zzd;
                zzb2 = zzgdx.zzb(bArr2[i13 + 1], bArr2[i13]);
                zza2 = (byte) zzb2;
                i9 = 2;
                return (zzgdx.zza(zza2) << 16) + i9;
            }
            return 0;
        }
        return 0;
    }

    public final String zzA(int i9, Charset charset) {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        String str = new String(bArr, i10, i9, charset);
        this.zze = i10 + i9;
        return str;
    }

    @Nullable
    public final Charset zzB() {
        int i9 = this.zzf;
        int i10 = this.zze;
        int i11 = i9 - i10;
        if (i11 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.zze = i10 + 3;
                return zzfxs.zzc;
            }
        }
        if (i11 >= 2) {
            byte[] bArr2 = this.zzd;
            byte b = bArr2[i10];
            if (b == -2) {
                if (bArr2[i10 + 1] == -1) {
                    this.zze = i10 + 2;
                    return zzfxs.zzd;
                }
                return null;
            }
            if (b == -1 && bArr2[i10 + 1] == -2) {
                this.zze = i10 + 2;
                return zzfxs.zze;
            }
            return null;
        }
        return null;
    }

    public final short zzC() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        this.zze = i9 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        this.zze = i9 + 2;
        return (short) ((bArr[i10] & 255) | (i11 << 8));
    }

    public final void zzE(int i9) {
        byte[] bArr = this.zzd;
        if (i9 > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i9);
        }
    }

    public final void zzF(zzft zzftVar, int i9) {
        zzG(zzftVar.zza, 0, i9);
        zzftVar.zzk(0);
    }

    public final void zzG(byte[] bArr, int i9, int i10) {
        System.arraycopy(this.zzd, this.zze, bArr, i9, i10);
        this.zze += i10;
    }

    public final void zzH(int i9) {
        byte[] bArr = this.zzd;
        if (bArr.length < i9) {
            bArr = new byte[i9];
        }
        zzI(bArr, i9);
    }

    public final void zzI(byte[] bArr, int i9) {
        this.zzd = bArr;
        this.zzf = i9;
        this.zze = 0;
    }

    public final void zzJ(int i9) {
        boolean z8 = false;
        if (i9 >= 0 && i9 <= this.zzd.length) {
            z8 = true;
        }
        zzeq.zzd(z8);
        this.zzf = i9;
    }

    public final void zzK(int i9) {
        boolean z8 = false;
        if (i9 >= 0 && i9 <= this.zzf) {
            z8 = true;
        }
        zzeq.zzd(z8);
        this.zze = i9;
    }

    public final void zzL(int i9) {
        zzK(this.zze + i9);
    }

    public final byte[] zzM() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzeq.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzO(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i9 + 3;
        this.zze = i14;
        int i15 = bArr[i12] & 255;
        this.zze = i9 + 4;
        return (bArr[i14] & 255) | (i11 << 24) | (i13 << 16) | (i15 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i9 + 3;
        return (bArr[i12] & 255) | ((i11 << 24) >> 8) | (i13 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        int i14 = i9 + 3;
        this.zze = i14;
        int i15 = bArr[i12] & 255;
        this.zze = i9 + 4;
        return ((bArr[i14] & 255) << 24) | (i13 << 8) | i11 | (i15 << 16);
    }

    public final int zzj() {
        int zzi = zzi();
        if (zzi >= 0) {
            return zzi;
        }
        throw new IllegalStateException(o.h(zzi, "Top bit not zero: "));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        this.zze = i9 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        this.zze = i9 + 1;
        return bArr[i9] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        this.zze = i9 + 2;
        int i12 = bArr[i10] & 255;
        this.zze = i9 + 4;
        return i12 | (i11 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i9 + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final int zzp() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException(o.h(zzg, "Top bit not zero: "));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        int i11 = bArr[i9] & 255;
        this.zze = i9 + 2;
        return (bArr[i10] & 255) | (i11 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        long j7 = bArr[i9];
        int i11 = i9 + 2;
        this.zze = i11;
        long j9 = bArr[i10];
        int i12 = i9 + 3;
        this.zze = i12;
        long j10 = bArr[i11];
        int i13 = i9 + 4;
        this.zze = i13;
        long j11 = bArr[i12];
        int i14 = i9 + 5;
        this.zze = i14;
        long j12 = bArr[i13];
        int i15 = i9 + 6;
        this.zze = i15;
        long j13 = bArr[i14];
        this.zze = i9 + 7;
        long j14 = bArr[i15];
        this.zze = i9 + 8;
        return ((bArr[r5] & 255) << 56) | ((j14 & 255) << 48) | ((j9 & 255) << 8) | (j7 & 255) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((j12 & 255) << 32) | ((j13 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        long j7 = bArr[i9];
        int i11 = i9 + 2;
        this.zze = i11;
        long j9 = bArr[i10];
        this.zze = i9 + 3;
        long j10 = bArr[i11];
        this.zze = i9 + 4;
        return ((bArr[r2] & 255) << 24) | (j7 & 255) | ((j9 & 255) << 8) | ((j10 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        long j7 = bArr[i9];
        int i11 = i9 + 2;
        this.zze = i11;
        long j9 = bArr[i10];
        int i12 = i9 + 3;
        this.zze = i12;
        long j10 = bArr[i11];
        int i13 = i9 + 4;
        this.zze = i13;
        long j11 = bArr[i12];
        int i14 = i9 + 5;
        this.zze = i14;
        long j12 = bArr[i13];
        int i15 = i9 + 6;
        this.zze = i15;
        long j13 = bArr[i14];
        this.zze = i9 + 7;
        long j14 = bArr[i15];
        this.zze = i9 + 8;
        return (bArr[r3] & 255) | ((j7 & 255) << 56) | ((j9 & 255) << 48) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | ((j14 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        int i10 = i9 + 1;
        this.zze = i10;
        long j7 = bArr[i9];
        int i11 = i9 + 2;
        this.zze = i11;
        long j9 = bArr[i10];
        this.zze = i9 + 3;
        long j10 = bArr[i11];
        this.zze = i9 + 4;
        return (bArr[r2] & 255) | ((j7 & 255) << 24) | ((j9 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long zzv() {
        long zzt = zzt();
        if (zzt >= 0) {
            return zzt;
        }
        throw new IllegalStateException(n0.g(zzt, "Top bit not zero: "));
    }

    public final long zzw() {
        int i9;
        int i10;
        long j7 = this.zzd[this.zze];
        int i11 = 7;
        while (true) {
            i9 = 0;
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j7) != 0) {
                i11--;
            } else if (i11 < 6) {
                j7 &= r7 - 1;
                i9 = 7 - i11;
            } else if (i11 == 7) {
                i9 = 1;
            }
        }
        if (i9 != 0) {
            for (i10 = 1; i10 < i9; i10++) {
                if ((this.zzd[this.zze + i10] & 192) == 128) {
                    j7 = (j7 << 6) | (r2 & 63);
                } else {
                    throw new NumberFormatException(n0.g(j7, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.zze += i9;
            return j7;
        }
        throw new NumberFormatException(n0.g(j7, "Invalid UTF-8 sequence first byte: "));
    }

    @Nullable
    public final String zzx(char c9) {
        int i9 = this.zzf;
        int i10 = this.zze;
        if (i9 - i10 != 0) {
            while (i10 < this.zzf && this.zzd[i10] != 0) {
                i10++;
            }
            byte[] bArr = this.zzd;
            int i11 = this.zze;
            String zzB = zzgd.zzB(bArr, i11, i10 - i11);
            this.zze = i10;
            if (i10 < this.zzf) {
                this.zze = i10 + 1;
            }
            return zzB;
        }
        return null;
    }

    @Nullable
    public final String zzy(Charset charset) {
        zzeq.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset2 = zzfxs.zza;
        if (!charset.equals(charset2)) {
            zzB();
        }
        int i9 = 1;
        if (!charset.equals(zzfxs.zzc) && !charset.equals(charset2)) {
            i9 = 2;
            if (!charset.equals(zzfxs.zzf) && !charset.equals(zzfxs.zze) && !charset.equals(zzfxs.zzd)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i10 = this.zze;
        while (true) {
            int i11 = this.zzf;
            if (i10 < i11 - (i9 - 1)) {
                if ((charset.equals(zzfxs.zzc) || charset.equals(zzfxs.zza)) && zzgd.zzM(this.zzd[i10])) {
                    break;
                }
                if (charset.equals(zzfxs.zzf) || charset.equals(zzfxs.zzd)) {
                    byte[] bArr = this.zzd;
                    if (bArr[i10] == 0 && zzgd.zzM(bArr[i10 + 1])) {
                        break;
                    }
                }
                if (charset.equals(zzfxs.zze)) {
                    byte[] bArr2 = this.zzd;
                    if (bArr2[i10 + 1] == 0 && zzgd.zzM(bArr2[i10])) {
                        break;
                    }
                }
                i10 += i9;
            } else {
                i10 = i11;
                break;
            }
        }
        String zzA = zzA(i10 - this.zze, charset);
        if (this.zze != this.zzf && zzN(charset, zza) == '\r') {
            zzN(charset, zzb);
        }
        return zzA;
    }

    public final String zzz(int i9) {
        int i10;
        if (i9 == 0) {
            return "";
        }
        int i11 = this.zze;
        int i12 = (i11 + i9) - 1;
        if (i12 < this.zzf && this.zzd[i12] == 0) {
            i10 = i9 - 1;
        } else {
            i10 = i9;
        }
        String zzB = zzgd.zzB(this.zzd, i11, i10);
        this.zze += i9;
        return zzB;
    }

    public zzfu() {
        this.zzd = zzgd.zzf;
    }

    public zzfu(int i9) {
        this.zzd = new byte[i9];
        this.zzf = i9;
    }

    public zzfu(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
