package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import q0.l;

/* loaded from: classes4.dex */
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f16826o;

    public SemanticsNode$fakeSemanticsNode$fakeNode$1(l lVar) {
        this.f16826o = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        this.f16826o.invoke(semanticsConfiguration);
    }
}
