package androidx.fragment.app;

import M0.C0218i;
import T.AbstractC0267e0;
import U4.RunnableC0311g;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t7.C2720i;
import u7.AbstractC2816g;
import u7.AbstractC2818i;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481p extends K0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f4748c;

    /* renamed from: d, reason: collision with root package name */
    public final L0 f4749d;

    /* renamed from: e, reason: collision with root package name */
    public final L0 f4750e;

    /* renamed from: f, reason: collision with root package name */
    public final G0 f4751f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4752g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4753h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4754i;

    /* renamed from: j, reason: collision with root package name */
    public final x.b f4755j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4756k;
    public final ArrayList l;
    public final x.b m;

    /* renamed from: n, reason: collision with root package name */
    public final x.b f4757n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4758o;

    /* renamed from: p, reason: collision with root package name */
    public final P.e f4759p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public Object f4760q;

    /* JADX WARN: Type inference failed for: r1v1, types: [P.e, java.lang.Object] */
    public C0481p(ArrayList arrayList, L0 l02, L0 l03, G0 g02, Object obj, ArrayList arrayList2, ArrayList arrayList3, x.b bVar, ArrayList arrayList4, ArrayList arrayList5, x.b bVar2, x.b bVar3, boolean z8) {
        this.f4748c = arrayList;
        this.f4749d = l02;
        this.f4750e = l03;
        this.f4751f = g02;
        this.f4752g = obj;
        this.f4753h = arrayList2;
        this.f4754i = arrayList3;
        this.f4755j = bVar;
        this.f4756k = arrayList4;
        this.l = arrayList5;
        this.m = bVar2;
        this.f4757n = bVar3;
        this.f4758o = z8;
    }

    public static void f(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC0267e0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt.getVisibility() == 0) {
                    f(childAt, arrayList);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    @Override // androidx.fragment.app.K0
    public final boolean a() {
        Object obj;
        G0 g02 = this.f4751f;
        if (g02.l()) {
            List<C0482q> list = this.f4748c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C0482q c0482q : list) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = c0482q.b) == null || !g02.m(obj)) {
                        break;
                    }
                }
            }
            Object obj2 = this.f4752g;
            if (obj2 == null || g02.m(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.K0
    public final void b(ViewGroup viewGroup) {
        G7.j.e(viewGroup, "container");
        P.e eVar = this.f4759p;
        synchronized (eVar) {
            try {
                if (!eVar.f2260a) {
                    eVar.f2260a = true;
                    eVar.f2261c = true;
                    C0218i c0218i = eVar.b;
                    if (c0218i != null) {
                        try {
                            Runnable runnable = (Runnable) c0218i.f1883c;
                            if (runnable == null) {
                                ((M0.w) c0218i.f1885f).cancel();
                                ((Runnable) c0218i.f1884d).run();
                            } else {
                                runnable.run();
                            }
                        } catch (Throwable th) {
                            synchronized (eVar) {
                                eVar.f2261c = false;
                                eVar.notifyAll();
                                throw th;
                            }
                        }
                    }
                    synchronized (eVar) {
                        eVar.f2261c = false;
                        eVar.notifyAll();
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.fragment.app.K0
    public final void c(ViewGroup viewGroup) {
        Object obj;
        G7.j.e(viewGroup, "container");
        boolean isLaidOut = viewGroup.isLaidOut();
        List<C0482q> list = this.f4748c;
        if (!isLaidOut) {
            for (C0482q c0482q : list) {
                L0 l02 = c0482q.f4731a;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + l02);
                }
                c0482q.f4731a.c(this);
            }
            return;
        }
        Object obj2 = this.f4760q;
        G0 g02 = this.f4751f;
        L0 l03 = this.f4750e;
        L0 l04 = this.f4749d;
        if (obj2 != null) {
            g02.c(obj2);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ending execution of operations from " + l04 + " to " + l03);
                return;
            }
            return;
        }
        C2720i g9 = g(viewGroup, l03, l04);
        ArrayList arrayList = (ArrayList) g9.b;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0482q) it.next()).f4731a);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            obj = g9.f23021c;
            if (!hasNext) {
                break;
            }
            L0 l05 = (L0) it2.next();
            g02.u(l05.f4667c, obj, this.f4759p, new RunnableC0473l(l05, this, 1));
        }
        i(arrayList, viewGroup, new C0475m(this, viewGroup, obj, 0));
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + l04 + " to " + l03);
        }
    }

    @Override // androidx.fragment.app.K0
    public final void d(f.b bVar, ViewGroup viewGroup) {
        G7.j.e(bVar, "backEvent");
        G7.j.e(viewGroup, "container");
        Object obj = this.f4760q;
        if (obj != null) {
            this.f4751f.r(obj, bVar.f20211c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [G7.r, java.lang.Object] */
    @Override // androidx.fragment.app.K0
    public final void e(ViewGroup viewGroup) {
        Object obj;
        G7.j.e(viewGroup, "container");
        boolean isLaidOut = viewGroup.isLaidOut();
        List list = this.f4748c;
        if (!isLaidOut) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                L0 l02 = ((C0482q) it.next()).f4731a;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + l02);
                }
            }
            return;
        }
        boolean h6 = h();
        L0 l03 = this.f4750e;
        L0 l04 = this.f4749d;
        if (h6 && (obj = this.f4752g) != null && !a()) {
            Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + l04 + " and " + l03 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            ?? obj2 = new Object();
            C2720i g9 = g(viewGroup, l03, l04);
            ArrayList arrayList = (ArrayList) g9.b;
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0482q) it2.next()).f4731a);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                Object obj3 = g9.f23021c;
                if (hasNext) {
                    L0 l05 = (L0) it3.next();
                    D3.b bVar = new D3.b(obj2, 13);
                    Fragment fragment = l05.f4667c;
                    this.f4751f.v(obj3, this.f4759p, bVar, new RunnableC0473l(l05, this, 0));
                } else {
                    i(arrayList, viewGroup, new C0479o(this, viewGroup, obj3, obj2));
                    return;
                }
            }
        }
    }

    public final C2720i g(ViewGroup viewGroup, L0 l02, L0 l03) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        G0 g02;
        Object obj2;
        C0481p c0481p = this;
        ViewGroup viewGroup2 = viewGroup;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        List list = c0481p.f4748c;
        Iterator it = list.iterator();
        View view2 = null;
        boolean z8 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = c0481p.f4754i;
            arrayList2 = c0481p.f4753h;
            obj = c0481p.f4752g;
            g02 = c0481p.f4751f;
            if (!hasNext) {
                break;
            }
            if (((C0482q) it.next()).f4769d != null && l03 != null && l02 != null && (!c0481p.f4755j.isEmpty()) && obj != null) {
                E0 e02 = z0.f4814a;
                Fragment fragment = l02.f4667c;
                G7.j.e(fragment, "inFragment");
                Iterator it2 = it;
                Fragment fragment2 = l03.f4667c;
                G7.j.e(fragment2, "outFragment");
                View view3 = view2;
                x.b bVar = c0481p.m;
                G7.j.e(bVar, "sharedElements");
                if (c0481p.f4758o) {
                    fragment2.getEnterTransitionCallback();
                } else {
                    fragment.getEnterTransitionCallback();
                }
                T.A.a(viewGroup2, new RunnableC0311g(l02, l03, c0481p, 2));
                arrayList2.addAll(bVar.values());
                ArrayList arrayList3 = c0481p.l;
                if (!arrayList3.isEmpty()) {
                    Object obj3 = arrayList3.get(0);
                    G7.j.d(obj3, "exitingNames[0]");
                    View view4 = (View) bVar.getOrDefault((String) obj3, null);
                    g02.s(view4, obj);
                    view2 = view4;
                } else {
                    view2 = view3;
                }
                x.b bVar2 = c0481p.f4757n;
                arrayList.addAll(bVar2.values());
                ArrayList arrayList4 = c0481p.f4756k;
                if (!arrayList4.isEmpty()) {
                    Object obj4 = arrayList4.get(0);
                    G7.j.d(obj4, "enteringNames[0]");
                    View view5 = (View) bVar2.getOrDefault((String) obj4, null);
                    if (view5 != null) {
                        T.A.a(viewGroup2, new RunnableC0311g(g02, view5, rect, 3));
                        z8 = true;
                    }
                }
                g02.w(obj, view, arrayList2);
                G0 g03 = c0481p.f4751f;
                Object obj5 = c0481p.f4752g;
                g03.q(obj5, null, null, obj5, c0481p.f4754i);
                it = it2;
            } else {
                it = it;
                view2 = view2;
            }
        }
        View view6 = view2;
        Object obj6 = null;
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = list.iterator();
        Object obj7 = null;
        while (true) {
            obj2 = obj7;
            if (!it3.hasNext()) {
                break;
            }
            C0482q c0482q = (C0482q) it3.next();
            Iterator it4 = it3;
            L0 l04 = c0482q.f4731a;
            Object obj8 = obj6;
            Object h6 = g02.h(c0482q.b);
            if (h6 != null) {
                ArrayList arrayList6 = new ArrayList();
                View view7 = l04.f4667c.mView;
                Rect rect2 = rect;
                G7.j.d(view7, "operation.fragment.mView");
                f(view7, arrayList6);
                if (obj != null && (l04 == l03 || l04 == l02)) {
                    if (l04 == l03) {
                        arrayList6.removeAll(AbstractC2816g.V(arrayList2));
                    } else {
                        arrayList6.removeAll(AbstractC2816g.V(arrayList));
                    }
                }
                if (arrayList6.isEmpty()) {
                    g02.a(view, h6);
                } else {
                    g02.b(h6, arrayList6);
                    c0481p.f4751f.q(h6, h6, arrayList6, null, null);
                    if (l04.f4666a == 3) {
                        l04.f4673i = false;
                        ArrayList arrayList7 = new ArrayList(arrayList6);
                        Fragment fragment3 = l04.f4667c;
                        arrayList7.remove(fragment3.mView);
                        g02.p(h6, fragment3.mView, arrayList7);
                        T.A.a(viewGroup2, new D3.b(arrayList6, 14));
                    }
                }
                if (l04.f4666a == 2) {
                    arrayList5.addAll(arrayList6);
                    if (z8) {
                        g02.t(h6, rect2);
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        rect2 = rect2;
                        Log.v(FragmentManager.TAG, "Entering Transition: " + h6);
                        Log.v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                        for (Iterator it5 = arrayList6.iterator(); it5.hasNext(); it5 = it5) {
                            Object next = it5.next();
                            G7.j.d(next, "transitioningViews");
                            Log.v(FragmentManager.TAG, "View: " + ((View) next));
                        }
                    } else {
                        rect2 = rect2;
                    }
                } else {
                    View view8 = view6;
                    g02.s(view8, h6);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        view6 = view8;
                        Log.v(FragmentManager.TAG, "Exiting Transition: " + h6);
                        Log.v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            Object next2 = it6.next();
                            G7.j.d(next2, "transitioningViews");
                            Log.v(FragmentManager.TAG, "View: " + ((View) next2));
                        }
                    } else {
                        view6 = view8;
                    }
                }
                if (c0482q.f4768c) {
                    obj6 = g02.o(obj8, h6);
                    c0481p = this;
                    viewGroup2 = viewGroup;
                    obj7 = obj2;
                    it3 = it4;
                    rect = rect2;
                } else {
                    obj7 = g02.o(obj2, h6);
                    viewGroup2 = viewGroup;
                    obj6 = obj8;
                    it3 = it4;
                    rect = rect2;
                    c0481p = this;
                }
            } else {
                obj6 = obj8;
                obj7 = obj2;
                it3 = it4;
                c0481p = this;
                viewGroup2 = viewGroup;
            }
        }
        Object n2 = g02.n(obj6, obj2, obj);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Final merged transition: " + n2);
        }
        return new C2720i(arrayList5, n2);
    }

    public final boolean h() {
        List list = this.f4748c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C0482q) it.next()).f4731a.f4667c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, F7.a aVar) {
        z0.a(4, arrayList);
        G0 g02 = this.f4751f;
        g02.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f4754i;
        int size = arrayList3.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList3.get(i9);
            arrayList2.add(ViewCompat.getTransitionName(view));
            ViewCompat.setTransitionName(view, null);
        }
        boolean isLoggingEnabled = FragmentManager.isLoggingEnabled(2);
        ArrayList arrayList4 = this.f4753h;
        if (isLoggingEnabled) {
            Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
            Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                G7.j.d(next, "sharedElementFirstOutViews");
                View view2 = (View) next;
                Log.v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
            }
            Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                G7.j.d(next2, "sharedElementLastInViews");
                View view3 = (View) next2;
                Log.v(FragmentManager.TAG, "View: " + view3 + " Name: " + ViewCompat.getTransitionName(view3));
            }
        }
        aVar.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList6 = this.f4753h;
            if (i10 < size2) {
                View view4 = (View) arrayList6.get(i10);
                String transitionName = ViewCompat.getTransitionName(view4);
                arrayList5.add(transitionName);
                if (transitionName != null) {
                    ViewCompat.setTransitionName(view4, null);
                    String str = (String) this.f4755j.getOrDefault(transitionName, null);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        if (str.equals(arrayList2.get(i11))) {
                            ViewCompat.setTransitionName((View) arrayList3.get(i11), transitionName);
                            break;
                        }
                        i11++;
                    }
                }
                i10++;
            } else {
                T.A.a(viewGroup, new F0(size2, arrayList3, arrayList2, arrayList6, arrayList5));
                z0.a(0, arrayList);
                g02.x(this.f4752g, arrayList4, arrayList3);
                return;
            }
        }
    }
}
