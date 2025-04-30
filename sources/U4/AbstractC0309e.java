package U4;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: U4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0309e {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f3298a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i9) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!H1.a.z(resources.getDrawable(i9, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i9);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i9 + ", treating it as an invalid icon");
            return false;
        }
    }
}
