package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfpx {
    private static UiModeManager zza;

    public static zzfop zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    return zzfop.OTHER;
                }
                return zzfop.CTV;
            }
            return zzfop.MOBILE;
        }
        return zzfop.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
