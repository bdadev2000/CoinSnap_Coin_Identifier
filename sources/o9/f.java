package o9;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes3.dex */
public abstract class f {
    public static boolean a(Context context) {
        Display display;
        boolean isHdr;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            return false;
        }
        isHdr = display.isHdr();
        if (!isHdr) {
            return false;
        }
        for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }
}
