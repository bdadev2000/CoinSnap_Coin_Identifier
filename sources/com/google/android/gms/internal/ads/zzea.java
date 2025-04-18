package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes3.dex */
public final class zzea {
    private static final Object zza = new Object();

    @Pure
    public static String zza(String str, @Nullable Throwable th) {
        String replace;
        if (th != null) {
            synchronized (zza) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
    }

    @Pure
    public static void zzb(@Size String str, String str2) {
        synchronized (zza) {
            Log.d(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzc(@Size String str, String str2) {
        synchronized (zza) {
            Log.e(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzd(@Size String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.e(str, zza(str2, th));
        }
    }

    @Pure
    public static void zze(@Size String str, String str2) {
        synchronized (zza) {
            Log.i(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzf(@Size String str, String str2) {
        synchronized (zza) {
            Log.w(str, zza(str2, null));
        }
    }

    @Pure
    public static void zzg(@Size String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.w(str, zza(str2, th));
        }
    }
}
