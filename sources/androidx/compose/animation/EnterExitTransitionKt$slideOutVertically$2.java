package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideOutVertically$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1850a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideOutVertically$2(l lVar) {
        super(1);
        this.f1850a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return new IntOffset(IntOffsetKt.a(0, ((Number) this.f1850a.invoke(Integer.valueOf((int) (((IntSize) obj).f17493a & 4294967295L)))).intValue()));
    }
}
