package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes3.dex */
public abstract class LazyLayoutIntervalContent<Interval extends Interval> {

    @ExperimentalFoundationApi
    /* loaded from: classes3.dex */
    public interface Interval {
        default l getKey() {
            return null;
        }

        default l getType() {
            return LazyLayoutIntervalContent$Interval$type$1.f4706a;
        }
    }

    public final Object g(int i2) {
        IntervalList.Interval interval = h().get(i2);
        return ((Interval) interval.f4659c).getType().invoke(Integer.valueOf(i2 - interval.f4657a));
    }

    public abstract MutableIntervalList h();

    public final Object i(int i2) {
        Object invoke;
        IntervalList.Interval interval = h().get(i2);
        int i3 = i2 - interval.f4657a;
        l key = ((Interval) interval.f4659c).getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(i3))) == null) ? new DefaultLazyKey(i2) : invoke;
    }
}
