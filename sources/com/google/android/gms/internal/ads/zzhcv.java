package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhcv implements zzhdc {
    private final zzhdc[] zza;

    public zzhcv(zzhdc... zzhdcVarArr) {
        this.zza = zzhdcVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final zzhdb zzb(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            zzhdc zzhdcVar = this.zza[i9];
            if (zzhdcVar.zzc(cls)) {
                return zzhdcVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final boolean zzc(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            if (this.zza[i9].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
