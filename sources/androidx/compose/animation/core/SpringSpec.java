package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f2231a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2232b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2233c;

    public SpringSpec(float f2, float f3, Object obj) {
        this.f2231a = f2;
        this.f2232b = f3;
        this.f2233c = obj;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        Object obj = this.f2233c;
        return new VectorizedSpringSpec(this.f2231a, this.f2232b, obj == null ? null : (AnimationVector) twoWayConverter.a().invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SpringSpec)) {
            return false;
        }
        SpringSpec springSpec = (SpringSpec) obj;
        return springSpec.f2231a == this.f2231a && springSpec.f2232b == this.f2232b && p0.a.g(springSpec.f2233c, this.f2233c);
    }

    public final int hashCode() {
        Object obj = this.f2233c;
        return Float.hashCode(this.f2232b) + d.b(this.f2231a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ SpringSpec(Object obj, int i2) {
        this((i2 & 1) != 0 ? 1.0f : 0.0f, (i2 & 2) != 0 ? 1500.0f : 0.0f, (i2 & 4) != 0 ? null : obj);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        TwoWayConverter twoWayConverter2 = VectorConvertersKt.f2340a;
        Object obj = this.f2233c;
        return new VectorizedSpringSpec(this.f2231a, this.f2232b, obj == null ? null : (AnimationVector) ((TwoWayConverterImpl) twoWayConverter2).a().invoke(obj));
    }
}
