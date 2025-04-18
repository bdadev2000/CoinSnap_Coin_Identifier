package g;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final d f30524a = new Object();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        return measureScope.T(Constraints.k(j2), Constraints.j(j2), e0.x.f30219a, c.f30523a);
    }
}
