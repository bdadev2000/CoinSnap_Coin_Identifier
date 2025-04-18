package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhaa extends zzhac {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzhaa(ByteBuffer byteBuffer, boolean z2, zzgzz zzgzzVar) {
        super(null);
        this.zzl = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = byteBuffer;
        long zze = zzhef.zze(byteBuffer);
        this.zzf = zze;
        this.zzg = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzh = position;
        this.zzi = position;
    }

    private final int zzC() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzI() {
        long j2 = this.zzg + this.zzj;
        this.zzg = j2;
        int i2 = (int) (j2 - this.zzi);
        int i3 = this.zzl;
        if (i2 <= i3) {
            this.zzj = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzj = i4;
        this.zzg = j2 - i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzB() throws IOException {
        return zzq() != 0;
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
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int i2) throws zzhbt {
        if (i2 < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzc = i2 + zzc();
        int i3 = this.zzl;
        if (zzc > i3) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = zzc;
        zzI();
        return i3;
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
        long j2 = this.zzh;
        if (this.zzg - j2 < 4) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = 4 + j2;
        int zza = zzhef.zza(j2) & UnsignedBytes.MAX_VALUE;
        int zza2 = zzhef.zza(1 + j2) & UnsignedBytes.MAX_VALUE;
        int zza3 = zzhef.zza(2 + j2) & UnsignedBytes.MAX_VALUE;
        return ((zzhef.zza(j2 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (zza2 << 8) | zza | (zza3 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhef.zza(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzh
            long r2 = r9.zzg
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhef.zza(r0)
            if (r4 < 0) goto L16
            r9.zzh = r2
            return r4
        L16:
            long r5 = r9.zzg
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzhef.zza(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhef.zza(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhef.zza(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhef.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhef.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhef.zza(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.zzh = r5
            return r0
        L92:
            long r0 = r9.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaa.zzi():int");
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
            this.zzk = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzk = zzi;
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
        long j2 = this.zzh;
        if (this.zzg - j2 < 8) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzh = 8 + j2;
        long zza = zzhef.zza(j2);
        long zza2 = zzhef.zza(1 + j2);
        long zza3 = zzhef.zza(2 + j2);
        long zza4 = zzhef.zza(3 + j2);
        long zza5 = zzhef.zza(4 + j2);
        return ((zzhef.zza(j2 + 7) & 255) << 56) | (zza & 255) | ((zza2 & 255) << 8) | ((zza3 & 255) << 16) | ((zza4 & 255) << 24) | ((zza5 & 255) << 32) | ((zzhef.zza(5 + j2) & 255) << 40) | ((zzhef.zza(6 + j2) & 255) << 48);
    }

    public final long zzq() throws IOException {
        long j2;
        long j3;
        int i2;
        long j4 = this.zzh;
        if (this.zzg != j4) {
            long j5 = 1 + j4;
            byte zza = zzhef.zza(j4);
            if (zza >= 0) {
                this.zzh = j5;
                return zza;
            }
            if (this.zzg - j5 >= 9) {
                long j6 = 2 + j4;
                int zza2 = (zzhef.zza(j5) << 7) ^ zza;
                if (zza2 >= 0) {
                    long j7 = 3 + j4;
                    int zza3 = zza2 ^ (zzhef.zza(j6) << 14);
                    if (zza3 >= 0) {
                        j2 = zza3 ^ 16256;
                    } else {
                        j6 = 4 + j4;
                        int zza4 = zza3 ^ (zzhef.zza(j7) << 21);
                        if (zza4 < 0) {
                            i2 = (-2080896) ^ zza4;
                        } else {
                            j7 = 5 + j4;
                            long zza5 = (zzhef.zza(j6) << 28) ^ zza4;
                            if (zza5 < 0) {
                                long j8 = 6 + j4;
                                long zza6 = (zzhef.zza(j7) << 35) ^ zza5;
                                if (zza6 >= 0) {
                                    j6 = j4 + 7;
                                    long zza7 = zza6 ^ (zzhef.zza(j8) << 42);
                                    if (zza7 >= 0) {
                                        j2 = 4363953127296L ^ zza7;
                                    } else {
                                        j8 = 8 + j4;
                                        zza6 = zza7 ^ (zzhef.zza(j6) << 49);
                                        if (zza6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j6 = j4 + 9;
                                            long zza8 = (zza6 ^ (zzhef.zza(j8) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j9 = j4 + 10;
                                                if (zzhef.zza(j6) >= 0) {
                                                    j6 = j9;
                                                }
                                            }
                                            j2 = zza8;
                                        }
                                    }
                                    this.zzh = j6;
                                    return j2;
                                }
                                j3 = -34093383808L;
                                j2 = j3 ^ zza6;
                                j6 = j8;
                                this.zzh = j6;
                                return j2;
                            }
                            j2 = 266354560 ^ zza5;
                        }
                    }
                    j6 = j7;
                    this.zzh = j6;
                    return j2;
                }
                i2 = zza2 ^ (-128);
                j2 = i2;
                this.zzh = j6;
                return j2;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            long j3 = this.zzh;
            if (j3 == this.zzg) {
                throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzh = 1 + j3;
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((zzhef.zza(j3) & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
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
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return zzgzs.zzb;
            }
            if (zzi < 0) {
                throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzi];
        long j2 = zzi;
        zzhef.zzo(this.zzh, bArr, 0L, j2);
        this.zzh += j2;
        return new zzgzq(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return "";
            }
            if (zzi < 0) {
                throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzi];
        long j2 = zzi;
        zzhef.zzo(this.zzh, bArr, 0L, j2);
        String str = new String(bArr, zzhbr.zza);
        this.zzh += j2;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzhek.zzg(this.zze, (int) (this.zzh - this.zzf), zzi);
            this.zzh += zzi;
            return zzg;
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi <= 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzy(int i2) throws zzhbt {
        if (this.zzk != i2) {
            throw new zzhbt("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzz(int i2) {
        this.zzl = i2;
        zzI();
    }
}
