package v2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k {
    public static final String a = androidx.work.p.g("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f25994b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String e2 = vd.e.e("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, e2);
        WeakHashMap weakHashMap = f25994b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, e2);
        }
        return newWakeLock;
    }
}
