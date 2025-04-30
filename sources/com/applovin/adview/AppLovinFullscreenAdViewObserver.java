package com.applovin.adview;

import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0510u;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinFullscreenAdViewObserver implements InterfaceC0510u {

    /* renamed from: a, reason: collision with root package name */
    private final k f6096a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private n9 f6097c;

    /* renamed from: d, reason: collision with root package name */
    private ob f6098d;

    public AppLovinFullscreenAdViewObserver(AbstractC0505o abstractC0505o, ob obVar, k kVar) {
        this.f6098d = obVar;
        this.f6096a = kVar;
        abstractC0505o.a(this);
    }

    @E(EnumC0503m.ON_DESTROY)
    public void onDestroy() {
        ob obVar = this.f6098d;
        if (obVar != null) {
            obVar.a();
            this.f6098d = null;
        }
        n9 n9Var = this.f6097c;
        if (n9Var != null) {
            n9Var.f();
            this.f6097c.v();
            this.f6097c = null;
        }
    }

    @E(EnumC0503m.ON_PAUSE)
    public void onPause() {
        n9 n9Var = this.f6097c;
        if (n9Var != null) {
            n9Var.w();
            this.f6097c.z();
        }
    }

    @E(EnumC0503m.ON_RESUME)
    public void onResume() {
        n9 n9Var;
        if (!this.b.getAndSet(false) && (n9Var = this.f6097c) != null) {
            n9Var.x();
            this.f6097c.a(0L);
        }
    }

    @E(EnumC0503m.ON_STOP)
    public void onStop() {
        n9 n9Var = this.f6097c;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    public void setPresenter(n9 n9Var) {
        this.f6097c = n9Var;
    }
}
