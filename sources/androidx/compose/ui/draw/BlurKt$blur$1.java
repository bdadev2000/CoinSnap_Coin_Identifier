package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.BlurEffect;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class BlurKt$blur$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f14787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14789c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14790f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f2, float f3, int i2, Shape shape, boolean z2) {
        super(1);
        this.f14787a = f2;
        this.f14788b = f3;
        this.f14789c = i2;
        this.d = shape;
        this.f14790f = z2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        float y1 = graphicsLayerScope.y1(this.f14787a);
        float y12 = graphicsLayerScope.y1(this.f14788b);
        graphicsLayerScope.f((y1 <= 0.0f || y12 <= 0.0f) ? null : new BlurEffect(y1, y12, this.f14789c));
        Shape shape = this.d;
        if (shape == null) {
            shape = RectangleShapeKt.f15014a;
        }
        graphicsLayerScope.w1(shape);
        graphicsLayerScope.x(this.f14790f);
        return b0.f30125a;
    }
}
