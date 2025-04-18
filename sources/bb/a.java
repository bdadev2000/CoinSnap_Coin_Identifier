package bb;

import com.google.firebase.analytics.FirebaseAnalytics;
import e6.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static volatile FirebaseAnalytics a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2410b = new Object();

    public static final FirebaseAnalytics a() {
        g gVar = g.f17132d;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (a == null) {
            synchronized (f2410b) {
                if (a == null) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    va.g c10 = va.g.c();
                    Intrinsics.checkNotNullExpressionValue(c10, "getInstance()");
                    c10.a();
                    a = FirebaseAnalytics.getInstance(c10.a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = a;
        Intrinsics.checkNotNull(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
