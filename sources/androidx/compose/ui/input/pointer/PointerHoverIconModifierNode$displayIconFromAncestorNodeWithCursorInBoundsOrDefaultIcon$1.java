package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f15580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(f0 f0Var) {
        super(1);
        this.f15580a = f0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) obj;
        f0 f0Var = this.f15580a;
        Object obj2 = f0Var.f30930a;
        if (obj2 == null && pointerHoverIconModifierNode.f15579q) {
            f0Var.f30930a = pointerHoverIconModifierNode;
        } else if (obj2 != null && pointerHoverIconModifierNode.f15578p && pointerHoverIconModifierNode.f15579q) {
            f0Var.f30930a = pointerHoverIconModifierNode;
        }
        return Boolean.TRUE;
    }
}
