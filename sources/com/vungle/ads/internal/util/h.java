package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.vungle.ads.L;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class h implements Application.ActivityLifecycleCallbacks {
    private Handler handler;
    private boolean isInitialized;
    private int resumed;
    private int started;
    public static final C2109b Companion = new C2109b(null);
    private static final String TAG = h.class.getSimpleName();
    private static final h instance = new h();
    private static final long TIMEOUT = 3000;
    private static final long CONFIG_CHANGE_DELAY = 700;
    private final CopyOnWriteArraySet<C2111d> callbacks = new CopyOnWriteArraySet<>();
    private final ConcurrentHashMap<InterfaceC2110c, C2111d> adLeftCallbacks = new ConcurrentHashMap<>();
    private boolean paused = true;
    private boolean stopped = true;
    private final Runnable configChangeRunnable = new L(this, 2);

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configChangeRunnable$lambda-0, reason: not valid java name */
    public static final void m88configChangeRunnable$lambda0(h hVar) {
        G7.j.e(hVar, "this$0");
        if (hVar.resumed == 0 && !hVar.paused) {
            hVar.paused = true;
            Iterator<C2111d> it = hVar.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onPause();
            }
        }
        if (hVar.started == 0 && hVar.paused && !hVar.stopped) {
            hVar.stopped = true;
            Iterator<C2111d> it2 = hVar.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener(C2111d c2111d) {
        this.callbacks.remove(c2111d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnNextAppLeftCallback(InterfaceC2110c interfaceC2110c) {
        C2111d remove;
        if (interfaceC2110c != null && (remove = this.adLeftCallbacks.remove(interfaceC2110c)) != null) {
            removeListener(remove);
        }
    }

    public final void addListener(C2111d c2111d) {
        G7.j.e(c2111d, "callback");
        this.callbacks.add(c2111d);
    }

    public final void addOnNextAppLeftCallback(InterfaceC2110c interfaceC2110c) {
        if (interfaceC2110c == null) {
            return;
        }
        if (!this.isInitialized) {
            ((com.vungle.ads.internal.ui.l) interfaceC2110c).onLeftApplication();
            return;
        }
        WeakReference weakReference = new WeakReference(interfaceC2110c);
        RunnableC2114g runnableC2114g = new RunnableC2114g(this, weakReference);
        C2113f c2113f = new C2113f(weakReference, this, runnableC2114g);
        this.adLeftCallbacks.put(interfaceC2110c, c2113f);
        if (inForeground()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.postDelayed(runnableC2114g, TIMEOUT);
            }
            addListener(c2113f);
            return;
        }
        instance.addListener(new C2112e(this, weakReference, runnableC2114g));
    }

    public final void deInit(Context context) {
        G7.j.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        G7.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.started = 0;
        this.resumed = 0;
        this.paused = true;
        this.stopped = true;
        this.isInitialized = false;
        this.callbacks.clear();
        this.adLeftCallbacks.clear();
    }

    public final boolean inForeground() {
        if (this.isInitialized && this.started <= 0) {
            return false;
        }
        return true;
    }

    public final void init(Context context) {
        G7.j.e(context, "context");
        if (this.isInitialized) {
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        Context applicationContext = context.getApplicationContext();
        G7.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        this.isInitialized = true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        G7.j.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        G7.j.e(activity, "activity");
        this.resumed = Math.max(0, this.resumed - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = this.resumed + 1;
        this.resumed = i9;
        if (i9 == 1) {
            if (this.paused) {
                this.paused = false;
                Iterator<C2111d> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onResume();
                }
                return;
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        G7.j.e(activity, "activity");
        G7.j.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        G7.j.e(activity, "activity");
        int i9 = this.started + 1;
        this.started = i9;
        if (i9 == 1 && this.stopped) {
            this.stopped = false;
            Iterator<C2111d> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        G7.j.e(activity, "activity");
        this.started = Math.max(0, this.started - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }
}
