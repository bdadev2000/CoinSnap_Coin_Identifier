package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzfyu {
    private static final Object zza;

    static {
        Object zza2 = zza();
        zza = zza2;
        if (zza2 != null) {
            zzb("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (zza2 == null) {
            return;
        }
        zzc(zza2);
    }

    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzb(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzc(Object obj) {
        try {
            Method zzb = zzb("getStackTraceDepth", Throwable.class);
            if (zzb == null) {
                return null;
            }
            zzb.invoke(obj, new Throwable());
            return zzb;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
