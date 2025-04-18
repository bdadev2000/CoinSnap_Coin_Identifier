package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class zzxa implements zzyd {
    protected final zzbw zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzad[] zzd;
    private int zze;

    public zzxa(zzbw zzbwVar, int[] iArr, int i10) {
        boolean z10;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzbwVar.getClass();
        this.zza = zzbwVar;
        this.zzb = length;
        this.zzd = new zzad[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzbwVar.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzad) obj2).zzj - ((zzad) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzbwVar.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxa zzxaVar = (zzxa) obj;
            if (this.zza.equals(zzxaVar.zza) && Arrays.equals(this.zzc, zzxaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zza(int i10) {
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzad zzd(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzbw zze() {
        return this.zza;
    }
}
