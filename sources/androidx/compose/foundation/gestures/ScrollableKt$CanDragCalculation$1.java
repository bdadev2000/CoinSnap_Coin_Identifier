package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class ScrollableKt$CanDragCalculation$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final ScrollableKt$CanDragCalculation$1 f3436a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!PointerType.a(((PointerInputChange) obj).f15595i, 2));
    }
}
