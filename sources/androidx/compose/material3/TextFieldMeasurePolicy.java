package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
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
import com.google.android.gms.common.api.Api;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12184a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12185b;

    /* renamed from: c, reason: collision with root package name */
    public final PaddingValues f12186c;

    public TextFieldMeasurePolicy(boolean z2, float f2, PaddingValues paddingValues) {
        this.f12184a = z2;
        this.f12185b = f2;
        this.f12186c = paddingValues;
    }

    public static int b(List list, int i2, p pVar) {
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
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj4), "Prefix")) {
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
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj5), "Suffix")) {
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
                    if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj6), "Leading")) {
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
                int intValue7 = intrinsicMeasurable6 != null ? ((Number) pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue() : 0;
                long j2 = TextFieldImplKt.f13034a;
                float f2 = TextFieldKt.f12056a;
                int i10 = intValue4 + intValue5;
                return Math.max(Math.max(intValue + i10, Math.max(intValue7 + i10, intValue2)) + intValue6 + intValue3, Constraints.k(j2));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
            float f2 = TextFieldKt.f12056a;
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
            float f3 = TextFieldKt.f12056a;
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
        int intValue = obj8 != null ? ((Number) pVar.invoke(obj8, Integer.valueOf(i3))).intValue() : 0;
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
            int intValue2 = ((Number) pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i3))).intValue();
            int S3 = intrinsicMeasurable3.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            float f4 = TextFieldKt.f12056a;
            if (i3 != Integer.MAX_VALUE) {
                i3 -= S3;
            }
            i6 = intValue2;
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
            int intValue3 = ((Number) pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i3))).intValue();
            int S4 = intrinsicMeasurable4.S(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            float f5 = TextFieldKt.f12056a;
            if (i3 != Integer.MAX_VALUE) {
                i3 -= S4;
            }
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (p0.a.g(TextFieldImplKt.g((IntrinsicMeasurable) obj9), "TextField")) {
                int intValue4 = ((Number) pVar.invoke(obj9, Integer.valueOf(i3))).intValue();
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
                int intValue5 = obj10 != null ? ((Number) pVar.invoke(obj10, Integer.valueOf(i3))).intValue() : 0;
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
                return TextFieldKt.b(intValue4, intValue, i4, i5, i6, i7, intValue5, obj12 != null ? ((Number) pVar.invoke(obj12, Integer.valueOf(i2))).intValue() : 0, this.f12185b, TextFieldImplKt.f13034a, intrinsicMeasureScope.getDensity(), this.f12186c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, list, i2, TextFieldMeasurePolicy$maxIntrinsicHeight$1.f12187a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return b(list, i2, TextFieldMeasurePolicy$maxIntrinsicWidth$1.f12188a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        PaddingValues paddingValues = this.f12186c;
        int F0 = measureScope.F0(paddingValues.d());
        int F02 = measureScope.F0(paddingValues.a());
        long b2 = Constraints.b(j2, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
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
            obj2 = list2.get(i3);
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
            obj3 = list2.get(i4);
            if (p0.a.g(LayoutIdKt.a((Measurable) obj3), "Prefix")) {
                break;
            }
            i4++;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable V3 = measurable3 != null ? measurable3.V(ConstraintsKt.l(-j4, 0, b2, 2)) : null;
        int j5 = TextFieldImplKt.j(V3) + j4;
        int max3 = Math.max(max2, TextFieldImplKt.h(V3));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i5);
            if (p0.a.g(LayoutIdKt.a((Measurable) obj4), "Suffix")) {
                break;
            }
            i5++;
        }
        Measurable measurable4 = (Measurable) obj4;
        Placeable V4 = measurable4 != null ? measurable4.V(ConstraintsKt.l(-j5, 0, b2, 2)) : null;
        int j6 = TextFieldImplKt.j(V4) + j5;
        int max4 = Math.max(max3, TextFieldImplKt.h(V4));
        int i6 = -j6;
        long k2 = ConstraintsKt.k(i6, -F02, b2);
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            Object obj8 = list2.get(i7);
            int i8 = size5;
            if (p0.a.g(LayoutIdKt.a((Measurable) obj8), "Label")) {
                obj5 = obj8;
                break;
            }
            i7++;
            size5 = i8;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable V5 = measurable5 != null ? measurable5.V(k2) : null;
        int size6 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i9);
            int i10 = size6;
            if (p0.a.g(LayoutIdKt.a((Measurable) obj6), "Supporting")) {
                break;
            }
            i9++;
            size6 = i10;
        }
        Measurable measurable6 = (Measurable) obj6;
        int K = measurable6 != null ? measurable6.K(Constraints.k(j2)) : 0;
        int h2 = TextFieldImplKt.h(V5) + F0;
        long k3 = ConstraintsKt.k(i6, ((-h2) - F02) - K, Constraints.b(j2, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = size7;
            Measurable measurable7 = (Measurable) list2.get(i11);
            int i13 = i11;
            if (p0.a.g(LayoutIdKt.a(measurable7), "TextField")) {
                Placeable V6 = measurable7.V(k3);
                long b3 = Constraints.b(k3, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i14);
                    int i15 = size8;
                    if (p0.a.g(LayoutIdKt.a((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i14++;
                    list2 = list;
                    size8 = i15;
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable V7 = measurable8 != null ? measurable8.V(b3) : null;
                int max5 = Math.max(max4, Math.max(TextFieldImplKt.h(V6), TextFieldImplKt.h(V7)) + h2 + F02);
                int j7 = TextFieldImplKt.j(V);
                int j8 = TextFieldImplKt.j(V2);
                int j9 = TextFieldImplKt.j(V3);
                int j10 = TextFieldImplKt.j(V4);
                int i16 = V6.f15825a;
                int j11 = TextFieldImplKt.j(V5);
                int j12 = TextFieldImplKt.j(V7);
                float f2 = TextFieldKt.f12056a;
                int i17 = j9 + j10;
                int max6 = Math.max(Math.max(i16 + i17, Math.max(j12 + i17, j11)) + j7 + j8, Constraints.k(j2));
                Placeable V8 = measurable6 != null ? measurable6.V(Constraints.b(ConstraintsKt.l(0, -max5, b2, 1), 0, max6, 0, 0, 9)) : null;
                int h3 = TextFieldImplKt.h(V8);
                int b4 = TextFieldKt.b(V6.f15826b, TextFieldImplKt.h(V5), TextFieldImplKt.h(V), TextFieldImplKt.h(V2), TextFieldImplKt.h(V3), TextFieldImplKt.h(V4), TextFieldImplKt.h(V7), TextFieldImplKt.h(V8), this.f12185b, j2, measureScope.getDensity(), this.f12186c);
                int i18 = b4 - h3;
                int size9 = list.size();
                int i19 = 0;
                while (i19 < size9) {
                    Measurable measurable9 = (Measurable) list.get(i19);
                    int i20 = size9;
                    if (p0.a.g(LayoutIdKt.a(measurable9), "Container")) {
                        return measureScope.T(max6, b4, x.f30219a, new TextFieldMeasurePolicy$measure$1(V5, max6, b4, V6, V7, V, V2, V3, V4, measurable9.V(ConstraintsKt.a(max6 != Integer.MAX_VALUE ? max6 : 0, max6, i18 != Integer.MAX_VALUE ? i18 : 0, i18)), V8, this, F0, measureScope));
                    }
                    i19++;
                    size9 = i20;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            list2 = list;
            i11 = i13 + 1;
            size7 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, list, i2, TextFieldMeasurePolicy$minIntrinsicHeight$1.f12202a);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return b(list, i2, TextFieldMeasurePolicy$minIntrinsicWidth$1.f12203a);
    }
}
