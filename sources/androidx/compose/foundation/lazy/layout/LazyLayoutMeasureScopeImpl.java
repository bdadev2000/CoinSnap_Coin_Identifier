package androidx.compose.foundation.lazy.layout;

import android.support.v4.media.d;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q0.l;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutItemContentFactory f4817a;

    /* renamed from: b, reason: collision with root package name */
    public final SubcomposeMeasureScope f4818b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyLayoutItemProvider f4819c;
    public final HashMap d = new HashMap();

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.f4817a = lazyLayoutItemContentFactory;
        this.f4818b = subcomposeMeasureScope;
        this.f4819c = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.f4777b.invoke();
    }

    @Override // androidx.compose.ui.unit.Density
    public final int C1(long j2) {
        return this.f4818b.C1(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final int F0(float f2) {
        return this.f4818b.F0(f2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final float H(int i2) {
        return this.f4818b.H(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final float I(float f2) {
        return this.f4818b.I(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float J0(long j2) {
        return this.f4818b.J0(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long L(long j2) {
        return this.f4818b.L(j2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult T(int i2, int i3, Map map, l lVar) {
        return this.f4818b.T(i2, i3, map, lVar);
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.f4818b.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final LayoutDirection getLayoutDirection() {
        return this.f4818b.getLayoutDirection();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public final List k0(int i2, long j2) {
        HashMap hashMap = this.d;
        List list = (List) hashMap.get(Integer.valueOf(i2));
        if (list != null) {
            return list;
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = this.f4819c;
        Object c2 = lazyLayoutItemProvider.c(i2);
        List D1 = this.f4818b.D1(c2, this.f4817a.a(i2, c2, lazyLayoutItemProvider.d(i2)));
        int size = D1.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        while (i3 < size) {
            i3 = d.e((Measurable) D1.get(i3), j2, arrayList, i3, 1);
        }
        hashMap.put(Integer.valueOf(i2), arrayList);
        return arrayList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public final long o(float f2) {
        return this.f4818b.o(f2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long p(long j2) {
        return this.f4818b.p(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    public final float r(long j2) {
        return this.f4818b.r(j2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult r0(int i2, int i3, Map map, l lVar) {
        return this.f4818b.r0(i2, i3, map, lVar);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean t0() {
        return this.f4818b.t0();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    public final long u(float f2) {
        return this.f4818b.u(f2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return this.f4818b.x1();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float y1(float f2) {
        return this.f4818b.y1(f2);
    }
}
