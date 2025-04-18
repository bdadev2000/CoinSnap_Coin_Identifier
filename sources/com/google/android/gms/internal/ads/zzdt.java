package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public final class zzdt {
    private static final Object zza = new Object();

    public static String zza(String str, @Nullable Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (zza) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 != null) {
                        if (th3 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th3 = th3.getCause();
                    } else {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
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

    public static void zzd(String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.e(str, zza(str2, th2));
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

    public static void zzg(String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.w(str, zza(str2, th2));
        }
    }
}
