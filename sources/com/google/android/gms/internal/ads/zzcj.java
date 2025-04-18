package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcj {
    public final int zza;
    private final zzcd zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzcj(zzcd zzcdVar, boolean z2, int[] iArr, boolean[] zArr) {
        int i2 = zzcdVar.zza;
        this.zza = i2;
        zzdi.zzd(i2 == iArr.length && i2 == zArr.length);
        this.zzb = zzcdVar;
        this.zzc = z2 && i2 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcj.class == obj.getClass()) {
            zzcj zzcjVar = (zzcj) obj;
            if (this.zzc == zzcjVar.zzc && this.zzb.equals(zzcjVar.zzb) && Arrays.equals(this.zzd, zzcjVar.zzd) && Arrays.equals(this.zze, zzcjVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int hashCode2 = Arrays.hashCode(iArr) + ((hashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (hashCode2 * 31);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzaf zzb(int i2) {
        return this.zzb.zzb(i2);
    }

    public final boolean zzc() {
        for (boolean z2 : this.zze) {
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i2) {
        return this.zze[i2];
    }
}
