package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class NavigationDrawerKt$ModalNavigationDrawer$2$3$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10131a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerState f10132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f10133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$2$3$1(DrawerState drawerState, MutableFloatState mutableFloatState) {
        super(0);
        this.f10132b = drawerState;
        this.f10133c = mutableFloatState;
    }

    @Override // q0.a
    public final Object invoke() {
        float f2 = NavigationDrawerKt.f10042a;
        float c2 = this.f10133c.c();
        return Float.valueOf(p0.a.z((this.f10132b.f9247a.g() - c2) / (this.f10131a - c2), 0.0f, 1.0f));
    }
}
