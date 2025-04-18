package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgyq implements zzhag {
    private static final zzgyq zza = new zzgyq();

    private zzgyq() {
    }

    public static zzgyq zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final zzhaf zzb(Class cls) {
        if (zzgyx.class.isAssignableFrom(cls)) {
            try {
                return (zzhaf) zzgyx.zzbh(cls.asSubclass(zzgyx.class)).zzbO();
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    public final boolean zzc(Class cls) {
        return zzgyx.class.isAssignableFrom(cls);
    }
}
