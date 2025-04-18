package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxt extends zzgxv {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzgxt(ByteBuffer byteBuffer, boolean z10, zzgxu zzgxuVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long zze = zzhbu.zze(byteBuffer);
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
        long j3 = this.zzg + this.zzj;
        this.zzg = j3;
        int i10 = (int) (j3 - this.zzi);
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzj = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzj = i12;
        this.zzg = j3 - i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzg;
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
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzd(int i10) throws zzgzm {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            int i11 = this.zzl;
            if (zzc <= i11) {
                this.zzl = zzc;
                zzI();
                return i11;
            }
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        long j3 = this.zzh;
        if (this.zzg - j3 >= 4) {
            this.zzh = 4 + j3;
            int zza = zzhbu.zza(j3) & UByte.MAX_VALUE;
            int zza2 = zzhbu.zza(1 + j3) & UByte.MAX_VALUE;
            int zza3 = zzhbu.zza(2 + j3) & UByte.MAX_VALUE;
            return ((zzhbu.zza(j3 + 3) & UByte.MAX_VALUE) << 24) | (zza2 << 8) | zza | (zza3 << 16);
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (com.google.android.gms.internal.ads.zzhbu.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzi() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzh
            long r2 = r10.zzg
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhbu.zza(r0)
            if (r0 < 0) goto L17
            r10.zzh = r4
            return r0
        L17:
            long r6 = r10.zzg
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            if (r1 < 0) goto L87
        L84:
            r10.zzh = r6
            return r0
        L87:
            long r0 = r10.zzr()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxt.zzi():int");
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
            this.zzk = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzk = zzi;
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
        long j3 = this.zzh;
        if (this.zzg - j3 >= 8) {
            this.zzh = 8 + j3;
            long zza = zzhbu.zza(j3);
            long zza2 = zzhbu.zza(1 + j3);
            long zza3 = zzhbu.zza(2 + j3);
            long zza4 = zzhbu.zza(3 + j3);
            long zza5 = zzhbu.zza(4 + j3);
            return ((zzhbu.zza(j3 + 7) & 255) << 56) | (zza & 255) | ((zza2 & 255) << 8) | ((zza3 & 255) << 16) | ((zza4 & 255) << 24) | ((zza5 & 255) << 32) | ((zzhbu.zza(5 + j3) & 255) << 40) | ((zzhbu.zza(6 + j3) & 255) << 48);
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzq() throws IOException {
        long zza;
        long j3;
        long j10;
        int i10;
        long j11 = this.zzh;
        if (this.zzg != j11) {
            long j12 = j11 + 1;
            byte zza2 = zzhbu.zza(j11);
            if (zza2 >= 0) {
                this.zzh = j12;
                return zza2;
            }
            if (this.zzg - j12 >= 9) {
                long j13 = j12 + 1;
                int zza3 = zza2 ^ (zzhbu.zza(j12) << 7);
                if (zza3 < 0) {
                    i10 = zza3 ^ (-128);
                } else {
                    long j14 = j13 + 1;
                    int zza4 = zza3 ^ (zzhbu.zza(j13) << Ascii.SO);
                    if (zza4 >= 0) {
                        zza = zza4 ^ 16256;
                    } else {
                        j13 = j14 + 1;
                        int zza5 = zza4 ^ (zzhbu.zza(j14) << Ascii.NAK);
                        if (zza5 < 0) {
                            i10 = zza5 ^ (-2080896);
                        } else {
                            j14 = j13 + 1;
                            long zza6 = zza5 ^ (zzhbu.zza(j13) << 28);
                            if (zza6 >= 0) {
                                j10 = 266354560;
                            } else {
                                long j15 = j14 + 1;
                                long zza7 = zza6 ^ (zzhbu.zza(j14) << 35);
                                if (zza7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j14 = j15 + 1;
                                    zza6 = zza7 ^ (zzhbu.zza(j15) << 42);
                                    if (zza6 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        j15 = j14 + 1;
                                        zza7 = zza6 ^ (zzhbu.zza(j14) << 49);
                                        if (zza7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j14 = j15 + 1;
                                            zza = (zza7 ^ (zzhbu.zza(j15) << 56)) ^ 71499008037633920L;
                                            if (zza < 0) {
                                                long j16 = 1 + j14;
                                                if (zzhbu.zza(j14) >= 0) {
                                                    j13 = j16;
                                                    this.zzh = j13;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j3;
                                j13 = j15;
                                this.zzh = j13;
                                return zza;
                            }
                            zza = zza6 ^ j10;
                        }
                    }
                    j13 = j14;
                    this.zzh = j13;
                    return zza;
                }
                zza = i10;
                this.zzh = j13;
                return zza;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            long j10 = this.zzh;
            if (j10 != this.zzg) {
                this.zzh = 1 + j10;
                j3 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((zzhbu.zza(j10) & ByteCompanionObject.MIN_VALUE) == 0) {
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
        if (zzi > 0 && zzi <= zzC()) {
            byte[] bArr = new byte[zzi];
            long j3 = zzi;
            zzhbu.zzo(this.zzh, bArr, 0L, j3);
            this.zzh += j3;
            return new zzgxm(bArr);
        }
        if (zzi == 0) {
            return zzgxp.zzb;
        }
        if (zzi < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            byte[] bArr = new byte[zzi];
            long j3 = zzi;
            zzhbu.zzo(this.zzh, bArr, 0L, j3);
            String str = new String(bArr, zzgzk.zza);
            this.zzh += j3;
            return str;
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
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzhbz.zzg(this.zze, (int) (this.zzh - this.zzf), zzi);
            this.zzh += zzi;
            return zzg;
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
        if (this.zzk == i10) {
        } else {
            throw new zzgzm("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final void zzz(int i10) {
        this.zzl = i10;
        zzI();
    }
}
