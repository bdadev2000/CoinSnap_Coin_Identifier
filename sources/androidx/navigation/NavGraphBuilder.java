package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import androidx.navigation.NavigatorProvider;
import e1.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import x0.c;

@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {

    /* renamed from: h, reason: collision with root package name */
    public final NavigatorProvider f20464h;

    /* renamed from: i, reason: collision with root package name */
    public final String f20465i;

    /* renamed from: j, reason: collision with root package name */
    public final c f20466j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f20467k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f20468l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, Object obj, c cVar, Map map) {
        super(navigatorProvider.b(NavigatorProvider.Companion.a(NavGraphNavigator.class)), cVar, map);
        p0.a.s(navigatorProvider, "provider");
        p0.a.s(obj, "startDestination");
        p0.a.s(map, "typeMap");
        this.f20468l = new ArrayList();
        this.f20464h = navigatorProvider;
        this.f20467k = obj;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavGraph a() {
        NavGraph navGraph = (NavGraph) super.a();
        ArrayList arrayList = this.f20468l;
        p0.a.s(arrayList, "nodes");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NavDestination navDestination = (NavDestination) it.next();
            if (navDestination != null) {
                int i2 = navDestination.f20436h;
                String str = navDestination.f20437i;
                if (i2 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
                }
                if (navGraph.f20437i != null && !(!p0.a.g(str, r6))) {
                    throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + navGraph).toString());
                }
                if (i2 == navGraph.f20436h) {
                    throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + navGraph).toString());
                }
                SparseArrayCompat sparseArrayCompat = navGraph.f20455l;
                NavDestination navDestination2 = (NavDestination) sparseArrayCompat.c(i2);
                if (navDestination2 == navDestination) {
                    continue;
                } else {
                    if (navDestination.f20432b != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                    }
                    if (navDestination2 != null) {
                        navDestination2.f20432b = null;
                    }
                    navDestination.f20432b = navGraph;
                    sparseArrayCompat.f(navDestination.f20436h, navDestination);
                }
            }
        }
        Object obj = this.f20467k;
        c cVar = this.f20466j;
        String str2 = this.f20465i;
        if (str2 == null && cVar == null && obj == null) {
            if (this.f20451c != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str2 != null) {
            navGraph.l(str2);
        } else if (cVar != null) {
            navGraph.k(t0.u(cVar), NavGraphBuilder$build$1$1.f20469a);
        } else if (obj != null) {
            navGraph.k(t0.u(g0.a(obj.getClass())), new NavGraph$setStartDestination$2(obj));
        } else {
            if (navGraph.f20436h == 0) {
                throw new IllegalArgumentException(("Start destination 0 cannot use the same id as the graph " + navGraph).toString());
            }
            if (navGraph.f20458o != null) {
                navGraph.l(null);
            }
            navGraph.f20456m = 0;
            navGraph.f20457n = null;
        }
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2) {
        super(navigatorProvider.b(NavigatorProvider.Companion.a(NavGraphNavigator.class)), str2);
        p0.a.s(navigatorProvider, "provider");
        p0.a.s(str, "startDestination");
        this.f20468l = new ArrayList();
        this.f20464h = navigatorProvider;
        this.f20465i = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, c cVar, c cVar2, Map map) {
        super(navigatorProvider.b(NavigatorProvider.Companion.a(NavGraphNavigator.class)), cVar2, map);
        p0.a.s(navigatorProvider, "provider");
        p0.a.s(cVar, "startDestination");
        p0.a.s(map, "typeMap");
        this.f20468l = new ArrayList();
        this.f20464h = navigatorProvider;
        this.f20466j = cVar;
    }
}
