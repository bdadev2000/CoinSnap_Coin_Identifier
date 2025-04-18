package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes3.dex */
public final class CanvasDrawScope$drawContext$1 implements DrawContext {

    /* renamed from: a, reason: collision with root package name */
    public final CanvasDrawScopeKt$asDrawTransform$1 f15139a = new CanvasDrawScopeKt$asDrawTransform$1(this);

    /* renamed from: b, reason: collision with root package name */
    public GraphicsLayer f15140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CanvasDrawScope f15141c;

    public CanvasDrawScope$drawContext$1(CanvasDrawScope canvasDrawScope) {
        this.f15141c = canvasDrawScope;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawContext
    public final Canvas a() {
        return this.f15141c.f15133a.f15138c;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawContext
    public final long b() {
        return this.f15141c.f15133a.d;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawContext
    public final void c(long j2) {
        this.f15141c.f15133a.d = j2;
    }

    public final Density d() {
        return this.f15141c.f15133a.f15136a;
    }

    public final GraphicsLayer e() {
        return this.f15140b;
    }

    public final LayoutDirection f() {
        return this.f15141c.f15133a.f15137b;
    }

    public final void g(Canvas canvas) {
        this.f15141c.f15133a.f15138c = canvas;
    }

    public final void h(Density density) {
        this.f15141c.f15133a.f15136a = density;
    }

    public final void i(GraphicsLayer graphicsLayer) {
        this.f15140b = graphicsLayer;
    }

    public final void j(LayoutDirection layoutDirection) {
        this.f15141c.f15133a.f15137b = layoutDirection;
    }
}
