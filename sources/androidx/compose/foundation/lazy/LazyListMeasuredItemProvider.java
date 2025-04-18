package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.common.api.Api;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class LazyListMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyListMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListItemProvider f4384a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyLayoutMeasureScope f4385b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4386c;

    public LazyListMeasuredItemProvider(long j2, boolean z2, LazyListItemProvider lazyListItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope) {
        this.f4384a = lazyListItemProvider;
        this.f4385b = lazyLayoutMeasureScope;
        this.f4386c = ConstraintsKt.b(z2 ? Constraints.i(j2) : Integer.MAX_VALUE, z2 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Constraints.h(j2), 5);
    }

    public static LazyListMeasuredItem c(LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1, int i2) {
        long j2 = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.f4386c;
        LazyListItemProvider lazyListItemProvider = lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.f4384a;
        return lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.b(i2, lazyListItemProvider.c(i2), lazyListItemProvider.d(i2), lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1.f4385b.k0(i2, j2), j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public final LazyLayoutMeasuredItem a(int i2, int i3, long j2, int i4) {
        LazyListItemProvider lazyListItemProvider = this.f4384a;
        return b(i2, lazyListItemProvider.c(i2), lazyListItemProvider.d(i2), this.f4385b.k0(i2, j2), j2);
    }

    public abstract LazyListMeasuredItem b(int i2, Object obj, Object obj2, List list, long j2);
}
