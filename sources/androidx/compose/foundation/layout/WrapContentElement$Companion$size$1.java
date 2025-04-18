package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class WrapContentElement$Companion$size$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Alignment f4229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$size$1(Alignment alignment) {
        super(2);
        this.f4229a = alignment;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return new IntOffset(this.f4229a.a(0L, ((IntSize) obj).f17493a, (LayoutDirection) obj2));
    }
}
