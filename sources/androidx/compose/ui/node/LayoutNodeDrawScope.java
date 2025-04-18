package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    /* renamed from: a, reason: collision with root package name */
    public final CanvasDrawScope f15977a = new CanvasDrawScope();

    /* renamed from: b, reason: collision with root package name */
    public DrawModifierNode f15978b;

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final CanvasDrawScope$drawContext$1 A1() {
        return this.f15977a.f15134b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void B0(long j2, float f2, float f3, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.B0(j2, f2, f3, j3, j4, f4, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void B1(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f15977a.B1(brush, j2, j3, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int C1(long j2) {
        return this.f15977a.C1(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int F0(float f2) {
        return this.f15977a.F0(f2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long F1() {
        return this.f15977a.F1();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float H(int i2) {
        return this.f15977a.H(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float I(float f2) {
        return f2 / this.f15977a.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void I0(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        this.f15977a.I0(j2, j3, j4, j5, drawStyle, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void I1(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.f15977a.I1(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float J0(long j2) {
        return this.f15977a.J0(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long L(long j2) {
        return this.f15977a.L(j2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public final void P1() {
        CanvasDrawScope canvasDrawScope = this.f15977a;
        Canvas a2 = canvasDrawScope.f15134b.a();
        DrawModifierNode drawModifierNode = this.f15978b;
        p0.a.p(drawModifierNode);
        Modifier.Node node = drawModifierNode.z0().f14692g;
        if (node != null && (node.d & 4) != 0) {
            while (node != null) {
                int i2 = node.f14690c;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & 4) != 0) {
                    break;
                } else {
                    node = node.f14692g;
                }
            }
        }
        node = null;
        if (node == null) {
            NodeCoordinator d = DelegatableNodeKt.d(drawModifierNode, 4);
            if (d.k1() == drawModifierNode.z0()) {
                d = d.f16103p;
                p0.a.p(d);
            }
            d.M1(a2, canvasDrawScope.f15134b.f15140b);
            return;
        }
        MutableVector mutableVector = null;
        while (node != null) {
            if (node instanceof DrawModifierNode) {
                DrawModifierNode drawModifierNode2 = (DrawModifierNode) node;
                GraphicsLayer graphicsLayer = canvasDrawScope.f15134b.f15140b;
                NodeCoordinator d2 = DelegatableNodeKt.d(drawModifierNode2, 4);
                long c2 = IntSizeKt.c(d2.f15827c);
                LayoutNode layoutNode = d2.f16100m;
                layoutNode.getClass();
                LayoutNodeKt.a(layoutNode).getSharedDrawScope().m(a2, c2, d2, drawModifierNode2, graphicsLayer);
            } else if ((node.f14690c & 4) != 0 && (node instanceof DelegatingNode)) {
                int i3 = 0;
                for (Modifier.Node node2 = ((DelegatingNode) node).f15909p; node2 != null; node2 = node2.f14692g) {
                    if ((node2.f14690c & 4) != 0) {
                        i3++;
                        if (i3 == 1) {
                            node = node2;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16]);
                            }
                            if (node != null) {
                                mutableVector.b(node);
                                node = null;
                            }
                            mutableVector.b(node2);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            node = DelegatableNodeKt.b(mutableVector);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void U0(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.U0(imageBitmap, j2, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void Z0(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.Z0(brush, j2, j3, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long b() {
        return this.f15977a.b();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void b1(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f15977a.b1(j2, j3, j4, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void c0(GraphicsLayer graphicsLayer, long j2, l lVar) {
        this.f15977a.c0(graphicsLayer, j2, lVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void c1(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.c1(path, j2, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void d1(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.d1(j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f15977a.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.f15977a.f15133a.f15137b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void j1(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.j1(j2, f2, j3, f3, drawStyle, colorFilter, i2);
    }

    public final void m(Canvas canvas, long j2, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.f15978b;
        this.f15978b = drawModifierNode;
        LayoutDirection layoutDirection = nodeCoordinator.f16100m.f15960v;
        CanvasDrawScope canvasDrawScope = this.f15977a;
        Density d = canvasDrawScope.f15134b.d();
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.f15134b;
        LayoutDirection f2 = canvasDrawScope$drawContext$1.f();
        Canvas a2 = canvasDrawScope$drawContext$1.a();
        long b2 = canvasDrawScope$drawContext$1.b();
        GraphicsLayer graphicsLayer2 = canvasDrawScope$drawContext$1.f15140b;
        canvasDrawScope$drawContext$1.h(nodeCoordinator);
        canvasDrawScope$drawContext$1.j(layoutDirection);
        canvasDrawScope$drawContext$1.g(canvas);
        canvasDrawScope$drawContext$1.c(j2);
        canvasDrawScope$drawContext$1.f15140b = graphicsLayer;
        canvas.p();
        try {
            drawModifierNode.z(this);
            canvas.i();
            canvasDrawScope$drawContext$1.h(d);
            canvasDrawScope$drawContext$1.j(f2);
            canvasDrawScope$drawContext$1.g(a2);
            canvasDrawScope$drawContext$1.c(b2);
            canvasDrawScope$drawContext$1.f15140b = graphicsLayer2;
            this.f15978b = drawModifierNode2;
        } catch (Throwable th) {
            canvas.i();
            canvasDrawScope$drawContext$1.h(d);
            canvasDrawScope$drawContext$1.j(f2);
            canvasDrawScope$drawContext$1.g(a2);
            canvasDrawScope$drawContext$1.c(b2);
            canvasDrawScope$drawContext$1.f15140b = graphicsLayer2;
            throw th;
        }
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final long o(float f2) {
        return this.f15977a.o(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long p(long j2) {
        return this.f15977a.p(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float r(long j2) {
        return this.f15977a.r(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final long u(float f2) {
        return this.f15977a.u(f2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void u1(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.u1(brush, j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void v0(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f15977a.v0(path, brush, f2, drawStyle, colorFilter, i2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f15977a.x1();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float y1(float f2) {
        return this.f15977a.getDensity() * f2;
    }
}
