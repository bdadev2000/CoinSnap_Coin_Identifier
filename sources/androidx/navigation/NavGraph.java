package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt$valueIterator$1;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import q0.l;
import y0.n;
import z0.m;

/* loaded from: classes.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, r0.a {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f20454p = 0;

    /* renamed from: l, reason: collision with root package name */
    public final SparseArrayCompat f20455l;

    /* renamed from: m, reason: collision with root package name */
    public int f20456m;

    /* renamed from: n, reason: collision with root package name */
    public String f20457n;

    /* renamed from: o, reason: collision with root package name */
    public String f20458o;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator navigator) {
        super(navigator);
        p0.a.s(navigator, "navGraphNavigator");
        this.f20455l = new SparseArrayCompat(0);
    }

    @Override // androidx.navigation.NavDestination
    public final NavDestination.DeepLinkMatch c(NavDeepLinkRequest navDeepLinkRequest) {
        return g(navDeepLinkRequest, false, this);
    }

    public final NavDestination e(String str, boolean z2) {
        Object obj;
        NavGraph navGraph;
        p0.a.s(str, "route");
        SparseArrayCompat sparseArrayCompat = this.f20455l;
        p0.a.s(sparseArrayCompat, "<this>");
        Iterator it = n.I(new SparseArrayKt$valueIterator$1(sparseArrayCompat)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NavDestination navDestination = (NavDestination) obj;
            if (m.S0(navDestination.f20437i, str, false) || navDestination.d(str) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) obj;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z2 || (navGraph = this.f20432b) == null || m.Z0(str)) {
            return null;
        }
        return navGraph.e(str, true);
    }

    @Override // androidx.navigation.NavDestination
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        if (super.equals(obj)) {
            SparseArrayCompat sparseArrayCompat = this.f20455l;
            int g2 = sparseArrayCompat.g();
            NavGraph navGraph = (NavGraph) obj;
            SparseArrayCompat sparseArrayCompat2 = navGraph.f20455l;
            if (g2 == sparseArrayCompat2.g() && this.f20456m == navGraph.f20456m) {
                for (NavDestination navDestination : n.I(new SparseArrayKt$valueIterator$1(sparseArrayCompat))) {
                    if (!p0.a.g(navDestination, sparseArrayCompat2.c(navDestination.f20436h))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final NavDestination f(int i2, NavDestination navDestination, boolean z2) {
        SparseArrayCompat sparseArrayCompat = this.f20455l;
        NavDestination navDestination2 = (NavDestination) sparseArrayCompat.c(i2);
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (z2) {
            Iterator it = n.I(new SparseArrayKt$valueIterator$1(sparseArrayCompat)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination2 = null;
                    break;
                }
                NavDestination navDestination3 = (NavDestination) it.next();
                navDestination2 = (!(navDestination3 instanceof NavGraph) || p0.a.g(navDestination3, navDestination)) ? null : ((NavGraph) navDestination3).f(i2, this, true);
                if (navDestination2 != null) {
                    break;
                }
            }
        }
        if (navDestination2 != null) {
            return navDestination2;
        }
        NavGraph navGraph = this.f20432b;
        if (navGraph == null || p0.a.g(navGraph, navDestination)) {
            return null;
        }
        NavGraph navGraph2 = this.f20432b;
        p0.a.p(navGraph2);
        return navGraph2.f(i2, this, z2);
    }

    public final NavDestination.DeepLinkMatch g(NavDeepLinkRequest navDeepLinkRequest, boolean z2, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        p0.a.s(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch c2 = super.c(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NavDestination next = it.next();
            deepLinkMatch = p0.a.g(next, navDestination) ? null : next.c(navDeepLinkRequest);
            if (deepLinkMatch != null) {
                arrayList.add(deepLinkMatch);
            }
        }
        NavDestination.DeepLinkMatch deepLinkMatch2 = (NavDestination.DeepLinkMatch) u.N0(arrayList);
        NavGraph navGraph = this.f20432b;
        if (navGraph != null && z2 && !p0.a.g(navGraph, navDestination)) {
            deepLinkMatch = navGraph.g(navDeepLinkRequest, true, this);
        }
        return (NavDestination.DeepLinkMatch) u.N0(q.a0(new NavDestination.DeepLinkMatch[]{c2, deepLinkMatch2, deepLinkMatch}));
    }

    @Override // androidx.navigation.NavDestination
    public final int hashCode() {
        int i2 = this.f20456m;
        SparseArrayCompat sparseArrayCompat = this.f20455l;
        int g2 = sparseArrayCompat.g();
        for (int i3 = 0; i3 < g2; i3++) {
            i2 = (((i2 * 31) + sparseArrayCompat.d(i3)) * 31) + ((NavDestination) sparseArrayCompat.h(i3)).hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    public final NavDestination.DeepLinkMatch j(String str, boolean z2, NavDestination navDestination) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        p0.a.s(str, "route");
        p0.a.s(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch d = d(str);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NavDestination next = it.next();
            deepLinkMatch = p0.a.g(next, navDestination) ? null : next instanceof NavGraph ? ((NavGraph) next).j(str, false, this) : next.d(str);
            if (deepLinkMatch != null) {
                arrayList.add(deepLinkMatch);
            }
        }
        NavDestination.DeepLinkMatch deepLinkMatch2 = (NavDestination.DeepLinkMatch) u.N0(arrayList);
        NavGraph navGraph = this.f20432b;
        if (navGraph != null && z2 && !p0.a.g(navGraph, navDestination)) {
            deepLinkMatch = navGraph.j(str, true, this);
        }
        return (NavDestination.DeepLinkMatch) u.N0(q.a0(new NavDestination.DeepLinkMatch[]{d, deepLinkMatch2, deepLinkMatch}));
    }

    public final void k(k1.a aVar, l lVar) {
        int b2 = RouteSerializerKt.b(aVar);
        NavDestination f2 = f(b2, this, false);
        if (f2 != null) {
            l((String) lVar.invoke(f2));
            this.f20456m = b2;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + aVar.b().g() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    public final void l(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (!(!p0.a.g(str, this.f20437i))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!m.Z0(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            hashCode = NavDestination.Companion.a(str).hashCode();
        }
        this.f20456m = hashCode;
        this.f20458o = str;
    }

    @Override // androidx.navigation.NavDestination
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f20458o;
        NavDestination e = (str == null || m.Z0(str)) ? null : e(str, true);
        if (e == null) {
            e = f(this.f20456m, this, false);
        }
        sb.append(" startDestination=");
        if (e == null) {
            String str2 = this.f20458o;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f20457n;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f20456m));
                }
            }
        } else {
            sb.append("{");
            sb.append(e.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }
}
