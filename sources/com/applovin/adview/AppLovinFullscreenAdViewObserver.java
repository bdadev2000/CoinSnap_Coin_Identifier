package com.applovin.adview;

import androidx.lifecycle.g0;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements u {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f3375b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private n9 f3376c;

    /* renamed from: d, reason: collision with root package name */
    private ob f3377d;

    public AppLovinFullscreenAdViewObserver(p pVar, ob obVar, k kVar) {
        this.f3377d = obVar;
        this.a = kVar;
        pVar.a(this);
    }

    @g0(n.ON_DESTROY)
    public void onDestroy() {
        ob obVar = this.f3377d;
        if (obVar != null) {
            obVar.a();
            this.f3377d = null;
        }
        n9 n9Var = this.f3376c;
        if (n9Var != null) {
            n9Var.f();
            this.f3376c.v();
            this.f3376c = null;
        }
    }

    @g0(n.ON_PAUSE)
    public void onPause() {
        n9 n9Var = this.f3376c;
        if (n9Var != null) {
            n9Var.w();
            this.f3376c.z();
        }
    }

    @g0(n.ON_RESUME)
    public void onResume() {
        n9 n9Var;
        if (!this.f3375b.getAndSet(false) && (n9Var = this.f3376c) != null) {
            n9Var.x();
            this.f3376c.a(0L);
        }
    }

    @g0(n.ON_STOP)
    public void onStop() {
        n9 n9Var = this.f3376c;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    public void setPresenter(n9 n9Var) {
        this.f3376c = n9Var;
    }
}
