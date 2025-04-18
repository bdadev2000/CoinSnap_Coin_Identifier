package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import java.util.List;

/* loaded from: classes4.dex */
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 extends LazyListMeasuredItemProvider {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ LazyLayoutMeasureScope e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Alignment.Horizontal f4337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Alignment.Vertical f4338i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f4339j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4340k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f4342m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4343n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, int i3, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z3, int i4, int i5, long j3, LazyListState lazyListState) {
        super(j2, z2, lazyListItemProvider, lazyLayoutMeasureScope);
        this.d = z2;
        this.e = lazyLayoutMeasureScope;
        this.f4335f = i2;
        this.f4336g = i3;
        this.f4337h = horizontal;
        this.f4338i = vertical;
        this.f4339j = z3;
        this.f4340k = i4;
        this.f4341l = i5;
        this.f4342m = j3;
        this.f4343n = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
    public final LazyListMeasuredItem b(int i2, Object obj, Object obj2, List list, long j2) {
        return new LazyListMeasuredItem(i2, list, this.d, this.f4337h, this.f4338i, this.e.getLayoutDirection(), this.f4339j, this.f4340k, this.f4341l, i2 == this.f4335f + (-1) ? 0 : this.f4336g, this.f4342m, obj, obj2, this.f4343n.f4402n, j2);
    }
}
