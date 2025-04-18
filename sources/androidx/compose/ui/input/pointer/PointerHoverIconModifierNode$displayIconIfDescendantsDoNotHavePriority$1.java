package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f15581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(b0 b0Var) {
        super(1);
        this.f15581a = b0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (!((PointerHoverIconModifierNode) obj).f15579q) {
            return TraversableNode.Companion.TraverseDescendantsAction.f16172a;
        }
        this.f15581a.f30919a = false;
        return TraversableNode.Companion.TraverseDescendantsAction.f16174c;
    }
}
