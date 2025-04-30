package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class zzya implements zzzg {
    protected final zzde zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzan[] zzd;
    private int zze;

    public zzya(zzde zzdeVar, int[] iArr, int i9) {
        boolean z8;
        int length = iArr.length;
        if (length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        zzdeVar.getClass();
        this.zza = zzdeVar;
        this.zzb = length;
        this.zzd = new zzan[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.zzd[i10] = zzdeVar.zzb(iArr[i10]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzan) obj2).zzj - ((zzan) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i11 = 0; i11 < this.zzb; i11++) {
            this.zzc[i11] = zzdeVar.zza(this.zzd[i11]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzya zzyaVar = (zzya) obj;
            if (this.zza.equals(zzyaVar.zza) && Arrays.equals(this.zzc, zzyaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zze;
        if (i9 == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zza(int i9) {
        return this.zzc[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zzb(int i9) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zzc[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzan zzd(int i9) {
        return this.zzd[i9];
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzde zze() {
        return this.zza;
    }
}
