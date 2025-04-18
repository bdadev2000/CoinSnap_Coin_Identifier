package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class DraggableKt$rememberDraggableState$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ State f3367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$rememberDraggableState$1$1(MutableState mutableState) {
        super(1);
        this.f3367a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((l) this.f3367a.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
        return b0.f30125a;
    }
}
