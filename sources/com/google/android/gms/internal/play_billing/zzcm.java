package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class zzcm implements zzea {
    private static final zzcm zza = new zzcm();

    private zzcm() {
    }

    public static zzcm zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final zzdz zzb(Class cls) {
        if (zzcs.class.isAssignableFrom(cls)) {
            try {
                return (zzdz) zzcs.zzj(cls.asSubclass(zzcs.class)).zzx(3, null, null);
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final boolean zzc(Class cls) {
        return zzcs.class.isAssignableFrom(cls);
    }
}
