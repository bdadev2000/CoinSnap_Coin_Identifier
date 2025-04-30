package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzhag extends zzham {
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

    public /* synthetic */ zzhag(Iterable iterable, int i9, boolean z8, zzhaf zzhafVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zzh = i9;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i9 == 0) {
            this.zzg = zzhcb.zze;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        zzO();
    }

    private final int zzK() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzL() throws zzhcd {
        if (this.zzf.hasNext()) {
            zzO();
            return;
        }
        throw zzhcd.zzj();
    }

    private final void zzM(byte[] bArr, int i9, int i10) throws IOException {
        if (i10 <= zzK()) {
            int i11 = i10;
            while (i11 > 0) {
                if (this.zzo - this.zzm == 0) {
                    zzL();
                }
                int min = Math.min(i11, (int) (this.zzo - this.zzm));
                long j7 = min;
                zzhfa.zzo(this.zzm, bArr, i10 - i11, j7);
                i11 -= min;
                this.zzm += j7;
            }
            return;
        }
        if (i10 <= 0) {
        } else {
            throw zzhcd.zzj();
        }
    }

    private final void zzN() {
        int i9 = this.zzh + this.zzi;
        this.zzh = i9;
        int i10 = this.zzj;
        if (i9 <= i10) {
            this.zzi = 0;
            return;
        }
        int i11 = i9 - i10;
        this.zzi = i11;
        this.zzh = i9 - i11;
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhfa.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final void zzA(int i9) {
        this.zzj = i9;
        zzN();
    }

    public final void zzB(int i9) throws IOException {
        if (i9 >= 0) {
            if (i9 <= ((this.zzh - this.zzl) - this.zzm) + this.zzn) {
                while (i9 > 0) {
                    if (this.zzo - this.zzm == 0) {
                        zzL();
                    }
                    int min = Math.min(i9, (int) (this.zzo - this.zzm));
                    i9 -= min;
                    this.zzm += min;
                }
                return;
            }
        }
        if (i9 < 0) {
            throw zzhcd.zzf();
        }
        throw zzhcd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final boolean zzC() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
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
        for (int i11 = 0; i11 < 10; i11++) {
            if (zza() >= 0) {
                return true;
            }
        }
        throw zzhcd.zze();
    }

    public final byte zza() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzL();
        }
        long j7 = this.zzm;
        this.zzm = 1 + j7;
        return zzhfa.zza(j7);
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
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzham
    public final int zze(int i9) throws zzhcd {
        if (i9 >= 0) {
            int zzd = i9 + zzd();
            int i10 = this.zzj;
            if (zzd <= i10) {
                this.zzj = zzd;
                zzN();
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
        long j7 = this.zzo;
        long j9 = this.zzm;
        if (j7 - j9 >= 4) {
            this.zzm = 4 + j9;
            int zza = zzhfa.zza(j9) & 255;
            int zza2 = (zzhfa.zza(1 + j9) & 255) << 8;
            return zza | zza2 | ((zzhfa.zza(2 + j9) & 255) << 16) | ((zzhfa.zza(j9 + 3) & 255) << 24);
        }
        int zza3 = zza() & 255;
        int zza4 = (zza() & 255) << 8;
        return zza3 | zza4 | ((zza() & 255) << 16) | ((zza() & 255) << 24);
    }

    public final int zzj() throws IOException {
        int i9;
        long j7 = this.zzm;
        if (this.zzo != j7) {
            long j9 = j7 + 1;
            byte zza = zzhfa.zza(j7);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j10 = 2 + j7;
                int zza2 = (zzhfa.zza(j9) << 7) ^ zza;
                if (zza2 < 0) {
                    i9 = zza2 ^ (-128);
                } else {
                    long j11 = 3 + j7;
                    int zza3 = (zzhfa.zza(j10) << Ascii.SO) ^ zza2;
                    if (zza3 >= 0) {
                        i9 = zza3 ^ 16256;
                    } else {
                        long j12 = 4 + j7;
                        int zza4 = zza3 ^ (zzhfa.zza(j11) << Ascii.NAK);
                        if (zza4 < 0) {
                            i9 = (-2080896) ^ zza4;
                        } else {
                            j11 = 5 + j7;
                            byte zza5 = zzhfa.zza(j12);
                            int i10 = (zza4 ^ (zza5 << Ascii.FS)) ^ 266354560;
                            if (zza5 < 0) {
                                j12 = 6 + j7;
                                if (zzhfa.zza(j11) < 0) {
                                    j11 = 7 + j7;
                                    if (zzhfa.zza(j12) < 0) {
                                        j12 = 8 + j7;
                                        if (zzhfa.zza(j11) < 0) {
                                            j11 = 9 + j7;
                                            if (zzhfa.zza(j12) < 0) {
                                                long j13 = j7 + 10;
                                                if (zzhfa.zza(j11) >= 0) {
                                                    i9 = i10;
                                                    j10 = j13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i10;
                            }
                            i9 = i10;
                        }
                        j10 = j12;
                    }
                    j10 = j11;
                }
                this.zzm = j10;
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
        long j7 = this.zzo;
        long j9 = this.zzm;
        if (j7 - j9 >= 8) {
            this.zzm = 8 + j9;
            long zza = zzhfa.zza(j9) & 255;
            long zza2 = (zzhfa.zza(1 + j9) & 255) << 8;
            long zza3 = (zzhfa.zza(j9 + 2) & 255) << 16;
            long zza4 = (zzhfa.zza(3 + j9) & 255) << 24;
            long zza5 = (zzhfa.zza(j9 + 4) & 255) << 32;
            return zza5 | zza | zza2 | zza3 | zza4 | ((zzhfa.zza(j9 + 5) & 255) << 40) | ((zzhfa.zza(j9 + 6) & 255) << 48) | ((zzhfa.zza(j9 + 7) & 255) << 56);
        }
        return (zza() & 255) | ((zza() & 255) << 8) | ((zza() & 255) << 16) | ((zza() & 255) << 24) | ((zza() & 255) << 32) | ((zza() & 255) << 40) | ((zza() & 255) << 48) | ((zza() & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j7;
        long j9;
        long j10 = this.zzm;
        if (this.zzo != j10) {
            long j11 = j10 + 1;
            byte zza = zzhfa.zza(j10);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j12 = 2 + j10;
                int zza2 = (zzhfa.zza(j11) << 7) ^ zza;
                if (zza2 < 0) {
                    j7 = zza2 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int zza3 = (zzhfa.zza(j12) << Ascii.SO) ^ zza2;
                    if (zza3 >= 0) {
                        j7 = zza3 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int zza4 = zza3 ^ (zzhfa.zza(j13) << Ascii.NAK);
                        if (zza4 < 0) {
                            j7 = (-2080896) ^ zza4;
                            j12 = j14;
                        } else {
                            j13 = 5 + j10;
                            long zza5 = (zzhfa.zza(j14) << 28) ^ zza4;
                            if (zza5 >= 0) {
                                j7 = 266354560 ^ zza5;
                            } else {
                                long j15 = 6 + j10;
                                long zza6 = zza5 ^ (zzhfa.zza(j13) << 35);
                                if (zza6 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    long j16 = 7 + j10;
                                    long zza7 = zza6 ^ (zzhfa.zza(j15) << 42);
                                    if (zza7 >= 0) {
                                        j7 = 4363953127296L ^ zza7;
                                    } else {
                                        j15 = 8 + j10;
                                        zza6 = zza7 ^ (zzhfa.zza(j16) << 49);
                                        if (zza6 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            j16 = 9 + j10;
                                            long zza8 = (zza6 ^ (zzhfa.zza(j15) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j17 = j10 + 10;
                                                if (zzhfa.zza(j16) >= 0) {
                                                    j7 = zza8;
                                                    j12 = j17;
                                                }
                                            } else {
                                                j7 = zza8;
                                            }
                                        }
                                    }
                                    j12 = j16;
                                }
                                j7 = j9 ^ zza6;
                                j12 = j15;
                            }
                        }
                    }
                    j12 = j13;
                }
                this.zzm = j12;
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
        if (zzj > 0) {
            long j7 = this.zzo;
            long j9 = this.zzm;
            long j10 = zzj;
            if (j10 <= j7 - j9) {
                byte[] bArr = new byte[zzj];
                zzhfa.zzo(j9, bArr, 0L, j10);
                this.zzm += j10;
                return new zzgzy(bArr);
            }
        }
        if (zzj > 0 && zzj <= zzK()) {
            byte[] bArr2 = new byte[zzj];
            zzM(bArr2, 0, zzj);
            return new zzgzy(bArr2);
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
        if (zzj > 0) {
            long j7 = this.zzo;
            long j9 = this.zzm;
            long j10 = zzj;
            if (j10 <= j7 - j9) {
                byte[] bArr = new byte[zzj];
                zzhfa.zzo(j9, bArr, 0L, j10);
                String str = new String(bArr, zzhcb.zzb);
                this.zzm += j10;
                return str;
            }
        }
        if (zzj > 0 && zzj <= zzK()) {
            byte[] bArr2 = new byte[zzj];
            zzM(bArr2, 0, zzj);
            return new String(bArr2, zzhcb.zzb);
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
        if (zzj > 0) {
            long j7 = this.zzo;
            long j9 = this.zzm;
            long j10 = zzj;
            if (j10 <= j7 - j9) {
                String zzg = zzhff.zzg(this.zzg, (int) (j9 - this.zzn), zzj);
                this.zzm += j10;
                return zzg;
            }
        }
        if (zzj >= 0 && zzj <= zzK()) {
            byte[] bArr = new byte[zzj];
            zzM(bArr, 0, zzj);
            return zzhff.zzh(bArr, 0, zzj);
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
