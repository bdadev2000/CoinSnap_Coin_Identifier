package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import d0.b0;
import d0.k;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeToDismissBoxState f11654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11656c;
    public final /* synthetic */ boolean d;

    /* renamed from: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f11657a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f11658b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f11659c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z2, boolean z3, float f2, boolean z4) {
            super(1);
            this.f11657a = z2;
            this.f11658b = z3;
            this.f11659c = f2;
            this.d = z4;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
            draggableAnchorsConfig.a(SwipeToDismissBoxValue.f11673c, 0.0f);
            boolean z2 = this.f11657a;
            boolean z3 = this.f11658b;
            float f2 = this.f11659c;
            if (z2) {
                draggableAnchorsConfig.a(SwipeToDismissBoxValue.f11671a, z3 ? -f2 : f2);
            }
            if (this.d) {
                SwipeToDismissBoxValue swipeToDismissBoxValue = SwipeToDismissBoxValue.f11672b;
                if (!z3) {
                    f2 = -f2;
                }
                draggableAnchorsConfig.a(swipeToDismissBoxValue, f2);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissBoxKt$SwipeToDismissBox$1$1$1(SwipeToDismissBoxState swipeToDismissBoxState, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.f11654a = swipeToDismissBoxState;
        this.f11655b = z2;
        this.f11656c = z3;
        this.d = z4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        long j2 = ((IntSize) obj).f17493a;
        long j3 = ((Constraints) obj2).f17480a;
        return new k(AnchoredDraggableKt.a(new AnonymousClass1(this.f11655b, this.f11656c, (int) (j2 >> 32), this.d)), (SwipeToDismissBoxValue) this.f11654a.f11669b.f12825h.getValue());
    }
}
