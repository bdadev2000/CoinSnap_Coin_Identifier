package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import b1.d0;
import b1.f0;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f11072a;

    /* renamed from: b, reason: collision with root package name */
    public Animatable f11073b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f11074c;

    public SegmentedButtonContentMeasurePolicy(d0 d0Var) {
        this.f11072a = d0Var;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i2 = 1;
        List list3 = (List) arrayList.get(1);
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        int i3 = 0;
        while (i3 < size) {
            i3 = d.e((Measurable) list2.get(i3), j2, arrayList2, i3, 1);
        }
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int i4 = ((Placeable) obj).f15825a;
            int p2 = f0.p(arrayList2);
            if (1 <= p2) {
                int i5 = 1;
                while (true) {
                    Object obj4 = arrayList2.get(i5);
                    int i6 = ((Placeable) obj4).f15825a;
                    if (i4 < i6) {
                        obj = obj4;
                        i4 = i6;
                    }
                    if (i5 == p2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int i7 = placeable != null ? placeable.f15825a : 0;
        ArrayList arrayList3 = new ArrayList(list3.size());
        int size2 = list3.size();
        int i8 = 0;
        while (i8 < size2) {
            i8 = d.e((Measurable) list3.get(i8), j2, arrayList3, i8, 1);
        }
        if (arrayList3.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList3.get(0);
            int i9 = ((Placeable) obj2).f15825a;
            int p3 = f0.p(arrayList3);
            if (1 <= p3) {
                int i10 = 1;
                while (true) {
                    Object obj5 = arrayList3.get(i10);
                    int i11 = ((Placeable) obj5).f15825a;
                    if (i9 < i11) {
                        obj2 = obj5;
                        i9 = i11;
                    }
                    if (i10 == p3) {
                        break;
                    }
                    i10++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer valueOf = placeable2 != null ? Integer.valueOf(placeable2.f15825a) : null;
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i12 = ((Placeable) obj3).f15826b;
            int p4 = f0.p(arrayList3);
            if (1 <= p4) {
                while (true) {
                    Object obj6 = arrayList3.get(i2);
                    int i13 = ((Placeable) obj6).f15826b;
                    if (i12 < i13) {
                        obj3 = obj6;
                        i12 = i13;
                    }
                    if (i2 == p4) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Placeable placeable3 = (Placeable) obj3;
        int i14 = placeable3 != null ? placeable3.f15826b : 0;
        float f2 = SegmentedButtonDefaults.f11085c;
        int max = Math.max(measureScope.F0(f2), i7);
        float f3 = SegmentedButtonKt.f11096a;
        int F0 = measureScope.F0(f3) + max + (valueOf != null ? valueOf.intValue() : 0);
        int i15 = i7 == 0 ? (-(measureScope.F0(f3) + measureScope.F0(f2))) / 2 : 0;
        Integer num = this.f11074c;
        if (num == null) {
            this.f11074c = Integer.valueOf(i15);
        } else {
            Animatable animatable = this.f11073b;
            if (animatable == null) {
                animatable = new Animatable(num, VectorConvertersKt.f2341b, null, 12);
                this.f11073b = animatable;
            }
            if (((Number) animatable.e.getValue()).intValue() != i15) {
                e.v(this.f11072a, null, 0, new SegmentedButtonContentMeasurePolicy$measure$1(animatable, i15, null), 3);
            }
        }
        return measureScope.T(F0, i14, x.f30219a, new SegmentedButtonContentMeasurePolicy$measure$2(arrayList2, measureScope, this, i15, arrayList3, i14));
    }
}
