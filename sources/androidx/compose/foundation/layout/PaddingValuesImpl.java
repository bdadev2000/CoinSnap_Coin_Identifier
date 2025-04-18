package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

@Immutable
/* loaded from: classes4.dex */
public final class PaddingValuesImpl implements PaddingValues {

    /* renamed from: a, reason: collision with root package name */
    public final float f4076a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4077b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4078c;
    public final float d;

    public PaddingValuesImpl(float f2, float f3, float f4, float f5) {
        this.f4076a = f2;
        this.f4077b = f3;
        this.f4078c = f4;
        this.d = f5;
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative".toString());
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative".toString());
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative".toString());
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative".toString());
        }
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float a() {
        return this.d;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f17494a ? this.f4076a : this.f4078c;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f17494a ? this.f4078c : this.f4076a;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    public final float d() {
        return this.f4077b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.a(this.f4076a, paddingValuesImpl.f4076a) && Dp.a(this.f4077b, paddingValuesImpl.f4077b) && Dp.a(this.f4078c, paddingValuesImpl.f4078c) && Dp.a(this.d, paddingValuesImpl.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + d.b(this.f4078c, d.b(this.f4077b, Float.hashCode(this.f4076a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) Dp.b(this.f4076a)) + ", top=" + ((Object) Dp.b(this.f4077b)) + ", end=" + ((Object) Dp.b(this.f4078c)) + ", bottom=" + ((Object) Dp.b(this.d)) + ')';
    }
}
