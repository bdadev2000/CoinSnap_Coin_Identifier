package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements Application.ActivityLifecycleCallbacks {
    private Handler handler;
    private boolean isInitialized;
    private int resumed;
    private int started;
    public static final b Companion = new b(null);
    private static final String TAG = h.class.getSimpleName();
    private static final h instance = new h();
    private static final long TIMEOUT = 3000;
    private static final long CONFIG_CHANGE_DELAY = 700;
    private final CopyOnWriteArraySet<d> callbacks = new CopyOnWriteArraySet<>();
    private final ConcurrentHashMap<c, d> adLeftCallbacks = new ConcurrentHashMap<>();
    private boolean paused = true;
    private boolean stopped = true;
    private final Runnable configChangeRunnable = new k8.f(this, 21);

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configChangeRunnable$lambda-0, reason: not valid java name */
    public static final void m68configChangeRunnable$lambda0(h this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.resumed == 0 && !this$0.paused) {
            this$0.paused = true;
            Iterator<d> it = this$0.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onPause();
            }
        }
        if (this$0.started == 0 && this$0.paused && !this$0.stopped) {
            this$0.stopped = true;
            Iterator<d> it2 = this$0.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener(d dVar) {
        this.callbacks.remove(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnNextAppLeftCallback(c cVar) {
        d remove;
        if (cVar != null && (remove = this.adLeftCallbacks.remove(cVar)) != null) {
            removeListener(remove);
        }
    }

    public final void addListener(d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    public final void addOnNextAppLeftCallback(c cVar) {
        if (cVar == null) {
            return;
        }
        if (!this.isInitialized) {
            ((com.vungle.ads.internal.ui.l) cVar).onLeftApplication();
            return;
        }
        WeakReference weakReference = new WeakReference(cVar);
        g gVar = new g(this, weakReference);
        f fVar = new f(weakReference, this, gVar);
        this.adLeftCallbacks.put(cVar, fVar);
        if (inForeground()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.postDelayed(gVar, TIMEOUT);
            }
            addListener(fVar);
            return;
        }
        instance.addListener(new e(this, weakReference, gVar));
    }

    public final void deInit(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
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
        return !this.isInitialized || this.started > 0;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isInitialized) {
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        this.isInitialized = true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.resumed = Math.max(0, this.resumed - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = this.resumed + 1;
        this.resumed = i10;
        if (i10 == 1) {
            if (this.paused) {
                this.paused = false;
                Iterator<d> it = this.callbacks.iterator();
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
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i10 = this.started + 1;
        this.started = i10;
        if (i10 == 1 && this.stopped) {
            this.stopped = false;
            Iterator<d> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.started = Math.max(0, this.started - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }
}
