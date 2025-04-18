package androidx.compose.animation;

import android.support.v4.media.d;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public SharedTransitionScopeImpl f1889o = null;

    /* renamed from: p, reason: collision with root package name */
    public q0.a f1890p = null;

    /* renamed from: q, reason: collision with root package name */
    public p f1891q = null;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f1892r = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public LayerWithRenderer f1893s;

    /* loaded from: classes.dex */
    public final class LayerWithRenderer implements LayerRenderer {

        /* renamed from: a, reason: collision with root package name */
        public final GraphicsLayer f1894a;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.f1894a = graphicsLayer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public final float a() {
            return RenderInTransitionOverlayNode.this.f1892r.c();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public final void b(DrawScope drawScope) {
            RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
            if (((Boolean) renderInTransitionOverlayNode.f1890p.invoke()).booleanValue()) {
                LayoutCoordinates layoutCoordinates = renderInTransitionOverlayNode.f1889o.f1918g;
                if (layoutCoordinates == null) {
                    p0.a.B0(RouterName.ROOT);
                    throw null;
                }
                long v2 = layoutCoordinates.v(DelegatableNodeKt.e(renderInTransitionOverlayNode), 0L);
                float g2 = Offset.g(v2);
                float h2 = Offset.h(v2);
                Path path = (Path) renderInTransitionOverlayNode.f1891q.invoke(drawScope.getLayoutDirection(), DelegatableNodeKt.f(renderInTransitionOverlayNode).f15959u);
                GraphicsLayer graphicsLayer = this.f1894a;
                if (path == null) {
                    drawScope.A1().f15139a.g(g2, h2);
                    try {
                        GraphicsLayerKt.a(drawScope, graphicsLayer);
                        return;
                    } finally {
                    }
                }
                CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
                long b2 = A1.b();
                A1.a().p();
                try {
                    A1.f15139a.a(path, 1);
                    drawScope.A1().f15139a.g(g2, h2);
                    try {
                        GraphicsLayerKt.a(drawScope, graphicsLayer);
                    } finally {
                    }
                } finally {
                    d.A(A1, b2);
                }
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.g(this).getGraphicsContext().a());
        this.f1889o.f1920i.add(layerWithRenderer);
        this.f1893s = layerWithRenderer;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        LayerWithRenderer layerWithRenderer = this.f1893s;
        if (layerWithRenderer != null) {
            this.f1889o.f1920i.remove(layerWithRenderer);
            DelegatableNodeKt.g(this).getGraphicsContext().b(layerWithRenderer.f1894a);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        LayerWithRenderer layerWithRenderer = this.f1893s;
        GraphicsLayer graphicsLayer = layerWithRenderer != null ? layerWithRenderer.f1894a : null;
        if (graphicsLayer == null) {
            throw new IllegalArgumentException("Error: layer never initialized".toString());
        }
        DrawScope.N0(contentDrawScope, graphicsLayer, new RenderInTransitionOverlayNode$draw$1(contentDrawScope));
        if (((Boolean) this.f1890p.invoke()).booleanValue()) {
            return;
        }
        GraphicsLayerKt.a(contentDrawScope, graphicsLayer);
    }
}
