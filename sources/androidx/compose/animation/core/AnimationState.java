package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVector> implements State<T> {

    /* renamed from: a, reason: collision with root package name */
    public final TwoWayConverter f2034a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2035b;

    /* renamed from: c, reason: collision with root package name */
    public AnimationVector f2036c;
    public long d;

    /* renamed from: f, reason: collision with root package name */
    public long f2037f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2038g;

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, int i2) {
        this(twoWayConverter, obj, (i2 & 4) != 0 ? null : animationVector, (i2 & 8) != 0 ? Long.MIN_VALUE : 0L, (i2 & 16) != 0 ? Long.MIN_VALUE : 0L, false);
    }

    public final Object a() {
        return this.f2034a.b().invoke(this.f2036c);
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return this.f2035b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f2035b.getValue() + ", velocity=" + a() + ", isRunning=" + this.f2038g + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.f2037f + ')';
    }

    public AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2) {
        ParcelableSnapshotMutableState f2;
        AnimationVector animationVector2;
        this.f2034a = twoWayConverter;
        f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f2035b = f2;
        if (animationVector != null) {
            animationVector2 = AnimationVectorsKt.a(animationVector);
        } else {
            animationVector2 = (AnimationVector) twoWayConverter.a().invoke(obj);
            animationVector2.d();
        }
        this.f2036c = animationVector2;
        this.d = j2;
        this.f2037f = j3;
        this.f2038g = z2;
    }
}
