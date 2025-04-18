package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f10069b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DismissibleNavigationDrawer$1$1(DrawerState drawerState, Density density) {
        super(0);
        this.f10068a = drawerState;
        this.f10069b = density;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f10068a.f9248b.setValue(this.f10069b);
        return b0.f30125a;
    }
}
