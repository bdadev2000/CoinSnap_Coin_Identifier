package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgdy implements Serializable {
    private static final zzgdy zza = new zzgdy(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgdy(int[] iArr, int i9, int i10) {
        this.zzb = iArr;
        this.zzc = i10;
    }

    public static zzgdy zzb(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgdy(copyOf, 0, copyOf.length);
    }

    public static zzgdy zzc() {
        return zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgdy)) {
            return false;
        }
        zzgdy zzgdyVar = (zzgdy) obj;
        if (this.zzc != zzgdyVar.zzc) {
            return false;
        }
        for (int i9 = 0; i9 < this.zzc; i9++) {
            if (zza(i9) != zzgdyVar.zza(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i9 = (i9 * 31) + this.zzb[i10];
        }
        return i9;
    }

    public final String toString() {
        int i9 = this.zzc;
        if (i9 != 0) {
            StringBuilder sb = new StringBuilder(i9 * 5);
            sb.append('[');
            sb.append(this.zzb[0]);
            for (int i10 = 1; i10 < this.zzc; i10++) {
                sb.append(", ");
                sb.append(this.zzb[i10]);
            }
            sb.append(']');
            return sb.toString();
        }
        return "[]";
    }

    public final int zza(int i9) {
        zzfyg.zza(i9, this.zzc, "index");
        return this.zzb[i9];
    }
}
