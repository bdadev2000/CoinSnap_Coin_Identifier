package androidx.compose.foundation.text;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$3 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(TextDragObserver textDragObserver) {
        super(0);
        this.f6058a = textDragObserver;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f6058a.onStop();
        return b0.f30125a;
    }
}
