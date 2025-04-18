package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import e0.q;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public final InteractionSource f7452o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7453p;

    /* renamed from: q, reason: collision with root package name */
    public final float f7454q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorProducer f7455r;

    /* renamed from: s, reason: collision with root package name */
    public final q0.a f7456s;

    /* renamed from: t, reason: collision with root package name */
    public StateLayer f7457t;

    /* renamed from: u, reason: collision with root package name */
    public float f7458u;
    public boolean w;

    /* renamed from: v, reason: collision with root package name */
    public long f7459v = 0;
    public final MutableObjectList x = new MutableObjectList();

    public RippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, q0.a aVar) {
        this.f7452o = interactionSource;
        this.f7453p = z2;
        this.f7454q = f2;
        this.f7455r = colorProducer;
        this.f7456s = aVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        e.v(S1(), null, 0, new RippleNode$onAttach$1(this, null), 3);
    }

    public abstract void e2(PressInteraction.Press press, long j2, float f2);

    public abstract void f2(DrawScope drawScope);

    public final void g2(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            e2((PressInteraction.Press) pressInteraction, this.f7459v, this.f7458u);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            h2(((PressInteraction.Release) pressInteraction).f3742a);
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            h2(((PressInteraction.Cancel) pressInteraction).f3740a);
        }
    }

    public abstract void h2(PressInteraction.Press press);

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void n(long j2) {
        this.w = true;
        Density density = DelegatableNodeKt.f(this).f15959u;
        this.f7459v = IntSizeKt.c(j2);
        float f2 = this.f7454q;
        this.f7458u = Float.isNaN(f2) ? RippleAnimationKt.a(density, this.f7453p, this.f7459v) : density.y1(f2);
        MutableObjectList mutableObjectList = this.x;
        Object[] objArr = mutableObjectList.f1549a;
        int i2 = mutableObjectList.f1550b;
        for (int i3 = 0; i3 < i2; i3++) {
            g2((PressInteraction) objArr[i3]);
        }
        q.W(0, mutableObjectList.f1550b, mutableObjectList.f1549a);
        mutableObjectList.f1550b = 0;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        contentDrawScope.P1();
        StateLayer stateLayer = this.f7457t;
        if (stateLayer != null) {
            stateLayer.a(contentDrawScope, this.f7458u, this.f7455r.a());
        }
        f2(contentDrawScope);
    }
}
