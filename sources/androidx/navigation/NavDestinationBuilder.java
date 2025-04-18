package androidx.navigation;

import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import b1.f0;
import e1.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import x0.c;
import z0.m;

@NavDestinationDsl
/* loaded from: classes4.dex */
public class NavDestinationBuilder<D extends NavDestination> {

    /* renamed from: a, reason: collision with root package name */
    public final Navigator f20449a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20450b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20451c;
    public final Map d;
    public final LinkedHashMap e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20452f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f20453g;

    public NavDestinationBuilder(Navigator navigator, int i2, String str) {
        p0.a.s(navigator, "navigator");
        this.f20449a = navigator;
        this.f20450b = i2;
        this.f20451c = str;
        this.e = new LinkedHashMap();
        this.f20452f = new ArrayList();
        this.f20453g = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.navigation.NavDeepLink$Builder, java.lang.Object] */
    public NavDestination a() {
        LinkedHashMap linkedHashMap;
        NavDestination b2 = b();
        b2.f20433c = null;
        Iterator it = this.e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = b2.f20435g;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            NavArgument navArgument = (NavArgument) entry.getValue();
            p0.a.s(str, "argumentName");
            p0.a.s(navArgument, "argument");
            linkedHashMap.put(str, navArgument);
        }
        Iterator it2 = this.f20452f.iterator();
        while (it2.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it2.next();
            p0.a.s(navDeepLink, "navDeepLink");
            ArrayList a2 = NavArgumentKt.a(linkedHashMap, new NavDestination$addDeepLink$missingRequiredArguments$1(navDeepLink));
            if (!a2.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f20400a + " can't be used to open destination " + b2 + ".\nFollowing required arguments are missing: " + a2).toString());
            }
            b2.d.add(navDeepLink);
        }
        for (Map.Entry entry2 : this.f20453g.entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            NavAction navAction = (NavAction) entry2.getValue();
            p0.a.s(navAction, "action");
            if (!(!(b2 instanceof ActivityNavigator.Destination))) {
                throw new UnsupportedOperationException("Cannot add action " + intValue + " to " + b2 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (intValue == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            b2.f20434f.f(intValue, navAction);
        }
        String str2 = this.f20451c;
        if (str2 != null) {
            if (!(!m.Z0(str2))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            int i2 = NavDestination.f20430k;
            String a3 = NavDestination.Companion.a(str2);
            ?? obj = new Object();
            p0.a.s(a3, "uriPattern");
            obj.f20413a = a3;
            ArrayList a4 = NavArgumentKt.a(linkedHashMap, new NavDestination$route$missingRequiredArguments$1(new NavDeepLink(obj.f20413a)));
            if (!a4.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b2 + ". Following required arguments are missing: " + a4).toString());
            }
            b2.f20438j = f0.t(new NavDestination$route$3(a3));
            b2.f20436h = a3.hashCode();
            b2.f20437i = str2;
        }
        int i3 = this.f20450b;
        if (i3 != -1) {
            b2.f20436h = i3;
        }
        return b2;
    }

    public NavDestination b() {
        return this.f20449a.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator navigator, String str) {
        this(navigator, -1, str);
        p0.a.s(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator navigator, c cVar, Map map) {
        this(navigator, cVar != null ? RouteSerializerKt.b(t0.u(cVar)) : -1, cVar != null ? RouteSerializerKt.d(t0.u(cVar), map) : null);
        p0.a.s(navigator, "navigator");
        p0.a.s(map, "typeMap");
        if (cVar != null) {
            Iterator it = RouteSerializerKt.c(t0.u(cVar), map).iterator();
            while (it.hasNext()) {
                NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
                this.e.put(namedNavArgument.f20318a, namedNavArgument.f20319b);
            }
        }
        this.d = map;
    }
}
