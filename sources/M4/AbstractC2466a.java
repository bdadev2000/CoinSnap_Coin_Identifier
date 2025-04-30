package m4;

import G7.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import g4.C2296f;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2466a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f21753a;
    public static final Object b = new Object();

    public static final FirebaseAnalytics a() {
        if (f21753a == null) {
            synchronized (b) {
                if (f21753a == null) {
                    C2296f c9 = C2296f.c();
                    c9.a();
                    f21753a = FirebaseAnalytics.getInstance(c9.f20433a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f21753a;
        j.b(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
