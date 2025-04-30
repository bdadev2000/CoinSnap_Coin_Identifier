package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class zzdp {
    public static Object zza(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void zzb(Object obj, Class cls) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
