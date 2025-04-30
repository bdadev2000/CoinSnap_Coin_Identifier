package T;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class J0 {
    public static /* bridge */ /* synthetic */ int b(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason();
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo f(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ List p(ActivityManager activityManager, String str) {
        return activityManager.getHistoricalProcessExitReasons(str, 0, 1);
    }
}
