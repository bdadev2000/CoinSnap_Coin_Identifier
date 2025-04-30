package O2;

import G7.j;
import L2.b;
import com.facebook.N;
import com.facebook.appevents.g;
import com.facebook.appevents.i;
import com.facebook.r;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f2156a = Collections.newSetFromMap(new WeakHashMap());
    public static boolean b;

    public static final void a(Object obj, Throwable th) {
        j.e(obj, "o");
        if (!b) {
            return;
        }
        f2156a.add(obj);
        r rVar = r.f13801a;
        if (N.b()) {
            g.h(th);
            i.c(th, b.f1713g).b();
        }
    }

    public static final boolean b(Object obj) {
        j.e(obj, "o");
        return f2156a.contains(obj);
    }
}
