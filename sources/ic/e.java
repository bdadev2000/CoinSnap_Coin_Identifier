package ic;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(int i10, Resources resources) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!d2.a.z(resources.getDrawable(i10, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
