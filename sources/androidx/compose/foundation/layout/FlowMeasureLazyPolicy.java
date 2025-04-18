package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import q0.r;

/* loaded from: classes2.dex */
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3965a;

    /* renamed from: b, reason: collision with root package name */
    public final Arrangement.Horizontal f3966b;

    /* renamed from: c, reason: collision with root package name */
    public final Arrangement.Vertical f3967c;
    public final float d;
    public final CrossAxisAlignment e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3968f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3969g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3970h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3971i;

    /* renamed from: j, reason: collision with root package name */
    public final FlowLayoutOverflowState f3972j;

    /* renamed from: k, reason: collision with root package name */
    public final List f3973k;

    /* renamed from: l, reason: collision with root package name */
    public final r f3974l;

    public FlowMeasureLazyPolicy(boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, ComposableLambdaImpl composableLambdaImpl) {
        this.f3965a = z2;
        this.f3966b = horizontal;
        this.f3967c = vertical;
        this.d = f2;
        this.e = crossAxisAlignment;
        this.f3968f = f3;
        this.f3969g = i2;
        this.f3970h = i3;
        this.f3971i = i4;
        this.f3972j = flowLayoutOverflowState;
        this.f3973k = list;
        this.f3974l = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.f3965a == flowMeasureLazyPolicy.f3965a && p0.a.g(this.f3966b, flowMeasureLazyPolicy.f3966b) && p0.a.g(this.f3967c, flowMeasureLazyPolicy.f3967c) && Dp.a(this.d, flowMeasureLazyPolicy.d) && p0.a.g(this.e, flowMeasureLazyPolicy.e) && Dp.a(this.f3968f, flowMeasureLazyPolicy.f3968f) && this.f3969g == flowMeasureLazyPolicy.f3969g && this.f3970h == flowMeasureLazyPolicy.f3970h && this.f3971i == flowMeasureLazyPolicy.f3971i && p0.a.g(this.f3972j, flowMeasureLazyPolicy.f3972j) && p0.a.g(this.f3973k, flowMeasureLazyPolicy.f3973k) && p0.a.g(this.f3974l, flowMeasureLazyPolicy.f3974l);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final CrossAxisAlignment f() {
        return this.e;
    }

    public final int hashCode() {
        return this.f3974l.hashCode() + d.f(this.f3973k, (this.f3972j.hashCode() + d.c(this.f3971i, d.c(this.f3970h, d.c(this.f3969g, d.b(this.f3968f, (this.e.hashCode() + d.b(this.d, (this.f3967c.hashCode() + ((this.f3966b.hashCode() + (Boolean.hashCode(this.f3965a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31), 31)) * 31, 31);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final boolean isHorizontal() {
        return this.f3965a;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Arrangement.Horizontal j() {
        return this.f3966b;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public final Arrangement.Vertical l() {
        return this.f3967c;
    }

    public final String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.f3965a + ", horizontalArrangement=" + this.f3966b + ", verticalArrangement=" + this.f3967c + ", mainAxisSpacing=" + ((Object) Dp.b(this.d)) + ", crossAxisAlignment=" + this.e + ", crossAxisArrangementSpacing=" + ((Object) Dp.b(this.f3968f)) + ", itemCount=" + this.f3969g + ", maxLines=" + this.f3970h + ", maxItemsInMainAxis=" + this.f3971i + ", overflow=" + this.f3972j + ", overflowComposables=" + this.f3973k + ", getComposable=" + this.f3974l + ')';
    }
}
