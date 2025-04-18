package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.p9;
import com.applovin.impl.sdk.j;
import com.applovin.impl.tb;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final j f22428a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f22429b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private p9 f22430c;
    private tb d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, tb tbVar, j jVar) {
        this.d = tbVar;
        this.f22428a = jVar;
        lifecycle.a(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        tb tbVar = this.d;
        if (tbVar != null) {
            tbVar.a();
            this.d = null;
        }
        p9 p9Var = this.f22430c;
        if (p9Var != null) {
            p9Var.f();
            this.f22430c.t();
            this.f22430c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        p9 p9Var = this.f22430c;
        if (p9Var != null) {
            p9Var.u();
            this.f22430c.x();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        p9 p9Var;
        if (this.f22429b.getAndSet(false) || (p9Var = this.f22430c) == null) {
            return;
        }
        p9Var.v();
        this.f22430c.a(0L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        p9 p9Var = this.f22430c;
        if (p9Var != null) {
            p9Var.w();
        }
    }

    public void setPresenter(p9 p9Var) {
        this.f22430c = p9Var;
    }
}
