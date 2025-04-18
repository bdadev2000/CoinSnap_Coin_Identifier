package androidx.navigation.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorState;
import e0.q;
import e0.u;
import e1.i1;
import e1.o0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q0.l;
import q0.r;

@StabilityInferred
@Navigator.Name("composable")
/* loaded from: classes4.dex */
public final class ComposeNavigator extends Navigator<Destination> {

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f20533c;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    @StabilityInferred
    @NavDestination.ClassType
    /* loaded from: classes4.dex */
    public static final class Destination extends NavDestination {

        /* renamed from: l, reason: collision with root package name */
        public final r f20534l;

        /* renamed from: m, reason: collision with root package name */
        public l f20535m;

        /* renamed from: n, reason: collision with root package name */
        public l f20536n;

        /* renamed from: o, reason: collision with root package name */
        public l f20537o;

        /* renamed from: p, reason: collision with root package name */
        public l f20538p;

        /* renamed from: q, reason: collision with root package name */
        public l f20539q;

        /* renamed from: androidx.navigation.compose.ComposeNavigator$Destination$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        final class AnonymousClass1 extends kotlin.jvm.internal.r implements r {
            @Override // q0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ((Number) obj4).intValue();
                throw null;
            }
        }

        public Destination(ComposeNavigator composeNavigator, r rVar) {
            super(composeNavigator);
            this.f20534l = rVar;
        }
    }

    public ComposeNavigator() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f20533c = f2;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination a() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.f20529a);
    }

    @Override // androidx.navigation.Navigator
    public final void d(List list, NavOptions navOptions, Navigator.Extras extras) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            NavigatorState b2 = b();
            p0.a.s(navBackStackEntry, "backStackEntry");
            i1 i1Var = b2.f20521c;
            Iterable iterable = (Iterable) i1Var.getValue();
            boolean z2 = iterable instanceof Collection;
            o0 o0Var = b2.e;
            if (!z2 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                        Iterable iterable2 = (Iterable) o0Var.f30313a.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((NavBackStackEntry) it3.next()) == navBackStackEntry) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) u.M0((List) o0Var.f30313a.getValue());
            if (navBackStackEntry2 != null) {
                i1Var.h(q.g0((Set) i1Var.getValue(), navBackStackEntry2));
            }
            i1Var.h(q.g0((Set) i1Var.getValue(), navBackStackEntry));
            b2.f(navBackStackEntry);
        }
        this.f20533c.setValue(Boolean.FALSE);
    }

    @Override // androidx.navigation.Navigator
    public final void e(NavBackStackEntry navBackStackEntry, boolean z2) {
        b().d(navBackStackEntry, z2);
        this.f20533c.setValue(Boolean.TRUE);
    }
}
