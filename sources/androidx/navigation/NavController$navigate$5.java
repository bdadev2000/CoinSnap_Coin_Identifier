package androidx.navigation;

import android.os.Bundle;
import e0.w;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavController$navigate$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f20392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavController f20393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavDestination f20394c;
    public final /* synthetic */ Bundle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navigate$5(b0 b0Var, NavController navController, NavDestination navDestination, Bundle bundle) {
        super(1);
        this.f20392a = b0Var;
        this.f20393b = navController;
        this.f20394c = navDestination;
        this.d = bundle;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        p0.a.s(navBackStackEntry, "it");
        this.f20392a.f30919a = true;
        w wVar = w.f30218a;
        this.f20393b.a(this.f20394c, this.d, navBackStackEntry, wVar);
        return d0.b0.f30125a;
    }
}
