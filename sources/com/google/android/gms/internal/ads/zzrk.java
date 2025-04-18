package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzrk extends zzcu {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzrk() {
        byte[] bArr = zzeu.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i2) {
        int zzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzdi.zzf(zzr >= 0);
        int min = (int) Math.min((i2 * 0.2f) + 0.5f, zzr);
        int i3 = this.zzd;
        return (min / i3) * i3;
    }

    private final int zzr(long j2) {
        return (int) ((j2 * this.zzb.zzb) / 1000000);
    }

    private static int zzs(byte b2, byte b3) {
        return (b2 << 8) | (b3 & UnsignedBytes.MAX_VALUE);
    }

    private final void zzt(boolean z2) {
        int i2;
        int i3;
        int i4 = this.zzk;
        int length = this.zzi.length;
        if (i4 != length) {
            if (!z2) {
                return;
            } else {
                z2 = true;
            }
        }
        if (this.zzh == 0) {
            if (z2) {
                zzu(i4, 3);
                i3 = i4;
            } else {
                zzdi.zzf(i4 >= (length >> 1));
                i3 = this.zzi.length >> 1;
                zzu(i3, 0);
            }
            i2 = i3;
        } else {
            int i5 = length >> 1;
            int i6 = i4 - i5;
            if (z2) {
                int zzq = zzq(i6) + (this.zzi.length >> 1);
                zzu(zzq, 2);
                int i7 = i5 + i6;
                i2 = zzq;
                i3 = i7;
            } else {
                int zzq2 = zzq(i6);
                zzu(zzq2, 1);
                i2 = zzq2;
                i3 = i6;
            }
        }
        zzdi.zzg(i3 % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + i3);
        zzdi.zzf(i4 >= i2);
        this.zzk -= i3;
        int i8 = this.zzj + i3;
        this.zzj = i8;
        this.zzj = i8 % this.zzi.length;
        this.zzh = (i2 / this.zzd) + this.zzh;
        this.zzg += (i3 - i2) / r2;
    }

    private final void zzu(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            return;
        }
        zzdi.zzd(this.zzk >= i2);
        if (i3 == 2) {
            int i5 = this.zzj;
            int i6 = this.zzk;
            int i7 = i5 + i6;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i7 <= length) {
                System.arraycopy(bArr, i7 - i2, this.zzl, 0, i2);
            } else {
                int i8 = i6 - (length - i5);
                if (i8 >= i2) {
                    System.arraycopy(bArr, i8 - i2, this.zzl, 0, i2);
                } else {
                    int i9 = i2 - i8;
                    System.arraycopy(bArr, length - i9, this.zzl, 0, i9);
                    System.arraycopy(this.zzi, 0, this.zzl, i9, i8);
                }
            }
        } else {
            int i10 = this.zzj;
            int i11 = i10 + i2;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i11 <= length2) {
                System.arraycopy(bArr2, i10, this.zzl, 0, i2);
            } else {
                int i12 = length2 - i10;
                System.arraycopy(bArr2, i10, this.zzl, 0, i12);
                System.arraycopy(this.zzi, 0, this.zzl, i12, i2 - i12);
            }
        }
        zzdi.zze(i2 % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + i2);
        zzdi.zzf(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzdi.zze(i2 % this.zzd == 0, d.i("byteOutput size is not aligned to frame size ", i2));
        if (i3 != 3) {
            for (int i13 = 0; i13 < i2; i13 += 2) {
                int i14 = i13 + 1;
                int zzs = zzs(bArr3[i14], bArr3[i13]);
                if (i3 == 0) {
                    i4 = ((((i13 * 1000) / (i2 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i4 = 10;
                    if (i3 == 2) {
                        i4 = 10 + (((90000 * i13) / (i2 - 1)) / 1000);
                    }
                }
                int i15 = (zzs * i4) / 100;
                if (i15 >= 32767) {
                    bArr3[i13] = -1;
                    bArr3[i14] = Byte.MAX_VALUE;
                } else if (i15 <= -32768) {
                    bArr3[i13] = 0;
                    bArr3[i14] = UnsignedBytes.MAX_POWER_OF_TWO;
                } else {
                    bArr3[i13] = (byte) (i15 & 255);
                    bArr3[i14] = (byte) (i15 >> 8);
                }
            }
        }
        zzj(i2).put(bArr3, 0, i2).flip();
    }

    private static final boolean zzv(byte b2, byte b3) {
        return Math.abs(zzs(b2, b3)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        int limit;
        int i2;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            if (this.zzf != 0) {
                zzdi.zzf(this.zzj < this.zzi.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i3 = this.zzd;
                            limit = (position2 / i3) * i3;
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i4 = this.zzj;
                int i5 = this.zzk;
                int i6 = i4 + i5;
                int length = this.zzi.length;
                if (i6 < length) {
                    i2 = length - i6;
                } else {
                    i6 = i5 - (length - i4);
                    i2 = i4 - i6;
                }
                int min = Math.min(position3, i2);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i6, min);
                int i7 = this.zzk + min;
                this.zzk = i7;
                zzdi.zzf(i7 <= this.zzi.length);
                boolean z2 = limit < limit2 && position3 < i2;
                zzt(z2);
                if (z2) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i8 = this.zzd;
                            position = ((limit4 / i8) * i8) + i8;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) throws zzcs {
        if (zzcrVar.zzd == 2) {
            return zzcrVar.zzb == -1 ? zzcr.zza : zzcrVar;
        }
        throw new zzcs("Unhandled input format:", zzcrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
        if (zzg()) {
            int i2 = this.zzb.zzc;
            this.zzd = i2 + i2;
            int zzr = zzr(100000L) / 2;
            int i3 = this.zzd;
            int i4 = (zzr / i3) * i3;
            int i5 = i4 + i4;
            if (this.zzi.length != i5) {
                this.zzi = new byte[i5];
                this.zzl = new byte[i5];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzeu.zzf;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z2) {
        this.zze = z2;
    }
}
