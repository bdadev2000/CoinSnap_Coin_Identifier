package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class LazyGridItemProviderImpl$Item$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridItemProviderImpl f4490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4491b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImpl$Item$1(LazyGridItemProviderImpl lazyGridItemProviderImpl, int i2) {
        super(2);
        this.f4490a = lazyGridItemProviderImpl;
        this.f4491b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            MutableIntervalList mutableIntervalList = this.f4490a.f4488b.f4484b;
            int i2 = this.f4491b;
            IntervalList.Interval interval = mutableIntervalList.get(i2);
            ((LazyGridInterval) interval.f4659c).d.invoke(LazyGridItemScopeImpl.f4498a, Integer.valueOf(i2 - interval.f4657a), composer, 6);
        }
        return b0.f30125a;
    }
}
