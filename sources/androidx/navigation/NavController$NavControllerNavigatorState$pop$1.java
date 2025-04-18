package androidx.navigation;

import androidx.navigation.NavController;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class NavController$NavControllerNavigatorState$pop$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavController.NavControllerNavigatorState f20369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavBackStackEntry f20370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f20371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$NavControllerNavigatorState$pop$1(NavController.NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z2) {
        super(0);
        this.f20369a = navControllerNavigatorState;
        this.f20370b = navBackStackEntry;
        this.f20371c = z2;
    }

    @Override // q0.a
    public final Object invoke() {
        super/*androidx.navigation.NavigatorState*/.c(this.f20370b, this.f20371c);
        return b0.f30125a;
    }
}
