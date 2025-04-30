package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbh implements zzhdc {
    private static final zzhbh zza = new zzhbh();

    private zzhbh() {
    }

    public static zzhbh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final zzhdb zzb(Class cls) {
        if (zzhbo.class.isAssignableFrom(cls)) {
            try {
                return (zzhdb) zzhbo.zzbh(cls.asSubclass(zzhbo.class)).zzbN();
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final boolean zzc(Class cls) {
        return zzhbo.class.isAssignableFrom(cls);
    }
}
