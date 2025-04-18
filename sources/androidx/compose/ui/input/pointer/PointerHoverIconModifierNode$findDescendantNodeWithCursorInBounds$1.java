package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f15582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(f0 f0Var) {
        super(1);
        this.f15582a = f0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) obj;
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.f16172a;
        if (!pointerHoverIconModifierNode.f15579q) {
            return traverseDescendantsAction;
        }
        this.f15582a.f30930a = pointerHoverIconModifierNode;
        return pointerHoverIconModifierNode.f15578p ? TraversableNode.Companion.TraverseDescendantsAction.f16173b : traverseDescendantsAction;
    }
}
