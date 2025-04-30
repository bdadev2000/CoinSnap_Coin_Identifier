package com.google.android.gms.internal.ads;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzarq {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable(zza, 2);
    private static final String zzc = zzarq.class.getName();

    public static void zza(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzb(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzc(Throwable th, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th);
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
        int i9 = 2;
        while (true) {
            if (i9 < stackTrace.length) {
                if (!stackTrace[i9].getClassName().equals(zzc)) {
                    String className = stackTrace[i9].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = o.k(substring.substring(substring.lastIndexOf(36) + 1), ".", stackTrace[i9].getMethodName());
                    break;
                }
                i9++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(str2);
        return AbstractC2914a.h(sb, ": ", format);
    }
}
