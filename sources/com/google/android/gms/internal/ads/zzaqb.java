package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzaqb {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable(zza, 2);
    private static final String zzc = zzaqb.class.getName();

    public static void zza(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzb(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzc(Throwable th2, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th2);
    }

    public static void zzd(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, zze(str, objArr));
        }
    }

    private static String zze(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 < stackTrace.length) {
                if (!stackTrace[i10].getClassName().equals(zzc)) {
                    String className = stackTrace[i10].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(substring.substring(substring.lastIndexOf(36) + 1), ".", stackTrace[i10].getMethodName());
                    break;
                }
                i10++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
