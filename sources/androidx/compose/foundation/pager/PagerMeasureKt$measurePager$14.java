package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class PagerMeasureKt$measurePager$14 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f5205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f5206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$14(ArrayList arrayList, MutableState mutableState) {
        super(1);
        this.f5205a = arrayList;
        this.f5206b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        int i3;
        int i4;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f5205a;
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            MeasuredPage measuredPage = (MeasuredPage) list.get(i5);
            if (measuredPage.f5136n == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("position() should be called first".toString());
            }
            List list2 = measuredPage.f5127c;
            int size2 = list2.size();
            int i6 = 0;
            while (i6 < size2) {
                Placeable placeable = (Placeable) list2.get(i6);
                int i7 = i6 * 2;
                int[] iArr = measuredPage.f5134l;
                long a2 = IntOffsetKt.a(iArr[i7], iArr[i7 + 1]);
                boolean z2 = measuredPage.f5131i;
                boolean z3 = measuredPage.f5132j;
                if (z2) {
                    if (z3) {
                        i2 = i5;
                        i3 = (int) (a2 >> 32);
                    } else {
                        i2 = i5;
                        i3 = (measuredPage.f5136n - ((int) (a2 >> 32))) - (z3 ? placeable.f15826b : placeable.f15825a);
                    }
                    if (z3) {
                        i4 = (measuredPage.f5136n - ((int) (a2 & 4294967295L))) - (z3 ? placeable.f15826b : placeable.f15825a);
                    } else {
                        i4 = (int) (a2 & 4294967295L);
                    }
                    a2 = IntOffsetKt.a(i3, i4);
                } else {
                    i2 = i5;
                }
                long d = IntOffset.d(a2, measuredPage.d);
                if (z3) {
                    Placeable.PlacementScope.n(placementScope, placeable, d);
                } else {
                    Placeable.PlacementScope.k(placementScope, placeable, d);
                }
                i6++;
                i5 = i2;
            }
            i5++;
        }
        this.f5206b.getValue();
        return b0.f30125a;
    }
}
