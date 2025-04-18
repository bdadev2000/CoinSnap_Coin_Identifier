package androidx.compose.material3.internal;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$progress$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12861a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$progress$2(AnchoredDraggableState anchoredDraggableState) {
        super(0);
        this.f12861a = anchoredDraggableState;
    }

    @Override // q0.a
    public final Object invoke() {
        AnchoredDraggableState anchoredDraggableState = this.f12861a;
        float e = anchoredDraggableState.e().e(anchoredDraggableState.f12824g.getValue());
        float e2 = anchoredDraggableState.e().e(anchoredDraggableState.f12826i.getValue()) - e;
        float abs = Math.abs(e2);
        float f2 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float g2 = (anchoredDraggableState.g() - e) / e2;
            if (g2 < 1.0E-6f) {
                f2 = 0.0f;
            } else if (g2 <= 0.999999f) {
                f2 = g2;
            }
        }
        return Float.valueOf(f2);
    }
}
