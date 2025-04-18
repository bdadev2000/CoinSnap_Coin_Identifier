package androidx.compose.foundation.lazy.layout;

import android.support.v4.media.d;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes3.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f4879a = new MutableVector(new IntervalList.Interval[16]);

    /* renamed from: b, reason: collision with root package name */
    public int f4880b;

    /* renamed from: c, reason: collision with root package name */
    public IntervalList.Interval f4881c;

    public final void a(int i2, LazyLayoutIntervalContent.Interval interval) {
        if (i2 < 0) {
            throw new IllegalArgumentException(d.i("size should be >=0, but was ", i2).toString());
        }
        if (i2 == 0) {
            return;
        }
        IntervalList.Interval interval2 = new IntervalList.Interval(this.f4880b, i2, interval);
        this.f4880b += i2;
        this.f4879a.b(interval2);
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f4880b) {
            StringBuilder t2 = d.t("Index ", i2, ", size ");
            t2.append(this.f4880b);
            throw new IndexOutOfBoundsException(t2.toString());
        }
    }

    public final void c(int i2, int i3, l lVar) {
        b(i2);
        b(i3);
        if (i3 < i2) {
            throw new IllegalArgumentException(("toIndex (" + i3 + ") should be not smaller than fromIndex (" + i2 + ')').toString());
        }
        MutableVector mutableVector = this.f4879a;
        int a2 = IntervalListKt.a(i2, mutableVector);
        int i4 = ((IntervalList.Interval) mutableVector.f14142a[a2]).f4657a;
        while (i4 <= i3) {
            IntervalList.Interval interval = (IntervalList.Interval) mutableVector.f14142a[a2];
            ((NearestRangeKeyIndexMap$2$1) lVar).invoke(interval);
            i4 += interval.f4658b;
            a2++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final IntervalList.Interval get(int i2) {
        b(i2);
        IntervalList.Interval interval = this.f4881c;
        if (interval != null) {
            int i3 = interval.f4658b;
            int i4 = interval.f4657a;
            if (i2 < i3 + i4 && i4 <= i2) {
                return interval;
            }
        }
        MutableVector mutableVector = this.f4879a;
        IntervalList.Interval interval2 = (IntervalList.Interval) mutableVector.f14142a[IntervalListKt.a(i2, mutableVector)];
        this.f4881c = interval2;
        return interval2;
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public final int getSize() {
        return this.f4880b;
    }
}
