package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.o;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzsh extends zzea {
    private int zze;
    private boolean zzf;
    private int zzg;
    private long zzh;
    private byte[] zzj;
    private byte[] zzm;
    private int zzi = 0;
    private int zzk = 0;
    private int zzl = 0;
    private zzdx zzd = zzdx.zza;

    public zzsh() {
        byte[] bArr = zzgd.zzf;
        this.zzj = bArr;
        this.zzm = bArr;
    }

    private final int zzq(int i9) {
        boolean z8 = true;
        int zzr = ((zzr(2000000L) - this.zzi) * this.zze) - (this.zzj.length >> 1);
        if (zzr < 0) {
            z8 = false;
        }
        zzeq.zzf(z8);
        int min = (int) Math.min((i9 * 0.2f) + 0.5f, zzr);
        int i10 = this.zze;
        return (min / i10) * i10;
    }

    private final int zzr(long j7) {
        return (int) ((j7 * this.zzd.zzb) / 1000000);
    }

    private static int zzs(byte b, byte b8) {
        return (b << 8) | (b8 & 255);
    }

    private final void zzt(boolean z8) {
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        int i11 = this.zzl;
        int length = this.zzj.length;
        boolean z11 = true;
        if (i11 != length) {
            if (z8) {
                z8 = true;
            } else {
                return;
            }
        }
        if (this.zzi == 0) {
            if (z8) {
                zzu(i11, 3);
                i10 = i11;
            } else {
                if (i11 >= (length >> 1)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzeq.zzf(z10);
                i10 = this.zzj.length >> 1;
                zzu(i10, 0);
            }
            i9 = i10;
        } else {
            int i12 = length >> 1;
            int i13 = i11 - i12;
            if (z8) {
                int zzq = zzq(i13) + (this.zzj.length >> 1);
                zzu(zzq, 2);
                int i14 = i12 + i13;
                i9 = zzq;
                i10 = i14;
            } else {
                int zzq2 = zzq(i13);
                zzu(zzq2, 1);
                i9 = zzq2;
                i10 = i13;
            }
        }
        if (i10 % this.zze == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zzg(z9, "bytesConsumed is not aligned to frame size: %s" + i10);
        if (i11 < i9) {
            z11 = false;
        }
        zzeq.zzf(z11);
        this.zzl -= i10;
        int i15 = this.zzk + i10;
        this.zzk = i15;
        this.zzk = i15 % this.zzj.length;
        this.zzi = (i9 / this.zze) + this.zzi;
        this.zzh += (i10 - i9) / r2;
    }

    private final void zzu(int i9, int i10) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i11;
        if (i9 == 0) {
            return;
        }
        boolean z11 = true;
        if (this.zzl >= i9) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        if (i10 == 2) {
            int i12 = this.zzk;
            int i13 = this.zzl;
            int i14 = i12 + i13;
            byte[] bArr = this.zzj;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i9, this.zzm, 0, i9);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i9) {
                    System.arraycopy(bArr, i15 - i9, this.zzm, 0, i9);
                } else {
                    int i16 = i9 - i15;
                    System.arraycopy(bArr, length - i16, this.zzm, 0, i16);
                    System.arraycopy(this.zzj, 0, this.zzm, i16, i15);
                }
            }
        } else {
            int i17 = this.zzk;
            int i18 = i17 + i9;
            byte[] bArr2 = this.zzj;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.zzm, 0, i9);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.zzm, 0, i19);
                System.arraycopy(this.zzj, 0, this.zzm, i19, i9 - i19);
            }
        }
        if (i9 % this.zze == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zze(z9, "sizeToOutput is not aligned to frame size: " + i9);
        if (this.zzk < this.zzj.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzeq.zzf(z10);
        byte[] bArr3 = this.zzm;
        int i20 = i9 % this.zze;
        String h6 = o.h(i9, "byteOutput size is not aligned to frame size ");
        if (i20 != 0) {
            z11 = false;
        }
        zzeq.zze(z11, h6);
        if (i10 != 3) {
            for (int i21 = 0; i21 < i9; i21 += 2) {
                int i22 = i21 + 1;
                int zzs = zzs(bArr3[i22], bArr3[i21]);
                if (i10 == 0) {
                    i11 = ((((i21 * 1000) / (i9 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i11 = 10;
                    if (i10 == 2) {
                        i11 = 10 + (((90000 * i21) / (i9 - 1)) / 1000);
                    }
                }
                int i23 = (zzs * i11) / 100;
                if (i23 >= 32767) {
                    bArr3[i21] = -1;
                    bArr3[i22] = Ascii.DEL;
                } else if (i23 <= -32768) {
                    bArr3[i21] = 0;
                    bArr3[i22] = Byte.MIN_VALUE;
                } else {
                    bArr3[i21] = (byte) (i23 & 255);
                    bArr3[i22] = (byte) (i23 >> 8);
                }
            }
        }
        zzj(i9).put(bArr3, 0, i9).flip();
    }

    private static final boolean zzv(byte b, byte b8) {
        if (Math.abs(zzs(b, b8)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zze(ByteBuffer byteBuffer) {
        boolean z8;
        int limit;
        int i9;
        boolean z9;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            boolean z10 = true;
            if (this.zzg != 0) {
                if (this.zzk < this.zzj.length) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zzeq.zzf(z8);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i10 = this.zze;
                            limit = (position2 / i10) * i10;
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i11 = this.zzk;
                int i12 = this.zzl;
                int i13 = i11 + i12;
                int length = this.zzj.length;
                if (i13 < length) {
                    i9 = length - i13;
                } else {
                    i13 = i12 - (length - i11);
                    i9 = i11 - i13;
                }
                int min = Math.min(position3, i9);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzj, i13, min);
                int i14 = this.zzl + min;
                this.zzl = i14;
                if (i14 <= this.zzj.length) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zzeq.zzf(z9);
                if (limit >= limit2 || position3 >= i9) {
                    z10 = false;
                }
                zzt(z10);
                if (z10) {
                    this.zzg = 0;
                    this.zzi = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzj.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (zzv(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i15 = this.zze;
                            position = ((limit4 / i15) * i15) + i15;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzg = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzea, com.google.android.gms.internal.ads.zzdz
    public final boolean zzg() {
        if (this.zzd.zzb != -1 && this.zzf) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdx zzi(zzdx zzdxVar) throws zzdy {
        if (zzdxVar.zzd == 2) {
            this.zzd = zzdxVar;
            int i9 = zzdxVar.zzc;
            this.zze = i9 + i9;
            return zzdxVar;
        }
        throw new zzdy("Unhandled input format:", zzdxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzk() {
        if (zzg()) {
            int zzr = zzr(100000L) / 2;
            int i9 = this.zze;
            int i10 = (zzr / i9) * i9;
            int i11 = i10 + i10;
            if (this.zzj.length != i11) {
                this.zzj = new byte[i11];
                this.zzm = new byte[i11];
            }
        }
        this.zzg = 0;
        this.zzh = 0L;
        this.zzi = 0;
        this.zzk = 0;
        this.zzl = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl() {
        if (this.zzl > 0) {
            zzt(true);
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzm() {
        this.zzf = false;
        this.zzd = zzdx.zza;
        byte[] bArr = zzgd.zzf;
        this.zzj = bArr;
        this.zzm = bArr;
    }

    public final long zzo() {
        return this.zzh;
    }

    public final void zzp(boolean z8) {
        this.zzf = z8;
    }
}
