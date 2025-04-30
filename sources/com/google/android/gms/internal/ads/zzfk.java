package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.UnknownHostException;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzfk {
    private static final Object zza = new Object();
    private static final zzfj zzb = zzfj.zza;

    public static String zza(String str, @Nullable Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (zza) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return AbstractC2914a.f(str, "\n  ", replace.replace("\n", "\n  "), "\n");
        }
        return str;
    }

    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.d(str, zza(str2, null));
        }
    }

    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zza(str2, null));
        }
    }

    public static void zzd(String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.e(str, zza(str2, th));
        }
    }

    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zza(str2, null));
        }
    }

    public static void zzf(String str, String str2) {
        synchronized (zza) {
            Log.w(str, zza(str2, null));
        }
    }

    public static void zzg(String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.w(str, zza(str2, th));
        }
    }
}
