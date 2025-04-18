package androidx.compose.foundation.text;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$4 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(TextDragObserver textDragObserver) {
        super(0);
        this.f6059a = textDragObserver;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6059a.onCancel();
        return b0.f30125a;
    }
}
