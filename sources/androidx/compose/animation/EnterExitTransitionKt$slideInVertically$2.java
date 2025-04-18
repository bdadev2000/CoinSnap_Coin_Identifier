package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class EnterExitTransitionKt$slideInVertically$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInVertically$2(l lVar) {
        super(1);
        this.f1849a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new IntOffset(IntOffsetKt.a(0, ((Number) this.f1849a.invoke(Integer.valueOf((int) (((IntSize) obj).f17493a & 4294967295L)))).intValue()));
    }
}
