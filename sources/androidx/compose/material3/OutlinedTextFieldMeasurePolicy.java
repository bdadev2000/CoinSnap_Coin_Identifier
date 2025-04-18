package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.common.api.Api;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final l f10585a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10586b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10587c;
    public final PaddingValues d;

    public OutlinedTextFieldMeasurePolicy(l lVar, boolean z2, float f2, PaddingValues paddingValues) {
        this.f10585a = lVar;
        this.f10586b = z2;
        this.f10587c = f2;
        this.d = paddingValues;
    }

    public final int a(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, p pVar) {
        Object obj;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            int S = intrinsicMeasurable.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            float f2 = OutlinedTextFieldKt.f10441a;
            i3 = i2 == Integer.MAX_VALUE ? i2 : i2 - S;
            i4 = ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue();
        } else {
            i3 = i2;
            i4 = 0;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            int S2 = intrinsicMeasurable2.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            float f3 = OutlinedTextFieldKt.f10441a;
            if (i3 != Integer.MAX_VALUE) {
                i3 -= S2;
            }
            i5 = ((Number) pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (IntrinsicMeasurable) obj3;
        int intValue = obj8 != null ? ((Number) pVar.invoke(obj8, Integer.valueOf(MathHelpersKt.c(i3, i2, this.f10587c)))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable3 != null) {
            i6 = ((Number) pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i3))).intValue();
            int S3 = intrinsicMeasurable3.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            float f4 = OutlinedTextFieldKt.f10441a;
            if (i3 != Integer.MAX_VALUE) {
                i3 -= S3;
            }
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable4 != null) {
            int intValue2 = ((Number) pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i3))).intValue();
            int S4 = intrinsicMeasurable4.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            float f5 = OutlinedTextFieldKt.f10441a;
            if (i3 != Integer.MAX_VALUE) {
                i3 -= S4;
            }
            i7 = intValue2;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj9), "TextField")) {
                int intValue3 = ((Number) pVar.invoke(obj9, Integer.valueOf(i3))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (IntrinsicMeasurable) obj6;
                int intValue4 = obj10 != null ? ((Number) pVar.invoke(obj10, Integer.valueOf(i3))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i15);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i15++;
                }
                Object obj12 = (IntrinsicMeasurable) obj7;
                return OutlinedTextFieldKt.c(i4, i5, i6, i7, intValue3, intValue, intValue4, obj12 != null ? ((Number) pVar.invoke(obj12, Integer.valueOf(i2))).intValue() : 0, this.f10587c, TextFieldImplKt.f13034a, intrinsicMeasureScope.getDensity(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int b(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, p pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj7 = list.get(i3);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj7), "TextField")) {
                int intValue = ((Number) pVar.invoke(obj7, Integer.valueOf(i2))).intValue();
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    obj = null;
                    if (i4 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i4);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
                int size3 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i5);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? ((Number) pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
                int size4 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i6);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? ((Number) pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i7);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj5), "Prefix")) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int intValue5 = intrinsicMeasurable4 != null ? ((Number) pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
                int size6 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj6), "Suffix")) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int intValue6 = intrinsicMeasurable5 != null ? ((Number) pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue() : 0;
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i9);
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, intrinsicMeasurable6 != null ? ((Number) pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue() : 0, this.f10587c, TextFieldImplKt.f13034a, intrinsicMeasureScope.getDensity(), this.d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.f10588a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return b(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.f10589a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        Placeable placeable;
        Placeable placeable2;
        Object obj4;
        Placeable placeable3;
        Object obj5;
        Object obj6;
        Object obj7;
        PaddingValues paddingValues = this.d;
        int F0 = measureScope.F0(paddingValues.a());
        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (p0.a.g(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable V = measurable != null ? measurable.V(b2) : null;
        int j3 = TextFieldImplKt.j(V);
        int max = Math.max(0, TextFieldImplKt.h(V));
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (p0.a.g(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable V2 = measurable2 != null ? measurable2.V(ConstraintsKt.l(-j3, 0, b2, 2)) : null;
        int j4 = TextFieldImplKt.j(V2) + j3;
        int max2 = Math.max(max, TextFieldImplKt.h(V2));
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (p0.a.g(LayoutIdKt.a((Measurable) obj3), "Prefix")) {
                break;
            }
            i4++;
        }
        Measurable measurable3 = (Measurable) obj3;
        if (measurable3 != null) {
            placeable = V;
            placeable2 = measurable3.V(ConstraintsKt.l(-j4, 0, b2, 2));
        } else {
            placeable = V;
            placeable2 = null;
        }
        int j5 = TextFieldImplKt.j(placeable2) + j4;
        int max3 = Math.max(max2, TextFieldImplKt.h(placeable2));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            int i6 = size4;
            if (p0.a.g(LayoutIdKt.a((Measurable) obj4), "Suffix")) {
                break;
            }
            i5++;
            size4 = i6;
        }
        Measurable measurable4 = (Measurable) obj4;
        Placeable V3 = measurable4 != null ? measurable4.V(ConstraintsKt.l(-j5, 0, b2, 2)) : null;
        int j6 = TextFieldImplKt.j(V3) + j5;
        int max4 = Math.max(max3, TextFieldImplKt.h(V3));
        MeasureScope measureScope2 = measureScope;
        int F02 = measureScope2.F0(paddingValues.c(measureScope.getLayoutDirection())) + measureScope2.F0(paddingValues.b(measureScope.getLayoutDirection()));
        int i7 = -j6;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        int c2 = MathHelpersKt.c(i7 - F02, -F02, outlinedTextFieldMeasurePolicy.f10587c);
        int i8 = -F0;
        Placeable placeable4 = V3;
        long k2 = ConstraintsKt.k(c2, i8, b2);
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                placeable3 = placeable4;
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            int i10 = size5;
            placeable3 = placeable4;
            if (p0.a.g(LayoutIdKt.a((Measurable) obj5), "Label")) {
                break;
            }
            i9++;
            placeable4 = placeable3;
            size5 = i10;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable V4 = measurable5 != null ? measurable5.V(k2) : null;
        outlinedTextFieldMeasurePolicy.f10585a.invoke(new Size(V4 != null ? SizeKt.a(V4.f15825a, V4.f15826b) : 0L));
        int size6 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i11);
            int i12 = size6;
            if (p0.a.g(LayoutIdKt.a((Measurable) obj6), "Supporting")) {
                break;
            }
            i11++;
            size6 = i12;
        }
        Measurable measurable6 = (Measurable) obj6;
        int K = measurable6 != null ? measurable6.K(Constraints.k(j2)) : 0;
        int max5 = Math.max(TextFieldImplKt.h(V4) / 2, measureScope2.F0(paddingValues.d()));
        long b3 = Constraints.b(ConstraintsKt.k(i7, (i8 - max5) - K, j2), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i13 = 0;
        while (i13 < size7) {
            int i14 = size7;
            Measurable measurable7 = (Measurable) list.get(i13);
            int i15 = i13;
            if (p0.a.g(LayoutIdKt.a(measurable7), "TextField")) {
                Placeable V5 = measurable7.V(b3);
                long b4 = Constraints.b(b3, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i16);
                    int i17 = size8;
                    if (p0.a.g(LayoutIdKt.a((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i16++;
                    size8 = i17;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable V6 = measurable8 != null ? measurable8.V(b4) : null;
                int max6 = Math.max(max4, Math.max(TextFieldImplKt.h(V5), TextFieldImplKt.h(V6)) + max5 + F0);
                int d = OutlinedTextFieldKt.d(TextFieldImplKt.j(placeable), TextFieldImplKt.j(V2), TextFieldImplKt.j(placeable2), TextFieldImplKt.j(placeable3), V5.f15825a, TextFieldImplKt.j(V4), TextFieldImplKt.j(V6), outlinedTextFieldMeasurePolicy.f10587c, j2, measureScope.getDensity(), outlinedTextFieldMeasurePolicy.d);
                Placeable V7 = measurable6 != null ? measurable6.V(Constraints.b(ConstraintsKt.l(0, -max6, b2, 1), 0, d, 0, 0, 9)) : null;
                int h2 = TextFieldImplKt.h(V7);
                int c3 = OutlinedTextFieldKt.c(TextFieldImplKt.h(placeable), TextFieldImplKt.h(V2), TextFieldImplKt.h(placeable2), TextFieldImplKt.h(placeable3), V5.f15826b, TextFieldImplKt.h(V4), TextFieldImplKt.h(V6), TextFieldImplKt.h(V7), outlinedTextFieldMeasurePolicy.f10587c, j2, measureScope.getDensity(), outlinedTextFieldMeasurePolicy.d);
                int i18 = c3 - h2;
                int size9 = list.size();
                for (int i19 = 0; i19 < size9; i19++) {
                    Measurable measurable9 = (Measurable) list.get(i19);
                    if (p0.a.g(LayoutIdKt.a(measurable9), "Container")) {
                        return measureScope.T(d, c3, x.f30219a, new OutlinedTextFieldMeasurePolicy$measure$1(c3, d, placeable, V2, placeable2, placeable3, V5, V4, V6, measurable9.V(ConstraintsKt.a(d != Integer.MAX_VALUE ? d : 0, d, i18 != Integer.MAX_VALUE ? i18 : 0, i18)), V7, this, measureScope));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i13 = i15 + 1;
            size7 = i14;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.f10602a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return b(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.f10603a);
    }
}
