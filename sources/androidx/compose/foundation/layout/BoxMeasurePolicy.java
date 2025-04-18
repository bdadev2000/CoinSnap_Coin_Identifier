package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BoxMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f3803a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3804b;

    public BoxMeasurePolicy(Alignment alignment, boolean z2) {
        this.f3803a = alignment;
        this.f3804b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return p0.a.g(this.f3803a, boxMeasurePolicy.f3803a) && this.f3804b == boxMeasurePolicy.f3804b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3804b) + (this.f3803a.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        int max;
        int max2;
        Placeable placeable;
        boolean isEmpty = list.isEmpty();
        x xVar = x.f30219a;
        if (isEmpty) {
            return measureScope.T(Constraints.k(j2), Constraints.j(j2), xVar, BoxMeasurePolicy$measure$1.f3805a);
        }
        long b2 = this.f3804b ? j2 : Constraints.b(j2, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            Measurable measurable = (Measurable) list.get(0);
            HashMap hashMap = BoxKt.f3796a;
            Object m2 = measurable.m();
            BoxChildDataNode boxChildDataNode = m2 instanceof BoxChildDataNode ? (BoxChildDataNode) m2 : null;
            if (boxChildDataNode == null || !boxChildDataNode.f3795p) {
                Placeable V = measurable.V(b2);
                max = Math.max(Constraints.k(j2), V.f15825a);
                max2 = Math.max(Constraints.j(j2), V.f15826b);
                placeable = V;
            } else {
                max = Constraints.k(j2);
                max2 = Constraints.j(j2);
                placeable = measurable.V(Constraints.Companion.c(Constraints.k(j2), Constraints.j(j2)));
            }
            return measureScope.T(max, max2, xVar, new BoxMeasurePolicy$measure$2(placeable, measurable, measureScope, max, max2, this));
        }
        Placeable[] placeableArr = new Placeable[list.size()];
        ?? obj = new Object();
        obj.f30925a = Constraints.k(j2);
        ?? obj2 = new Object();
        obj2.f30925a = Constraints.j(j2);
        int size = list.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable2 = (Measurable) list.get(i2);
            HashMap hashMap2 = BoxKt.f3796a;
            Object m3 = measurable2.m();
            BoxChildDataNode boxChildDataNode2 = m3 instanceof BoxChildDataNode ? (BoxChildDataNode) m3 : null;
            if (boxChildDataNode2 == null || !boxChildDataNode2.f3795p) {
                Placeable V2 = measurable2.V(b2);
                placeableArr[i2] = V2;
                obj.f30925a = Math.max(obj.f30925a, V2.f15825a);
                obj2.f30925a = Math.max(obj2.f30925a, V2.f15826b);
            } else {
                z2 = true;
            }
        }
        if (z2) {
            int i3 = obj.f30925a;
            int i4 = i3 != Integer.MAX_VALUE ? i3 : 0;
            int i5 = obj2.f30925a;
            long a2 = ConstraintsKt.a(i4, i3, i5 != Integer.MAX_VALUE ? i5 : 0, i5);
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Measurable measurable3 = (Measurable) list.get(i6);
                HashMap hashMap3 = BoxKt.f3796a;
                Object m4 = measurable3.m();
                BoxChildDataNode boxChildDataNode3 = m4 instanceof BoxChildDataNode ? (BoxChildDataNode) m4 : null;
                if (boxChildDataNode3 != null && boxChildDataNode3.f3795p) {
                    placeableArr[i6] = measurable3.V(a2);
                }
            }
        }
        return measureScope.T(obj.f30925a, obj2.f30925a, xVar, new BoxMeasurePolicy$measure$5(placeableArr, list, measureScope, obj, obj2, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.f3803a);
        sb.append(", propagateMinConstraints=");
        return d.s(sb, this.f3804b, ')');
    }
}
