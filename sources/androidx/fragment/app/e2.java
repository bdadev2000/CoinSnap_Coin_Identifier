package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e2 {
    public final ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1625b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1626c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1627d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1628e;

    public e2(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.a = container;
        this.f1625b = new ArrayList();
        this.f1626c = new ArrayList();
    }

    public static final e2 j(ViewGroup container, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        f2 specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
        Intrinsics.checkNotNullExpressionValue(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
        return ka.e.k(container, specialEffectsControllerFactory);
    }

    public final void a(b2 b2Var, a2 a2Var, k1 k1Var) {
        synchronized (this.f1625b) {
            j0.e eVar = new j0.e();
            Fragment fragment = k1Var.f1677c;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            c2 h10 = h(fragment);
            if (h10 != null) {
                h10.c(b2Var, a2Var);
                return;
            }
            final z1 z1Var = new z1(b2Var, a2Var, k1Var, eVar);
            this.f1625b.add(z1Var);
            final int i10 = 0;
            Runnable listener = new Runnable(this) { // from class: androidx.fragment.app.y1

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e2 f1765c;

                {
                    this.f1765c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    z1 operation = z1Var;
                    e2 this$0 = this.f1765c;
                    switch (i11) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            if (this$0.f1625b.contains(operation)) {
                                b2 b2Var2 = operation.a;
                                View view = operation.f1596c.mView;
                                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                b2Var2.a(view);
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            this$0.f1625b.remove(operation);
                            this$0.f1626c.remove(operation);
                            return;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            z1Var.f1597d.add(listener);
            final int i11 = 1;
            Runnable listener2 = new Runnable(this) { // from class: androidx.fragment.app.y1

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ e2 f1765c;

                {
                    this.f1765c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    z1 operation = z1Var;
                    e2 this$0 = this.f1765c;
                    switch (i112) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            if (this$0.f1625b.contains(operation)) {
                                b2 b2Var2 = operation.a;
                                View view = operation.f1596c.mView;
                                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                b2Var2.a(view);
                                return;
                            }
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            this$0.f1625b.remove(operation);
                            this$0.f1626c.remove(operation);
                            return;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener2, "listener");
            z1Var.f1597d.add(listener2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(b2 finalState, k1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f1677c);
        }
        a(finalState, a2.ADDING, fragmentStateManager);
    }

    public final void c(k1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.f1677c);
        }
        a(b2.GONE, a2.NONE, fragmentStateManager);
    }

    public final void d(k1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.f1677c);
        }
        a(b2.REMOVED, a2.REMOVING, fragmentStateManager);
    }

    public final void e(k1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.f1677c);
        }
        a(b2.VISIBLE, a2.NONE, fragmentStateManager);
    }

    public abstract void f(List list, boolean z10);

    public final void g() {
        if (this.f1628e) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.a)) {
            i();
            this.f1627d = false;
            return;
        }
        synchronized (this.f1625b) {
            if (!this.f1625b.isEmpty()) {
                List<c2> mutableList = CollectionsKt.toMutableList((Collection) this.f1626c);
                this.f1626c.clear();
                for (c2 c2Var : mutableList) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + c2Var);
                    }
                    c2Var.a();
                    if (!c2Var.f1600g) {
                        this.f1626c.add(c2Var);
                    }
                }
                l();
                List mutableList2 = CollectionsKt.toMutableList((Collection) this.f1625b);
                this.f1625b.clear();
                this.f1626c.addAll(mutableList2);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                }
                Iterator it = mutableList2.iterator();
                while (it.hasNext()) {
                    ((c2) it.next()).d();
                }
                f(mutableList2, this.f1627d);
                this.f1627d = false;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final c2 h(Fragment fragment) {
        Object obj;
        boolean z10;
        Iterator it = this.f1625b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                c2 c2Var = (c2) obj;
                if (Intrinsics.areEqual(c2Var.f1596c, fragment) && !c2Var.f1599f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (c2) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = ViewCompat.isAttachedToWindow(this.a);
        synchronized (this.f1625b) {
            l();
            Iterator it = this.f1625b.iterator();
            while (it.hasNext()) {
                ((c2) it.next()).d();
            }
            for (c2 c2Var : CollectionsKt.toMutableList((Collection) this.f1626c)) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str2 + "Cancelling running operation " + c2Var);
                }
                c2Var.a();
            }
            for (c2 c2Var2 : CollectionsKt.toMutableList((Collection) this.f1625b)) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str + "Cancelling pending operation " + c2Var2);
                }
                c2Var2.a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void k() {
        boolean z10;
        Fragment fragment;
        Object obj;
        boolean z11;
        synchronized (this.f1625b) {
            l();
            ArrayList arrayList = this.f1625b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                z10 = false;
                fragment = null;
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    c2 c2Var = (c2) obj;
                    View view = c2Var.f1596c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    b2 a = ac.e.a(view);
                    b2 b2Var = c2Var.a;
                    b2 b2Var2 = b2.VISIBLE;
                    if (b2Var == b2Var2 && a != b2Var2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c2 c2Var2 = (c2) obj;
            if (c2Var2 != null) {
                fragment = c2Var2.f1596c;
            }
            if (fragment != null) {
                z10 = fragment.isPostponed();
            }
            this.f1628e = z10;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void l() {
        Iterator it = this.f1625b.iterator();
        while (it.hasNext()) {
            c2 c2Var = (c2) it.next();
            if (c2Var.f1595b == a2.ADDING) {
                View requireView = c2Var.f1596c.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                c2Var.c(ac.e.c(requireView.getVisibility()), a2.NONE);
            }
        }
    }
}
