package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbb {
    private static final zzhaz zza = new zzhba();
    private static final zzhaz zzb;

    static {
        zzhaz zzhazVar = null;
        try {
            zzhazVar = (zzhaz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzhazVar;
    }

    public static zzhaz zza() {
        zzhaz zzhazVar = zzb;
        if (zzhazVar != null) {
            return zzhazVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzhaz zzb() {
        return zza;
    }
}
