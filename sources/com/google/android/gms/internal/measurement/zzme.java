package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzme {
    private static final zzme zza = new zzme(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzme() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzme zzc() {
        return zza;
    }

    public static zzme zzd() {
        return new zzme();
    }

    private final void zzf() {
        if (this.zzf) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzme)) {
            return false;
        }
        zzme zzmeVar = (zzme) obj;
        int i9 = this.zzb;
        if (i9 == zzmeVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmeVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmeVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzb;
        int i10 = (i9 + 527) * 31;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i9; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public final int zza() {
        int zzg;
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                zzg = zzit.zzg(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 1) {
                zzg = zzit.zzc(i13, ((Long) this.zzd[i11]).longValue());
            } else if (i14 == 2) {
                zzg = zzit.zzc(i13, (zzia) this.zzd[i11]);
            } else if (i14 == 3) {
                i10 = ((zzme) this.zzd[i11]).zza() + (zzit.zzi(i13) << 1) + i10;
            } else if (i14 == 5) {
                zzg = zzit.zzf(i13, ((Integer) this.zzd[i11]).intValue());
            } else {
                throw new IllegalStateException(zzjs.zza());
            }
            i10 = zzg + i10;
        }
        this.zze = i10;
        return i10;
    }

    public final int zzb() {
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 += zzit.zzd(this.zzc[i11] >>> 3, (zzia) this.zzd[i11]);
        }
        this.zze = i10;
        return i10;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzme(int i9, int[] iArr, Object[] objArr, boolean z8) {
        this.zze = -1;
        this.zzb = i9;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z8;
    }

    public final void zzb(zzna zznaVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zznaVar.zza() == 1) {
            for (int i9 = 0; i9 < this.zzb; i9++) {
                zza(this.zzc[i9], this.zzd[i9], zznaVar);
            }
            return;
        }
        for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
            zza(this.zzc[i10], this.zzd[i10], zznaVar);
        }
    }

    public final zzme zza(zzme zzmeVar) {
        if (zzmeVar.equals(zza)) {
            return this;
        }
        zzf();
        int i9 = this.zzb + zzmeVar.zzb;
        zza(i9);
        System.arraycopy(zzmeVar.zzc, 0, this.zzc, this.zzb, zzmeVar.zzb);
        System.arraycopy(zzmeVar.zzd, 0, this.zzd, this.zzb, zzmeVar.zzb);
        this.zzb = i9;
        return this;
    }

    public static zzme zza(zzme zzmeVar, zzme zzmeVar2) {
        int i9 = zzmeVar.zzb + zzmeVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmeVar.zzc, i9);
        System.arraycopy(zzmeVar2.zzc, 0, copyOf, zzmeVar.zzb, zzmeVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmeVar.zzd, i9);
        System.arraycopy(zzmeVar2.zzd, 0, copyOf2, zzmeVar.zzb, zzmeVar2.zzb);
        return new zzme(i9, copyOf, copyOf2, true);
    }

    private final void zza(int i9) {
        int[] iArr = this.zzc;
        if (i9 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i9) {
                i9 = i11;
            }
            if (i9 < 8) {
                i9 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i9);
            this.zzd = Arrays.copyOf(this.zzd, i9);
        }
    }

    public final void zza(StringBuilder sb, int i9) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzku.zza(sb, i9, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zza(int i9, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i9;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zza(zzna zznaVar) throws IOException {
        if (zznaVar.zza() == 2) {
            for (int i9 = this.zzb - 1; i9 >= 0; i9--) {
                zznaVar.zza(this.zzc[i9] >>> 3, this.zzd[i9]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zznaVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    private static void zza(int i9, Object obj, zzna zznaVar) throws IOException {
        int i10 = i9 >>> 3;
        int i11 = i9 & 7;
        if (i11 == 0) {
            zznaVar.zzb(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 1) {
            zznaVar.zza(i10, ((Long) obj).longValue());
            return;
        }
        if (i11 == 2) {
            zznaVar.zza(i10, (zzia) obj);
            return;
        }
        if (i11 != 3) {
            if (i11 == 5) {
                zznaVar.zzb(i10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzjs.zza());
        }
        if (zznaVar.zza() == 1) {
            zznaVar.zzb(i10);
            ((zzme) obj).zzb(zznaVar);
            zznaVar.zza(i10);
        } else {
            zznaVar.zza(i10);
            ((zzme) obj).zzb(zznaVar);
            zznaVar.zzb(i10);
        }
    }
}
