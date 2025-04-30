package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhdl {
    private static final zzhdk zza;
    private static final zzhdk zzb;

    static {
        zzhdk zzhdkVar = null;
        try {
            zzhdkVar = (zzhdk) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzhdkVar;
        zzb = new zzhdk();
    }

    public static zzhdk zza() {
        return zza;
    }

    public static zzhdk zzb() {
        return zzb;
    }
}
