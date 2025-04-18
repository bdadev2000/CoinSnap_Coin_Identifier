package s7;

import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class p0 {
    public static final HashSet a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f24651b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (p0.class) {
            if (a.add(str)) {
                f24651b += ", " + str;
            }
        }
    }
}
