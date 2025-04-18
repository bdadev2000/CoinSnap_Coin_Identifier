package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode$findOverridingAncestorNode$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f15583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerHoverIconModifierNode$findOverridingAncestorNode$1(f0 f0Var) {
        super(1);
        this.f15583a = f0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) obj;
        if (pointerHoverIconModifierNode.f15578p && pointerHoverIconModifierNode.f15579q) {
            this.f15583a.f30930a = pointerHoverIconModifierNode;
        }
        return Boolean.TRUE;
    }
}
