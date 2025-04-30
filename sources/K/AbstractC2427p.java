package k;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2427p {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
