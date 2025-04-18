package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import e0.w;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyGridSpanLayoutProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridIntervalContent f4590a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4591b;

    /* renamed from: c, reason: collision with root package name */
    public int f4592c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4593f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4594g;

    /* renamed from: h, reason: collision with root package name */
    public List f4595h;

    /* renamed from: i, reason: collision with root package name */
    public int f4596i;

    /* loaded from: classes2.dex */
    public static final class Bucket {

        /* renamed from: a, reason: collision with root package name */
        public final int f4597a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4598b;

        public Bucket(int i2, int i3) {
            this.f4597a = i2;
            this.f4598b = i3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        /* renamed from: a, reason: collision with root package name */
        public static final LazyGridItemSpanScopeImpl f4599a = new Object();
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class LineConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public final int f4600a;

        /* renamed from: b, reason: collision with root package name */
        public final List f4601b;

        public LineConfiguration(int i2, List list) {
            this.f4600a = i2;
            this.f4601b = list;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.f4590a = lazyGridIntervalContent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Bucket(0, 0));
        this.f4591b = arrayList;
        this.f4593f = -1;
        this.f4594g = new ArrayList();
        this.f4595h = w.f30218a;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f4596i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r9 < r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration b(int r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.b(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int c(int i2) {
        if (d() <= 0) {
            return 0;
        }
        if (i2 >= d()) {
            throw new IllegalArgumentException("ItemIndex > total count".toString());
        }
        if (!this.f4590a.f4485c) {
            return i2 / this.f4596i;
        }
        ArrayList arrayList = this.f4591b;
        int c2 = f0.c(0, arrayList.size(), arrayList, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i2));
        if (c2 < 0) {
            c2 = (-c2) - 2;
        }
        int a2 = a() * c2;
        int i3 = ((Bucket) arrayList.get(c2)).f4597a;
        if (i3 > i2) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex".toString());
        }
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            int e = e(i3);
            i4 += e;
            int i6 = this.f4596i;
            if (i4 >= i6) {
                if (i4 == i6) {
                    a2++;
                    i4 = 0;
                } else {
                    a2++;
                    i4 = e;
                }
            }
            if (a2 % a() == 0 && a2 / a() >= arrayList.size()) {
                arrayList.add(new Bucket(i5 - (i4 > 0 ? 1 : 0), 0));
            }
            i3 = i5;
        }
        return e(i2) + i4 > this.f4596i ? a2 + 1 : a2;
    }

    public final int d() {
        return this.f4590a.f4484b.f4880b;
    }

    public final int e(int i2) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.f4599a;
        IntervalList.Interval interval = this.f4590a.f4484b.get(i2);
        return (int) ((GridItemSpan) ((LazyGridInterval) interval.f4659c).f4481b.invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i2 - interval.f4657a))).f4447a;
    }
}
