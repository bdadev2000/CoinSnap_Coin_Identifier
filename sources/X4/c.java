package X4;

import a5.C0397a;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.core.app.C0414o;
import androidx.fragment.app.AbstractC0464g0;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.v1.TraceMetric;
import g5.C2303f;
import h5.AbstractC2327h;
import h5.C2323d;
import h5.i;
import i5.EnumC2355j;
import i5.J;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: t, reason: collision with root package name */
    public static final C0397a f3676t = C0397a.d();

    /* renamed from: u, reason: collision with root package name */
    public static volatile c f3677u;
    public final WeakHashMap b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f3678c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f3679d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f3680f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3681g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f3682h;

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f3683i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f3684j;

    /* renamed from: k, reason: collision with root package name */
    public final C2303f f3685k;
    public final Y4.a l;
    public final R3.e m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3686n;

    /* renamed from: o, reason: collision with root package name */
    public i f3687o;

    /* renamed from: p, reason: collision with root package name */
    public i f3688p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC2355j f3689q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3690r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3691s;

    public c(C2303f c2303f, R3.e eVar) {
        Y4.a e4 = Y4.a.e();
        C0397a c0397a = f.f3697e;
        this.b = new WeakHashMap();
        this.f3678c = new WeakHashMap();
        this.f3679d = new WeakHashMap();
        this.f3680f = new WeakHashMap();
        this.f3681g = new HashMap();
        this.f3682h = new HashSet();
        this.f3683i = new HashSet();
        this.f3684j = new AtomicInteger(0);
        this.f3689q = EnumC2355j.BACKGROUND;
        this.f3690r = false;
        this.f3691s = true;
        this.f3685k = c2303f;
        this.m = eVar;
        this.l = e4;
        this.f3686n = true;
    }

    public static c a() {
        if (f3677u == null) {
            synchronized (c.class) {
                try {
                    if (f3677u == null) {
                        f3677u = new c(C2303f.f20472u, new R3.e(24));
                    }
                } finally {
                }
            }
        }
        return f3677u;
    }

    public final void b(String str) {
        synchronized (this.f3681g) {
            try {
                Long l = (Long) this.f3681g.get(str);
                if (l == null) {
                    this.f3681g.put(str, 1L);
                } else {
                    this.f3681g.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f3683i) {
            try {
                Iterator it = this.f3683i.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()) != null) {
                        try {
                            C0397a c0397a = W4.b.b;
                        } catch (IllegalStateException e4) {
                            W4.c.f3612a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e4);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Activity activity) {
        C2323d c2323d;
        WeakHashMap weakHashMap = this.f3680f;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        f fVar = (f) this.f3678c.get(activity);
        E1.c cVar = fVar.b;
        boolean z8 = fVar.f3700d;
        C0397a c0397a = f.f3697e;
        if (!z8) {
            c0397a.a("Cannot stop because no recording was started");
            c2323d = new C2323d();
        } else {
            Map map = fVar.f3699c;
            if (!map.isEmpty()) {
                c0397a.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            C2323d a6 = fVar.a();
            try {
                cVar.C(fVar.f3698a);
            } catch (IllegalArgumentException | NullPointerException e4) {
                if ((e4 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e4;
                }
                c0397a.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e4.toString());
                a6 = new C2323d();
            }
            C0414o c0414o = (C0414o) cVar.f972c;
            SparseIntArray[] sparseIntArrayArr = c0414o.b;
            c0414o.b = new SparseIntArray[9];
            fVar.f3700d = false;
            c2323d = a6;
        }
        if (!c2323d.b()) {
            f3676t.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            AbstractC2327h.a(trace, (b5.d) c2323d.a());
            trace.stop();
        }
    }

    public final void e(String str, i iVar, i iVar2) {
        if (!this.l.o()) {
            return;
        }
        J newBuilder = TraceMetric.newBuilder();
        newBuilder.k(str);
        newBuilder.i(iVar.b);
        newBuilder.j(iVar.d(iVar2));
        newBuilder.c(SessionManager.getInstance().perfSession().c());
        int andSet = this.f3684j.getAndSet(0);
        synchronized (this.f3681g) {
            try {
                newBuilder.e(this.f3681g);
                if (andSet != 0) {
                    newBuilder.g(andSet, "_tsns");
                }
                this.f3681g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3685k.c((TraceMetric) newBuilder.build(), EnumC2355j.FOREGROUND_BACKGROUND);
    }

    public final void f(Activity activity) {
        if (this.f3686n && this.l.o()) {
            f fVar = new f(activity);
            this.f3678c.put(activity, fVar);
            if (activity instanceof FragmentActivity) {
                e eVar = new e(this.m, this.f3685k, this, fVar);
                this.f3679d.put(activity, eVar);
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(eVar, true);
            }
        }
    }

    public final void g(EnumC2355j enumC2355j) {
        this.f3689q = enumC2355j;
        synchronized (this.f3682h) {
            try {
                Iterator it = this.f3682h.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f3689q);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f3678c.remove(activity);
        WeakHashMap weakHashMap = this.f3679d;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks((AbstractC0464g0) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.b.isEmpty()) {
                this.m.getClass();
                this.f3687o = new i();
                this.b.put(activity, Boolean.TRUE);
                if (this.f3691s) {
                    g(EnumC2355j.FOREGROUND);
                    c();
                    this.f3691s = false;
                } else {
                    e("_bs", this.f3688p, this.f3687o);
                    g(EnumC2355j.FOREGROUND);
                }
            } else {
                this.b.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f3686n && this.l.o()) {
                if (!this.f3678c.containsKey(activity)) {
                    f(activity);
                }
                ((f) this.f3678c.get(activity)).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f3685k, this.m, this);
                trace.start();
                this.f3680f.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f3686n) {
                d(activity);
            }
            if (this.b.containsKey(activity)) {
                this.b.remove(activity);
                if (this.b.isEmpty()) {
                    this.m.getClass();
                    i iVar = new i();
                    this.f3688p = iVar;
                    e("_fs", this.f3687o, iVar);
                    g(EnumC2355j.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
