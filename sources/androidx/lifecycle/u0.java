package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 extends c1 implements a1 {
    public final Application a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f1823b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1824c;

    /* renamed from: d, reason: collision with root package name */
    public final p f1825d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.d f1826e;

    public u0(Application application, y1.f owner, Bundle bundle) {
        z0 z0Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f1826e = owner.getSavedStateRegistry();
        this.f1825d = owner.getLifecycle();
        this.f1824c = bundle;
        this.a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (z0.f1848c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                z0.f1848c = new z0(application);
            }
            z0Var = z0.f1848c;
            Intrinsics.checkNotNull(z0Var);
        } else {
            z0Var = new z0(null);
        }
        this.f1823b = z0Var;
    }

    @Override // androidx.lifecycle.a1
    public final x0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class modelClass, k1.e extras) {
        Constructor a;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(c6.m.f2666d);
        if (str != null) {
            if (extras.a(jb.g.f19884b) != null && extras.a(jb.g.f19885c) != null) {
                Application application = (Application) extras.a(b6.b.f2295g);
                boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && application != null) {
                    a = v0.a(modelClass, v0.a);
                } else {
                    a = v0.a(modelClass, v0.f1827b);
                }
                if (a == null) {
                    return this.f1823b.b(modelClass, extras);
                }
                if (isAssignableFrom && application != null) {
                    return v0.b(modelClass, a, application, jb.g.d(extras));
                }
                return v0.b(modelClass, a, jb.g.d(extras));
            }
            if (this.f1825d != null) {
                return d(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.c1
    public final void c(x0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        p pVar = this.f1825d;
        if (pVar != null) {
            y1.d dVar = this.f1826e;
            Intrinsics.checkNotNull(dVar);
            Intrinsics.checkNotNull(pVar);
            d6.g.d(viewModel, dVar, pVar);
        }
    }

    public final x0 d(Class modelClass, String key) {
        Constructor a;
        x0 b3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        p pVar = this.f1825d;
        if (pVar != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = v0.a(modelClass, v0.a);
            } else {
                a = v0.a(modelClass, v0.f1827b);
            }
            if (a == null) {
                if (application != null) {
                    return this.f1823b.a(modelClass);
                }
                if (b1.a == null) {
                    b1.a = new b1();
                }
                b1 b1Var = b1.a;
                Intrinsics.checkNotNull(b1Var);
                return b1Var.a(modelClass);
            }
            y1.d dVar = this.f1826e;
            Intrinsics.checkNotNull(dVar);
            SavedStateHandleController j3 = d6.g.j(dVar, pVar, key, this.f1824c);
            q0 q0Var = j3.f1781c;
            if (isAssignableFrom && application != null) {
                Intrinsics.checkNotNull(application);
                b3 = v0.b(modelClass, a, application, q0Var);
            } else {
                b3 = v0.b(modelClass, a, q0Var);
            }
            b3.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", j3);
            return b3;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
