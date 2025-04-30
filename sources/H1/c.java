package H1;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1349a = new Object();

    public static void a() {
        f1349a.getClass();
    }

    public static void b(String str) {
        f1349a.getClass();
        HashSet hashSet = b.f1348a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, null);
            hashSet.add(str);
        }
    }

    public static void c(String str, Throwable th) {
        f1349a.getClass();
        HashSet hashSet = b.f1348a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, th);
            hashSet.add(str);
        }
    }
}
