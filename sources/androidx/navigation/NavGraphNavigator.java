package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import b1.f0;
import e0.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

@Navigator.Name("navigation")
/* loaded from: classes.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {

    /* renamed from: c, reason: collision with root package name */
    public final NavigatorProvider f20470c;

    public NavGraphNavigator(NavigatorProvider navigatorProvider) {
        p0.a.s(navigatorProvider, "navigatorProvider");
        this.f20470c = navigatorProvider;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            NavDestination navDestination = navBackStackEntry.f20328b;
            p0.a.q(navDestination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            NavGraph navGraph = (NavGraph) navDestination;
            ?? obj = new Object();
            obj.f30930a = navBackStackEntry.a();
            int i2 = navGraph.f20456m;
            String str = navGraph.f20458o;
            if (i2 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i3 = navGraph.f20436h;
                sb.append(i3 != 0 ? String.valueOf(i3) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            NavDestination e = str != null ? navGraph.e(str, false) : (NavDestination) navGraph.f20455l.c(i2);
            if (e == null) {
                if (navGraph.f20457n == null) {
                    String str2 = navGraph.f20458o;
                    if (str2 == null) {
                        str2 = String.valueOf(navGraph.f20456m);
                    }
                    navGraph.f20457n = str2;
                }
                String str3 = navGraph.f20457n;
                p0.a.p(str3);
                throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                if (!p0.a.g(str, e.f20437i)) {
                    NavDestination.DeepLinkMatch d = e.d(str);
                    Bundle bundle = d != null ? d.f20441b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putAll(bundle);
                        Bundle bundle3 = (Bundle) obj.f30930a;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        obj.f30930a = bundle2;
                    }
                }
                LinkedHashMap linkedHashMap = e.f20435g;
                if (!e0.x(linkedHashMap).isEmpty()) {
                    ArrayList a2 = NavArgumentKt.a(e0.x(linkedHashMap), new NavGraphNavigator$navigate$missingRequiredArgs$1(obj));
                    if (!a2.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + e + ". Missing required arguments [" + a2 + ']').toString());
                    }
                } else {
                    continue;
                }
            }
            this.f20470c.b(e.f20431a).d(f0.u(b().a(e, e.b((Bundle) obj.f30930a))), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public NavGraph a() {
        return new NavGraph(this);
    }
}
