package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class StartIconMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f11611a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11612b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11613c;
    public final float d;

    public StartIconMeasurePolicy(q0.a aVar, float f2, float f3, float f4) {
        this.f11611a = aVar;
        this.f11612b = f2;
        this.f11613c = f3;
        this.d = f4;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (p0.a.g(TextFieldImplKt.g(intrinsicMeasurable), "icon")) {
                int s2 = intrinsicMeasurable.s(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
                    if (p0.a.g(TextFieldImplKt.g(intrinsicMeasurable2), "label")) {
                        return Math.max(s2, intrinsicMeasurable2.s(i2)) + intrinsicMeasureScope.F0(this.f11613c * 2);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (p0.a.g(TextFieldImplKt.g(intrinsicMeasurable), "icon")) {
                int S = intrinsicMeasurable.S(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i4);
                    if (p0.a.g(TextFieldImplKt.g(intrinsicMeasurable2), "label")) {
                        return S + intrinsicMeasurable2.S(i2) + intrinsicMeasureScope.F0((this.f11612b * 2) + this.d);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        StartIconMeasurePolicy startIconMeasurePolicy = this;
        float floatValue = ((Number) startIconMeasurePolicy.f11611a.invoke()).floatValue();
        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
        float f2 = 2;
        float f3 = startIconMeasurePolicy.f11612b * f2;
        int i2 = -measureScope.F0(f3);
        float f4 = startIconMeasurePolicy.f11613c * f2;
        long k2 = ConstraintsKt.k(i2, -measureScope.F0(f4), b2);
        int size = list.size();
        int i3 = 0;
        while (true) {
            String str = "Collection contains no element matching the predicate.";
            if (i3 >= size) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            Measurable measurable = (Measurable) list.get(i3);
            int i4 = size;
            int i5 = i3;
            if (p0.a.g(LayoutIdKt.a(measurable), "icon")) {
                Placeable V = measurable.V(k2);
                int size2 = list.size();
                int i6 = 0;
                while (i6 < size2) {
                    int i7 = size2;
                    Measurable measurable2 = (Measurable) list.get(i6);
                    int i8 = i6;
                    String str2 = str;
                    if (p0.a.g(LayoutIdKt.a(measurable2), "label")) {
                        int i9 = V.f15825a;
                        float f5 = startIconMeasurePolicy.d;
                        int i10 = 0;
                        Placeable V2 = measurable2.V(ConstraintsKt.l(-(measureScope.F0(f5) + i9), 0, k2, 2));
                        int F0 = measureScope.F0(f3 + f5) + V.f15825a + V2.f15825a;
                        int F02 = measureScope.F0(f4) + Math.max(V.f15826b, V2.f15826b);
                        int t02 = p0.a.t0(F0 * floatValue);
                        int size3 = list.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Measurable measurable3 = (Measurable) list.get(i11);
                            if (p0.a.g(LayoutIdKt.a(measurable3), "indicatorRipple")) {
                                Placeable V3 = measurable3.V(ConstraintsKt.f(b2, Constraints.Companion.c(F0, F02)));
                                int size4 = list.size();
                                while (i10 < size4) {
                                    Measurable measurable4 = (Measurable) list.get(i10);
                                    if (p0.a.g(LayoutIdKt.a(measurable4), "indicator")) {
                                        Placeable V4 = measurable4.V(ConstraintsKt.f(b2, Constraints.Companion.c(t02, F02)));
                                        float f6 = NavigationItemKt.f10235a;
                                        int h2 = ConstraintsKt.h(V3.f15825a, j2);
                                        int g2 = ConstraintsKt.g(V3.f15826b, j2);
                                        int i12 = (h2 - V4.f15825a) / 2;
                                        int i13 = (g2 - V4.f15826b) / 2;
                                        int i14 = (g2 - V.f15826b) / 2;
                                        int i15 = (g2 - V2.f15826b) / 2;
                                        int F03 = (h2 - ((measureScope.F0(f5) + V.f15825a) + V2.f15825a)) / 2;
                                        return measureScope.T(h2, g2, x.f30219a, new NavigationItemKt$placeLabelAndStartIcon$1(V4, i12, i13, V2, measureScope.F0(f5) + F03 + V.f15825a, i15, V, F03, i14, V3, (h2 - V3.f15825a) / 2, (g2 - V3.f15826b) / 2));
                                    }
                                    i10++;
                                }
                                throw new NoSuchElementException(str2);
                            }
                            i11++;
                            i10 = i10;
                        }
                        throw new NoSuchElementException(str2);
                    }
                    i6 = i8 + 1;
                    startIconMeasurePolicy = this;
                    str = str2;
                    size2 = i7;
                }
                throw new NoSuchElementException(str);
            }
            i3 = i5 + 1;
            startIconMeasurePolicy = this;
            size = i4;
        }
    }
}
