package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(TextDragObserver textDragObserver) {
        super(1);
        this.f6057a = textDragObserver;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f6057a.b(((Offset) obj).f14913a);
        return b0.f30125a;
    }
}
