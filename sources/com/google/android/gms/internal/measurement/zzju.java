package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;

/* loaded from: classes3.dex */
final class zzju implements zzkz {
    private static final zzju zza = new zzju();

    private zzju() {
    }

    public static zzju zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb(Class<?> cls) {
        return zzjt.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final zzla zza(Class<?> cls) {
        if (zzjt.class.isAssignableFrom(cls)) {
            try {
                return (zzla) zzjt.zza(cls.asSubclass(zzjt.class)).zza(zzjt.zze.zzc, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
