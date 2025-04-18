package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class v1 implements androidx.lifecycle.j, y1.f, androidx.lifecycle.e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f1725b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.d1 f1726c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f1727d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.a1 f1728f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.x f1729g = null;

    /* renamed from: h, reason: collision with root package name */
    public y1.e f1730h = null;

    public v1(Fragment fragment, androidx.lifecycle.d1 d1Var, androidx.activity.d dVar) {
        this.f1725b = fragment;
        this.f1726c = d1Var;
        this.f1727d = dVar;
    }

    public final void a(androidx.lifecycle.n nVar) {
        this.f1729g.e(nVar);
    }

    public final void b() {
        if (this.f1729g == null) {
            this.f1729g = new androidx.lifecycle.x(this);
            y1.e g10 = ka.e.g(this);
            this.f1730h = g10;
            g10.a();
            this.f1727d.run();
        }
    }

    @Override // androidx.lifecycle.j
    public final k1.c getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f1725b;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        k1.e eVar = new k1.e();
        if (application != null) {
            eVar.b(b6.b.f2295g, application);
        }
        eVar.b(jb.g.f19884b, fragment);
        eVar.b(jb.g.f19885c, this);
        if (fragment.getArguments() != null) {
            eVar.b(jb.g.f19886d, fragment.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f1725b;
        androidx.lifecycle.a1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f1728f = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f1728f == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f1728f = new androidx.lifecycle.u0(application, fragment, fragment.getArguments());
        }
        return this.f1728f;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        b();
        return this.f1729g;
    }

    @Override // y1.f
    public final y1.d getSavedStateRegistry() {
        b();
        return this.f1730h.f27886b;
    }

    @Override // androidx.lifecycle.e1
    public final androidx.lifecycle.d1 getViewModelStore() {
        b();
        return this.f1726c;
    }
}
