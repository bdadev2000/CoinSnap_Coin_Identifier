package x5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.q;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final com.facebook.b f27387f = new com.facebook.b(20, 0);

    /* renamed from: g, reason: collision with root package name */
    public static g f27388g;
    public final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final Set f27389b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f27390c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f27391d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f27392e;

    public g() {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f27389b = newSetFromMap;
        this.f27390c = new LinkedHashSet();
        this.f27391d = new HashSet();
        this.f27392e = new HashMap();
    }

    public final void a(Activity activity) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.areEqual((Object) null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f27389b.add(activity);
                this.f27391d.clear();
                HashSet hashSet = (HashSet) this.f27392e.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.f27391d = hashSet;
                }
                if (!m6.a.b(this)) {
                    try {
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            b();
                        } else {
                            this.a.post(new androidx.activity.d(this, 20));
                        }
                        return;
                    } catch (Throwable th2) {
                        m6.a.a(this, th2);
                        return;
                    }
                }
                return;
            }
            throw new q("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    public final void b() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f27389b) {
                if (activity != null) {
                    View q10 = c6.c.q(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.a;
                    HashSet hashSet = this.f27391d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.f27390c.add(new f(q10, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Intrinsics.areEqual((Object) null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f27389b.remove(activity);
                this.f27390c.clear();
                this.f27392e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f27391d.clone());
                this.f27391d.clear();
                return;
            }
            throw new q("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
