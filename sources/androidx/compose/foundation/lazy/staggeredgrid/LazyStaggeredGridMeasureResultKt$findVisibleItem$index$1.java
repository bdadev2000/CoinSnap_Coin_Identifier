package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5017a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1(int i2) {
        super(1);
        this.f5017a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Integer.valueOf(((LazyStaggeredGridItemInfo) obj).getIndex() - this.f5017a);
    }
}
