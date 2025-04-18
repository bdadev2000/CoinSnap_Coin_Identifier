package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class PagerMeasureKt$measurePager$extraPagesAfter$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f5208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PagerLazyLayoutItemProvider f5210c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Orientation f5211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f5212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f5213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5215j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$extraPagesAfter$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z2, int i2) {
        super(1);
        this.f5208a = lazyLayoutMeasureScope;
        this.f5209b = j2;
        this.f5210c = pagerLazyLayoutItemProvider;
        this.d = j3;
        this.f5211f = orientation;
        this.f5212g = horizontal;
        this.f5213h = vertical;
        this.f5214i = z2;
        this.f5215j = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        long j2 = this.f5209b;
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.f5210c;
        long j3 = this.d;
        Orientation orientation = this.f5211f;
        Alignment.Horizontal horizontal = this.f5212g;
        Alignment.Vertical vertical = this.f5213h;
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f5208a;
        return PagerMeasureKt.a(lazyLayoutMeasureScope, intValue, j2, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), this.f5214i, this.f5215j);
    }
}
