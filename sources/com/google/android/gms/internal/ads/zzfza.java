package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzfza extends zzfzd {
    public zzfza() {
        super(null);
    }

    public static final zzfzd zzf(int i10) {
        zzfzd zzfzdVar;
        zzfzd zzfzdVar2;
        zzfzd zzfzdVar3;
        if (i10 < 0) {
            zzfzdVar3 = zzfzd.zzb;
            return zzfzdVar3;
        }
        if (i10 > 0) {
            zzfzdVar2 = zzfzd.zzc;
            return zzfzdVar2;
        }
        zzfzdVar = zzfzd.zza;
        return zzfzdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final zzfzd zze(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }
}
