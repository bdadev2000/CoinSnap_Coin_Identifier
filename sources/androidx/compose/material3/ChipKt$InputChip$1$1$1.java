package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ChipKt$InputChip$1$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f8409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Shape f8410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$1$1$1(float f2, Shape shape) {
        super(1);
        this.f8409a = f2;
        this.f8410b = shape;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        graphicsLayerScope.c(this.f8409a);
        graphicsLayerScope.w1(this.f8410b);
        graphicsLayerScope.x(true);
        return b0.f30125a;
    }
}
