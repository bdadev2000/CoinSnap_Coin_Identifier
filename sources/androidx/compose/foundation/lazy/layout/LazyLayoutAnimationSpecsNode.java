package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyLayoutAnimationSpecsNode extends Modifier.Node implements ParentDataModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public FiniteAnimationSpec f4692o;

    /* renamed from: p, reason: collision with root package name */
    public FiniteAnimationSpec f4693p;

    /* renamed from: q, reason: collision with root package name */
    public FiniteAnimationSpec f4694q;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        return this;
    }
}
