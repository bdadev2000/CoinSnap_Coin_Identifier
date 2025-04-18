package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import e0.x;
import java.util.List;

/* loaded from: classes4.dex */
final class SpacerMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final SpacerMeasurePolicy f4118a = new Object();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return measureScope.T(Constraints.g(j2) ? Constraints.i(j2) : 0, Constraints.f(j2) ? Constraints.h(j2) : 0, x.f30219a, SpacerMeasurePolicy$measure$1$1.f4119a);
    }
}
