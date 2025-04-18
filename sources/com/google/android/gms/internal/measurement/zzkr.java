package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkr implements zzkz {
    private zzkz[] zza;

    public zzkr(zzkz... zzkzVarArr) {
        this.zza = zzkzVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final zzla zza(Class<?> cls) {
        for (zzkz zzkzVar : this.zza) {
            if (zzkzVar.zzb(cls)) {
                return zzkzVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb(Class<?> cls) {
        for (zzkz zzkzVar : this.zza) {
            if (zzkzVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
