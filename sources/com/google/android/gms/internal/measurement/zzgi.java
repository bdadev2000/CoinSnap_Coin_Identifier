package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public class zzgi {

    @Nullable
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzgi() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        if (zza() && !zzc(context)) {
            return false;
        }
        return true;
    }

    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgi.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zzd = zzd(context);
                if (zzd) {
                    zzb = zzd;
                }
                return zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzd(Context context) {
        boolean z8;
        boolean z9 = true;
        int i9 = 1;
        while (true) {
            z8 = false;
            if (i9 > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z9 = false;
                }
            } catch (NullPointerException e4) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e4);
                zza = null;
                i9++;
            }
        }
        z8 = z9;
        if (z8) {
            zza = null;
        }
        return z8;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }
}
