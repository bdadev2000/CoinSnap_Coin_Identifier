package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f3261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1(c0 c0Var) {
        super(2);
        this.f3261a = c0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        ((PointerInputChange) obj).a();
        this.f3261a.f30922a = floatValue;
        return b0.f30125a;
    }
}
