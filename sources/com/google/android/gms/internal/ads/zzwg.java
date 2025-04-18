package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwg {
    private final zzek zza = new zzek(32);
    private zzwf zzb;
    private zzwf zzc;
    private zzwf zzd;
    private long zze;
    private final zzza zzf;

    public zzwg(zzza zzzaVar) {
        this.zzf = zzzaVar;
        zzwf zzwfVar = new zzwf(0L, 65536);
        this.zzb = zzwfVar;
        this.zzc = zzwfVar;
        this.zzd = zzwfVar;
    }

    private final int zzi(int i2) {
        zzwf zzwfVar = this.zzd;
        if (zzwfVar.zzc == null) {
            zzyt zzb = this.zzf.zzb();
            zzwf zzwfVar2 = new zzwf(this.zzd.zzb, 65536);
            zzwfVar.zzc = zzb;
            zzwfVar.zzd = zzwfVar2;
        }
        return Math.min(i2, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwf zzj(zzwf zzwfVar, long j2) {
        while (j2 >= zzwfVar.zzb) {
            zzwfVar = zzwfVar.zzd;
        }
        return zzwfVar;
    }

    private static zzwf zzk(zzwf zzwfVar, long j2, ByteBuffer byteBuffer, int i2) {
        zzwf zzj = zzj(zzwfVar, j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j2));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j2), min);
            i2 -= min;
            j2 += min;
            if (j2 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwf zzl(zzwf zzwfVar, long j2, byte[] bArr, int i2) {
        zzwf zzj = zzj(zzwfVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (zzj.zzb - j2));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j2), bArr, i2 - i3, min);
            i3 -= min;
            j2 += min;
            if (j2 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwf zzm(zzwf zzwfVar, zzhq zzhqVar, zzwi zzwiVar, zzek zzekVar) {
        zzwf zzwfVar2;
        if (zzhqVar.zzl()) {
            long j2 = zzwiVar.zzb;
            int i2 = 1;
            zzekVar.zzI(1);
            zzwf zzl = zzl(zzwfVar, j2, zzekVar.zzN(), 1);
            long j3 = j2 + 1;
            byte b2 = zzekVar.zzN()[0];
            int i3 = b2 & UnsignedBytes.MAX_POWER_OF_TWO;
            int i4 = b2 & Byte.MAX_VALUE;
            zzhn zzhnVar = zzhqVar.zzb;
            byte[] bArr = zzhnVar.zza;
            if (bArr == null) {
                zzhnVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z2 = i3 != 0;
            zzwfVar2 = zzl(zzl, j3, zzhnVar.zza, i4);
            long j4 = j3 + i4;
            if (z2) {
                zzekVar.zzI(2);
                zzwfVar2 = zzl(zzwfVar2, j4, zzekVar.zzN(), 2);
                j4 += 2;
                i2 = zzekVar.zzq();
            }
            int i5 = i2;
            int[] iArr = zzhnVar.zzd;
            if (iArr == null || iArr.length < i5) {
                iArr = new int[i5];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhnVar.zze;
            if (iArr3 == null || iArr3.length < i5) {
                iArr3 = new int[i5];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i6 = i5 * 6;
                zzekVar.zzI(i6);
                zzwfVar2 = zzl(zzwfVar2, j4, zzekVar.zzN(), i6);
                j4 += i6;
                zzekVar.zzL(0);
                for (int i7 = 0; i7 < i5; i7++) {
                    iArr2[i7] = zzekVar.zzq();
                    iArr4[i7] = zzekVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwiVar.zza - ((int) (j4 - zzwiVar.zzb));
            }
            zzaeg zzaegVar = zzwiVar.zzc;
            int i8 = zzeu.zza;
            zzhnVar.zzc(i5, iArr2, iArr4, zzaegVar.zzb, zzhnVar.zza, zzaegVar.zza, zzaegVar.zzc, zzaegVar.zzd);
            long j5 = zzwiVar.zzb;
            int i9 = (int) (j4 - j5);
            zzwiVar.zzb = j5 + i9;
            zzwiVar.zza -= i9;
        } else {
            zzwfVar2 = zzwfVar;
        }
        if (!zzhqVar.zze()) {
            zzhqVar.zzj(zzwiVar.zza);
            return zzk(zzwfVar2, zzwiVar.zzb, zzhqVar.zzc, zzwiVar.zza);
        }
        zzekVar.zzI(4);
        zzwf zzl2 = zzl(zzwfVar2, zzwiVar.zzb, zzekVar.zzN(), 4);
        int zzp = zzekVar.zzp();
        zzwiVar.zzb += 4;
        zzwiVar.zza -= 4;
        zzhqVar.zzj(zzp);
        zzwf zzk = zzk(zzl2, zzwiVar.zzb, zzhqVar.zzc, zzp);
        zzwiVar.zzb += zzp;
        int i10 = zzwiVar.zza - zzp;
        zzwiVar.zza = i10;
        ByteBuffer byteBuffer = zzhqVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            zzhqVar.zzf = ByteBuffer.allocate(i10);
        } else {
            zzhqVar.zzf.clear();
        }
        return zzk(zzk, zzwiVar.zzb, zzhqVar.zzf, zzwiVar.zza);
    }

    private final void zzn(int i2) {
        long j2 = this.zze + i2;
        this.zze = j2;
        zzwf zzwfVar = this.zzd;
        if (j2 == zzwfVar.zzb) {
            this.zzd = zzwfVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i2, boolean z2) throws IOException {
        int zzi = zzi(i2);
        zzwf zzwfVar = this.zzd;
        int zza = zzpVar.zza(zzwfVar.zzc.zza, zzwfVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j2) {
        zzwf zzwfVar;
        if (j2 != -1) {
            while (true) {
                zzwfVar = this.zzb;
                if (j2 < zzwfVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwfVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwfVar.zza) {
                this.zzc = zzwfVar;
            }
        }
    }

    public final void zzd(zzhq zzhqVar, zzwi zzwiVar) {
        zzm(this.zzc, zzhqVar, zzwiVar, this.zza);
    }

    public final void zze(zzhq zzhqVar, zzwi zzwiVar) {
        this.zzc = zzm(this.zzc, zzhqVar, zzwiVar, this.zza);
    }

    public final void zzf() {
        zzwf zzwfVar = this.zzb;
        if (zzwfVar.zzc != null) {
            this.zzf.zzd(zzwfVar);
            zzwfVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwf zzwfVar2 = this.zzb;
        this.zzc = zzwfVar2;
        this.zzd = zzwfVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzek zzekVar, int i2) {
        while (i2 > 0) {
            int zzi = zzi(i2);
            zzwf zzwfVar = this.zzd;
            zzekVar.zzH(zzwfVar.zzc.zza, zzwfVar.zza(this.zze), zzi);
            i2 -= zzi;
            zzn(zzi);
        }
    }
}
