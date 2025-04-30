package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhda {
    private static final zzhcz zza;
    private static final zzhcz zzb;

    static {
        zzhcz zzhczVar = null;
        try {
            zzhczVar = (zzhcz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzhczVar;
        zzb = new zzhcz();
    }

    public static zzhcz zza() {
        return zza;
    }

    public static zzhcz zzb() {
        return zzb;
    }
}
