package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PagerLazyLayoutItemProvider$Item$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerLazyLayoutItemProvider f5200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLazyLayoutItemProvider$Item$1(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2) {
        super(2);
        this.f5200a = pagerLazyLayoutItemProvider;
        this.f5201b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            MutableIntervalList h2 = this.f5200a.f5198b.h();
            int i2 = this.f5201b;
            IntervalList.Interval interval = h2.get(i2);
            ((PagerIntervalContent) interval.f4659c).f5146b.invoke(PagerScopeImpl.f5257a, Integer.valueOf(i2 - interval.f4657a), composer, 0);
        }
        return b0.f30125a;
    }
}
