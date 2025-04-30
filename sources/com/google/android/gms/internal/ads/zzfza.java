package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class zzfza {
    private static final Object zza;
    private static final Method zzb;
    private static final Method zzc;

    static {
        Method zzb2;
        Object zza2 = zza();
        zza = zza2;
        Method method = null;
        if (zza2 == null) {
            zzb2 = null;
        } else {
            zzb2 = zzb("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        zzb = zzb2;
        if (zza2 != null) {
            method = zzc(zza2);
        }
        zzc = method;
    }

    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzb(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e4) {
            throw e4;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzc(Object obj) {
        try {
            Method zzb2 = zzb("getStackTraceDepth", Throwable.class);
            if (zzb2 == null) {
                return null;
            }
            zzb2.invoke(obj, new Throwable());
            return zzb2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
