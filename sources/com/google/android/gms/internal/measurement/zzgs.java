package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class zzgs {

    @Nullable
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzgs() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgs.class) {
            if (zzb) {
                return true;
            }
            boolean zzd = zzd(context);
            if (zzd) {
                zzb = zzd;
            }
            return zzd;
        }
    }

    @RequiresApi(24)
    @TargetApi(24)
    private static boolean zzd(Context context) {
        boolean z10;
        boolean z11 = true;
        int i10 = 1;
        while (true) {
            z10 = false;
            if (i10 > 2) {
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
                    z11 = false;
                }
            } catch (NullPointerException e2) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                zza = null;
                i10++;
            }
        }
        z10 = z11;
        if (z10) {
            zza = null;
        }
        return z10;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }
}
