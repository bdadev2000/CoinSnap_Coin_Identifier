package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import com.cooldev.gba.emulator.gameboy.R;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f19861a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19862b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19863c;
    public boolean d;
    public boolean e;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static SpecialEffectsController a(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
            p0.a.s(viewGroup, "container");
            p0.a.s(specialEffectsControllerFactory, "factory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            DefaultSpecialEffectsController a2 = specialEffectsControllerFactory.a(viewGroup);
            p0.a.r(a2, "factory.createController(container)");
            viewGroup.setTag(R.id.special_effects_controller_view_tag, a2);
            return a2;
        }
    }

    /* loaded from: classes.dex */
    public static final class FragmentStateManagerOperation extends Operation {

        /* renamed from: h, reason: collision with root package name */
        public final FragmentStateManager f19864h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.FragmentStateManager r5, androidx.core.os.CancellationSignal r6) {
            /*
                r2 = this;
                java.lang.String r0 = "fragmentStateManager"
                p0.a.s(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.f19800c
                java.lang.String r1 = "fragmentStateManager.fragment"
                p0.a.r(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f19864h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager, androidx.core.os.CancellationSignal):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f19864h.k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void d() {
            Operation.LifecycleImpact lifecycleImpact = this.f19866b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.f19871b;
            FragmentStateManager fragmentStateManager = this.f19864h;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.f19872c) {
                    Fragment fragment = fragmentStateManager.f19800c;
                    p0.a.r(fragment, "fragmentStateManager.fragment");
                    View requireView = fragment.requireView();
                    p0.a.r(requireView, "fragment.requireView()");
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fragment);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = fragmentStateManager.f19800c;
            p0.a.r(fragment2, "fragmentStateManager.fragment");
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
                }
            }
            View requireView2 = this.f19867c.requireView();
            p0.a.r(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                fragmentStateManager.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* loaded from: classes.dex */
    public static class Operation {

        /* renamed from: a, reason: collision with root package name */
        public State f19865a;

        /* renamed from: b, reason: collision with root package name */
        public LifecycleImpact f19866b;

        /* renamed from: c, reason: collision with root package name */
        public final Fragment f19867c;
        public final ArrayList d = new ArrayList();
        public final LinkedHashSet e = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        public boolean f19868f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f19869g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes.dex */
        public static final class LifecycleImpact {

            /* renamed from: a, reason: collision with root package name */
            public static final LifecycleImpact f19870a;

            /* renamed from: b, reason: collision with root package name */
            public static final LifecycleImpact f19871b;

            /* renamed from: c, reason: collision with root package name */
            public static final LifecycleImpact f19872c;
            public static final /* synthetic */ LifecycleImpact[] d;

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
            static {
                ?? r02 = new Enum("NONE", 0);
                f19870a = r02;
                ?? r1 = new Enum("ADDING", 1);
                f19871b = r1;
                ?? r2 = new Enum("REMOVING", 2);
                f19872c = r2;
                d = new LifecycleImpact[]{r02, r1, r2};
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes.dex */
        public static final class State {

            /* renamed from: a, reason: collision with root package name */
            public static final State f19873a;

            /* renamed from: b, reason: collision with root package name */
            public static final State f19874b;

            /* renamed from: c, reason: collision with root package name */
            public static final State f19875c;
            public static final State d;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ State[] f19876f;

            /* loaded from: classes.dex */
            public static final class Companion {
                public static State a(View view) {
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.d : b(view.getVisibility());
                }

                public static State b(int i2) {
                    if (i2 == 0) {
                        return State.f19874b;
                    }
                    if (i2 == 4) {
                        return State.d;
                    }
                    if (i2 == 8) {
                        return State.f19875c;
                    }
                    throw new IllegalArgumentException(android.support.v4.media.d.i("Unknown visibility ", i2));
                }
            }

            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$State] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$State] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$State] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.fragment.app.SpecialEffectsController$Operation$State] */
            static {
                ?? r02 = new Enum("REMOVED", 0);
                f19873a = r02;
                ?? r1 = new Enum("VISIBLE", 1);
                f19874b = r1;
                ?? r2 = new Enum("GONE", 2);
                f19875c = r2;
                ?? r3 = new Enum("INVISIBLE", 3);
                d = r3;
                f19876f = new State[]{r02, r1, r2, r3};
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f19876f.clone();
            }

            public final void a(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (ordinal == 1) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (ordinal == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (ordinal != 3) {
                    return;
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, CancellationSignal cancellationSignal) {
            this.f19865a = state;
            this.f19866b = lifecycleImpact;
            this.f19867c = fragment;
            cancellationSignal.b(new j(this, 0));
        }

        public final void a() {
            if (this.f19868f) {
                return;
            }
            this.f19868f = true;
            LinkedHashSet linkedHashSet = this.e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = u.d1(linkedHashSet).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).a();
            }
        }

        public void b() {
            if (this.f19869g) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f19869g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(State state, LifecycleImpact lifecycleImpact) {
            int ordinal = lifecycleImpact.ordinal();
            State state2 = State.f19873a;
            Fragment fragment = this.f19867c;
            if (ordinal == 0) {
                if (this.f19865a != state2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f19865a + " -> " + state + '.');
                    }
                    this.f19865a = state;
                    return;
                }
                return;
            }
            if (ordinal == 1) {
                if (this.f19865a == state2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f19866b + " to ADDING.");
                    }
                    this.f19865a = State.f19874b;
                    this.f19866b = LifecycleImpact.f19871b;
                    return;
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f19865a + " -> REMOVED. mLifecycleImpact  = " + this.f19866b + " to REMOVING.");
            }
            this.f19865a = state2;
            this.f19866b = LifecycleImpact.f19872c;
        }

        public void d() {
        }

        public final String toString() {
            StringBuilder v2 = android.support.v4.media.d.v("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            v2.append(this.f19865a);
            v2.append(" lifecycleImpact = ");
            v2.append(this.f19866b);
            v2.append(" fragment = ");
            v2.append(this.f19867c);
            v2.append('}');
            return v2.toString();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19877a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f19877a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        p0.a.s(viewGroup, "container");
        this.f19861a = viewGroup;
        this.f19862b = new ArrayList();
        this.f19863c = new ArrayList();
    }

    public static final SpecialEffectsController j(ViewGroup viewGroup, FragmentManager fragmentManager) {
        p0.a.s(viewGroup, "container");
        p0.a.s(fragmentManager, "fragmentManager");
        SpecialEffectsControllerFactory H = fragmentManager.H();
        p0.a.r(H, "fragmentManager.specialEffectsControllerFactory");
        return Companion.a(viewGroup, H);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.core.os.CancellationSignal, java.lang.Object] */
    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.f19862b) {
            ?? obj = new Object();
            Fragment fragment = fragmentStateManager.f19800c;
            p0.a.r(fragment, "fragmentStateManager.fragment");
            Operation h2 = h(fragment);
            if (h2 != null) {
                h2.c(state, lifecycleImpact);
                return;
            }
            FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, obj);
            this.f19862b.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.d.add(new i(this, fragmentStateManagerOperation, 0));
            fragmentStateManagerOperation.d.add(new i(this, fragmentStateManagerOperation, 1));
        }
    }

    public final void b(Operation.State state, FragmentStateManager fragmentStateManager) {
        p0.a.s(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f19800c);
        }
        a(state, Operation.LifecycleImpact.f19871b, fragmentStateManager);
    }

    public final void c(FragmentStateManager fragmentStateManager) {
        p0.a.s(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.f19800c);
        }
        a(Operation.State.f19875c, Operation.LifecycleImpact.f19870a, fragmentStateManager);
    }

    public final void d(FragmentStateManager fragmentStateManager) {
        p0.a.s(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.f19800c);
        }
        a(Operation.State.f19873a, Operation.LifecycleImpact.f19872c, fragmentStateManager);
    }

    public final void e(FragmentStateManager fragmentStateManager) {
        p0.a.s(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.f19800c);
        }
        a(Operation.State.f19874b, Operation.LifecycleImpact.f19870a, fragmentStateManager);
    }

    public abstract void f(ArrayList arrayList, boolean z2);

    public final void g() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.f19861a;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        if (!viewGroup.isAttachedToWindow()) {
            i();
            this.d = false;
            return;
        }
        synchronized (this.f19862b) {
            try {
                if (!this.f19862b.isEmpty()) {
                    ArrayList b12 = u.b1(this.f19863c);
                    this.f19863c.clear();
                    Iterator it = b12.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.a();
                        if (!operation.f19869g) {
                            this.f19863c.add(operation);
                        }
                    }
                    l();
                    ArrayList b13 = u.b1(this.f19862b);
                    this.f19862b.clear();
                    this.f19863c.addAll(b13);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = b13.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).d();
                    }
                    f(b13, this.d);
                    this.d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Operation h(Fragment fragment) {
        Object obj;
        Iterator it = this.f19862b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (p0.a.g(operation.f19867c, fragment) && !operation.f19868f) {
                break;
            }
        }
        return (Operation) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f19861a;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f19862b) {
            try {
                l();
                Iterator it = this.f19862b.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).d();
                }
                Iterator it2 = u.b1(this.f19863c).iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f19861a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                    }
                    operation.a();
                }
                Iterator it3 = u.b1(this.f19862b).iterator();
                while (it3.hasNext()) {
                    Operation operation2 = (Operation) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f19861a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                    }
                    operation2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object obj;
        synchronized (this.f19862b) {
            try {
                l();
                ArrayList arrayList = this.f19862b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    Operation operation = (Operation) obj;
                    View view = operation.f19867c.mView;
                    p0.a.r(view, "operation.fragment.mView");
                    Operation.State a2 = Operation.State.Companion.a(view);
                    Operation.State state = operation.f19865a;
                    Operation.State state2 = Operation.State.f19874b;
                    if (state == state2 && a2 != state2) {
                        break;
                    }
                }
                Operation operation2 = (Operation) obj;
                Fragment fragment = operation2 != null ? operation2.f19867c : null;
                this.e = fragment != null ? fragment.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Iterator it = this.f19862b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f19866b == Operation.LifecycleImpact.f19871b) {
                View requireView = operation.f19867c.requireView();
                p0.a.r(requireView, "fragment.requireView()");
                operation.c(Operation.State.Companion.b(requireView.getVisibility()), Operation.LifecycleImpact.f19870a);
            }
        }
    }
}
