package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.facebook.internal.ServerProtocol;

@RequiresApi
/* loaded from: classes3.dex */
final class zzaaq {
    @DoNotInline
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i2 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i2 == 1) {
                return true;
            }
        }
        return false;
    }
}
