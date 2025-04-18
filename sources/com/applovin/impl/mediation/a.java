package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.de;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.p {
    private final com.applovin.impl.q a;

    /* renamed from: b, reason: collision with root package name */
    private final t f6002b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6003c = zp.l(com.applovin.impl.sdk.k.k());

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0022a f6004d;

    /* renamed from: e, reason: collision with root package name */
    private de f6005e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6006f;

    /* renamed from: g, reason: collision with root package name */
    private int f6007g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6008h;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0022a {
        void b(de deVar);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f6002b = kVar.L();
        this.a = kVar.e();
    }

    public void a(boolean z10) {
        this.f6006f = z10;
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f6003c) && (this.f6005e.q0() || this.f6006f)) {
            if (t.a()) {
                this.f6002b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f6004d != null) {
                if (t.a()) {
                    this.f6002b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f6004d.b(this.f6005e);
            }
            a();
            return;
        }
        if (!this.f6008h) {
            this.f6008h = true;
        }
        this.f6007g++;
        if (t.a()) {
            this.f6002b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f6007g);
        }
    }

    @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (!this.f6008h) {
            return;
        }
        this.f6007g--;
        if (t.a()) {
            this.f6002b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f6007g);
        }
        if (this.f6007g <= 0) {
            if (t.a()) {
                this.f6002b.a("AdActivityObserver", "Last ad Activity destroyed");
            }
            if (this.f6004d != null) {
                if (t.a()) {
                    this.f6002b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f6004d.b(this.f6005e);
            }
            a();
        }
    }

    public void a(de deVar, InterfaceC0022a interfaceC0022a) {
        if (t.a()) {
            this.f6002b.a("AdActivityObserver", "Starting for ad " + deVar.getAdUnitId() + "...");
        }
        a();
        this.f6004d = interfaceC0022a;
        this.f6005e = deVar;
        this.a.a(this);
    }

    public void a() {
        if (t.a()) {
            this.f6002b.a("AdActivityObserver", "Cancelling...");
        }
        this.a.b(this);
        this.f6004d = null;
        this.f6005e = null;
        this.f6007g = 0;
        this.f6008h = false;
    }
}
