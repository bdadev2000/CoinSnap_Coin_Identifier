package com.safedk.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29925a = "LifecycleManager";

    /* renamed from: b, reason: collision with root package name */
    private static b f29926b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f29927c = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static boolean f29928h;
    private final LinkedHashSet<WeakReference<Activity>> d = new LinkedHashSet<>();
    private final ArrayList<WeakReference<Activity>> e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private int f29929f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29930g = true;

    /* renamed from: i, reason: collision with root package name */
    private Set<a> f29931i = Collections.newSetFromMap(new ConcurrentHashMap());

    private b() {
    }

    public ArrayList<WeakReference<Activity>> getAppActivities() {
        return this.e;
    }

    public static synchronized b getInstance() {
        b bVar;
        synchronized (b.class) {
            if (f29926b == null) {
                f29926b = new b();
            }
            bVar = f29926b;
        }
        return bVar;
    }

    public void AddActivity(Activity activity) {
        this.d.add(new WeakReference<>(activity));
        if (!BrandSafetyUtils.d(activity.getClass())) {
            this.e.add(new WeakReference<>(activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.StringBuilder] */
    public Activity getForegroundActivity() {
        ?? r02;
        Throwable th;
        Object obj;
        String str = null;
        try {
            if (this.d.size() > 0) {
                synchronized (this.d) {
                    try {
                        r02 = (Activity) ((WeakReference) this.d.toArray()[this.d.size() - 1]).get();
                        try {
                            if (r02 != 0) {
                                try {
                                    str = f29925a;
                                    Logger.d(f29925a, "getForegroundActivity Foreground activity is " + r02);
                                } catch (Throwable th2) {
                                    th = th2;
                                    r02 = r02;
                                    Logger.e(f29925a, "Exception in getForegroundActivity : " + th.getMessage(), th);
                                    new CrashReporter().caughtException(th);
                                    return r02;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = r02;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r02 = obj;
                                        Logger.e(f29925a, "Exception in getForegroundActivity : " + th.getMessage(), th);
                                        new CrashReporter().caughtException(th);
                                        return r02;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        obj = null;
                    }
                }
            } else {
                Logger.d(f29925a, "No foreground activity found");
                r02 = 0;
            }
        } catch (Throwable th7) {
            th = th7;
            r02 = str;
        }
        return r02;
    }

    public boolean isInBackground() {
        return this.f29930g;
    }

    public synchronized boolean isInterstitialActivity(Context activity) {
        boolean z2 = false;
        synchronized (this) {
            if (this.f29929f != 0) {
                if (this.f29929f == System.identityHashCode(activity)) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (f29928h) {
            Logger.d(f29925a, "onActivityCreated " + activity.toString());
            if (!BrandSafetyUtils.d(activity.getClass())) {
                this.e.add(new WeakReference<>(activity));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (f29928h) {
                Logger.d(f29925a, "onActivityStarted " + activity.toString());
                synchronized (this.d) {
                    this.d.add(new WeakReference<>(activity));
                }
                if (this.d.size() == 1) {
                    c();
                }
            }
        } catch (Throwable th) {
            Logger.e(f29925a, "onActivityStarted failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder("{ ");
        synchronized (this.d) {
            Iterator<WeakReference<Activity>> it = this.d.iterator();
            while (it.hasNext()) {
                sb.append(it.next().get()).append(" ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        try {
            if (f29928h) {
                Logger.d(f29925a, "onActivityResumed " + activity.toString() + ", isActive=" + f29928h + ", foregroundActivities=" + a());
                boolean z2 = false;
                if (BrandSafetyUtils.d(activity.getClass())) {
                    this.f29929f = System.identityHashCode(activity);
                    z2 = SafeDK.getInstance().a(activity);
                } else {
                    SafeDK.getInstance().d(activity);
                }
                if (!z2 || BrandSafetyUtils.c(activity.getClass())) {
                    SafeDK.getInstance().c(activity);
                } else if (SafeDK.getInstance().y().d(activity) == null) {
                    Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: com.safedk.android.internal.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (SafeDK.getInstance().y().d(activity) == null) {
                                SafeDK.getInstance().c(activity);
                            }
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29925a, "onActivityResumed failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            if (f29928h) {
                Logger.d(f29925a, "onActivityPaused " + activity.toString());
                if (BrandSafetyUtils.d(activity.getClass())) {
                    SafeDK.getInstance().b(activity);
                } else {
                    SafeDK.getInstance().e(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29925a, "onActivityPaused failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r5.remove(r0);
        r0.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void removeActivity(android.app.Activity r4, java.util.Collection<java.lang.ref.WeakReference<android.app.Activity>> r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L1f
        L5:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L1f
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L1f
            if (r2 != r4) goto L5
            r5.remove(r0)     // Catch: java.lang.Throwable -> L1f
            r0.clear()     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r3)
            return
        L1f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.internal.b.removeActivity(android.app.Activity, java.util.Collection):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (f29928h) {
                Logger.d(f29925a, "onActivityStopped " + activity.toString());
                synchronized (this.d) {
                    removeActivity(activity, this.d);
                }
                Logger.d(f29925a, "onActivityStopped foregroundActivities=" + a());
                if (this.d.size() == 0) {
                    b();
                }
            }
        } catch (Throwable th) {
            Logger.e(f29925a, "onActivityStopped failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (f29928h) {
            Logger.d(f29925a, "onActivitySaveInstanceState " + activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (f29928h) {
            Logger.d(f29925a, "onActivityDestroyed " + activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                SafeDK.getInstance().a(activity.toString());
            } else {
                removeActivity(activity, this.e);
            }
        }
    }

    private void a(boolean z2) {
        this.f29930g = z2;
    }

    private void b() {
        Logger.d(f29925a, "Identified background");
        a(true);
        for (a aVar : this.f29931i) {
            Logger.d(f29925a, "notifyBackground to " + aVar.getClass().getCanonicalName());
            aVar.g();
        }
    }

    private void c() {
        Logger.d(f29925a, "Identified foreground");
        a(false);
        Iterator<a> it = this.f29931i.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public synchronized void registerBackgroundForegroundListener(a listener) {
        try {
            if (f29928h && !this.f29931i.contains(listener) && !a(listener)) {
                Logger.d(f29925a, "Adding " + listener.getClass() + " to listen to BG FG events");
                this.f29931i.add(listener);
                if (isInBackground()) {
                    listener.g();
                } else {
                    listener.h();
                }
            }
        } catch (Throwable th) {
            Logger.e(f29925a, "Failed to add listener to BG/FG events", th);
            new CrashReporter().caughtException(th);
        }
    }

    private boolean a(a aVar) {
        Logger.d(f29925a, "listenersContainsType started, listener is " + aVar.getClass());
        ArrayList arrayList = new ArrayList();
        if (this.f29931i != null) {
            Logger.d(f29925a, "listenersContainsType iteration listener is " + aVar.getClass());
            Iterator<a> it = this.f29931i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClass().getCanonicalName());
            }
        }
        return arrayList.contains(aVar.getClass().getCanonicalName());
    }

    public synchronized void clearBackgroundForegroundListeners() {
        Logger.d(f29925a, "Clearing Background Foreground listeners collection");
        this.f29931i = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static void setActiveMode(boolean enable) {
        f29928h = enable;
        Logger.d(f29925a, "setting active mode to " + enable);
    }
}
