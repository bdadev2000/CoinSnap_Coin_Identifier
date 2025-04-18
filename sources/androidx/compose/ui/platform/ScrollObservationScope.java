package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ScrollObservationScope implements OwnerScope {

    /* renamed from: a, reason: collision with root package name */
    public final int f16589a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16590b;

    /* renamed from: c, reason: collision with root package name */
    public Float f16591c = null;
    public Float d = null;

    /* renamed from: f, reason: collision with root package name */
    public ScrollAxisRange f16592f = null;

    /* renamed from: g, reason: collision with root package name */
    public ScrollAxisRange f16593g = null;

    public ScrollObservationScope(int i2, ArrayList arrayList) {
        this.f16589a = i2;
        this.f16590b = arrayList;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean Y0() {
        return this.f16590b.contains(this);
    }
}
