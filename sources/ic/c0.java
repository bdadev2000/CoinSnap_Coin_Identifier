package ic;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class c0 {
    public static final long a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f19533b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static WakeLock f19534c;

    public static void a(Intent intent) {
        synchronized (f19533b) {
            if (f19534c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f19534c.release();
            }
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        synchronized (f19533b) {
            if (f19534c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f19534c = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f19534c.acquire(a);
            }
            return startService;
        }
    }
}
