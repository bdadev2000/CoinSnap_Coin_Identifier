package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Density f10125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$1$1(DrawerState drawerState, Density density) {
        super(0);
        this.f10124a = drawerState;
        this.f10125b = density;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f10124a.f9248b.setValue(this.f10125b);
        return b0.f30125a;
    }
}
