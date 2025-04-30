package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f4688a;
    public final CopyOnWriteArrayList b;

    public V(FragmentManager fragmentManager) {
        G7.j.e(fragmentManager, "fragmentManager");
        this.f4688a = fragmentManager;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().a(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void b(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        FragmentManager fragmentManager = this.f4688a;
        Context context = fragmentManager.getHost().f4683c;
        Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().b(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void c(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().c(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void d(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().d(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void e(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().e(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void f(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().f(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.a(fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        FragmentManager fragmentManager = this.f4688a;
        Context context = fragmentManager.getHost().f4683c;
        Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().g(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void h(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().h(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void i(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().i(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.b(fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().j(fragment, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void k(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().k(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void l(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().l(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z8) {
        G7.j.e(fragment, "f");
        G7.j.e(view, "v");
        FragmentManager fragmentManager = this.f4688a;
        Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().m(fragment, view, bundle, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.c(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(Fragment fragment, boolean z8) {
        G7.j.e(fragment, "f");
        Fragment parent = this.f4688a.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            G7.j.d(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().n(fragment, true);
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            U u8 = (U) it.next();
            if (!z8 || u8.b) {
                u8.f4687a.getClass();
            }
        }
    }
}
