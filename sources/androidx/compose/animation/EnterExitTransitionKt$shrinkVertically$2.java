package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class EnterExitTransitionKt$shrinkVertically$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1848a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkVertically$2(l lVar) {
        super(1);
        this.f1848a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((IntSize) obj).f17493a;
        return new IntSize(IntSizeKt.a((int) (j2 >> 32), ((Number) this.f1848a.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()));
    }
}
