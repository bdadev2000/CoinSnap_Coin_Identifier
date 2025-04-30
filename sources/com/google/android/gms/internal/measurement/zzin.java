package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzin extends zzio {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final void zzaa() {
        int i9 = this.zze + this.zzf;
        this.zze = i9;
        int i10 = i9 - this.zzh;
        int i11 = this.zzj;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zzf = i12;
            this.zze = i9 - i12;
            return;
        }
        this.zzf = 0;
    }

    private final byte zzv() throws IOException {
        int i9 = this.zzg;
        if (i9 != this.zze) {
            byte[] bArr = this.zzd;
            this.zzg = i9 + 1;
            return bArr[i9];
        }
        throw zzjs.zzh();
    }

    private final int zzw() throws IOException {
        int i9 = this.zzg;
        if (this.zze - i9 >= 4) {
            byte[] bArr = this.zzd;
            this.zzg = i9 + 4;
            return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        }
        throw zzjs.zzh();
    }

    private final int zzx() throws IOException {
        int i9;
        int i10 = this.zzg;
        int i11 = this.zze;
        if (i11 != i10) {
            byte[] bArr = this.zzd;
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b >= 0) {
                this.zzg = i12;
                return b;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << Ascii.SO) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << Ascii.NAK);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b8 = bArr[i17];
                            int i19 = (i18 ^ (b8 << Ascii.FS)) ^ 266354560;
                            if (b8 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzg = i13;
                return i9;
            }
        }
        return (int) zzm();
    }

    private final long zzy() throws IOException {
        int i9 = this.zzg;
        if (this.zze - i9 >= 8) {
            byte[] bArr = this.zzd;
            this.zzg = i9 + 8;
            return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
        }
        throw zzjs.zzh();
    }

    private final long zzz() throws IOException {
        long j7;
        long j9;
        long j10;
        int i9 = this.zzg;
        int i10 = this.zze;
        if (i10 != i9) {
            byte[] bArr = this.zzd;
            int i11 = i9 + 1;
            byte b = bArr[i9];
            if (b >= 0) {
                this.zzg = i11;
                return b;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b;
                if (i13 < 0) {
                    j7 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << Ascii.SO) ^ i13;
                    if (i15 >= 0) {
                        j7 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << Ascii.NAK);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j7 = j11;
                        } else {
                            long j12 = i17;
                            i12 = i9 + 5;
                            long j13 = j12 ^ (bArr[i16] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                int i18 = i9 + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i12 = i9 + 7;
                                    j13 = j14 ^ (bArr[i18] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i18 = i9 + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i12 = i9 + 9;
                                            long j15 = (j14 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i19;
                                                }
                                            }
                                            j7 = j15;
                                        }
                                    }
                                }
                                j7 = j14 ^ j9;
                                i12 = i18;
                            }
                            j7 = j13 ^ j10;
                        }
                    }
                }
                this.zzg = i12;
                return j7;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzd() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzf() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzg() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzh() throws IOException {
        return zzio.zze(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzi = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzjs.zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzk() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzl() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzm() throws IOException {
        long j7 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            j7 |= (r3 & Ascii.DEL) << i9;
            if ((zzv() & 128) == 0) {
                return j7;
            }
        }
        throw zzjs.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzn() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzo() throws IOException {
        return zzio.zza(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final long zzp() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final zzia zzq() throws IOException {
        byte[] bArr;
        int zzx = zzx();
        if (zzx > 0) {
            int i9 = this.zze;
            int i10 = this.zzg;
            if (zzx <= i9 - i10) {
                zzia zza = zzia.zza(this.zzd, i10, zzx);
                this.zzg += zzx;
                return zza;
            }
        }
        if (zzx == 0) {
            return zzia.zza;
        }
        if (zzx > 0) {
            int i11 = this.zze;
            int i12 = this.zzg;
            if (zzx <= i11 - i12) {
                int i13 = zzx + i12;
                this.zzg = i13;
                bArr = Arrays.copyOfRange(this.zzd, i12, i13);
                return zzia.zzb(bArr);
            }
        }
        if (zzx <= 0) {
            if (zzx == 0) {
                bArr = zzjm.zzb;
                return zzia.zzb(bArr);
            }
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final String zzr() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i9 = this.zze;
            int i10 = this.zzg;
            if (zzx <= i9 - i10) {
                String str = new String(this.zzd, i10, zzx, zzjm.zza);
                this.zzg += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final String zzs() throws IOException {
        int zzx = zzx();
        if (zzx > 0) {
            int i9 = this.zze;
            int i10 = this.zzg;
            if (zzx <= i9 - i10) {
                String zzb = zzmk.zzb(this.zzd, i10, zzx);
                this.zzg += zzx;
                return zzb;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final boolean zzt() throws IOException {
        if (this.zzg == this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final boolean zzu() throws IOException {
        if (zzz() != 0) {
            return true;
        }
        return false;
    }

    private zzin(byte[] bArr, int i9, int i10, boolean z8) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i10 + i9;
        this.zzg = i9;
        this.zzh = i9;
    }

    private final void zzf(int i9) throws IOException {
        if (i9 >= 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (i9 <= i10 - i11) {
                this.zzg = i11 + i9;
                return;
            }
        }
        if (i9 < 0) {
            throw zzjs.zzf();
        }
        throw zzjs.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final int zza(int i9) throws zzjs {
        if (i9 >= 0) {
            int zzc = i9 + zzc();
            if (zzc >= 0) {
                int i10 = this.zzj;
                if (zzc <= i10) {
                    this.zzj = zzc;
                    zzaa();
                    return i10;
                }
                throw zzjs.zzh();
            }
            throw zzjs.zzg();
        }
        throw zzjs.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final void zzb(int i9) throws zzjs {
        if (this.zzi != i9) {
            throw zzjs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final void zzc(int i9) {
        this.zzj = i9;
        zzaa();
    }

    @Override // com.google.android.gms.internal.measurement.zzio
    public final boolean zzd(int i9) throws IOException {
        int zzi;
        int i10 = i9 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i11 < 10) {
                    byte[] bArr = this.zzd;
                    int i12 = this.zzg;
                    this.zzg = i12 + 1;
                    if (bArr[i12] < 0) {
                        i11++;
                    }
                }
                throw zzjs.zze();
            }
            while (i11 < 10) {
                if (zzv() < 0) {
                    i11++;
                }
            }
            throw zzjs.zze();
            return true;
        }
        if (i10 == 1) {
            zzf(8);
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 == 5) {
                    zzf(4);
                    return true;
                }
                throw zzjs.zza();
            }
            do {
                zzi = zzi();
                if (zzi == 0) {
                    break;
                }
            } while (zzd(zzi));
            zzb(((i9 >>> 3) << 3) | 4);
            return true;
        }
        zzf(zzx());
        return true;
    }
}
