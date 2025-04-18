package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgzz implements zzhag {
    private final zzhag[] zza;

    public zzgzz(zzhag... zzhagVarArr) {
        this.zza = zzhagVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final zzhaf zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzhag zzhagVar = this.zza[i10];
            if (zzhagVar.zzc(cls)) {
                return zzhagVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
