package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class LazyStaggeredGridItemProviderImpl$Item$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridItemProviderImpl f4942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridItemProviderImpl$Item$1(LazyStaggeredGridItemProviderImpl lazyStaggeredGridItemProviderImpl, int i2) {
        super(2);
        this.f4942a = lazyStaggeredGridItemProviderImpl;
        this.f4943b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
            return b0.f30125a;
        }
        IntervalList.Interval interval = this.f4942a.f4940b.f4937a.get(this.f4943b);
        int i2 = interval.f4657a;
        ((LazyStaggeredGridInterval) interval.f4659c).getClass();
        throw null;
    }
}
