package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FragmentLifecycleCallbacksDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f19737a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f19738b;

    /* loaded from: classes3.dex */
    public static final class FragmentLifecycleCallbacksHolder {
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        this.f19738b = fragmentManager;
    }

    public final void a(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.a(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void b(boolean z2) {
        FragmentManager fragmentManager = this.f19738b;
        Context context = fragmentManager.f19757u.f19732b;
        Fragment fragment = fragmentManager.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.b(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void c(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.c(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void d(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.d(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void e(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.e(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void f(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.f(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void g(boolean z2) {
        FragmentManager fragmentManager = this.f19738b;
        Context context = fragmentManager.f19757u.f19732b;
        Fragment fragment = fragmentManager.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.g(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void h(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.h(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void i(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.i(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void j(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.j(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void k(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.k(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void l(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.l(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f19738b.w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f19749m.m(fragment, view, bundle, true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }

    public final void n(boolean z2) {
        Fragment fragment = this.f19738b.w;
        if (fragment != null) {
            fragment.getParentFragmentManager().f19749m.n(true);
        }
        Iterator it = this.f19737a.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder fragmentLifecycleCallbacksHolder = (FragmentLifecycleCallbacksHolder) it.next();
            if (!z2) {
                fragmentLifecycleCallbacksHolder.getClass();
                throw null;
            }
            fragmentLifecycleCallbacksHolder.getClass();
        }
    }
}
