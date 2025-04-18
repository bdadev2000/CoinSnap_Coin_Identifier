package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$7$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f9886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$7$1$1(Animatable animatable) {
        super(1);
        this.f9886a = animatable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        float floatValue = ((Number) this.f9886a.d()).floatValue();
        float d = ModalBottomSheetKt.d(graphicsLayerScope, floatValue);
        float e = ModalBottomSheetKt.e(graphicsLayerScope, floatValue);
        graphicsLayerScope.k(e == 0.0f ? 1.0f : d / e);
        graphicsLayerScope.G0(ModalBottomSheetKt.f9811c);
        return b0.f30125a;
    }
}
