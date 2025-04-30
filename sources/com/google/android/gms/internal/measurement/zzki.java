package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzki implements zzkq {
    private zzkq[] zza;

    public zzki(zzkq... zzkqVarArr) {
        this.zza = zzkqVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final zzkr zza(Class<?> cls) {
        for (zzkq zzkqVar : this.zza) {
            if (zzkqVar.zzb(cls)) {
                return zzkqVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final boolean zzb(Class<?> cls) {
        for (zzkq zzkqVar : this.zza) {
            if (zzkqVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
