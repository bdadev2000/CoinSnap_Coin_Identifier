package androidx.compose.material3;

import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class SwipeToDismissBoxState$anchoredDraggableState$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeToDismissBoxState f11670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissBoxState$anchoredDraggableState$1(SwipeToDismissBoxState swipeToDismissBoxState) {
        super(0);
        this.f11670a = swipeToDismissBoxState;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(this.f11670a.f11668a.y1(SwipeToDismissBoxKt.f11653a));
    }
}
