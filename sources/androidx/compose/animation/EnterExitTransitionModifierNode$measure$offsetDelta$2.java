package androidx.compose.animation;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$offsetDelta$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f1869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$offsetDelta$2(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.f1869a = enterExitTransitionModifierNode;
        this.f1870b = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int ordinal;
        EnterExitState enterExitState = (EnterExitState) obj;
        long j2 = this.f1870b;
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.f1869a;
        long j3 = 0;
        if (enterExitTransitionModifierNode.x != null && enterExitTransitionModifierNode.e2() != null && !p0.a.g(enterExitTransitionModifierNode.x, enterExitTransitionModifierNode.e2()) && (ordinal = enterExitState.ordinal()) != 0 && ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            ChangeSize changeSize = enterExitTransitionModifierNode.f1856t.a().f1975c;
            if (changeSize != null) {
                long j4 = ((IntSize) changeSize.f1774b.invoke(new IntSize(j2))).f17493a;
                Alignment e2 = enterExitTransitionModifierNode.e2();
                p0.a.p(e2);
                LayoutDirection layoutDirection = LayoutDirection.f17494a;
                long a2 = e2.a(j2, j4, layoutDirection);
                Alignment alignment = enterExitTransitionModifierNode.x;
                p0.a.p(alignment);
                j3 = IntOffset.c(a2, alignment.a(j2, j4, layoutDirection));
            }
        }
        return new IntOffset(j3);
    }
}
