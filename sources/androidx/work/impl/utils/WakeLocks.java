package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.platform.j;
import androidx.work.Logger;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes3.dex */
public class WakeLocks {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22208a = Logger.e("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f22209b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String b2 = j.b("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, b2);
        WeakHashMap weakHashMap = f22209b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, b2);
        }
        return newWakeLock;
    }
}
