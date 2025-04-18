package m6;

import com.bumptech.glide.e;
import com.facebook.u0;
import com.facebook.x;
import j6.c;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21628b;

    public static final void a(Object o10, Throwable th2) {
        Intrinsics.checkNotNullParameter(o10, "o");
        if (!f21628b) {
            return;
        }
        a.add(o10);
        x xVar = x.a;
        if (u0.b()) {
            e.w(th2);
            j6.a t5 = j6.a.CrashShield;
            Intrinsics.checkNotNullParameter(t5, "t");
            new c(th2, t5).c();
        }
    }

    public static final boolean b(Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        return a.contains(o10);
    }
}
