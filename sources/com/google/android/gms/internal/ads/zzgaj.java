package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes4.dex */
final class zzgaj extends zzgam {
    public zzgaj() {
        super(null);
    }

    public static final zzgam zzf(int i2) {
        zzgam zzgamVar;
        zzgam zzgamVar2;
        zzgam zzgamVar3;
        if (i2 < 0) {
            zzgamVar3 = zzgam.zzb;
            return zzgamVar3;
        }
        if (i2 > 0) {
            zzgamVar2 = zzgam.zzc;
            return zzgamVar2;
        }
        zzgamVar = zzgam.zza;
        return zzgamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final zzgam zzb(int i2, int i3) {
        return zzf(Integer.compare(i2, i3));
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final zzgam zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final zzgam zzd(boolean z2, boolean z3) {
        return zzf(Boolean.compare(z2, z3));
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final zzgam zze(boolean z2, boolean z3) {
        return zzf(Boolean.compare(z3, z2));
    }
}
