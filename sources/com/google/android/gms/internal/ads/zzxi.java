package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzxi {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzxi(int i9) {
        this(0, new Random());
    }

    public final int zza() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int zzb() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length <= 0) {
            return -1;
        }
        return iArr[length - 1];
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int i9) {
        int i10 = this.zzc[i9] + 1;
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int zze(int i9) {
        int i10 = this.zzc[i9] - 1;
        if (i10 < 0) {
            return -1;
        }
        return this.zzb[i10];
    }

    public final zzxi zzf() {
        return new zzxi(0, new Random(this.zza.nextLong()));
    }

    public final zzxi zzg(int i9, int i10) {
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int i11 = 0;
        int i12 = 0;
        while (i12 < i10) {
            iArr[i12] = this.zza.nextInt(this.zzb.length + 1);
            int i13 = i12 + 1;
            int nextInt = this.zza.nextInt(i13);
            iArr2[i12] = iArr2[nextInt];
            iArr2[nextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.zzb.length + i10];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr4 = this.zzb;
            if (i11 < iArr4.length + i10) {
                if (i14 < i10 && i15 == iArr[i14]) {
                    iArr3[i11] = iArr2[i14];
                    i14++;
                } else {
                    int i16 = i15 + 1;
                    int i17 = iArr4[i15];
                    iArr3[i11] = i17;
                    if (i17 >= 0) {
                        iArr3[i11] = i17 + i10;
                    }
                    i15 = i16;
                }
                i11++;
            } else {
                return new zzxi(iArr3, new Random(this.zza.nextLong()));
            }
        }
    }

    public final zzxi zzh(int i9, int i10) {
        int[] iArr = new int[this.zzb.length - i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.zzb;
            if (i11 < iArr2.length) {
                int i13 = iArr2[i11];
                if (i13 >= 0 && i13 < i10) {
                    i12++;
                } else {
                    int i14 = i11 - i12;
                    if (i13 >= 0) {
                        i13 -= i10;
                    }
                    iArr[i14] = i13;
                }
                i11++;
            } else {
                return new zzxi(iArr, new Random(this.zza.nextLong()));
            }
        }
    }

    private zzxi(int i9, Random random) {
        this(new int[0], random);
    }

    private zzxi(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.zzc[iArr[i9]] = i9;
        }
    }
}
