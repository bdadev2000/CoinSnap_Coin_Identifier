package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.modifier.SingleLocalMap;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import e0.x;

@StabilityInferred
/* loaded from: classes.dex */
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public SharedElementInternalState f1900o;

    /* renamed from: p, reason: collision with root package name */
    public GraphicsLayer f1901p;

    /* renamed from: q, reason: collision with root package name */
    public final SingleLocalMap f1902q;

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.f1900o = sharedElementInternalState;
        sharedElementInternalState.getClass();
        throw null;
    }

    public static final void e2(SharedBoundsNode sharedBoundsNode, LayoutCoordinates layoutCoordinates) {
        sharedBoundsNode.f1900o.d();
        sharedBoundsNode.f1900o.d().getClass();
        throw null;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final MeasureResult L0(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        if (this.f1900o.d().b()) {
            this.f1900o.c().getClass();
            throw null;
        }
        measurable.V(j2);
        this.f1900o.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public final boolean Q0(long j2) {
        if (!this.f1900o.d().b()) {
            return false;
        }
        this.f1900o.d().getClass();
        throw null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        ProvidableModifierLocal providableModifierLocal = SharedContentNodeKt.f1909a;
        U(providableModifierLocal, this.f1900o);
        this.f1900o.f1913c = (SharedElementInternalState) s(providableModifierLocal);
        g2(DelegatableNodeKt.g(this).getGraphicsContext().a());
        this.f1900o.f1912b = new SharedBoundsNode$onAttach$1(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        g2(null);
        SharedElementInternalState sharedElementInternalState = this.f1900o;
        sharedElementInternalState.f1913c = null;
        sharedElementInternalState.f1912b = SharedBoundsNode$onDetach$1.f1907a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void Y1() {
        GraphicsLayer graphicsLayer = this.f1901p;
        if (graphicsLayer != null) {
            DelegatableNodeKt.g(this).getGraphicsContext().b(graphicsLayer);
        }
        g2(DelegatableNodeKt.g(this).getGraphicsContext().a());
    }

    public final LayoutCoordinates f2() {
        this.f1900o.d().getClass();
        DelegatableNodeKt.e(this);
        throw null;
    }

    public final void g2(GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            this.f1900o.getClass();
            throw null;
        }
        GraphicsLayer graphicsLayer2 = this.f1901p;
        if (graphicsLayer2 != null) {
            DelegatableNodeKt.g(this).getGraphicsContext().b(graphicsLayer2);
        }
        this.f1901p = graphicsLayer;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new SharedBoundsNode$measure$1(V, this, SizeKt.a(V.f15825a, V.f15826b)));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap n0() {
        return this.f1902q;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        this.f1900o.getClass();
        throw null;
    }
}
