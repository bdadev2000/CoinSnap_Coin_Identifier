package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$2$4$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$4$1(DrawerState drawerState) {
        super(1);
        this.f10134a = drawerState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float c2 = this.f10134a.f9247a.f12827j.c();
        return new IntOffset(Float.isNaN(c2) ? 0L : IntOffsetKt.a(p0.a.t0(c2), 0));
    }
}
