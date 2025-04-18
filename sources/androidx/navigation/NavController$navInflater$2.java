package androidx.navigation;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavController$navInflater$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavController f20391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navInflater$2(NavController navController) {
        super(0);
        this.f20391a = navController;
    }

    @Override // q0.a
    public final Object invoke() {
        NavController navController = this.f20391a;
        navController.getClass();
        NavigatorProvider navigatorProvider = navController.w;
        p0.a.s(navController.f20345a, "context");
        p0.a.s(navigatorProvider, "navigatorProvider");
        return new Object();
    }
}
