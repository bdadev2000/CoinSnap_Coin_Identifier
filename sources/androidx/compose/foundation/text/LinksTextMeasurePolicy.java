package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import e0.x;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LinksTextMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f6045a;

    public LinksTextMeasurePolicy(q0.a aVar) {
        this.f6045a = aVar;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return measureScope.T(Constraints.i(j2), Constraints.h(j2), x.f30219a, new LinksTextMeasurePolicy$measure$1(list, this));
    }
}
