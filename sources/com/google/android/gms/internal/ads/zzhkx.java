package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhkx {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static Object zzb(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void zzc(Object obj, Class cls) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
