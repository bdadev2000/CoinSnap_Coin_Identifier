package androidx.compose.material3.internal;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnchoredDraggableState$trySnapTo$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$trySnapTo$1(AnchoredDraggableState anchoredDraggableState, Object obj) {
        super(0);
        this.f12863a = anchoredDraggableState;
        this.f12864b = obj;
    }

    @Override // q0.a
    public final Object invoke() {
        AnchoredDraggableState anchoredDraggableState = this.f12863a;
        AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = anchoredDraggableState.f12832o;
        DraggableAnchors e = anchoredDraggableState.e();
        Object obj = this.f12864b;
        float e2 = e.e(obj);
        if (!Float.isNaN(e2)) {
            anchoredDraggableState$anchoredDragScope$1.a(e2, 0.0f);
            anchoredDraggableState.i(null);
        }
        anchoredDraggableState.h(obj);
        return b0.f30125a;
    }
}
