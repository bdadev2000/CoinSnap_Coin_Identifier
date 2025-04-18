package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class PagerMeasureKt$measurePager$extraPagesBefore$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutMeasureScope f5216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PagerLazyLayoutItemProvider f5218c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Orientation f5219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f5220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f5221h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$extraPagesBefore$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z2, int i2) {
        super(1);
        this.f5216a = lazyLayoutMeasureScope;
        this.f5217b = j2;
        this.f5218c = pagerLazyLayoutItemProvider;
        this.d = j3;
        this.f5219f = orientation;
        this.f5220g = horizontal;
        this.f5221h = vertical;
        this.f5222i = z2;
        this.f5223j = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        long j2 = this.f5217b;
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.f5218c;
        long j3 = this.d;
        Orientation orientation = this.f5219f;
        Alignment.Horizontal horizontal = this.f5220g;
        Alignment.Vertical vertical = this.f5221h;
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f5216a;
        return PagerMeasureKt.a(lazyLayoutMeasureScope, intValue, j2, pagerLazyLayoutItemProvider, j3, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), this.f5222i, this.f5223j);
    }
}
