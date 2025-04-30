package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0513x;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0499i;
import java.util.LinkedHashMap;
import r0.AbstractC2654b;
import r0.C2655c;

/* loaded from: classes.dex */
public final class H0 implements InterfaceC0499i, G0.g, androidx.lifecycle.g0 {
    public final Fragment b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.f0 f4654c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f4655d;

    /* renamed from: f, reason: collision with root package name */
    public C0513x f4656f = null;

    /* renamed from: g, reason: collision with root package name */
    public G0.f f4657g = null;

    public H0(Fragment fragment, androidx.lifecycle.f0 f0Var, D3.b bVar) {
        this.b = fragment;
        this.f4654c = f0Var;
        this.f4655d = bVar;
    }

    public final void a(EnumC0503m enumC0503m) {
        this.f4656f.e(enumC0503m);
    }

    public final void b() {
        if (this.f4656f == null) {
            this.f4656f = new C0513x(this);
            G0.f fVar = new G0.f(this);
            this.f4657g = fVar;
            fVar.a();
            this.f4655d.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0499i
    public final AbstractC2654b getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.b;
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
        C2655c c2655c = new C2655c(0);
        LinkedHashMap linkedHashMap = c2655c.f22812a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.c0.f4885d, application);
        }
        linkedHashMap.put(androidx.lifecycle.V.f4868a, fragment);
        linkedHashMap.put(androidx.lifecycle.V.b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.V.f4869c, fragment.getArguments());
        }
        return c2655c;
    }

    @Override // androidx.lifecycle.InterfaceC0511v
    public final AbstractC0505o getLifecycle() {
        b();
        return this.f4656f;
    }

    @Override // G0.g
    public final G0.e getSavedStateRegistry() {
        b();
        return this.f4657g.b;
    }

    @Override // androidx.lifecycle.g0
    public final androidx.lifecycle.f0 getViewModelStore() {
        b();
        return this.f4654c;
    }
}
