package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import d0.b0;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavHostKt$NavHost$32 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f20689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f20690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f20691c;

    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$32$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f20692a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnimatedContentScope f20693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NavBackStackEntry navBackStackEntry, AnimatedContentScope animatedContentScope) {
            super(2);
            this.f20692a = navBackStackEntry;
            this.f20693b = animatedContentScope;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                NavBackStackEntry navBackStackEntry = this.f20692a;
                NavDestination navDestination = navBackStackEntry.f20328b;
                p0.a.q(navDestination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                ((ComposeNavigator.Destination) navDestination).f20534l.invoke(this.f20693b, navBackStackEntry, composer, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$32(SaveableStateHolder saveableStateHolder, MutableState mutableState, State state) {
        super(4);
        this.f20689a = saveableStateHolder;
        this.f20690b = mutableState;
        this.f20691c = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        NavBackStackEntry navBackStackEntry;
        AnimatedContentScope animatedContentScope = (AnimatedContentScope) obj;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.f20690b.getValue()).booleanValue()) {
            List list = (List) this.f20691c.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntry = 0;
                    break;
                }
                navBackStackEntry = listIterator.previous();
                if (p0.a.g(navBackStackEntry2, (NavBackStackEntry) navBackStackEntry)) {
                    break;
                }
            }
            navBackStackEntry2 = navBackStackEntry;
        }
        if (navBackStackEntry2 != null) {
            NavBackStackEntryProviderKt.a(navBackStackEntry2, this.f20689a, ComposableLambdaKt.c(-1263531443, new AnonymousClass1(navBackStackEntry2, animatedContentScope), composer), composer, 384);
        }
        return b0.f30125a;
    }
}
