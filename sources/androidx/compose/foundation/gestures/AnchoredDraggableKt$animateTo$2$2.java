package androidx.compose.foundation.gestures;

import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class AnchoredDraggableKt$animateTo$2$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f3011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2$2(AnchoredDragScope anchoredDragScope, c0 c0Var) {
        super(2);
        this.f3010a = anchoredDragScope;
        this.f3011b = c0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        this.f3010a.a(floatValue, ((Number) obj2).floatValue());
        this.f3011b.f30922a = floatValue;
        return b0.f30125a;
    }
}
