package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class WrapContentElement$Companion$width$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f4230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$width$1(Alignment.Horizontal horizontal) {
        super(2);
        this.f4230a = horizontal;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = (int) (((IntSize) obj).f17493a >> 32);
        return new IntOffset(IntOffsetKt.a(this.f4230a.a(0, i2, (LayoutDirection) obj2), 0));
    }
}
