package androidx.navigation.compose;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$finalEnter$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposeNavigator f20741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20743c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$finalEnter$1$1(ComposeNavigator composeNavigator, l lVar, l lVar2, MutableState mutableState) {
        super(1);
        this.f20741a = composeNavigator;
        this.f20742b = lVar;
        this.f20743c = lVar2;
        this.d = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:6:0x003b->B:22:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:1: B:30:0x007d->B:45:?, LOOP_END, SYNTHETIC] */
    @Override // q0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            androidx.compose.animation.AnimatedContentTransitionScope r5 = (androidx.compose.animation.AnimatedContentTransitionScope) r5
            java.lang.Object r0 = r5.a()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.navigation.NavDestination r0 = r0.f20328b
            java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"
            p0.a.q(r0, r1)
            androidx.navigation.compose.ComposeNavigator$Destination r0 = (androidx.navigation.compose.ComposeNavigator.Destination) r0
            androidx.navigation.compose.ComposeNavigator r1 = r4.f20741a
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r1.f20533c
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L73
            androidx.compose.runtime.MutableState r1 = r4.d
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            goto L73
        L31:
            int r1 = androidx.navigation.NavDestination.f20430k
            y0.j r0 = androidx.navigation.NavDestination.Companion.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            boolean r3 = r1 instanceof androidx.navigation.compose.ComposeNavigator.Destination
            if (r3 == 0) goto L5a
            androidx.navigation.compose.ComposeNavigator$Destination r1 = (androidx.navigation.compose.ComposeNavigator.Destination) r1
            q0.l r1 = r1.f20535m
            if (r1 == 0) goto L58
            java.lang.Object r1 = r1.invoke(r5)
            androidx.compose.animation.EnterTransition r1 = (androidx.compose.animation.EnterTransition) r1
            goto L64
        L58:
            r1 = r2
            goto L64
        L5a:
            boolean r3 = r1 instanceof androidx.navigation.compose.ComposeNavGraphNavigator.ComposeNavGraph
            if (r3 == 0) goto L58
            androidx.navigation.compose.ComposeNavGraphNavigator$ComposeNavGraph r1 = (androidx.navigation.compose.ComposeNavGraphNavigator.ComposeNavGraph) r1
            r1.getClass()
            goto L58
        L64:
            if (r1 == 0) goto L3b
            r2 = r1
        L67:
            if (r2 != 0) goto Lb4
            q0.l r0 = r4.f20743c
            java.lang.Object r5 = r0.invoke(r5)
            r2 = r5
            androidx.compose.animation.EnterTransition r2 = (androidx.compose.animation.EnterTransition) r2
            goto Lb4
        L73:
            int r1 = androidx.navigation.NavDestination.f20430k
            y0.j r0 = androidx.navigation.NavDestination.Companion.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L7d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            androidx.navigation.NavDestination r1 = (androidx.navigation.NavDestination) r1
            boolean r3 = r1 instanceof androidx.navigation.compose.ComposeNavigator.Destination
            if (r3 == 0) goto L9c
            androidx.navigation.compose.ComposeNavigator$Destination r1 = (androidx.navigation.compose.ComposeNavigator.Destination) r1
            q0.l r1 = r1.f20537o
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r1.invoke(r5)
            androidx.compose.animation.EnterTransition r1 = (androidx.compose.animation.EnterTransition) r1
            goto La6
        L9a:
            r1 = r2
            goto La6
        L9c:
            boolean r3 = r1 instanceof androidx.navigation.compose.ComposeNavGraphNavigator.ComposeNavGraph
            if (r3 == 0) goto L9a
            androidx.navigation.compose.ComposeNavGraphNavigator$ComposeNavGraph r1 = (androidx.navigation.compose.ComposeNavGraphNavigator.ComposeNavGraph) r1
            r1.getClass()
            goto L9a
        La6:
            if (r1 == 0) goto L7d
            r2 = r1
        La9:
            if (r2 != 0) goto Lb4
            q0.l r0 = r4.f20742b
            java.lang.Object r5 = r0.invoke(r5)
            r2 = r5
            androidx.compose.animation.EnterTransition r2 = (androidx.compose.animation.EnterTransition) r2
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1.invoke(java.lang.Object):java.lang.Object");
    }
}
