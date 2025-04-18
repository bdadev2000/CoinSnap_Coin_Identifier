package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AnimationScope<T, V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final TwoWayConverter f2027a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2028b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2029c;
    public final q0.a d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public AnimationVector f2030f;

    /* renamed from: g, reason: collision with root package name */
    public long f2031g;

    /* renamed from: h, reason: collision with root package name */
    public long f2032h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2033i;

    public AnimationScope(Object obj, TwoWayConverter twoWayConverter, AnimationVector animationVector, long j2, Object obj2, long j3, q0.a aVar) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f2027a = twoWayConverter;
        this.f2028b = obj2;
        this.f2029c = j3;
        this.d = aVar;
        f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.e = f2;
        this.f2030f = AnimationVectorsKt.a(animationVector);
        this.f2031g = j2;
        this.f2032h = Long.MIN_VALUE;
        f3 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.f2033i = f3;
    }

    public final void a() {
        this.f2033i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.f2027a.b().invoke(this.f2030f);
    }
}
