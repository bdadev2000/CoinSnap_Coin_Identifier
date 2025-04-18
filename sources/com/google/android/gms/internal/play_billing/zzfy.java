package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
final class zzfy {
    private static final zzfx zza;
    private static final zzfx zzb;

    static {
        zzfx zzfxVar;
        try {
            zzfxVar = (zzfx) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfxVar = null;
        }
        zza = zzfxVar;
        zzb = new zzfx();
    }

    public static zzfx zza() {
        return zza;
    }

    public static zzfx zzb() {
        return zzb;
    }
}
