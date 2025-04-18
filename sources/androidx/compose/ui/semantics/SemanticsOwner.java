package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SemanticsOwner {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f16830a;

    /* renamed from: b, reason: collision with root package name */
    public final EmptySemanticsModifier f16831b;

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier) {
        this.f16830a = layoutNode;
        this.f16831b = emptySemanticsModifier;
    }

    public final SemanticsNode a() {
        return new SemanticsNode(this.f16831b, false, this.f16830a, new SemanticsConfiguration());
    }
}
