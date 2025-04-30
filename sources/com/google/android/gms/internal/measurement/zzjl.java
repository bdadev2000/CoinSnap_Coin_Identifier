package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;

/* loaded from: classes2.dex */
final class zzjl implements zzkq {
    private static final zzjl zza = new zzjl();

    private zzjl() {
    }

    public static zzjl zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final boolean zzb(Class<?> cls) {
        return zzjk.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final zzkr zza(Class<?> cls) {
        if (zzjk.class.isAssignableFrom(cls)) {
            try {
                return (zzkr) zzjk.zza(cls.asSubclass(zzjk.class)).zza(zzjk.zze.zzc, (Object) null, (Object) null);
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
