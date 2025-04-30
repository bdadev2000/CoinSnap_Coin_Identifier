package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import u7.AbstractC2816g;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4666a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f4667c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4668d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4669e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4670f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4671g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4672h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4673i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4674j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4675k;
    public final w0 l;

    public L0(int i9, int i10, w0 w0Var) {
        AbstractC2914a.i(i9, "finalState");
        AbstractC2914a.i(i10, "lifecycleImpact");
        G7.j.e(w0Var, "fragmentStateManager");
        Fragment fragment = w0Var.f4797c;
        G7.j.d(fragment, "fragmentStateManager.fragment");
        AbstractC2914a.i(i9, "finalState");
        AbstractC2914a.i(i10, "lifecycleImpact");
        G7.j.e(fragment, "fragment");
        this.f4666a = i9;
        this.b = i10;
        this.f4667c = fragment;
        this.f4668d = new ArrayList();
        this.f4673i = true;
        ArrayList arrayList = new ArrayList();
        this.f4674j = arrayList;
        this.f4675k = arrayList;
        this.l = w0Var;
    }

    public final void a(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
        this.f4672h = false;
        if (this.f4669e) {
            return;
        }
        this.f4669e = true;
        if (this.f4674j.isEmpty()) {
            b();
            return;
        }
        for (K0 k02 : AbstractC2816g.T(this.f4675k)) {
            k02.getClass();
            if (!k02.b) {
                k02.b(viewGroup);
            }
            k02.b = true;
        }
    }

    public final void b() {
        this.f4672h = false;
        if (!this.f4670f) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4670f = true;
            Iterator it = this.f4668d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f4667c.mTransitioning = false;
        this.l.k();
    }

    public final void c(K0 k02) {
        G7.j.e(k02, "effect");
        ArrayList arrayList = this.f4674j;
        if (arrayList.remove(k02) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i9, int i10) {
        AbstractC2914a.i(i9, "finalState");
        AbstractC2914a.i(i10, "lifecycleImpact");
        int d2 = AbstractC2965e.d(i10);
        Fragment fragment = this.f4667c;
        if (d2 != 0) {
            if (d2 != 1) {
                if (d2 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + Q7.n0.x(this.f4666a) + " -> REMOVED. mLifecycleImpact  = " + Q7.n0.w(this.b) + " to REMOVING.");
                    }
                    this.f4666a = 1;
                    this.b = 3;
                    this.f4673i = true;
                    return;
                }
                return;
            }
            if (this.f4666a == 1) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + Q7.n0.w(this.b) + " to ADDING.");
                }
                this.f4666a = 2;
                this.b = 2;
                this.f4673i = true;
                return;
            }
            return;
        }
        if (this.f4666a != 1) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + Q7.n0.x(this.f4666a) + " -> " + Q7.n0.x(i9) + '.');
            }
            this.f4666a = i9;
        }
    }

    public final String toString() {
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        n2.append(Q7.n0.x(this.f4666a));
        n2.append(" lifecycleImpact = ");
        n2.append(Q7.n0.w(this.b));
        n2.append(" fragment = ");
        n2.append(this.f4667c);
        n2.append('}');
        return n2.toString();
    }
}
