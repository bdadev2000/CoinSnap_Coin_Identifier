package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazyGridMeasureKt$measureLazyGrid$6 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f4535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridMeasureKt$measureLazyGrid$6(ArrayList arrayList, MutableState mutableState) {
        super(1);
        this.f4534a = arrayList;
        this.f4535b = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        List list;
        GraphicsLayer graphicsLayer;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list2 = this.f4534a;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) list2.get(i3);
            if (lazyGridMeasuredItem.f4565r == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("position() should be called first".toString());
            }
            List list3 = lazyGridMeasuredItem.f4556i;
            int size2 = list3.size();
            int i4 = 0;
            while (i4 < size2) {
                Placeable placeable = (Placeable) list3.get(i4);
                int i5 = lazyGridMeasuredItem.f4566s;
                boolean z2 = lazyGridMeasuredItem.f4552c;
                int i6 = i5 - (z2 ? placeable.f15826b : placeable.f15825a);
                int i7 = lazyGridMeasuredItem.f4567t;
                long j2 = lazyGridMeasuredItem.f4569v;
                List list4 = list2;
                LazyLayoutItemAnimation a2 = lazyGridMeasuredItem.f4559l.a(i4, lazyGridMeasuredItem.f4551b);
                if (a2 != null) {
                    i2 = size;
                    long d = IntOffset.d(j2, ((IntOffset) a2.f4723q.getValue()).f17489a);
                    list = list3;
                    if ((lazyGridMeasuredItem.o(j2) <= i6 && lazyGridMeasuredItem.o(d) <= i6) || (lazyGridMeasuredItem.o(j2) >= i7 && lazyGridMeasuredItem.o(d) >= i7)) {
                        a2.b();
                    }
                    graphicsLayer = a2.f4720n;
                    j2 = d;
                } else {
                    i2 = size;
                    list = list3;
                    graphicsLayer = null;
                }
                if (lazyGridMeasuredItem.e) {
                    j2 = IntOffsetKt.a(z2 ? (int) (j2 >> 32) : (lazyGridMeasuredItem.f4565r - ((int) (j2 >> 32))) - (z2 ? placeable.f15826b : placeable.f15825a), z2 ? (lazyGridMeasuredItem.f4565r - ((int) (j2 & 4294967295L))) - (z2 ? placeable.f15826b : placeable.f15825a) : (int) (j2 & 4294967295L));
                }
                long d2 = IntOffset.d(j2, lazyGridMeasuredItem.f4557j);
                if (a2 != null) {
                    a2.f4719m = d2;
                }
                if (z2) {
                    if (graphicsLayer != null) {
                        placementScope.getClass();
                        Placeable.PlacementScope.a(placementScope, placeable);
                        placeable.j0(IntOffset.d(d2, placeable.f15828f), 0.0f, graphicsLayer);
                    } else {
                        Placeable.PlacementScope.n(placementScope, placeable, d2);
                    }
                } else if (graphicsLayer != null) {
                    Placeable.PlacementScope.l(placementScope, placeable, d2, graphicsLayer);
                } else {
                    Placeable.PlacementScope.k(placementScope, placeable, d2);
                }
                i4++;
                list2 = list4;
                size = i2;
                list3 = list;
            }
        }
        this.f4535b.getValue();
        return b0.f30125a;
    }
}
