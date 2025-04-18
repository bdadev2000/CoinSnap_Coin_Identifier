package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import e0.x;
import java.util.List;

/* loaded from: classes2.dex */
final class EmptyMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptyMeasurePolicy f5962a = new Object();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return measureScope.T(Constraints.i(j2), Constraints.h(j2), x.f30219a, EmptyMeasurePolicy$placementBlock$1.f5963a);
    }
}
