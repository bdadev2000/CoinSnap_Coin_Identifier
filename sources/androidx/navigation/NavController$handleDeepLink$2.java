package androidx.navigation;

import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import d0.b0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import q0.l;
import y0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavController$handleDeepLink$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDestination f20386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavController f20387b;

    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f20388a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimBuilder animBuilder = (AnimBuilder) obj;
            p0.a.s(animBuilder, "$this$anim");
            animBuilder.f20316a = 0;
            animBuilder.f20317b = 0;
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f20389a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            PopUpToBuilder popUpToBuilder = (PopUpToBuilder) obj;
            p0.a.s(popUpToBuilder, "$this$popUpTo");
            popUpToBuilder.f20524b = true;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavHostController navHostController) {
        super(1);
        this.f20386a = navDestination;
        this.f20387b = navHostController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, androidx.navigation.AnimBuilder] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
        p0.a.s(navOptionsBuilder, "$this$navOptions");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.f20388a;
        ?? obj2 = new Object();
        obj2.f20316a = -1;
        obj2.f20317b = -1;
        anonymousClass1.invoke(obj2);
        int i2 = obj2.f20316a;
        NavOptions.Builder builder = navOptionsBuilder.f20488a;
        builder.f20484g = i2;
        builder.f20485h = obj2.f20317b;
        builder.f20486i = -1;
        builder.f20487j = -1;
        NavDestination navDestination = this.f20386a;
        if (navDestination instanceof NavGraph) {
            int i3 = NavDestination.f20430k;
            Iterator it = NavDestination.Companion.c(navDestination).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                NavController navController = this.f20387b;
                if (hasNext) {
                    NavDestination navDestination2 = (NavDestination) it.next();
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) navController.f20349g.j();
                    NavDestination navDestination3 = navBackStackEntry != null ? navBackStackEntry.f20328b : null;
                    if (p0.a.g(navDestination2, navDestination3 != null ? navDestination3.f20432b : null)) {
                        break;
                    }
                } else {
                    int i4 = NavGraph.f20454p;
                    Iterator it2 = n.J(navController.g(), NavGraph$Companion$childHierarchy$1.f20459a).iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException("Sequence is empty.");
                    }
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    navOptionsBuilder.a(((NavDestination) next).f20436h, AnonymousClass2.f20389a);
                }
            }
        }
        return b0.f30125a;
    }
}
