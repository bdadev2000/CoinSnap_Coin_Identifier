package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxq extends zzgxv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgxq(byte[] bArr, int i10, int i11, boolean z10, zzgxu zzgxuVar) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
    }

    private final void zzC() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzB() throws IOException {
        return zzq() != 0;
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
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzd(int i10) throws zzgzm {
        if (i10 >= 0) {
            int i11 = (this.zzh - this.zzi) + i10;
            if (i11 >= 0) {
                int i12 = this.zzk;
                if (i11 <= i12) {
                    this.zzk = i11;
                    zzC();
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
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            int i11 = bArr[i10] & UByte.MAX_VALUE;
            int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
            int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
            return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxq.zzi():int");
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
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            long j3 = bArr[i10];
            long j10 = bArr[i10 + 2];
            long j11 = bArr[i10 + 3];
            return ((bArr[i10 + 7] & 255) << 56) | (j3 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzq() throws IOException {
        long j3;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b3 = bArr[i11];
            if (b3 >= 0) {
                this.zzh = i13;
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
                                                    this.zzh = i14;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ j14;
                                i14 = i19;
                                this.zzh = i14;
                                return j10;
                            }
                            j3 = j13 ^ j12;
                        }
                    }
                    i14 = i16;
                    j10 = j3;
                    this.zzh = i14;
                    return j10;
                }
                j10 = i10;
                this.zzh = i14;
                return j10;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.zzh;
            if (i11 != this.zzf) {
                byte[] bArr = this.zze;
                this.zzh = i11 + 1;
                j3 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((bArr[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j3;
                }
            } else {
                throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                zzgxp zzv = zzgxp.zzv(this.zze, i11, zzi);
                this.zzh += zzi;
                return zzv;
            }
        }
        if (zzi != 0) {
            if (zzi > 0) {
                int i12 = this.zzf;
                int i13 = this.zzh;
                if (zzi <= i12 - i13) {
                    int i14 = zzi + i13;
                    this.zzh = i14;
                    return new zzgxm(Arrays.copyOfRange(this.zze, i13, i14));
                }
            }
            if (zzi <= 0) {
                throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return zzgxp.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                String str = new String(this.zze, i11, zzi, zzgzk.zza);
                this.zzh += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzi <= i10 - i11) {
                String zzh = zzhbz.zzh(this.zze, i11, zzi);
                this.zzh += zzi;
                return zzh;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi <= 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        this.zzk = i10;
        zzC();
    }
}
