package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhak extends zzham {
    private final ByteBuffer zze;
    private final long zzf;
    private long zzg;
    private long zzh;
    private final long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzhak(ByteBuffer byteBuffer, boolean z8, zzhaj zzhajVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = byteBuffer;
        long zze = zzhfa.zze(byteBuffer);
        this.zzf = zze;
        this.zzg = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzh = position;
        this.zzi = position;
    }

    private final int zzK() {
        return (int) (this.zzg - this.zzh);
    }

    private final void zzL() {
        long j7 = this.zzg + this.zzj;
        this.zzg = j7;
        int i9 = (int) (j7 - this.zzi);
        int i10 = this.zzl;
        if (i9 <= i10) {
            this.zzj = 0;
            return;
        }
        int i11 = i9 - i10;
        this.zzj = i11;
        this.zzg = j7 - i11;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzA(int i9) {
        this.zzl = i9;
        zzL();
    }

    public final void zzB(int i9) throws IOException {
        if (i9 >= 0 && i9 <= zzK()) {
            this.zzh += i9;
        } else {
            if (i9 < 0) {
                throw zzhcd.zzf();
            }
            throw zzhcd.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzg;
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
        if (zzK() >= 10) {
            while (i11 < 10) {
                long j7 = this.zzh;
                this.zzh = 1 + j7;
                if (zzhfa.zza(j7) < 0) {
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
        long j7 = this.zzh;
        if (j7 != this.zzg) {
            this.zzh = 1 + j7;
            return zzhfa.zza(j7);
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
        return (int) (this.zzh - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zze(int i9) throws zzhcd {
        if (i9 >= 0) {
            int zzd = i9 + zzd();
            int i10 = this.zzl;
            if (zzd <= i10) {
                this.zzl = zzd;
                zzL();
                return i10;
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
        long j7 = this.zzh;
        if (this.zzg - j7 >= 4) {
            this.zzh = 4 + j7;
            int zza = zzhfa.zza(j7) & 255;
            int zza2 = zzhfa.zza(1 + j7) & 255;
            int zza3 = zzhfa.zza(2 + j7) & 255;
            return ((zzhfa.zza(j7 + 3) & 255) << 24) | (zza2 << 8) | zza | (zza3 << 16);
        }
        throw zzhcd.zzj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhfa.zza(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzj() throws java.io.IOException {
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
            byte r4 = com.google.android.gms.internal.ads.zzhfa.zza(r0)
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
            byte r2 = com.google.android.gms.internal.ads.zzhfa.zza(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhfa.zza(r5)
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
            byte r3 = com.google.android.gms.internal.ads.zzhfa.zza(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhfa.zza(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhfa.zza(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhfa.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhfa.zza(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhfa.zza(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhfa.zza(r3)
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
            long r0 = r9.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhak.zzj():int");
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
            this.zzk = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzk = zzj;
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
        long j7 = this.zzh;
        if (this.zzg - j7 >= 8) {
            this.zzh = 8 + j7;
            long zza = zzhfa.zza(j7);
            long zza2 = zzhfa.zza(1 + j7);
            long zza3 = zzhfa.zza(2 + j7);
            long zza4 = zzhfa.zza(3 + j7);
            long zza5 = zzhfa.zza(4 + j7);
            return ((zzhfa.zza(j7 + 7) & 255) << 56) | (zza & 255) | ((zza2 & 255) << 8) | ((zza3 & 255) << 16) | ((zza4 & 255) << 24) | ((zza5 & 255) << 32) | ((zzhfa.zza(5 + j7) & 255) << 40) | ((zzhfa.zza(6 + j7) & 255) << 48);
        }
        throw zzhcd.zzj();
    }

    public final long zzr() throws IOException {
        long j7;
        long j9;
        int i9;
        long j10 = this.zzh;
        if (this.zzg != j10) {
            long j11 = 1 + j10;
            byte zza = zzhfa.zza(j10);
            if (zza >= 0) {
                this.zzh = j11;
                return zza;
            }
            if (this.zzg - j11 >= 9) {
                long j12 = 2 + j10;
                int zza2 = (zzhfa.zza(j11) << 7) ^ zza;
                if (zza2 < 0) {
                    i9 = zza2 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int zza3 = zza2 ^ (zzhfa.zza(j12) << Ascii.SO);
                    if (zza3 >= 0) {
                        j7 = zza3 ^ 16256;
                    } else {
                        j12 = 4 + j10;
                        int zza4 = zza3 ^ (zzhfa.zza(j13) << Ascii.NAK);
                        if (zza4 < 0) {
                            i9 = (-2080896) ^ zza4;
                        } else {
                            j13 = 5 + j10;
                            long zza5 = (zzhfa.zza(j12) << 28) ^ zza4;
                            if (zza5 >= 0) {
                                j7 = 266354560 ^ zza5;
                            } else {
                                long j14 = 6 + j10;
                                long zza6 = (zzhfa.zza(j13) << 35) ^ zza5;
                                if (zza6 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    j12 = j10 + 7;
                                    long zza7 = zza6 ^ (zzhfa.zza(j14) << 42);
                                    if (zza7 >= 0) {
                                        j7 = 4363953127296L ^ zza7;
                                    } else {
                                        j14 = 8 + j10;
                                        zza6 = zza7 ^ (zzhfa.zza(j12) << 49);
                                        if (zza6 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            j12 = j10 + 9;
                                            long zza8 = (zza6 ^ (zzhfa.zza(j14) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j15 = j10 + 10;
                                                if (zzhfa.zza(j12) >= 0) {
                                                    j12 = j15;
                                                }
                                            }
                                            j7 = zza8;
                                        }
                                    }
                                    this.zzh = j12;
                                    return j7;
                                }
                                j7 = j9 ^ zza6;
                                j12 = j14;
                                this.zzh = j12;
                                return j7;
                            }
                        }
                    }
                    j12 = j13;
                    this.zzh = j12;
                    return j7;
                }
                j7 = i9;
                this.zzh = j12;
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
        if (zzj > 0 && zzj <= zzK()) {
            byte[] bArr = new byte[zzj];
            long j7 = zzj;
            zzhfa.zzo(this.zzh, bArr, 0L, j7);
            this.zzh += j7;
            return new zzgzy(bArr);
        }
        if (zzj == 0) {
            return zzhac.zzb;
        }
        if (zzj < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final String zzx() throws IOException {
        int zzj = zzj();
        if (zzj > 0 && zzj <= zzK()) {
            byte[] bArr = new byte[zzj];
            long j7 = zzj;
            zzhfa.zzo(this.zzh, bArr, 0L, j7);
            String str = new String(bArr, zzhcb.zzb);
            this.zzh += j7;
            return str;
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
        if (zzj > 0 && zzj <= zzK()) {
            String zzg = zzhff.zzg(this.zze, (int) (this.zzh - this.zzf), zzj);
            this.zzh += zzj;
            return zzg;
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
        if (this.zzk == i9) {
        } else {
            throw zzhcd.zzb();
        }
    }
}
