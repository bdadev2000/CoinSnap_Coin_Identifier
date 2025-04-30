package z2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C1849l;
import com.vungle.ads.L;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final c f24519f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static g f24520g;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f24521a = new Handler(Looper.getMainLooper());
    public final Set b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f24522c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f24523d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f24524e;

    public g() {
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        G7.j.d(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.b = newSetFromMap;
        this.f24522c = new LinkedHashSet();
        this.f24523d = new HashSet();
        this.f24524e = new HashMap();
    }

    public final void a(Activity activity) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(activity, "activity");
            if (G7.j.a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.b.add(activity);
                this.f24523d.clear();
                HashSet hashSet = (HashSet) this.f24524e.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.f24523d = hashSet;
                }
                if (!O2.a.b(this)) {
                    try {
                        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                            b();
                        } else {
                            this.f24521a.post(new L(this, 14));
                        }
                        return;
                    } catch (Throwable th) {
                        O2.a.a(this, th);
                        return;
                    }
                }
                return;
            }
            throw new C1849l("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    public final void b() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.b) {
                if (activity != null) {
                    this.f24522c.add(new f(E2.e.b(activity), this.f24521a, this.f24523d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void c(Activity activity) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(activity, "activity");
            if (G7.j.a(null, Boolean.TRUE)) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.b.remove(activity);
                this.f24522c.clear();
                this.f24524e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f24523d.clone());
                this.f24523d.clear();
                return;
            }
            throw new C1849l("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
