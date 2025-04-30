package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC0734p;
import com.applovin.impl.C0738q;
import com.applovin.impl.de;
import com.applovin.impl.sdk.t;
import com.applovin.impl.zp;

/* loaded from: classes.dex */
public class a extends AbstractC0734p {

    /* renamed from: a, reason: collision with root package name */
    private final C0738q f8959a;
    private final t b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8960c = zp.l(com.applovin.impl.sdk.k.k());

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0022a f8961d;

    /* renamed from: e, reason: collision with root package name */
    private de f8962e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8963f;

    /* renamed from: g, reason: collision with root package name */
    private int f8964g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8965h;

    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0022a {
        void b(de deVar);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.b = kVar.L();
        this.f8959a = kVar.e();
    }

    public void a(boolean z8) {
        this.f8963f = z8;
    }

    @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f8960c) && (this.f8962e.q0() || this.f8963f)) {
            if (t.a()) {
                this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f8961d != null) {
                if (t.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8961d.b(this.f8962e);
            }
            a();
            return;
        }
        if (!this.f8965h) {
            this.f8965h = true;
        }
        this.f8964g++;
        if (t.a()) {
            this.b.a("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f8964g);
        }
    }

    @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (!this.f8965h) {
            return;
        }
        this.f8964g--;
        if (t.a()) {
            this.b.a("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f8964g);
        }
        if (this.f8964g <= 0) {
            if (t.a()) {
                this.b.a("AdActivityObserver", "Last ad Activity destroyed");
            }
            if (this.f8961d != null) {
                if (t.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8961d.b(this.f8962e);
            }
            a();
        }
    }

    public void a(de deVar, InterfaceC0022a interfaceC0022a) {
        if (t.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + deVar.getAdUnitId() + "...");
        }
        a();
        this.f8961d = interfaceC0022a;
        this.f8962e = deVar;
        this.f8959a.a(this);
    }

    public void a() {
        if (t.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.f8959a.b(this);
        this.f8961d = null;
        this.f8962e = null;
        this.f8964g = 0;
        this.f8965h = false;
    }
}
