package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class zzek {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzgbc zzc = zzgbc.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzek(byte[] bArr, int i2) {
        this.zzd = bArr;
        this.zzf = i2;
    }

    private final char zzO(Charset charset, char[] cArr) {
        int zzP = zzP(charset);
        if (zzP != 0) {
            int i2 = zzP >> 16;
            for (char c2 : cArr) {
                char c3 = (char) i2;
                if (c2 == c3) {
                    this.zze += (char) zzP;
                    return c3;
                }
            }
        }
        return (char) 0;
    }

    private final int zzP(Charset charset) {
        byte zza2;
        char zzb2;
        int i2 = 1;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            if (this.zzf - this.zze > 0) {
                zza2 = (byte) zzgdr.zza(this.zzd[r2] & UnsignedBytes.MAX_VALUE);
                return (zzgdr.zza(zza2) << 16) + i2;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
            int i3 = this.zzf;
            int i4 = this.zze;
            if (i3 - i4 >= 2) {
                byte[] bArr = this.zzd;
                zzb2 = zzgdr.zzb(bArr[i4], bArr[i4 + 1]);
                zza2 = (byte) zzb2;
                i2 = 2;
                return (zzgdr.zza(zza2) << 16) + i2;
            }
        }
        if (!charset.equals(StandardCharsets.UTF_16LE)) {
            return 0;
        }
        int i5 = this.zzf;
        int i6 = this.zze;
        if (i5 - i6 < 2) {
            return 0;
        }
        byte[] bArr2 = this.zzd;
        zzb2 = zzgdr.zzb(bArr2[i6 + 1], bArr2[i6]);
        zza2 = (byte) zzb2;
        i2 = 2;
        return (zzgdr.zza(zza2) << 16) + i2;
    }

    public final String zzA(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.zze;
        int i4 = (i3 + i2) - 1;
        String zzB = zzeu.zzB(this.zzd, i3, (i4 >= this.zzf || this.zzd[i4] != 0) ? i2 : i2 - 1);
        this.zze += i2;
        return zzB;
    }

    public final String zzB(int i2, Charset charset) {
        byte[] bArr = this.zzd;
        int i3 = this.zze;
        String str = new String(bArr, i3, i2, charset);
        this.zze = i3 + i2;
        return str;
    }

    @Nullable
    public final Charset zzC() {
        int i2 = this.zzf;
        int i3 = this.zze;
        int i4 = i2 - i3;
        if (i4 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.zze = i3 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i4 < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        byte b2 = bArr2[i3];
        if (b2 == -2) {
            if (bArr2[i3 + 1] != -1) {
                return null;
            }
            this.zze = i3 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i3 + 1] != -2) {
            return null;
        }
        this.zze = i3 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 2;
        return (short) (((bArr[i3] & UnsignedBytes.MAX_VALUE) << 8) | i4);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 2;
        return (short) ((bArr[i3] & UnsignedBytes.MAX_VALUE) | (i4 << 8));
    }

    public final void zzF(int i2) {
        byte[] bArr = this.zzd;
        if (i2 > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i2);
        }
    }

    public final void zzG(zzej zzejVar, int i2) {
        zzH(zzejVar.zza, 0, i2);
        zzejVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.zzd, this.zze, bArr, i2, i3);
        this.zze += i3;
    }

    public final void zzI(int i2) {
        byte[] bArr = this.zzd;
        if (bArr.length < i2) {
            bArr = new byte[i2];
        }
        zzJ(bArr, i2);
    }

    public final void zzJ(byte[] bArr, int i2) {
        this.zzd = bArr;
        this.zzf = i2;
        this.zze = 0;
    }

    public final void zzK(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= this.zzd.length) {
            z2 = true;
        }
        zzdi.zzd(z2);
        this.zzf = i2;
    }

    public final void zzL(int i2) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= this.zzf) {
            z2 = true;
        }
        zzdi.zzd(z2);
        this.zze = i2;
    }

    public final void zzM(int i2) {
        zzL(this.zze + i2);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzdi.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzP(charset) >> 16);
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
        return this.zzd[this.zze] & UnsignedBytes.MAX_VALUE;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = i2 + 3;
        int i6 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 4;
        return (bArr[i5] & UnsignedBytes.MAX_VALUE) | (i3 << 24) | (i4 << 16) | (i6 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = i2 + 2;
        int i5 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 3;
        return (bArr[i4] & UnsignedBytes.MAX_VALUE) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 4;
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public final int zzj() {
        int zzi = zzi();
        if (zzi >= 0) {
            return zzi;
        }
        throw new IllegalStateException(d.i("Top bit not zero: ", zzi));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 2;
        return ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 8) | i4;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        this.zze = i2 + 1;
        return bArr[i2] & UnsignedBytes.MAX_VALUE;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 4;
        return i4 | (i3 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = i2 + 2;
        int i5 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 3;
        return (bArr[i4] & UnsignedBytes.MAX_VALUE) | (i3 << 16) | (i5 << 8);
    }

    public final int zzp() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException(d.i("Top bit not zero: ", zzg));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        this.zze = i2 + 2;
        return (bArr[i3] & UnsignedBytes.MAX_VALUE) | (i4 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        long j6 = bArr[i2 + 4];
        long j7 = bArr[i2 + 5];
        long j8 = bArr[i2 + 6];
        this.zze = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | ((j8 & 255) << 48) | ((j3 & 255) << 8) | (j2 & 255) | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((j6 & 255) << 32) | ((j7 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        this.zze = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (j2 & 255) | ((j3 & 255) << 8) | ((j4 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        long j5 = bArr[i2 + 3];
        long j6 = bArr[i2 + 4];
        long j7 = bArr[i2 + 5];
        long j8 = bArr[i2 + 6];
        this.zze = i2 + 8;
        return (bArr[i2 + 7] & 255) | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | ((j8 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i2 = this.zze;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 1];
        long j4 = bArr[i2 + 2];
        this.zze = i2 + 4;
        return (bArr[i2 + 3] & 255) | ((j2 & 255) << 24) | ((j3 & 255) << 16) | ((j4 & 255) << 8);
    }

    public final long zzv() {
        long j2 = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long zzm = zzm();
            j2 |= (127 & zzm) << (i2 * 7);
            if ((zzm & 128) == 0) {
                break;
            }
        }
        return j2;
    }

    public final long zzw() {
        long zzt = zzt();
        if (zzt >= 0) {
            return zzt;
        }
        throw new IllegalStateException(d.m("Top bit not zero: ", zzt));
    }

    public final long zzx() {
        int i2;
        int i3;
        long j2 = this.zzd[this.zze];
        int i4 = 7;
        while (true) {
            i2 = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j2) != 0) {
                i4--;
            } else if (i4 < 6) {
                j2 &= r7 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            throw new NumberFormatException(d.m("Invalid UTF-8 sequence first byte: ", j2));
        }
        for (i3 = 1; i3 < i2; i3++) {
            if ((this.zzd[this.zze + i3] & 192) != 128) {
                throw new NumberFormatException(d.m("Invalid UTF-8 sequence continuation byte: ", j2));
            }
            j2 = (j2 << 6) | (r2 & Utf8.REPLACEMENT_BYTE);
        }
        this.zze += i2;
        return j2;
    }

    @Nullable
    public final String zzy(char c2) {
        int i2 = this.zzf;
        int i3 = this.zze;
        if (i2 - i3 == 0) {
            return null;
        }
        while (i3 < this.zzf && this.zzd[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.zzd;
        int i4 = this.zze;
        String zzB = zzeu.zzB(bArr, i4, i3 - i4);
        this.zze = i3;
        if (i3 < this.zzf) {
            this.zze = i3 + 1;
        }
        return zzB;
    }

    @Nullable
    public final String zzz(Charset charset) {
        zzdi.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzC();
        }
        int i2 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i2 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i3 = this.zze;
        while (true) {
            int i4 = this.zzf;
            if (i3 >= i4 - (i2 - 1)) {
                i3 = i4;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzeu.zzK(this.zzd[i3])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.zzd;
                if (bArr[i3] == 0 && zzeu.zzK(bArr[i3 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.zzd;
                if (bArr2[i3 + 1] == 0 && zzeu.zzK(bArr2[i3])) {
                    break;
                }
            }
            i3 += i2;
        }
        String zzB = zzB(i3 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return zzB;
    }

    public zzek() {
        this.zzd = zzeu.zzf;
    }

    public zzek(int i2) {
        this.zzd = new byte[i2];
        this.zzf = i2;
    }

    public zzek(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
