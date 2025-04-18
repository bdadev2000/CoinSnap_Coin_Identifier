package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ModalBottomSheetKt$ModalBottomSheetContent$6$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f9878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f9879b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$6$1(SheetState sheetState, Animatable animatable) {
        super(1);
        this.f9878a = sheetState;
        this.f9879b = animatable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        float c2 = this.f9878a.f11199c.f12827j.c();
        float b2 = Size.b(graphicsLayerScope.b());
        if (!Float.isNaN(c2) && !Float.isNaN(b2) && b2 != 0.0f) {
            float floatValue = ((Number) this.f9879b.d()).floatValue();
            graphicsLayerScope.e(ModalBottomSheetKt.d(graphicsLayerScope, floatValue));
            graphicsLayerScope.k(ModalBottomSheetKt.e(graphicsLayerScope, floatValue));
            graphicsLayerScope.G0(TransformOriginKt.a(0.5f, (c2 + b2) / b2));
        }
        return b0.f30125a;
    }
}
