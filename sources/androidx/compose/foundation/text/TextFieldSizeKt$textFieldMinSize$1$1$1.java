package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes3.dex */
final class TextFieldSizeKt$textFieldMinSize$1$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSize f6208a;

    /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f6209a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable) {
            super(1);
            this.f6209a = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Placeable.PlacementScope.h((Placeable.PlacementScope) obj, this.f6209a, 0, 0);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1$1$1(TextFieldSize textFieldSize) {
        super(3);
        this.f6208a = textFieldSize;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Constraints) obj3).f17480a;
        long j3 = this.f6208a.f6206f;
        Placeable V = ((Measurable) obj2).V(Constraints.b(j2, p0.a.A((int) (j3 >> 32), Constraints.k(j2), Constraints.i(j2)), 0, p0.a.A((int) (j3 & 4294967295L), Constraints.j(j2), Constraints.h(j2)), 0, 10));
        return ((MeasureScope) obj).T(V.f15825a, V.f15826b, x.f30219a, new AnonymousClass1(V));
    }
}
