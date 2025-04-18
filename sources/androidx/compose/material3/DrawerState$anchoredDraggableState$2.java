package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class DrawerState$anchoredDraggableState$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerState f9252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$anchoredDraggableState$2(DrawerState drawerState) {
        super(0);
        this.f9252a = drawerState;
    }

    @Override // q0.a
    public final Object invoke() {
        DrawerState drawerState = this.f9252a;
        Density density = (Density) drawerState.f9248b.getValue();
        if (density != null) {
            return Float.valueOf(density.y1(NavigationDrawerKt.f10042a));
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + drawerState + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
    }
}
