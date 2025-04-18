package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhcg implements zzhcn {
    private final zzhcn[] zza;

    public zzhcg(zzhcn... zzhcnVarArr) {
        this.zza = zzhcnVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhcn
    public final zzhcm zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzhcn zzhcnVar = this.zza[i2];
            if (zzhcnVar.zzc(cls)) {
                return zzhcnVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhcn
    public final boolean zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
