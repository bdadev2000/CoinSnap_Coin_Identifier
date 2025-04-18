package androidx.navigation;

import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavController$executePopOperations$6 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavController f20381a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$6(NavController navController) {
        super(1);
        this.f20381a = navController;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        p0.a.s((NavDestination) obj, "destination");
        return Boolean.valueOf(!this.f20381a.f20356n.containsKey(Integer.valueOf(r2.f20436h)));
    }
}
