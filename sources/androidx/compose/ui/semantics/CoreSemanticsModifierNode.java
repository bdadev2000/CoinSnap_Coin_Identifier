package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public boolean f16779o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16780p;

    /* renamed from: q, reason: collision with root package name */
    public l f16781q;

    public CoreSemanticsModifierNode(boolean z2, boolean z3, l lVar) {
        this.f16779o = z2;
        this.f16780p = z3;
        this.f16781q = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        this.f16781q.invoke(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean N1() {
        return this.f16779o;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean f0() {
        return this.f16780p;
    }
}
