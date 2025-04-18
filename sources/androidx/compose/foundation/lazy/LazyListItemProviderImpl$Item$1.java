package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class LazyListItemProviderImpl$Item$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListItemProviderImpl f4296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImpl$Item$1(LazyListItemProviderImpl lazyListItemProviderImpl, int i2) {
        super(2);
        this.f4296a = lazyListItemProviderImpl;
        this.f4297b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            LazyListItemProviderImpl lazyListItemProviderImpl = this.f4296a;
            MutableIntervalList mutableIntervalList = lazyListItemProviderImpl.f4294b.f4289a;
            int i2 = this.f4297b;
            IntervalList.Interval interval = mutableIntervalList.get(i2);
            int i3 = i2 - interval.f4657a;
            ((LazyListInterval) interval.f4659c).f4288c.invoke(lazyListItemProviderImpl.f4295c, Integer.valueOf(i3), composer, 0);
        }
        return b0.f30125a;
    }
}
