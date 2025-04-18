package androidx.navigation;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavGraph$Companion$childHierarchy$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final NavGraph$Companion$childHierarchy$1 f20459a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavDestination navDestination = (NavDestination) obj;
        p0.a.s(navDestination, "it");
        if (!(navDestination instanceof NavGraph)) {
            return null;
        }
        NavGraph navGraph = (NavGraph) navDestination;
        return navGraph.f(navGraph.f20456m, navGraph, false);
    }
}
