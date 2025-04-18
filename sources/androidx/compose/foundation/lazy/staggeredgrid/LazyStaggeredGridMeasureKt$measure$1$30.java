package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureKt$measure$1$30 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridMeasureContext f4988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureKt$measure$1$30(ArrayList arrayList, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        super(1);
        this.f4987a = arrayList;
        this.f4988b = lazyStaggeredGridMeasureContext;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        List list;
        GraphicsLayer graphicsLayer;
        int i3;
        int i4;
        int i5;
        LazyStaggeredGridMeasureKt$measure$1$30 lazyStaggeredGridMeasureKt$measure$1$30 = this;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list2 = lazyStaggeredGridMeasureKt$measure$1$30.f4987a;
        int size = list2.size();
        int i6 = 0;
        while (true) {
            LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = lazyStaggeredGridMeasureKt$measure$1$30.f4988b;
            if (i6 >= size) {
                lazyStaggeredGridMeasureContext.f4970a.f5065s.getValue();
                return b0.f30125a;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) list2.get(i6);
            if (lazyStaggeredGridMeasuredItem.f5030o == -1) {
                throw new IllegalArgumentException("position() should be called first".toString());
            }
            List list3 = lazyStaggeredGridMeasuredItem.f5020c;
            int size2 = list3.size();
            int i7 = 0;
            while (i7 < size2) {
                Placeable placeable = (Placeable) list3.get(i7);
                int i8 = lazyStaggeredGridMeasuredItem.f5031p;
                boolean z2 = lazyStaggeredGridMeasuredItem.d;
                int i9 = i8 - (z2 ? placeable.f15826b : placeable.f15825a);
                int i10 = lazyStaggeredGridMeasuredItem.f5032q;
                int i11 = i6;
                long j2 = lazyStaggeredGridMeasuredItem.f5034s;
                List list4 = list2;
                LazyLayoutItemAnimation a2 = lazyStaggeredGridMeasuredItem.f5025j.a(i7, lazyStaggeredGridMeasuredItem.f5019b);
                if (a2 != null) {
                    i2 = size;
                    long d = IntOffset.d(j2, ((IntOffset) a2.f4723q.getValue()).f17489a);
                    list = list3;
                    if ((lazyStaggeredGridMeasuredItem.a(j2) <= i9 && lazyStaggeredGridMeasuredItem.a(d) <= i9) || (lazyStaggeredGridMeasuredItem.a(j2) >= i10 && lazyStaggeredGridMeasuredItem.a(d) >= i10)) {
                        a2.b();
                    }
                    graphicsLayer = a2.f4720n;
                    j2 = d;
                } else {
                    i2 = size;
                    list = list3;
                    graphicsLayer = null;
                }
                if (lazyStaggeredGridMeasureContext.f4979l) {
                    if (z2) {
                        i3 = size2;
                        i4 = (int) (j2 >> 32);
                    } else {
                        i3 = size2;
                        i4 = (lazyStaggeredGridMeasuredItem.f5030o - ((int) (j2 >> 32))) - (z2 ? placeable.f15826b : placeable.f15825a);
                    }
                    if (z2) {
                        i5 = (lazyStaggeredGridMeasuredItem.f5030o - ((int) (j2 & 4294967295L))) - (z2 ? placeable.f15826b : placeable.f15825a);
                    } else {
                        i5 = (int) (j2 & 4294967295L);
                    }
                    j2 = IntOffsetKt.a(i4, i5);
                } else {
                    i3 = size2;
                }
                long d2 = IntOffset.d(j2, lazyStaggeredGridMeasureContext.f4976i);
                if (a2 != null) {
                    a2.f4719m = d2;
                }
                if (graphicsLayer != null) {
                    Placeable.PlacementScope.l(placementScope, placeable, d2, graphicsLayer);
                } else {
                    Placeable.PlacementScope.k(placementScope, placeable, d2);
                }
                i7++;
                size2 = i3;
                i6 = i11;
                list2 = list4;
                size = i2;
                list3 = list;
            }
            i6++;
            lazyStaggeredGridMeasureKt$measure$1$30 = this;
        }
    }
}
