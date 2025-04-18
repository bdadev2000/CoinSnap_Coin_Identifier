package com.google.android.gms.internal.play_billing;

import com.applovin.impl.adview.t;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzhe {
    private static final zzhe zza = new zzhe(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhe(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzhe zzc() {
        return zza;
    }

    public static zzhe zze(zzhe zzheVar, zzhe zzheVar2) {
        int i2 = zzheVar.zzb + zzheVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzheVar.zzc, i2);
        System.arraycopy(zzheVar2.zzc, 0, copyOf, zzheVar.zzb, zzheVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzheVar.zzd, i2);
        System.arraycopy(zzheVar2.zzd, 0, copyOf2, zzheVar.zzb, zzheVar2.zzb);
        return new zzhe(i2, copyOf, copyOf2, true);
    }

    public static zzhe zzf() {
        return new zzhe(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = (i3 / 2) + i3;
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhe)) {
            return false;
        }
        zzhe zzheVar = (zzhe) obj;
        int i2 = this.zzb;
        if (i2 == zzheVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzheVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzheVar.zzd;
                    int i4 = this.zzb;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = i2 + 527;
        int[] iArr = this.zzc;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = ((i3 * 31) + i5) * 31;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int zza() {
        int zzx;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    zzx = zzee.zzx(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzdw zzdwVar = (zzdw) this.zzd[i4];
                    int i9 = zzee.zzb;
                    int zzd = zzdwVar.zzd();
                    i3 = t.z(i8, zzee.zzx(zzd) + zzd, i3);
                } else if (i7 == 3) {
                    int i10 = i6 << 3;
                    int i11 = zzee.zzb;
                    int zza2 = ((zzhe) this.zzd[i4]).zza();
                    int zzx2 = zzee.zzx(i10);
                    zzx = zzx2 + zzx2 + zza2;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzff.zza());
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    zzx = zzee.zzx(i6 << 3) + 4;
                }
                i3 = zzx + i3;
            } else {
                i3 = t.z(i6 << 3, zzee.zzy(((Long) this.zzd[i4]).longValue()), i3);
            }
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4] >>> 3;
            zzdw zzdwVar = (zzdw) this.zzd[i4];
            int i6 = zzee.zzb;
            int zzd = zzdwVar.zzd();
            int zzx = zzee.zzx(zzd) + zzd;
            int zzx2 = zzee.zzx(16);
            int zzx3 = zzee.zzx(i5);
            int zzx4 = zzee.zzx(8);
            i3 += zzee.zzx(24) + zzx + zzx2 + zzx3 + zzx4 + zzx4;
        }
        this.zze = i3;
        return i3;
    }

    public final zzhe zzd(zzhe zzheVar) {
        if (zzheVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzheVar.zzb;
        zzl(i2);
        System.arraycopy(zzheVar.zzc, 0, this.zzc, this.zzb, zzheVar.zzb);
        System.arraycopy(zzheVar.zzd, 0, this.zzd, this.zzb, zzheVar.zzb);
        this.zzb = i2;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzge.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzj(int i2, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    public final void zzk(zzhv zzhvVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzhvVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzhvVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzhvVar.zzd(i5, (zzdw) obj);
                } else if (i4 == 3) {
                    zzhvVar.zzE(i5);
                    ((zzhe) obj).zzk(zzhvVar);
                    zzhvVar.zzh(i5);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzff.zza());
                    }
                    zzhvVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzhe() {
        this(0, new int[8], new Object[8], true);
    }
}
