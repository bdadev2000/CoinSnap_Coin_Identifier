package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes4.dex */
public final class zzfpw {
    private static UiModeManager zza;

    public static zzfoo zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfoo.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfoo.OTHER : zzfoo.CTV : zzfoo.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
