package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class zzxh implements zzyl {
    protected final zzcd zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzaf[] zzd;
    private int zze;

    public zzxh(zzcd zzcdVar, int[] iArr, int i2) {
        int length = iArr.length;
        zzdi.zzf(length > 0);
        zzcdVar.getClass();
        this.zza = zzcdVar;
        this.zzb = length;
        this.zzd = new zzaf[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.zzd[i3] = zzcdVar.zzb(iArr[i3]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzaf) obj2).zzi - ((zzaf) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i4 = 0; i4 < this.zzb; i4++) {
            this.zzc[i4] = zzcdVar.zza(this.zzd[i4]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxh zzxhVar = (zzxh) obj;
            if (this.zza.equals(zzxhVar.zza) && Arrays.equals(this.zzc, zzxhVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zza(int i2) {
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb(int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            if (this.zzc[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzaf zzd(int i2) {
        return this.zzd[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzcd zze() {
        return this.zza;
    }
}
