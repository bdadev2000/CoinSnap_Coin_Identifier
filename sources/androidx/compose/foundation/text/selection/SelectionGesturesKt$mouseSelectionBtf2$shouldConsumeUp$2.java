package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MouseSelectionObserver f7139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectionAdjustment f7140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2(MouseSelectionObserver mouseSelectionObserver, a aVar) {
        super(1);
        this.f7139a = mouseSelectionObserver;
        this.f7140b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (this.f7139a.c(pointerInputChange.f15591c, this.f7140b)) {
            pointerInputChange.a();
        }
        return b0.f30125a;
    }
}
