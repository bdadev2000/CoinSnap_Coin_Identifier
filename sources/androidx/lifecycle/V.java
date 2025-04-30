package androidx.lifecycle;

import Q7.AbstractC0255x;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import q4.C2645d;
import r0.AbstractC2654b;
import r0.C2653a;
import r0.C2655c;
import s0.C2690a;
import s0.C2692c;
import t7.C2719h;
import x7.EnumC2928a;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final L4.f f4868a = new L4.f(15);
    public static final R3.e b = new R3.e(15);

    /* renamed from: c, reason: collision with root package name */
    public static final C2645d f4869c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final C2692c f4870d = new Object();

    public static final void a(b0 b0Var, G0.e eVar, AbstractC0505o abstractC0505o) {
        G7.j.e(eVar, "registry");
        G7.j.e(abstractC0505o, "lifecycle");
        T t9 = (T) b0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (t9 != null && !t9.f4867d) {
            t9.h(eVar, abstractC0505o);
            EnumC0504n enumC0504n = ((C0513x) abstractC0505o).f4904d;
            if (enumC0504n != EnumC0504n.f4892c && enumC0504n.compareTo(EnumC0504n.f4894f) < 0) {
                abstractC0505o.a(new R0.a(3, abstractC0505o, eVar));
            } else {
                eVar.d();
            }
        }
    }

    public static S b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new S();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                G7.j.d(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new S(hashMap);
        }
        ClassLoader classLoader = S.class.getClassLoader();
        G7.j.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = parcelableArrayList.get(i9);
                G7.j.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i9));
            }
            return new S(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    public static final S c(C2655c c2655c) {
        W w2;
        Bundle bundle;
        L4.f fVar = f4868a;
        LinkedHashMap linkedHashMap = c2655c.f22812a;
        G0.g gVar = (G0.g) linkedHashMap.get(fVar);
        if (gVar != null) {
            g0 g0Var = (g0) linkedHashMap.get(b);
            if (g0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f4869c);
                String str = (String) linkedHashMap.get(C2692c.f22965a);
                if (str != null) {
                    G0.d b8 = gVar.getSavedStateRegistry().b();
                    if (b8 instanceof W) {
                        w2 = (W) b8;
                    } else {
                        w2 = null;
                    }
                    if (w2 != null) {
                        LinkedHashMap linkedHashMap2 = g(g0Var).b;
                        S s5 = (S) linkedHashMap2.get(str);
                        if (s5 == null) {
                            Class[] clsArr = S.f4861f;
                            w2.b();
                            Bundle bundle3 = w2.f4872c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = w2.f4872c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = w2.f4872c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                w2.f4872c = null;
                            }
                            S b9 = b(bundle, bundle2);
                            linkedHashMap2.put(str, b9);
                            return b9;
                        }
                        return s5;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, EnumC0503m enumC0503m) {
        G7.j.e(activity, "activity");
        G7.j.e(enumC0503m, NotificationCompat.CATEGORY_EVENT);
        if (activity instanceof InterfaceC0511v) {
            AbstractC0505o lifecycle = ((InterfaceC0511v) activity).getLifecycle();
            if (lifecycle instanceof C0513x) {
                ((C0513x) lifecycle).e(enumC0503m);
            }
        }
    }

    public static final void e(G0.g gVar) {
        G7.j.e(gVar, "<this>");
        EnumC0504n enumC0504n = ((C0513x) gVar.getLifecycle()).f4904d;
        if (enumC0504n != EnumC0504n.f4892c && enumC0504n != EnumC0504n.f4893d) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (gVar.getSavedStateRegistry().b() == null) {
            W w2 = new W(gVar.getSavedStateRegistry(), (g0) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", w2);
            gVar.getLifecycle().a(new G0.b(w2, 3));
        }
    }

    public static final C0507q f(InterfaceC0511v interfaceC0511v) {
        C0507q c0507q;
        G7.j.e(interfaceC0511v, "<this>");
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        G7.j.e(lifecycle, "<this>");
        loop0: while (true) {
            AtomicReference atomicReference = lifecycle.f4897a;
            c0507q = (C0507q) atomicReference.get();
            if (c0507q == null) {
                w7.k x9 = new Q7.X(null);
                X7.e eVar = Q7.F.f2529a;
                R7.c cVar = V7.o.f3533a.f2766h;
                G7.j.e(cVar, "context");
                if (cVar != w7.l.b) {
                    x9 = (w7.k) cVar.b(x9, w7.c.f23996d);
                }
                c0507q = new C0507q(lifecycle, x9);
                while (!atomicReference.compareAndSet(null, c0507q)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                X7.e eVar2 = Q7.F.f2529a;
                AbstractC0255x.l(c0507q, V7.o.f3533a.f2766h, null, new C0506p(c0507q, null), 2);
                break loop0;
            }
            break;
        }
        return c0507q;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.d0] */
    public static final X g(g0 g0Var) {
        AbstractC2654b abstractC2654b;
        G7.j.e(g0Var, "<this>");
        ?? obj = new Object();
        f0 viewModelStore = g0Var.getViewModelStore();
        if (g0Var instanceof InterfaceC0499i) {
            abstractC2654b = ((InterfaceC0499i) g0Var).getDefaultViewModelCreationExtras();
        } else {
            abstractC2654b = C2653a.b;
        }
        G7.j.e(viewModelStore, "store");
        G7.j.e(abstractC2654b, "defaultCreationExtras");
        return (X) new l5.k(viewModelStore, obj, abstractC2654b).h(G7.s.a(X.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C2690a h(b0 b0Var) {
        C2690a c2690a;
        G7.j.e(b0Var, "<this>");
        synchronized (f4870d) {
            c2690a = (C2690a) b0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c2690a == null) {
                w7.k kVar = w7.l.b;
                try {
                    X7.e eVar = Q7.F.f2529a;
                    kVar = V7.o.f3533a.f2766h;
                } catch (IllegalStateException | C2719h unused) {
                }
                C2690a c2690a2 = new C2690a(kVar.n(new Q7.X(null)));
                b0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c2690a2);
                c2690a = c2690a2;
            }
        }
        return c2690a;
    }

    public static void i(Activity activity) {
        G7.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            P.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new P());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final Object j(InterfaceC0511v interfaceC0511v, EnumC0504n enumC0504n, F7.p pVar, w7.f fVar) {
        Object d2;
        AbstractC0505o lifecycle = interfaceC0511v.getLifecycle();
        if (enumC0504n != EnumC0504n.f4892c) {
            EnumC0504n enumC0504n2 = ((C0513x) lifecycle).f4904d;
            EnumC0504n enumC0504n3 = EnumC0504n.b;
            t7.y yVar = t7.y.f23029a;
            EnumC2928a enumC2928a = EnumC2928a.b;
            if (enumC0504n2 == enumC0504n3 || (d2 = AbstractC0255x.d(new N(lifecycle, enumC0504n, pVar, null), fVar)) != enumC2928a) {
                d2 = yVar;
            }
            if (d2 == enumC2928a) {
                return d2;
            }
            return yVar;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final void k(View view, InterfaceC0511v interfaceC0511v) {
        G7.j.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0511v);
    }
}
