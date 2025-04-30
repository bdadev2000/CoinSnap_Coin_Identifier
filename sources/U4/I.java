package U4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final long f3274a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static WakeLock f3275c;

    public static void a(Intent intent) {
        synchronized (b) {
            try {
                if (f3275c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f3275c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (b) {
            try {
                if (f3275c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f3275c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f3275c.acquire(f3274a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
