package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationRailKt$NavigationRailItem$1$indicator$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f10341a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$1$indicator$1$1$1(State state) {
        super(1);
        this.f10341a = state;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((GraphicsLayerScope) obj).c(((Number) this.f10341a.getValue()).floatValue());
        return b0.f30125a;
    }
}
