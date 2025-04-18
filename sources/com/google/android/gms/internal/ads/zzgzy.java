package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgzy extends zzhac {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgzy(InputStream inputStream, int i2, zzgzx zzgzxVar) {
        super(null);
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        byte[] bArr = zzhbr.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.zze.read(bArr, i3, min - i3);
                if (read == -1) {
                    throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += read;
                i3 += read;
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i3 = this.zzk + i2;
        int i4 = this.zzl;
        if (i3 <= i4) {
            this.zzh = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzh = i5;
        this.zzg = i2 - i5;
    }

    private final void zzK(int i2) throws IOException {
        if (zzL(i2)) {
            return;
        }
        if (i2 <= (Api.BaseClientBuilder.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhbt("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzL(int i2) throws IOException {
        int i3 = this.zzi;
        int i4 = i3 + i2;
        int i5 = this.zzg;
        if (i4 <= i5) {
            throw new IllegalStateException(d.j("refillBuffer() called when ", i2, " bytes were already available in buffer"));
        }
        int i6 = this.zzk;
        if (i2 > (Api.BaseClientBuilder.API_PRIORITY_OTHER - i6) - i3 || i6 + i3 + i2 > this.zzl) {
            return false;
        }
        if (i3 > 0) {
            if (i5 > i3) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            i6 = this.zzk + i3;
            this.zzk = i6;
            i5 = this.zzg - i3;
            this.zzg = i5;
            this.zzi = 0;
        }
        try {
            int read = this.zze.read(this.zzf, i5, Math.min(4096 - i5, (Api.BaseClientBuilder.API_PRIORITY_OTHER - i6) - i5));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzg += read;
            zzJ();
            if (this.zzg >= i2) {
                return true;
            }
            return zzL(i2);
        } catch (zzhbt e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzM(int i2, boolean z2) throws IOException {
        byte[] zzN = zzN(i2);
        if (zzN != null) {
            return zzN;
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i2) throws IOException {
        if (i2 == 0) {
            return zzhbr.zzb;
        }
        int i3 = this.zzk;
        int i4 = this.zzi;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw new zzhbt("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i6 = this.zzl;
        if (i5 > i6) {
            zzC((i6 - i3) - i4);
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = this.zzg - i4;
        int i8 = i2 - i7;
        if (i8 >= 4096) {
            try {
                if (i8 > this.zze.available()) {
                    return null;
                }
            } catch (zzhbt e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i7);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i7 < i2) {
            try {
                int read = this.zze.read(bArr, i7, i2 - i7);
                if (read == -1) {
                    throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += read;
                i7 += read;
            } catch (zzhbt e2) {
                e2.zza();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    public final void zzC(int i2) throws IOException {
        int i3 = this.zzg;
        int i4 = this.zzi;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.zzi = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.zzk;
        int i7 = i6 + i4;
        int i8 = this.zzl;
        if (i7 + i2 > i8) {
            zzC((i8 - i6) - i4);
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i7;
        this.zzg = 0;
        this.zzi = 0;
        while (i5 < i2) {
            try {
                long j2 = i2 - i5;
                try {
                    long skip = this.zze.skip(j2);
                    if (skip < 0 || skip > j2) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i5 += (int) skip;
                    }
                } catch (zzhbt e) {
                    e.zza();
                    throw e;
                }
            } catch (Throwable th) {
                this.zzk += i5;
                zzJ();
                throw th;
            }
        }
        this.zzk += i5;
        zzJ();
        if (i5 >= i2) {
            return;
        }
        int i9 = this.zzg;
        int i10 = i9 - this.zzi;
        this.zzi = i9;
        zzK(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.zzg;
            if (i11 <= i12) {
                this.zzi = i11;
                return;
            } else {
                i10 += i12;
                this.zzi = i12;
                zzK(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int i2) throws zzhbt {
        if (i2 < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.zzk + this.zzi + i2;
        if (i3 < 0) {
            throw new zzhbt("Failed to parse the message.");
        }
        int i4 = this.zzl;
        if (i3 > i4) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i3;
        zzJ();
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzK(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public final int zzi() throws IOException {
        int i2;
        int i3 = this.zzi;
        int i4 = this.zzg;
        if (i4 != i3) {
            byte[] bArr = this.zzf;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzi = i5;
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
                this.zzi = i6;
                return i2;
            }
        }
        return (int) zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzk() throws IOException {
        return zzhac.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzj = zzi;
        if ((zzi >>> 3) != 0) {
            return zzi;
        }
        throw new zzhbt("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzK(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        return ((bArr[i2 + 7] & 255) << 56) | (j2 & 255) | ((bArr[i2 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final long zzq() throws IOException {
        long j2;
        long j3;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzi = i4;
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
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            long j4 = (-2080896) ^ i10;
                            i5 = i9;
                            j2 = j4;
                        } else {
                            i7 = i2 + 5;
                            long j5 = (bArr[i9] << 28) ^ i10;
                            if (j5 >= 0) {
                                j2 = j5 ^ 266354560;
                            } else {
                                i5 = i2 + 6;
                                long j6 = (bArr[i7] << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i11 = i2 + 7;
                                    long j7 = j6 ^ (bArr[i5] << 42);
                                    if (j7 >= 0) {
                                        j2 = j7 ^ 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j6 = j7 ^ (bArr[i11] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i11 = i2 + 9;
                                            long j8 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i5 = i2 + 10;
                                                if (bArr[i11] >= 0) {
                                                    j2 = j8;
                                                }
                                            } else {
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    i5 = i11;
                                }
                                j2 = j6 ^ j3;
                            }
                        }
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return j2;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i3 = this.zzi;
            this.zzi = i3 + 1;
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((bArr[i3] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j2;
            }
        }
        throw new zzhbt("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzt() throws IOException {
        return zzhac.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzgzs zzv() throws IOException {
        int zzi = zzi();
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (zzi <= i2 - i3 && zzi > 0) {
            zzgzs zzv = zzgzs.zzv(this.zzf, i3, zzi);
            this.zzi += zzi;
            return zzv;
        }
        if (zzi == 0) {
            return zzgzs.zzb;
        }
        if (zzi < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzN = zzN(zzi);
        if (zzN != null) {
            return zzgzs.zzv(zzN, 0, zzN.length);
        }
        int i4 = this.zzi;
        int i5 = this.zzg;
        int i6 = i5 - i4;
        this.zzk += i5;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(zzi - i6);
        byte[] bArr = new byte[zzi];
        System.arraycopy(this.zzf, i4, bArr, 0, i6);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i6, length);
            i6 += length;
        }
        return new zzgzq(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (zzi <= i2 - i3) {
                String str = new String(this.zzf, i3, zzi, zzhbr.zza);
                this.zzi += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzi > this.zzg) {
            return new String(zzM(zzi, false), zzhbr.zza);
        }
        zzK(zzi);
        String str2 = new String(this.zzf, this.zzi, zzi, zzhbr.zza);
        this.zzi += zzi;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzx() throws IOException {
        byte[] zzM;
        int zzi = zzi();
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (zzi <= i3 - i2 && zzi > 0) {
            zzM = this.zzf;
            this.zzi = i2 + zzi;
        } else {
            if (zzi == 0) {
                return "";
            }
            if (zzi < 0) {
                throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i2 = 0;
            if (zzi <= i3) {
                zzK(zzi);
                zzM = this.zzf;
                this.zzi = zzi;
            } else {
                zzM = zzM(zzi, false);
            }
        }
        return zzhek.zzh(zzM, i2, zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzy(int i2) throws zzhbt {
        if (this.zzj != i2) {
            throw new zzhbt("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzz(int i2) {
        this.zzl = i2;
        zzJ();
    }
}
