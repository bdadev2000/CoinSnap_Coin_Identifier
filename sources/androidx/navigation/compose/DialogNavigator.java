package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import b1.f0;
import e0.u;
import java.util.Iterator;
import java.util.List;
import q0.q;

@StabilityInferred
@Navigator.Name("dialog")
/* loaded from: classes3.dex */
public final class DialogNavigator extends Navigator<Destination> {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @StabilityInferred
    @NavDestination.ClassType
    /* loaded from: classes3.dex */
    public static final class Destination extends NavDestination implements FloatingWindow {

        /* renamed from: l, reason: collision with root package name */
        public final DialogProperties f20574l;

        /* renamed from: m, reason: collision with root package name */
        public final q f20575m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(DialogNavigator dialogNavigator, ComposableLambdaImpl composableLambdaImpl) {
            super(dialogNavigator);
            DialogProperties dialogProperties = new DialogProperties(7);
            this.f20574l = dialogProperties;
            this.f20575m = composableLambdaImpl;
        }
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this, ComposableSingletons$DialogNavigatorKt.f20531a);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public final void e(NavBackStackEntry navBackStackEntry, boolean z2) {
        b().d(navBackStackEntry, z2);
        int H0 = u.H0((Iterable) b().f20522f.f30313a.getValue(), navBackStackEntry);
        int i2 = 0;
        for (Object obj : (Iterable) b().f20522f.f30313a.getValue()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i2 > H0) {
                b().b(navBackStackEntry2);
            }
            i2 = i3;
        }
    }
}
