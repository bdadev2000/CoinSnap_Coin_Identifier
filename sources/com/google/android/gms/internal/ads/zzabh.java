package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
final class zzabh {
    public static boolean zza(Context context) {
        Display display;
        boolean isHdr;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null) {
            isHdr = display.isHdr();
            if (!isHdr) {
                return false;
            }
            for (int i9 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i9 == 1) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
