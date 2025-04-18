package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$slideOffset$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f1871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$slideOffset$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j2) {
        super(1);
        this.f1871a = enterExitTransitionModifierNode;
        this.f1872b = j2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        l lVar;
        l lVar2;
        EnterExitState enterExitState = (EnterExitState) obj;
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.f1871a;
        Slide slide = enterExitTransitionModifierNode.f1855s.a().f1974b;
        long j2 = this.f1872b;
        long j3 = 0;
        long j4 = (slide == null || (lVar2 = slide.f1969a) == null) ? 0L : ((IntOffset) lVar2.invoke(new IntSize(j2))).f17489a;
        Slide slide2 = enterExitTransitionModifierNode.f1856t.a().f1974b;
        long j5 = (slide2 == null || (lVar = slide2.f1969a) == null) ? 0L : ((IntOffset) lVar.invoke(new IntSize(j2))).f17489a;
        int ordinal = enterExitState.ordinal();
        if (ordinal == 0) {
            j3 = j4;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            j3 = j5;
        }
        return new IntOffset(j3);
    }
}
