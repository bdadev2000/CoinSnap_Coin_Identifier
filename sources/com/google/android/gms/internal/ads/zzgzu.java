package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgzu extends zzhac {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgzu(byte[] bArr, int i2, int i3, boolean z2, zzgzt zzgztVar) {
        super(null);
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i3 + i2;
        this.zzh = i2;
        this.zzi = i2;
    }

    private final void zzC() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i3 = i2 - this.zzi;
        int i4 = this.zzk;
        if (i3 <= i4) {
            this.zzg = 0;
            return;
        }
        int i5 = i3 - i4;
        this.zzg = i5;
        this.zzf = i2 - i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws IOException {
        return this.zzh == this.zzf;
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
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int i2) throws zzhbt {
        if (i2 < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = (this.zzh - this.zzi) + i2;
        if (i3 < 0) {
            throw new zzhbt("Failed to parse the message.");
        }
        int i4 = this.zzk;
        if (i3 > i4) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i3;
        zzC();
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
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 4;
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public final int zzi() throws IOException {
        int i2;
        int i3 = this.zzh;
        int i4 = this.zzf;
        if (i4 != i3) {
            byte[] bArr = this.zze;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.zzh = i5;
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
                this.zzh = i6;
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
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 8;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        return ((bArr[i2 + 7] & 255) << 56) | (j2 & 255) | ((bArr[i2 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final long zzq() throws IOException {
        long j2;
        long j3;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zze;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzh = i4;
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
                this.zzh = i5;
                return j2;
            }
        }
        return zzr();
    }

    public final long zzr() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i3 = this.zzh;
            if (i3 == this.zzf) {
                throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.zze;
            this.zzh = i3 + 1;
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
        if (zzi > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzi <= i2 - i3) {
                zzgzs zzv = zzgzs.zzv(this.zze, i3, zzi);
                this.zzh += zzi;
                return zzv;
            }
        }
        if (zzi == 0) {
            return zzgzs.zzb;
        }
        if (zzi > 0) {
            int i4 = this.zzf;
            int i5 = this.zzh;
            if (zzi <= i4 - i5) {
                int i6 = zzi + i5;
                this.zzh = i6;
                return new zzgzq(Arrays.copyOfRange(this.zze, i5, i6));
            }
        }
        if (zzi <= 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzw() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzi <= i2 - i3) {
                String str = new String(this.zze, i3, zzi, zzhbr.zza);
                this.zzh += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzx() throws IOException {
        int zzi = zzi();
        if (zzi > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (zzi <= i2 - i3) {
                String zzh = zzhek.zzh(this.zze, i3, zzi);
                this.zzh += zzi;
                return zzh;
            }
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
        if (this.zzj != i2) {
            throw new zzhbt("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final void zzz(int i2) {
        this.zzk = i2;
        zzC();
    }
}
