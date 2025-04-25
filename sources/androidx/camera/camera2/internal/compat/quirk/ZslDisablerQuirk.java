package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class ZslDisablerQuirk implements Quirk {
    private static final List<String> AFFECTED_SAMSUNG_MODEL = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");
    private static final List<String> AFFECTED_XIAOMI_MODEL = Arrays.asList("MI 8");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isAffectedSamsungDevices() || isAffectedXiaoMiDevices();
    }

    private static boolean isAffectedSamsungDevices() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_SAMSUNG_MODEL);
    }

    private static boolean isAffectedXiaoMiDevices() {
        return Constants.REFERRER_API_XIAOMI.equalsIgnoreCase(Build.BRAND) && isAffectedModel(AFFECTED_XIAOMI_MODEL);
    }

    private static boolean isAffectedModel(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }
}
