package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class EnterExitTransitionModifierNode$measure$animSize$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f1866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$animSize$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.f1866a = enterExitTransitionModifierNode;
        this.f1867b = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        l lVar;
        l lVar2;
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.f1866a;
        enterExitTransitionModifierNode.getClass();
        int ordinal = ((EnterExitState) obj).ordinal();
        long j2 = this.f1867b;
        if (ordinal == 0) {
            ChangeSize changeSize = enterExitTransitionModifierNode.f1855s.a().f1975c;
            if (changeSize != null && (lVar = changeSize.f1774b) != null) {
                j2 = ((IntSize) lVar.invoke(new IntSize(j2))).f17493a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            ChangeSize changeSize2 = enterExitTransitionModifierNode.f1856t.a().f1975c;
            if (changeSize2 != null && (lVar2 = changeSize2.f1774b) != null) {
                j2 = ((IntSize) lVar2.invoke(new IntSize(j2))).f17493a;
            }
        }
        return new IntSize(j2);
    }
}
