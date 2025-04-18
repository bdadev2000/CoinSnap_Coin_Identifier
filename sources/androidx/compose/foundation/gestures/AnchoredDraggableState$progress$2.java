package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class AnchoredDraggableState$progress$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f3094a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$progress$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f3094a = anchoredDraggableState;
    }

    @Override // q0.a
    public final Object invoke() {
        AnchoredDraggableState anchoredDraggableState = this.f3094a;
        float e = anchoredDraggableState.b().e(anchoredDraggableState.f3066h.getValue());
        float e2 = anchoredDraggableState.b().e(anchoredDraggableState.f3067i.getValue()) - e;
        float abs = Math.abs(e2);
        float f2 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float d = (anchoredDraggableState.d() - e) / e2;
            if (d < 1.0E-6f) {
                f2 = 0.0f;
            } else if (d <= 0.999999f) {
                f2 = d;
            }
        }
        return Float.valueOf(f2);
    }
}
