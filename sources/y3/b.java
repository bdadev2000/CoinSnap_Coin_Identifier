package y3;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b {
    public static final a a = new a();

    public static void a() {
        a.getClass();
    }

    public static void b(String str) {
        a.getClass();
        HashSet hashSet = a.a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, null);
            hashSet.add(str);
        }
    }

    public static void c(String str, Throwable th2) {
        a.getClass();
        HashSet hashSet = a.a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, th2);
            hashSet.add(str);
        }
    }
}
