package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.common.api.Api;
import e0.u;
import e0.w;
import e0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import w0.e;
import w0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FlowMeasurePolicy implements MultiContentMeasurePolicy, FlowLineMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3984a;

    /* renamed from: b, reason: collision with root package name */
    public final Arrangement.Horizontal f3985b;

    /* renamed from: c, reason: collision with root package name */
    public final Arrangement.Vertical f3986c;
    public final float d;
    public final CrossAxisAlignment e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3987f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3988g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3989h;

    /* renamed from: i, reason: collision with root package name */
    public final FlowLayoutOverflowState f3990i;

    /* renamed from: j, reason: collision with root package name */
    public final r f3991j;

    /* renamed from: k, reason: collision with root package name */
    public final r f3992k;

    /* renamed from: l, reason: collision with root package name */
    public final r f3993l;

    public FlowMeasurePolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.f3984a = z2;
        this.f3985b = horizontal;
        this.f3986c = vertical;
        this.d = f2;
        this.e = crossAxisAlignment;
        this.f3987f = f3;
        this.f3988g = i2;
        this.f3989h = i3;
        this.f3990i = flowLayoutOverflowState;
        this.f3991j = z2 ? FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1.f3994a : FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2.f3995a;
        this.f3992k = z2 ? FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1.f3998a : FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2.f3999a;
        this.f3993l = z2 ? FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1.f4000a : FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2.f4001a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.f3984a == flowMeasurePolicy.f3984a && p0.a.g(this.f3985b, flowMeasurePolicy.f3985b) && p0.a.g(this.f3986c, flowMeasurePolicy.f3986c) && Dp.a(this.d, flowMeasurePolicy.d) && p0.a.g(this.e, flowMeasurePolicy.e) && Dp.a(this.f3987f, flowMeasurePolicy.f3987f) && this.f3988g == flowMeasurePolicy.f3988g && this.f3989h == flowMeasurePolicy.f3989h && p0.a.g(this.f3990i, flowMeasurePolicy.f3990i);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final CrossAxisAlignment f() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.r, q0.q] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.r, q0.q] */
    public final int g(List list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        return (int) (FlowLayoutKt.d(list, this.f3993l, this.f3992k, i2, i3, i4, i5, i6, flowLayoutOverflowState) >> 32);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.r, q0.q] */
    public final int h(int i2, int i3, List list) {
        ?? r02 = this.f3991j;
        CrossAxisAlignment crossAxisAlignment = FlowLayoutKt.f3910a;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = ((Number) r02.invoke((IntrinsicMeasurable) list.get(i4), Integer.valueOf(i4), Integer.valueOf(i2))).intValue() + i3;
            int i8 = i4 + 1;
            if (i8 - i6 == this.f3988g || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + intValue) - i3);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    public final int hashCode() {
        return this.f3990i.hashCode() + d.c(this.f3989h, d.c(this.f3988g, d.b(this.f3987f, (this.e.hashCode() + d.b(this.d, (this.f3986c.hashCode() + ((this.f3985b.hashCode() + (Boolean.hashCode(this.f3984a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.r, q0.q] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.r, q0.q] */
    public final int i(List list, int i2, int i3, int i4, int i5, int i6, FlowLayoutOverflowState flowLayoutOverflowState) {
        FlowLayoutOverflow.OverflowType overflowType;
        ?? r2 = this.f3993l;
        ?? r3 = this.f3992k;
        CrossAxisAlignment crossAxisAlignment = FlowLayoutKt.f3910a;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            iArr2[i8] = 0;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i9);
            int intValue = ((Number) r2.invoke(intrinsicMeasurable, Integer.valueOf(i9), Integer.valueOf(i2))).intValue();
            iArr[i9] = intValue;
            iArr2[i9] = ((Number) r3.invoke(intrinsicMeasurable, Integer.valueOf(i9), Integer.valueOf(intValue))).intValue();
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i6 != Integer.MAX_VALUE && i5 != Integer.MAX_VALUE) {
            i10 = i5 * i6;
        }
        int size4 = list.size();
        FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.d;
        int min = Math.min(i10 - (((i10 >= size4 || !((overflowType = flowLayoutOverflowState.f3942a) == FlowLayoutOverflow.OverflowType.f3940c || overflowType == overflowType2)) && (i10 < list.size() || i6 < flowLayoutOverflowState.f3943b || flowLayoutOverflowState.f3942a != overflowType2)) ? 0 : 1), list.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr[i12];
        }
        int size5 = ((list.size() - 1) * i3) + i11;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i13 = iArr2[0];
        f it = new e(1, size2 - 1, 1).iterator();
        while (it.f31411c) {
            int i14 = iArr2[it.b()];
            if (i13 < i14) {
                i13 = i14;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr[0];
        f it2 = new e(1, size - 1, 1).iterator();
        while (it2.f31411c) {
            int i16 = iArr[it2.b()];
            if (i15 < i16) {
                i15 = i16;
            }
        }
        int i17 = size5;
        int i18 = i17;
        int i19 = i15;
        while (i19 <= i18 && i13 != i2) {
            int i20 = (i19 + i18) / 2;
            int i21 = i19;
            int i22 = i18;
            long d = FlowLayoutKt.d(list, new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i20, i3, i4, i5, i6, flowLayoutOverflowState);
            i13 = (int) (d >> 32);
            int i23 = (int) (d & 4294967295L);
            if (i13 > i2 || i23 < min) {
                i19 = i20 + 1;
                if (i19 > i22) {
                    return i19;
                }
                i18 = i22;
                i17 = i20;
            } else {
                if (i13 >= i2) {
                    return i20;
                }
                i18 = i20 - 1;
                i17 = i20;
                i19 = i21;
            }
        }
        return i17;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final boolean isHorizontal() {
        return this.f3984a;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Arrangement.Horizontal j() {
        return this.f3985b;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Arrangement.Vertical l() {
        return this.f3986c;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f3990i;
        List list2 = (List) u.G0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) u.F0(list2) : null;
        List list3 = (List) u.G0(2, list);
        flowLayoutOverflowState.c(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) u.F0(list3) : null, this.f3984a, ConstraintsKt.b(i2, 0, 13));
        List list4 = w.f30218a;
        boolean z2 = this.f3984a;
        float f2 = this.d;
        if (z2) {
            List list5 = (List) u.F0(list);
            return g(list5 == null ? list4 : list5, i2, intrinsicMeasureScope.F0(f2), intrinsicMeasureScope.F0(this.f3987f), this.f3988g, this.f3989h, this.f3990i);
        }
        List list6 = (List) u.F0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return h(i2, intrinsicMeasureScope.F0(f2), list4);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f3990i;
        List list2 = (List) u.G0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) u.F0(list2) : null;
        List list3 = (List) u.G0(2, list);
        flowLayoutOverflowState.c(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) u.F0(list3) : null, this.f3984a, ConstraintsKt.b(0, i2, 7));
        List list4 = w.f30218a;
        boolean z2 = this.f3984a;
        float f2 = this.d;
        if (!z2) {
            List list5 = (List) u.F0(list);
            return g(list5 == null ? list4 : list5, i2, intrinsicMeasureScope.F0(f2), intrinsicMeasureScope.F0(this.f3987f), this.f3988g, this.f3989h, this.f3990i);
        }
        List list6 = (List) u.F0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return h(i2, intrinsicMeasureScope.F0(f2), list4);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo1measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        int i2 = this.f3989h;
        x xVar = x.f30219a;
        if (i2 != 0 && this.f3988g != 0 && !((ArrayList) list).isEmpty()) {
            int h2 = Constraints.h(j2);
            FlowLayoutOverflowState flowLayoutOverflowState = this.f3990i;
            if (h2 != 0 || flowLayoutOverflowState.f3942a == FlowLayoutOverflow.OverflowType.f3938a) {
                List list2 = (List) u.E0(list);
                if (list2.isEmpty()) {
                    return measureScope.T(0, 0, xVar, FlowMeasurePolicy$measure$2.f3997a);
                }
                List list3 = (List) u.G0(1, list);
                Measurable measurable = list3 != null ? (Measurable) u.F0(list3) : null;
                List list4 = (List) u.G0(2, list);
                Measurable measurable2 = list4 != null ? (Measurable) u.F0(list4) : null;
                list2.size();
                flowLayoutOverflowState.getClass();
                this.f3990i.b(this, measurable, measurable2, j2);
                return FlowLayoutKt.b(measureScope, this, list2.iterator(), this.d, this.f3987f, OrientationIndependentConstraints.a(j2, this.f3984a ? LayoutOrientation.f4037a : LayoutOrientation.f4038b), this.f3988g, this.f3989h, this.f3990i);
            }
        }
        return measureScope.T(0, 0, xVar, FlowMeasurePolicy$measure$1.f3996a);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f3990i;
        List list2 = (List) u.G0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) u.F0(list2) : null;
        List list3 = (List) u.G0(2, list);
        flowLayoutOverflowState.c(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) u.F0(list3) : null, this.f3984a, ConstraintsKt.b(i2, 0, 13));
        w wVar = w.f30218a;
        boolean z2 = this.f3984a;
        float f2 = this.f3987f;
        float f3 = this.d;
        if (z2) {
            List list4 = (List) u.F0(list);
            return g(list4 == null ? wVar : list4, i2, intrinsicMeasureScope.F0(f3), intrinsicMeasureScope.F0(f2), this.f3988g, this.f3989h, this.f3990i);
        }
        List list5 = (List) u.F0(list);
        return i(list5 == null ? wVar : list5, i2, intrinsicMeasureScope.F0(f3), intrinsicMeasureScope.F0(f2), this.f3988g, this.f3989h, this.f3990i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.f3990i;
        List list2 = (List) u.G0(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) u.F0(list2) : null;
        List list3 = (List) u.G0(2, list);
        flowLayoutOverflowState.c(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) u.F0(list3) : null, this.f3984a, ConstraintsKt.b(0, i2, 7));
        w wVar = w.f30218a;
        boolean z2 = this.f3984a;
        float f2 = this.f3987f;
        float f3 = this.d;
        if (z2) {
            List list4 = (List) u.F0(list);
            return i(list4 == null ? wVar : list4, i2, intrinsicMeasureScope.F0(f3), intrinsicMeasureScope.F0(f2), this.f3988g, this.f3989h, this.f3990i);
        }
        List list5 = (List) u.F0(list);
        return g(list5 == null ? wVar : list5, i2, intrinsicMeasureScope.F0(f3), intrinsicMeasureScope.F0(f2), this.f3988g, this.f3989h, this.f3990i);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.f3984a + ", horizontalArrangement=" + this.f3985b + ", verticalArrangement=" + this.f3986c + ", mainAxisSpacing=" + ((Object) Dp.b(this.d)) + ", crossAxisAlignment=" + this.e + ", crossAxisArrangementSpacing=" + ((Object) Dp.b(this.f3987f)) + ", maxItemsInMainAxis=" + this.f3988g + ", maxLines=" + this.f3989h + ", overflow=" + this.f3990i + ')';
    }
}
