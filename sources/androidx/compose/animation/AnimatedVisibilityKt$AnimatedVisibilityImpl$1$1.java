package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f1762b;

    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Placeable f1763a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Placeable placeable) {
            super(1);
            this.f1763a = placeable;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((Placeable.PlacementScope) obj).e(this.f1763a, 0, 0, 0.0f);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(l lVar, Transition transition) {
        super(3);
        this.f1761a = lVar;
        this.f1762b = transition;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long a2;
        MeasureScope measureScope = (MeasureScope) obj;
        Placeable V = ((Measurable) obj2).V(((Constraints) obj3).f17480a);
        if (measureScope.t0()) {
            if (!((Boolean) this.f1761a.invoke(this.f1762b.d.getValue())).booleanValue()) {
                a2 = 0;
                return measureScope.T((int) (a2 >> 32), (int) (a2 & 4294967295L), x.f30219a, new AnonymousClass1(V));
            }
        }
        a2 = IntSizeKt.a(V.f15825a, V.f15826b);
        return measureScope.T((int) (a2 >> 32), (int) (a2 & 4294967295L), x.f30219a, new AnonymousClass1(V));
    }
}
