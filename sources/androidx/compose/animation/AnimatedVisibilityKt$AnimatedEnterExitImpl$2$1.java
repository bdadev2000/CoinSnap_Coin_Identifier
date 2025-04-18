package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import e0.x;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnLookaheadMeasured f1684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(OnLookaheadMeasured onLookaheadMeasured) {
        super(3);
        this.f1684a = onLookaheadMeasured;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureScope measureScope = (MeasureScope) obj;
        Placeable V = ((Measurable) obj2).V(((Constraints) obj3).f17480a);
        if (measureScope.t0()) {
            int i2 = V.f15825a;
            this.f1684a.a();
        }
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1(V));
    }
}
