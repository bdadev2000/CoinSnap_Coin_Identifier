package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
final class IconKt$defaultSizeForColorProducer$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f9619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f9620b;

    /* renamed from: androidx.compose.material3.IconKt$defaultSizeForColorProducer$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f9621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable) {
            super(1);
            this.f9621a = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f9621a, 0, 0, 0.0f);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconKt$defaultSizeForColorProducer$1(float f2, float f3) {
        super(3);
        this.f9619a = f2;
        this.f9620b = f3;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Constraints) obj3).f17480a;
        Placeable V = ((Measurable) obj2).V(Constraints.Companion.c((int) this.f9619a, (int) this.f9620b));
        return ((MeasureScope) obj).T(V.f15825a, V.f15826b, x.f30219a, new AnonymousClass1(V));
    }
}
