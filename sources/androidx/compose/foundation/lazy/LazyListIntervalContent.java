package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;
import q0.q;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {

    /* renamed from: a, reason: collision with root package name */
    public final MutableIntervalList f4289a = new MutableIntervalList();

    public LazyListIntervalContent(l lVar) {
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void c(Object obj, Object obj2, q qVar) {
        LazyListIntervalContent$item$1 lazyListIntervalContent$item$1 = obj != null ? new LazyListIntervalContent$item$1(obj) : null;
        LazyListIntervalContent$item$2 lazyListIntervalContent$item$2 = new LazyListIntervalContent$item$2(obj2);
        LazyListIntervalContent$item$3 lazyListIntervalContent$item$3 = new LazyListIntervalContent$item$3(qVar);
        Object obj3 = ComposableLambdaKt.f14482a;
        this.f4289a.a(1, new LazyListInterval(lazyListIntervalContent$item$1, lazyListIntervalContent$item$2, new ComposableLambdaImpl(-1010194746, lazyListIntervalContent$item$3, true)));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final void d(int i2, l lVar, l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f4289a.a(i2, new LazyListInterval(lVar, lVar2, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final MutableIntervalList h() {
        return this.f4289a;
    }
}
