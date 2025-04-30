package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import r0.C2655c;
import s0.C2692c;

/* loaded from: classes.dex */
public final class Y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4874a;
    public final c0 b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f4875c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0505o f4876d;

    /* renamed from: e, reason: collision with root package name */
    public final G0.e f4877e;

    public Y(Application application, G0.g gVar, Bundle bundle) {
        c0 c0Var;
        G7.j.e(gVar, "owner");
        this.f4877e = gVar.getSavedStateRegistry();
        this.f4876d = gVar.getLifecycle();
        this.f4875c = bundle;
        this.f4874a = application;
        if (application != null) {
            if (c0.f4884c == null) {
                c0.f4884c = new c0(application);
            }
            c0Var = c0.f4884c;
            G7.j.b(c0Var);
        } else {
            c0Var = new c0(null);
        }
        this.b = c0Var;
    }

    @Override // androidx.lifecycle.d0
    public final b0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.d0
    public final b0 b(Class cls, C2655c c2655c) {
        Constructor a6;
        C2692c c2692c = C2692c.f22965a;
        LinkedHashMap linkedHashMap = c2655c.f22812a;
        String str = (String) linkedHashMap.get(c2692c);
        if (str != null) {
            if (linkedHashMap.get(V.f4868a) != null && linkedHashMap.get(V.b) != null) {
                Application application = (Application) linkedHashMap.get(c0.f4885d);
                boolean isAssignableFrom = AbstractC0491a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a6 = Z.a(cls, Z.f4878a);
                } else {
                    a6 = Z.a(cls, Z.b);
                }
                if (a6 == null) {
                    return this.b.b(cls, c2655c);
                }
                if (isAssignableFrom && application != null) {
                    return Z.b(cls, a6, application, V.c(c2655c));
                }
                return Z.b(cls, a6, V.c(c2655c));
            }
            if (this.f4876d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, androidx.lifecycle.e0] */
    public final b0 d(Class cls, String str) {
        Constructor a6;
        b0 b;
        AbstractC0505o abstractC0505o = this.f4876d;
        if (abstractC0505o != null) {
            boolean isAssignableFrom = AbstractC0491a.class.isAssignableFrom(cls);
            Application application = this.f4874a;
            if (isAssignableFrom && application != null) {
                a6 = Z.a(cls, Z.f4878a);
            } else {
                a6 = Z.a(cls, Z.b);
            }
            if (a6 == null) {
                if (application != null) {
                    return this.b.a(cls);
                }
                if (e0.f4888a == null) {
                    e0.f4888a = new Object();
                }
                e0 e0Var = e0.f4888a;
                G7.j.b(e0Var);
                return e0Var.a(cls);
            }
            G0.e eVar = this.f4877e;
            G7.j.b(eVar);
            Bundle a9 = eVar.a(str);
            Class[] clsArr = S.f4861f;
            S b8 = V.b(a9, this.f4875c);
            T t9 = new T(str, b8);
            t9.h(eVar, abstractC0505o);
            EnumC0504n enumC0504n = ((C0513x) abstractC0505o).f4904d;
            if (enumC0504n != EnumC0504n.f4892c && enumC0504n.compareTo(EnumC0504n.f4894f) < 0) {
                abstractC0505o.a(new R0.a(3, abstractC0505o, eVar));
            } else {
                eVar.d();
            }
            if (isAssignableFrom && application != null) {
                b = Z.b(cls, a6, application, b8);
            } else {
                b = Z.b(cls, a6, b8);
            }
            b.a("androidx.lifecycle.savedstate.vm.tag", t9);
            return b;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
