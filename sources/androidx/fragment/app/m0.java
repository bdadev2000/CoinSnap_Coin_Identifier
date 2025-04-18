package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class m0 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f1686b;

    public m0(FragmentManager fragmentManager) {
        this.f1686b = fragmentManager;
    }

    public final void a(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().a(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void b(boolean z10) {
        FragmentManager fragmentManager = this.f1686b;
        Context context = fragmentManager.getHost().f1648c;
        Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().b(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void c(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().c(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void d(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().d(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void e(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().e(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void f(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().f(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void g(boolean z10) {
        FragmentManager fragmentManager = this.f1686b;
        Context context = fragmentManager.getHost().f1648c;
        Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().g(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void h(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().h(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void i(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().i(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void j(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().j(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void k(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().k(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void l(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().l(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, boolean z10) {
        FragmentManager fragmentManager = this.f1686b;
        Fragment parent = fragmentManager.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().m(fragment, view, true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                androidx.viewpager2.adapter.a aVar = (androidx.viewpager2.adapter.a) l0Var.a;
                if (fragment == aVar.a) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(aVar);
                    aVar.f2128c.getClass();
                    androidx.viewpager2.adapter.g.a(view, aVar.f2127b);
                }
            }
        }
    }

    public final void n(boolean z10) {
        Fragment parent = this.f1686b.getParent();
        if (parent != null) {
            parent.getParentFragmentManager().getLifecycleCallbacksDispatcher().n(true);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1680b) {
                l0Var.a.getClass();
            }
        }
    }
}
