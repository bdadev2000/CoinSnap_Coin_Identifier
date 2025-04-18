package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectLongMap;
import androidx.collection.ObjectLongMapKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class PrefetchMetrics {

    /* renamed from: a, reason: collision with root package name */
    public final MutableObjectLongMap f4903a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableObjectLongMap f4904b;

    /* renamed from: c, reason: collision with root package name */
    public long f4905c;
    public long d;

    public PrefetchMetrics() {
        int i2 = ObjectLongMapKt.f1556a;
        this.f4903a = new MutableObjectLongMap(6);
        this.f4904b = new MutableObjectLongMap(6);
    }

    public static final long a(PrefetchMetrics prefetchMetrics, long j2, long j3) {
        if (j3 == 0) {
            return j2;
        }
        long j4 = 4;
        return (j2 / j4) + ((j3 / j4) * 3);
    }
}
