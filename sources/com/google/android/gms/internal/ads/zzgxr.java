package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
final class zzgxr extends zzgxv {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgxr(Iterable iterable, int i10, boolean z10, zzgxu zzgxuVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i10;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 == 0) {
            this.zzg = zzgzk.zzc;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        zzM();
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgzm {
        if (this.zzf.hasNext()) {
            zzM();
            return;
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final void zzK(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 <= zzI()) {
            int i12 = i11;
            while (i12 > 0) {
                if (this.zzo - this.zzm == 0) {
                    zzJ();
                }
                int min = Math.min(i12, (int) (this.zzo - this.zzm));
                long j3 = min;
                zzhbu.zzo(this.zzm, bArr, i11 - i12, j3);
                i12 -= min;
                this.zzm += j3;
            }
            return;
        }
        if (i11 <= 0) {
        } else {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzL() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i10 - i12;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhbu.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzA() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final boolean zzB() throws IOException {
        return zzr() != 0;
    }

    public final long zzC() throws IOException {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j3 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzh() & ByteCompanionObject.MIN_VALUE) == 0) {
                return j3;
            }
        }
        throw new zzgzm("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzd(int i10) throws zzgzm {
        if (i10 >= 0) {
            int zzc = i10 + zzc();
            int i11 = this.zzj;
            if (zzc <= i11) {
                this.zzj = zzc;
                zzL();
                return i11;
            }
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zze() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzf() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j3 = this.zzm;
        this.zzm = 1 + j3;
        return zzhbu.zza(j3);
    }

    public final int zzi() throws IOException {
        long j3 = this.zzo;
        long j10 = this.zzm;
        if (j3 - j10 >= 4) {
            this.zzm = 4 + j10;
            int zza = zzhbu.zza(j10) & UByte.MAX_VALUE;
            int zza2 = (zzhbu.zza(1 + j10) & UByte.MAX_VALUE) << 8;
            return zza | zza2 | ((zzhbu.zza(2 + j10) & UByte.MAX_VALUE) << 16) | ((zzhbu.zza(j10 + 3) & UByte.MAX_VALUE) << 24);
        }
        int zzh = zzh() & UByte.MAX_VALUE;
        int zzh2 = (zzh() & UByte.MAX_VALUE) << 8;
        return zzh | zzh2 | ((zzh() & UByte.MAX_VALUE) << 16) | ((zzh() & UByte.MAX_VALUE) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzj() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzk() throws IOException {
        return zzgxv.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzl() throws IOException {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
        }
        throw new zzgzm("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final int zzm() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzn() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzo() throws IOException {
        return zzr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.zzhbu.zza(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzp() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.zzm
            long r2 = r10.zzo
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.google.android.gms.internal.ads.zzhbu.zza(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.zzm
            long r4 = r4 + r2
            r10.zzm = r4
            return r0
        L1a:
            long r6 = r10.zzo
            long r8 = r10.zzm
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.google.android.gms.internal.ads.zzhbu.zza(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.zzm = r6
            return r0
        L8c:
            long r0 = r10.zzC()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgxr.zzp():int");
    }

    public final long zzq() throws IOException {
        long j3 = this.zzo;
        long j10 = this.zzm;
        if (j3 - j10 >= 8) {
            this.zzm = 8 + j10;
            long zza = zzhbu.zza(j10) & 255;
            long zza2 = (zzhbu.zza(1 + j10) & 255) << 8;
            long zza3 = (zzhbu.zza(j10 + 2) & 255) << 16;
            long zza4 = (zzhbu.zza(3 + j10) & 255) << 24;
            long zza5 = (zzhbu.zza(j10 + 4) & 255) << 32;
            return zza5 | zza | zza2 | zza3 | zza4 | ((zzhbu.zza(j10 + 5) & 255) << 40) | ((zzhbu.zza(j10 + 6) & 255) << 48) | ((zzhbu.zza(j10 + 7) & 255) << 56);
        }
        return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
    }

    public final long zzr() throws IOException {
        long zza;
        long j3;
        long j10;
        int i10;
        long j11 = this.zzm;
        if (this.zzo != j11) {
            long j12 = j11 + 1;
            byte zza2 = zzhbu.zza(j11);
            if (zza2 >= 0) {
                this.zzm++;
                return zza2;
            }
            if (this.zzo - this.zzm >= 10) {
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
                                                    this.zzm = j13;
                                                    return zza;
                                                }
                                            }
                                        }
                                    }
                                }
                                zza = zza7 ^ j3;
                                j13 = j15;
                                this.zzm = j13;
                                return zza;
                            }
                            zza = zza6 ^ j10;
                        }
                    }
                    j13 = j14;
                    this.zzm = j13;
                    return zza;
                }
                zza = i10;
                this.zzm = j13;
                return zza;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzs() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzt() throws IOException {
        return zzgxv.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final long zzu() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final zzgxp zzv() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j3 = this.zzo;
            long j10 = this.zzm;
            long j11 = zzp;
            if (j11 <= j3 - j10) {
                byte[] bArr = new byte[zzp];
                zzhbu.zzo(j10, bArr, 0L, j11);
                this.zzm += j11;
                return new zzgxm(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new zzgxm(bArr2);
        }
        if (zzp == 0) {
            return zzgxp.zzb;
        }
        if (zzp < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzw() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j3 = this.zzo;
            long j10 = this.zzm;
            long j11 = zzp;
            if (j11 <= j3 - j10) {
                byte[] bArr = new byte[zzp];
                zzhbu.zzo(j10, bArr, 0L, j11);
                String str = new String(bArr, zzgzk.zza);
                this.zzm += j11;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgzk.zza);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final String zzx() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j3 = this.zzo;
            long j10 = this.zzm;
            long j11 = zzp;
            if (j11 <= j3 - j10) {
                String zzg = zzhbz.zzg(this.zzg, (int) (j10 - this.zzn), zzp);
                this.zzm += j11;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhbz.zzh(bArr, 0, zzp);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp <= 0) {
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
        this.zzj = i10;
        zzL();
    }
}
