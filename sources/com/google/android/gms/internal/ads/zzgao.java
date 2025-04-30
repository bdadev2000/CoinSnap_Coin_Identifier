package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzgao extends zzgar {
    public zzgao() {
        super(null);
    }

    public static final zzgar zzg(int i9) {
        zzgar zzgarVar;
        zzgar zzgarVar2;
        zzgar zzgarVar3;
        if (i9 < 0) {
            zzgarVar3 = zzgar.zzb;
            return zzgarVar3;
        }
        if (i9 > 0) {
            zzgarVar2 = zzgar.zzc;
            return zzgarVar2;
        }
        zzgarVar = zzgar.zza;
        return zzgarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgar zzb(int i9, int i10) {
        return zzg(i9 < i10 ? -1 : i9 > i10 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgar zzc(long j7, long j9) {
        return zzg(j7 < j9 ? -1 : j7 > j9 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgar zzd(Object obj, Object obj2, Comparator comparator) {
        return zzg(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgar zze(boolean z8, boolean z9) {
        return zzg(zzgdw.zza(z8, z9));
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgar zzf(boolean z8, boolean z9) {
        return zzg(zzgdw.zza(z9, z8));
    }
}
