package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.ie;
import com.applovin.impl.yp;

/* loaded from: classes2.dex */
public class a extends com.applovin.impl.p {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.q f25297a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f25298b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25299c = yp.l(com.applovin.impl.sdk.j.l());
    private InterfaceC0084a d;
    private ie e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25300f;

    /* renamed from: g, reason: collision with root package name */
    private int f25301g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25302h;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0084a {
        void b(ie ieVar);
    }

    public a(com.applovin.impl.sdk.j jVar) {
        this.f25298b = jVar.J();
        this.f25297a = jVar.e();
    }

    public void a(boolean z2) {
        this.f25300f = z2;
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f25299c) && (this.e.v0() || this.f25300f)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25298b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.d != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25298b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
            return;
        }
        if (!this.f25302h) {
            this.f25302h = true;
        }
        this.f25301g++;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25298b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f25301g);
        }
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f25302h) {
            this.f25301g--;
            if (com.applovin.impl.sdk.n.a()) {
                this.f25298b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f25301g);
            }
            if (this.f25301g <= 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25298b.a("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.d != null) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f25298b.a("AdActivityObserver", "Invoking callback...");
                    }
                    this.d.b(this.e);
                }
                a();
            }
        }
    }

    public void a(ie ieVar, InterfaceC0084a interfaceC0084a) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25298b.a("AdActivityObserver", "Starting for ad " + ieVar.getAdUnitId() + "...");
        }
        a();
        this.d = interfaceC0084a;
        this.e = ieVar;
        this.f25297a.a(this);
    }

    public void a() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f25298b.a("AdActivityObserver", "Cancelling...");
        }
        this.f25297a.b(this);
        this.d = null;
        this.e = null;
        this.f25301g = 0;
        this.f25302h = false;
    }
}
