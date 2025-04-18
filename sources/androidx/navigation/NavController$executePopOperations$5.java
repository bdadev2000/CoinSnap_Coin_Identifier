package androidx.navigation;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavController$executePopOperations$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final NavController$executePopOperations$5 f20380a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavDestination navDestination = (NavDestination) obj;
        p0.a.s(navDestination, "destination");
        NavGraph navGraph = navDestination.f20432b;
        if (navGraph == null || navGraph.f20456m != navDestination.f20436h) {
            return null;
        }
        return navGraph;
    }
}
