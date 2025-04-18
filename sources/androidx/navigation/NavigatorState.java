package androidx.navigation;

import android.os.Bundle;
import e0.u;
import e0.w;
import e0.y;
import e1.i1;
import e1.o0;
import e1.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class NavigatorState {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f20519a = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name */
    public final i1 f20520b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f20521c;
    public boolean d;
    public final o0 e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f20522f;

    public NavigatorState() {
        i1 c2 = t0.c(w.f30218a);
        this.f20520b = c2;
        i1 c3 = t0.c(y.f30220a);
        this.f20521c = c3;
        this.e = new o0(c2);
        this.f20522f = new o0(c3);
    }

    public abstract NavBackStackEntry a(NavDestination navDestination, Bundle bundle);

    public void b(NavBackStackEntry navBackStackEntry) {
        p0.a.s(navBackStackEntry, "entry");
        i1 i1Var = this.f20521c;
        Set set = (Set) i1Var.getValue();
        p0.a.s(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.g(set.size()));
        boolean z2 = false;
        for (Object obj : set) {
            boolean z3 = true;
            if (!z2 && p0.a.g(obj, navBackStackEntry)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(obj);
            }
        }
        i1Var.h(linkedHashSet);
    }

    public void c(NavBackStackEntry navBackStackEntry, boolean z2) {
        p0.a.s(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.f20519a;
        reentrantLock.lock();
        try {
            i1 i1Var = this.f20520b;
            Iterable iterable = (Iterable) i1Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!p0.a.g((NavBackStackEntry) obj, navBackStackEntry))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            i1Var.h(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void d(NavBackStackEntry navBackStackEntry, boolean z2) {
        Object obj;
        p0.a.s(navBackStackEntry, "popUpTo");
        i1 i1Var = this.f20521c;
        Iterable iterable = (Iterable) i1Var.getValue();
        boolean z3 = iterable instanceof Collection;
        o0 o0Var = this.e;
        if (!z3 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) o0Var.f30313a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                        }
                    }
                    return;
                }
            }
        }
        i1Var.h(e0.q.g0((Set) i1Var.getValue(), navBackStackEntry));
        List list = (List) o0Var.f30313a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (!p0.a.g(navBackStackEntry2, navBackStackEntry) && ((List) o0Var.f30313a.getValue()).lastIndexOf(navBackStackEntry2) < ((List) o0Var.f30313a.getValue()).lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
        if (navBackStackEntry3 != null) {
            i1Var.h(e0.q.g0((Set) i1Var.getValue(), navBackStackEntry3));
        }
        c(navBackStackEntry, z2);
    }

    public void e(NavBackStackEntry navBackStackEntry) {
        p0.a.s(navBackStackEntry, "entry");
        i1 i1Var = this.f20521c;
        i1Var.h(e0.q.g0((Set) i1Var.getValue(), navBackStackEntry));
    }

    public void f(NavBackStackEntry navBackStackEntry) {
        p0.a.s(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f20519a;
        reentrantLock.lock();
        try {
            i1 i1Var = this.f20520b;
            i1Var.h(u.Q0((Collection) i1Var.getValue(), navBackStackEntry));
        } finally {
            reentrantLock.unlock();
        }
    }
}
