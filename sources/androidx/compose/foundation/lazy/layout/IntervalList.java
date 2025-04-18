package androidx.compose.foundation.lazy.layout;

import android.support.v4.media.d;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;

@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public interface IntervalList<T> {

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Interval<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f4657a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4658b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f4659c;

        public Interval(int i2, int i3, LazyLayoutIntervalContent.Interval interval) {
            this.f4657a = i2;
            this.f4658b = i3;
            this.f4659c = interval;
            if (i2 < 0) {
                throw new IllegalArgumentException(d.i("startIndex should be >= 0, but was ", i2).toString());
            }
            if (i3 <= 0) {
                throw new IllegalArgumentException(d.i("size should be >0, but was ", i3).toString());
            }
        }
    }

    Interval get(int i2);

    int getSize();
}
