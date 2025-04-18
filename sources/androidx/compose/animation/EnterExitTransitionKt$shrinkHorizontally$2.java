package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class EnterExitTransitionKt$shrinkHorizontally$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkHorizontally$2(l lVar) {
        super(1);
        this.f1845a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((IntSize) obj).f17493a;
        return new IntSize(IntSizeKt.a(((Number) this.f1845a.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue(), (int) (j2 & 4294967295L)));
    }
}
