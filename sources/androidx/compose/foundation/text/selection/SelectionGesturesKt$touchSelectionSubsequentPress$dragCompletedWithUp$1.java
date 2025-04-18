package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f7172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$dragCompletedWithUp$1(TextDragObserver textDragObserver) {
        super(1);
        this.f7172a = textDragObserver;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        this.f7172a.d(PointerEventKt.f(pointerInputChange, false));
        pointerInputChange.a();
        return b0.f30125a;
    }
}
