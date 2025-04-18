package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class zzej {
    private static final zzei zza;
    private static final zzei zzb;

    static {
        zzei zzeiVar;
        try {
            zzeiVar = (zzei) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzeiVar = null;
        }
        zza = zzeiVar;
        zzb = new zzei();
    }

    public static zzei zza() {
        return zza;
    }

    public static zzei zzb() {
        return zzb;
    }
}
