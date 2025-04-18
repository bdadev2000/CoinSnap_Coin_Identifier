package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridSpanLayoutProvider f4531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 f4532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) {
        super(1);
        this.f4531a = lazyGridSpanLayoutProvider;
        this.f4532b = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LazyGridSpanLayoutProvider.LineConfiguration b2 = this.f4531a.b(((Number) obj).intValue());
        List list = b2.f4601b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = b2.f4600a;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) ((GridItemSpan) list.get(i4)).f4447a;
            arrayList.add(new k(Integer.valueOf(i2), new Constraints(a(i3, i5))));
            i2++;
            i3 += i5;
        }
        return arrayList;
    }
}
