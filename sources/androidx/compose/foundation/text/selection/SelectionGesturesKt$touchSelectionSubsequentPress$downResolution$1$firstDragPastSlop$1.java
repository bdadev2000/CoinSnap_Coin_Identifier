package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f7171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1(e0 e0Var) {
        super(2);
        this.f7171a = e0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((Offset) obj2).f14913a;
        ((PointerInputChange) obj).a();
        this.f7171a.f30927a = j2;
        return b0.f30125a;
    }
}
