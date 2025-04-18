package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.ConstraintsKt;
import e0.x;
import kotlin.jvm.internal.r;
import q0.l;
import q0.q;

/* loaded from: classes4.dex */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f4332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4334c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, int i2, int i3) {
        super(3);
        this.f4332a = lazyLayoutMeasureScope;
        this.f4333b = j2;
        this.f4334c = i2;
        this.d = i3;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int i2 = intValue + this.f4334c;
        long j2 = this.f4333b;
        int h2 = ConstraintsKt.h(i2, j2);
        int g2 = ConstraintsKt.g(intValue2 + this.d, j2);
        x xVar = x.f30219a;
        return this.f4332a.T(h2, g2, xVar, (l) obj3);
    }
}
