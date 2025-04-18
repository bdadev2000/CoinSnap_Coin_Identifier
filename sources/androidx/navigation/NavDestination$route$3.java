package androidx.navigation;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class NavDestination$route$3 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDestination$route$3(String str) {
        super(0);
        this.f20447a = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.navigation.NavDeepLink$Builder, java.lang.Object] */
    @Override // q0.a
    public final Object invoke() {
        ?? obj = new Object();
        String str = this.f20447a;
        p0.a.s(str, "uriPattern");
        obj.f20413a = str;
        return new NavDeepLink(obj.f20413a);
    }
}
