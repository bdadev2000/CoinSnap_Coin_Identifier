package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxs extends zzgxv {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgxs(InputStream inputStream, int i10, zzgxu zzgxuVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zzgzk.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zze.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.zzk += read;
                    i11 += read;
                } else {
                    throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzK(int i10) throws IOException {
        if (!zzL(i10)) {
            if (i10 > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
                throw new zzgzm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final boolean zzL(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 > i13) {
            int i14 = this.zzk;
            if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzl) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                i14 = this.zzk + i11;
                this.zzk = i14;
                i13 = this.zzg - i11;
                this.zzg = i13;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.zzg += read;
                    zzJ();
                    if (this.zzg >= i10) {
                        return true;
                    }
                    return zzL(i10);
                }
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (zzgzm e2) {
                e2.zza();
                throw e2;
            }
        }
        throw new IllegalStateException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("refillBuffer() called when ", i10, " bytes were already available in buffer"));
    }

    private final byte[] zzM(int i10, boolean z10) throws IOException {
        byte[] zzN = zzN(i10);
        if (zzN != null) {
            return zzN;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzI = zzI(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i10) throws IOException {
        if (i10 == 0) {
            return zzgzk.zzb;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 <= 0) {
            int i14 = this.zzl;
            if (i13 <= i14) {
                int i15 = this.zzg - i12;
                int i16 = i10 - i15;
                if (i16 >= 4096) {
                    try {
                        if (i16 > this.zze.available()) {
                            return null;
                        }
                    } catch (zzgzm e2) {
                        e2.zza();
                        throw e2;
                    }
                }
                byte[] bArr = new byte[i10];
                System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
                this.zzk += this.zzg;
                this.zzi = 0;
                this.zzg = 0;
                while (i15 < i10) {
                    try {
                        int read = this.zze.read(bArr, i15, i10 - i15);
                        if (read != -1) {
                            this.zzk += read;
                            i15 += read;
                        } else {
                            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    } catch (zzgzm e10) {
                        e10.zza();
                        throw e10;
                    }
                }
                return bArr;
            }
            zzC((i14 - i11) - i12);
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzA() throws IOException {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzB() throws IOException {
        return zzq() != 0;
    }

    public final void zzC(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 >= 0) {
            int i14 = this.zzk;
            int i15 = i14 + i12;
            int i16 = this.zzl;
            if (i15 + i10 <= i16) {
                this.zzk = i15;
                this.zzg = 0;
                this.zzi = 0;
                while (i13 < i10) {
                    try {
                        long j3 = i10 - i13;
                        try {
                            long skip = this.zze.skip(j3);
                            if (skip >= 0 && skip <= j3) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i13 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (zzgzm e2) {
                            e2.zza();
                            throw e2;
                        }
                    } finally {
                        this.zzk += i13;
                        zzJ();
                    }
                }
                if (i13 < i10) {
                    int i17 = this.zzg;
                    int i18 = i17 - this.zzi;
                    this.zzi = i17;
                    zzK(1);
                    while (true) {
                        int i19 = i10 - i18;
                        int i20 = this.zzg;
                        if (i19 > i20) {
                            i18 += i20;
                            this.zzi = i20;
                            zzK(1);
                        } else {
                            this.zzi = i19;
                            return;
                        }
                    }
                }
            } else {
                zzC((i16 - i14) - i12);
                throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzd(int i10) throws zzgzm {
        if (i10 >= 0) {
            int i11 = this.zzk + this.zzi + i10;
            if (i11 >= 0) {
                int i12 = this.zzl;
                if (i11 <= i12) {
                    this.zzl = i11;
                    zzJ();
                    return i12;
                }
                throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzgzm("Failed to parse the message.");
        }
        throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zze() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzf() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzg() throws IOException {
        return zzi();
    }

    public final int zzh() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzK(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzi = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzi = r1
            return r0
        L6d:
            long r0 = r5.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxs.zzi():int");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzj() throws IOException {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzk() throws IOException {
        return zzgxv.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
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
        throw new zzgzm("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzm() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzn() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzo() throws IOException {
        return zzq();
    }

    public final long zzp() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzK(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j3 = bArr[i10];
        long j10 = bArr[i10 + 2];
        long j11 = bArr[i10 + 3];
        return ((bArr[i10 + 7] & 255) << 56) | (j3 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long zzq() throws IOException {
        long j3;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.zzi = i13;
                return b3;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b3 ^ (bArr[i13] << 7);
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << Ascii.SO);
                    if (i17 >= 0) {
                        j3 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << Ascii.NAK);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j13 = i18 ^ (bArr[i14] << 28);
                            if (j13 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i19 = i16 + 1;
                                long j14 = j13 ^ (bArr[i16] << 35);
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j13 = j14 ^ (bArr[i19] << 42);
                                    if (j13 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j14 = j13 ^ (bArr[i16] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j3 = (j14 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j10 = j3;
                                                    i14 = i19;
                                                    this.zzi = i14;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ j14;
                                i14 = i19;
                                this.zzi = i14;
                                return j10;
                            }
                            j3 = j13 ^ j12;
                        }
                    }
                    i14 = i16;
                    j10 = j3;
                    this.zzi = i14;
                    return j10;
                }
                j10 = i10;
                this.zzi = i14;
                return j10;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.zzi == this.zzg) {
                zzK(1);
            }
            byte[] bArr = this.zzf;
            int i11 = this.zzi;
            this.zzi = i11 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((bArr[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j3;
            }
        }
        throw new zzgzm("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzs() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzt() throws IOException {
        return zzgxv.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzu() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final zzgxp zzv() throws IOException {
        int zzi = zzi();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzi <= i10 - i11 && zzi > 0) {
            zzgxp zzv = zzgxp.zzv(this.zzf, i11, zzi);
            this.zzi += zzi;
            return zzv;
        }
        if (zzi == 0) {
            return zzgxp.zzb;
        }
        if (zzi >= 0) {
            byte[] zzN = zzN(zzi);
            if (zzN != null) {
                return zzgxp.zzv(zzN, 0, zzN.length);
            }
            int i12 = this.zzi;
            int i13 = this.zzg;
            int i14 = i13 - i12;
            this.zzk += i13;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzI = zzI(zzi - i14);
            byte[] bArr = new byte[zzi];
            System.arraycopy(this.zzf, i12, bArr, 0, i14);
            for (byte[] bArr2 : zzI) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return new zzgxm(bArr);
        }
        throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzi <= i10 - i11) {
                String str = new String(this.zzf, i11, zzi, zzgzk.zza);
                this.zzi += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi >= 0) {
            if (zzi <= this.zzg) {
                zzK(zzi);
                String str2 = new String(this.zzf, this.zzi, zzi, zzgzk.zza);
                this.zzi += zzi;
                return str2;
            }
            return new String(zzM(zzi, false), zzgzk.zza);
        }
        throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzx() throws IOException {
        byte[] zzM;
        int zzi = zzi();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzi <= i11 - i10 && zzi > 0) {
            zzM = this.zzf;
            this.zzi = i10 + zzi;
        } else {
            if (zzi == 0) {
                return "";
            }
            if (zzi >= 0) {
                i10 = 0;
                if (zzi <= i11) {
                    zzK(zzi);
                    zzM = this.zzf;
                    this.zzi = zzi;
                } else {
                    zzM = zzM(zzi, false);
                }
            } else {
                throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzhbz.zzh(zzM, i10, zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final void zzy(int i10) throws zzgzm {
        if (this.zzj == i10) {
        } else {
            throw new zzgzm("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final void zzz(int i10) {
        this.zzl = i10;
        zzJ();
    }
}
