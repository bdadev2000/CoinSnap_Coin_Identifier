package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class WrapContentElement$Companion$height$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f4228a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$height$1(Alignment.Vertical vertical) {
        super(2);
        this.f4228a = vertical;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return new IntOffset(IntOffsetKt.a(0, this.f4228a.a(0, (int) (4294967295L & ((IntSize) obj).f17493a))));
    }
}
