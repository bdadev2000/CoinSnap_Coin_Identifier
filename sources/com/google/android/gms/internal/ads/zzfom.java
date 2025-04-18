package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfom {
    private static UiModeManager zza;

    public static zzfnc zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType != 1) {
                if (currentModeType != 4) {
                    return zzfnc.OTHER;
                }
                return zzfnc.CTV;
            }
            return zzfnc.MOBILE;
        }
        return zzfnc.OTHER;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
