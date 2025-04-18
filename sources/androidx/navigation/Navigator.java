package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import e0.u;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import y0.e;
import y0.f;
import y0.m;
import y0.o;

/* loaded from: classes.dex */
public abstract class Navigator<D extends NavDestination> {

    /* renamed from: a, reason: collision with root package name */
    public NavigatorState f20511a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20512b;

    /* loaded from: classes.dex */
    public interface Extras {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Name {
        String value();
    }

    public abstract NavDestination a();

    public final NavigatorState b() {
        NavigatorState navigatorState = this.f20511a;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public NavDestination c(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Extras extras) {
        return navDestination;
    }

    public void d(List list, NavOptions navOptions, Extras extras) {
        e eVar = new e(new f(m.P(u.z0(list), new Navigator$navigate$1(this, navOptions, extras)), false, o.f31446a));
        while (eVar.hasNext()) {
            b().f((NavBackStackEntry) eVar.next());
        }
    }

    public void e(NavBackStackEntry navBackStackEntry, boolean z2) {
        p0.a.s(navBackStackEntry, "popUpTo");
        List list = (List) b().e.f30313a.getValue();
        if (!list.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (f()) {
            navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (p0.a.g(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            b().c(navBackStackEntry2, z2);
        }
    }

    public boolean f() {
        return true;
    }
}
