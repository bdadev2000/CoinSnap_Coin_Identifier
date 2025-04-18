package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Navigator$navigate$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Navigator f20513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavOptions f20514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Navigator.Extras f20515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Navigator$navigate$1(Navigator navigator, NavOptions navOptions, Navigator.Extras extras) {
        super(1);
        this.f20513a = navigator;
        this.f20514b = navOptions;
        this.f20515c = extras;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        p0.a.s(navBackStackEntry, "backStackEntry");
        NavDestination navDestination = navBackStackEntry.f20328b;
        if (!(navDestination instanceof NavDestination)) {
            navDestination = null;
        }
        if (navDestination == null) {
            return null;
        }
        Bundle a2 = navBackStackEntry.a();
        Navigator navigator = this.f20513a;
        NavDestination c2 = navigator.c(navDestination, a2, this.f20514b, this.f20515c);
        if (c2 == null) {
            navBackStackEntry = null;
        } else if (!p0.a.g(c2, navDestination)) {
            navBackStackEntry = navigator.b().a(c2, c2.b(navBackStackEntry.a()));
        }
        return navBackStackEntry;
    }
}
