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
/* loaded from: classes3.dex */
public final class TopIconOrIconOnlyMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12614a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f12615b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12616c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12617f;

    public TopIconOrIconOnlyMeasurePolicy(boolean z2, q0.a aVar, float f2, float f3, float f4, float f5) {
        this.f12614a = z2;
        this.f12615b = aVar;
        this.f12616c = f2;
        this.d = f3;
        this.e = f4;
        this.f12617f = f5;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Object obj;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
            if (p0.a.g(TextFieldImplKt.g(intrinsicMeasurable), "icon")) {
                int s2 = intrinsicMeasurable.s(i2);
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj), "label")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj;
                float f2 = 2;
                return s2 + (intrinsicMeasurable2 != null ? intrinsicMeasurable2.s(i2) : 0) + intrinsicMeasureScope.F0((this.d * f2) + (this.f12617f * f2) + this.e);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        List list2 = list;
        float floatValue = ((Number) this.f12615b.invoke()).floatValue();
        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (p0.a.g(LayoutIdKt.a(measurable), "icon")) {
                float f2 = 2;
                float f3 = this.f12616c * f2;
                int i3 = -measureScope.F0(f3);
                float f4 = this.d;
                float f5 = f4 * f2;
                Placeable V = measurable.V(ConstraintsKt.k(i3, -measureScope.F0(f5), b2));
                int F0 = measureScope.F0(f3) + V.f15825a;
                int F02 = measureScope.F0(f5) + V.f15826b;
                int t02 = p0.a.t0(F0 * floatValue);
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = (Measurable) list2.get(i4);
                    int i5 = size2;
                    int i6 = i4;
                    if (p0.a.g(LayoutIdKt.a(measurable2), "indicatorRipple")) {
                        Placeable V2 = measurable2.V(ConstraintsKt.f(b2, Constraints.Companion.c(F0, F02)));
                        int size3 = list.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i7);
                            int i8 = size3;
                            int i9 = i7;
                            if (p0.a.g(LayoutIdKt.a(measurable3), "indicator")) {
                                Placeable V3 = measurable3.V(ConstraintsKt.f(b2, Constraints.Companion.c(t02, F02)));
                                boolean z2 = this.f12614a;
                                x xVar = x.f30219a;
                                if (!z2) {
                                    float f6 = NavigationItemKt.f10235a;
                                    int h2 = ConstraintsKt.h(V2.f15825a, j2);
                                    int g2 = ConstraintsKt.g(V2.f15826b, j2);
                                    return measureScope.T(h2, g2, xVar, new NavigationItemKt$placeIcon$1((h2 - V3.f15825a) / 2, (g2 - V3.f15826b) / 2, (h2 - V.f15825a) / 2, (g2 - V.f15826b) / 2, (h2 - V2.f15825a) / 2, (g2 - V2.f15826b) / 2, V3, V, V2));
                                }
                                int size4 = list.size();
                                int i10 = 0;
                                while (i10 < size4) {
                                    Measurable measurable4 = (Measurable) list2.get(i10);
                                    int i11 = size4;
                                    if (p0.a.g(LayoutIdKt.a(measurable4), "label")) {
                                        int i12 = V3.f15826b;
                                        float f7 = this.e;
                                        Placeable V4 = measurable4.V(ConstraintsKt.l(0, -(measureScope.F0(f7) + i12), b2, 1));
                                        float f8 = NavigationItemKt.f10235a;
                                        int h3 = ConstraintsKt.h(Math.max(V4.f15825a, V2.f15825a), j2);
                                        float y1 = measureScope.y1(f7) + V2.f15826b + V4.f15826b;
                                        float f9 = this.f12617f;
                                        int g3 = ConstraintsKt.g(p0.a.t0((measureScope.y1(f9) * f2) + y1), j2);
                                        int F03 = measureScope.F0(f9 + f4);
                                        int i13 = (h3 - V.f15825a) / 2;
                                        int i14 = (h3 - V3.f15825a) / 2;
                                        int F04 = F03 - measureScope.F0(f4);
                                        return measureScope.T(h3, g3, xVar, new NavigationItemKt$placeLabelAndTopIcon$1(V3, i14, F04, V4, (h3 - V4.f15825a) / 2, measureScope.F0(f4 + f7) + F03 + V.f15826b, V, i13, F03, V2, (h3 - V2.f15825a) / 2, F04));
                                    }
                                    i10++;
                                    list2 = list;
                                    size4 = i11;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            list2 = list;
                            i7 = i9 + 1;
                            size3 = i8;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    list2 = list;
                    i4 = i6 + 1;
                    size2 = i5;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i2++;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
