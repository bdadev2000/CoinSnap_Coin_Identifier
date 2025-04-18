package androidx.compose.animation;

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
final class AnimatedContentKt$AnimatedContent$6$1$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ContentTransform f1644a;

    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f1645a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContentTransform f1646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable, ContentTransform contentTransform) {
            super(1);
            this.f1645a = placeable;
            this.f1646b = contentTransform;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f1645a, 0, 0, this.f1646b.f1781c.c());
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$1$1(ContentTransform contentTransform) {
        super(3);
        this.f1644a = contentTransform;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Placeable V = ((Measurable) obj2).V(((Constraints) obj3).f17480a);
        return ((MeasureScope) obj).T(V.f15825a, V.f15826b, x.f30219a, new AnonymousClass1(V, this.f1644a));
    }
}
