package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.f6060a = textDragObserver;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        this.f6060a.d(((Offset) obj2).f14913a);
        return b0.f30125a;
    }
}
