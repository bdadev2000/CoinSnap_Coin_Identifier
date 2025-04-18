package androidx.navigation;

import e0.n;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavController$executePopOperations$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f20374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f20375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavController f20376c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f20377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$1(b0 b0Var, b0 b0Var2, NavController navController, boolean z2, n nVar) {
        super(1);
        this.f20374a = b0Var;
        this.f20375b = b0Var2;
        this.f20376c = navController;
        this.d = z2;
        this.f20377f = nVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        p0.a.s(navBackStackEntry, "entry");
        this.f20374a.f30919a = true;
        this.f20375b.f30919a = true;
        this.f20376c.q(navBackStackEntry, this.d, this.f20377f);
        return d0.b0.f30125a;
    }
}
