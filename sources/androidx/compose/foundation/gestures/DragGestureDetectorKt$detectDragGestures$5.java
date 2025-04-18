package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes4.dex */
final class DragGestureDetectorKt$detectDragGestures$5 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f3229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(l lVar) {
        super(3);
        this.f3229a = lVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Offset) obj3).f14913a;
        this.f3229a.invoke(new Offset(((PointerInputChange) obj2).f15591c));
        return b0.f30125a;
    }
}
