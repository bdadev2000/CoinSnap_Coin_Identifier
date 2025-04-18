package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgzw extends zzhac {
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

    public /* synthetic */ zzgzw(Iterable iterable, int i2, boolean z2, zzgzv zzgzvVar) {
        super(null);
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzh = i2;
        this.zze = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i2 != 0) {
            zzM();
            return;
        }
        this.zzg = zzhbr.zzc;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzhbt {
        if (!this.zzf.hasNext()) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 > zzI()) {
            if (i3 > 0) {
                throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i4 = i3;
        while (i4 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int min = Math.min(i4, (int) (this.zzo - this.zzm));
            long j2 = min;
            zzhef.zzo(this.zzm, bArr, i3 - i4, j2);
            i4 -= min;
            this.zzm += j2;
        }
    }

    private final void zzL() {
        int i2 = this.zzh + this.zzi;
        this.zzh = i2;
        int i3 = this.zzj;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i2 - i4;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhef.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzA() throws IOException {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final boolean zzB() throws IOException {
        return zzr() != 0;
    }

    public final long zzC() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((zzh() & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j2;
            }
        }
        throw new zzhbt("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzd(int i2) throws zzhbt {
        if (i2 < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzc = i2 + zzc();
        int i3 = this.zzj;
        if (zzc > i3) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = zzc;
        zzL();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zze() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzf() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzg() throws IOException {
        return zzp();
    }

    public final byte zzh() throws IOException {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j2 = this.zzm;
        this.zzm = 1 + j2;
        return zzhef.zza(j2);
    }

    public final int zzi() throws IOException {
        long j2 = this.zzo;
        long j3 = this.zzm;
        if (j2 - j3 < 4) {
            int zzh = zzh() & UnsignedBytes.MAX_VALUE;
            int zzh2 = (zzh() & UnsignedBytes.MAX_VALUE) << 8;
            return zzh | zzh2 | ((zzh() & UnsignedBytes.MAX_VALUE) << 16) | ((zzh() & UnsignedBytes.MAX_VALUE) << 24);
        }
        this.zzm = 4 + j3;
        int zza = zzhef.zza(j3) & UnsignedBytes.MAX_VALUE;
        int zza2 = (zzhef.zza(1 + j3) & UnsignedBytes.MAX_VALUE) << 8;
        return zza | zza2 | ((zzhef.zza(2 + j3) & UnsignedBytes.MAX_VALUE) << 16) | ((zzhef.zza(j3 + 3) & UnsignedBytes.MAX_VALUE) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzj() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzk() throws IOException {
        return zzhac.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
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
        throw new zzhbt("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final int zzm() throws IOException {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzn() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzo() throws IOException {
        return zzr();
    }

    public final int zzp() throws IOException {
        int i2;
        long j2 = this.zzm;
        if (this.zzo != j2) {
            long j3 = j2 + 1;
            byte zza = zzhef.zza(j2);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j4 = 2 + j2;
                int zza2 = (zzhef.zza(j3) << 7) ^ zza;
                if (zza2 < 0) {
                    i2 = zza2 ^ (-128);
                } else {
                    long j5 = 3 + j2;
                    int zza3 = (zzhef.zza(j4) << 14) ^ zza2;
                    if (zza3 >= 0) {
                        i2 = zza3 ^ 16256;
                    } else {
                        long j6 = 4 + j2;
                        int zza4 = zza3 ^ (zzhef.zza(j5) << 21);
                        if (zza4 < 0) {
                            i2 = (-2080896) ^ zza4;
                        } else {
                            j5 = 5 + j2;
                            byte zza5 = zzhef.zza(j6);
                            int i3 = (zza4 ^ (zza5 << 28)) ^ 266354560;
                            if (zza5 < 0) {
                                j6 = 6 + j2;
                                if (zzhef.zza(j5) < 0) {
                                    j5 = 7 + j2;
                                    if (zzhef.zza(j6) < 0) {
                                        j6 = 8 + j2;
                                        if (zzhef.zza(j5) < 0) {
                                            j5 = 9 + j2;
                                            if (zzhef.zza(j6) < 0) {
                                                long j7 = j2 + 10;
                                                if (zzhef.zza(j5) >= 0) {
                                                    i2 = i3;
                                                    j4 = j7;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i3;
                            }
                            i2 = i3;
                        }
                        j4 = j6;
                    }
                    j4 = j5;
                }
                this.zzm = j4;
                return i2;
            }
        }
        return (int) zzC();
    }

    public final long zzq() throws IOException {
        long j2 = this.zzo;
        long j3 = this.zzm;
        if (j2 - j3 < 8) {
            return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
        }
        this.zzm = 8 + j3;
        long zza = zzhef.zza(j3) & 255;
        long zza2 = (zzhef.zza(1 + j3) & 255) << 8;
        long zza3 = (zzhef.zza(j3 + 2) & 255) << 16;
        long zza4 = (zzhef.zza(3 + j3) & 255) << 24;
        long zza5 = (zzhef.zza(j3 + 4) & 255) << 32;
        return zza5 | zza | zza2 | zza3 | zza4 | ((zzhef.zza(j3 + 5) & 255) << 40) | ((zzhef.zza(j3 + 6) & 255) << 48) | ((zzhef.zza(j3 + 7) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j2;
        long j3;
        long j4 = this.zzm;
        if (this.zzo != j4) {
            long j5 = j4 + 1;
            byte zza = zzhef.zza(j4);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j6 = 2 + j4;
                int zza2 = (zzhef.zza(j5) << 7) ^ zza;
                if (zza2 < 0) {
                    j2 = zza2 ^ (-128);
                } else {
                    long j7 = 3 + j4;
                    int zza3 = (zzhef.zza(j6) << 14) ^ zza2;
                    if (zza3 >= 0) {
                        j2 = zza3 ^ 16256;
                    } else {
                        long j8 = 4 + j4;
                        int zza4 = zza3 ^ (zzhef.zza(j7) << 21);
                        if (zza4 < 0) {
                            j2 = (-2080896) ^ zza4;
                            j6 = j8;
                        } else {
                            j7 = 5 + j4;
                            long zza5 = (zzhef.zza(j8) << 28) ^ zza4;
                            if (zza5 >= 0) {
                                j2 = 266354560 ^ zza5;
                            } else {
                                long j9 = 6 + j4;
                                long zza6 = zza5 ^ (zzhef.zza(j7) << 35);
                                if (zza6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    long j10 = 7 + j4;
                                    long zza7 = zza6 ^ (zzhef.zza(j9) << 42);
                                    if (zza7 >= 0) {
                                        j2 = 4363953127296L ^ zza7;
                                    } else {
                                        j9 = 8 + j4;
                                        zza6 = zza7 ^ (zzhef.zza(j10) << 49);
                                        if (zza6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j10 = 9 + j4;
                                            long zza8 = (zza6 ^ (zzhef.zza(j9) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j11 = j4 + 10;
                                                if (zzhef.zza(j10) >= 0) {
                                                    j2 = zza8;
                                                    j6 = j11;
                                                }
                                            } else {
                                                j2 = zza8;
                                            }
                                        }
                                    }
                                    j6 = j10;
                                }
                                j2 = j3 ^ zza6;
                                j6 = j9;
                            }
                        }
                    }
                    j6 = j7;
                }
                this.zzm = j6;
                return j2;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzs() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzt() throws IOException {
        return zzhac.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final long zzu() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final zzgzs zzv() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j2 = this.zzo;
            long j3 = this.zzm;
            long j4 = zzp;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[zzp];
                zzhef.zzo(j3, bArr, 0L, j4);
                this.zzm += j4;
                return new zzgzq(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new zzgzq(bArr2);
        }
        if (zzp == 0) {
            return zzgzs.zzb;
        }
        if (zzp < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzw() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j2 = this.zzo;
            long j3 = this.zzm;
            long j4 = zzp;
            if (j4 <= j2 - j3) {
                byte[] bArr = new byte[zzp];
                zzhef.zzo(j3, bArr, 0L, j4);
                String str = new String(bArr, zzhbr.zza);
                this.zzm += j4;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzhbr.zza);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhac
    public final String zzx() throws IOException {
        int zzp = zzp();
        if (zzp > 0) {
            long j2 = this.zzo;
            long j3 = this.zzm;
            long j4 = zzp;
            if (j4 <= j2 - j3) {
                String zzg = zzhek.zzg(this.zzg, (int) (j3 - this.zzn), zzp);
                this.zzm += j4;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhek.zzh(bArr, 0, zzp);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp <= 0) {
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
        this.zzj = i2;
        zzL();
    }
}
