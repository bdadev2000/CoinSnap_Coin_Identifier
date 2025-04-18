package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import d0.b0;
import h0.g;
import p0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DefaultScrollableState implements ScrollableState {

    /* renamed from: a, reason: collision with root package name */
    public final l f3153a;

    /* renamed from: b, reason: collision with root package name */
    public final DefaultScrollableState$scrollScope$1 f3154b = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public final float a(float f2) {
            if (Float.isNaN(f2)) {
                return 0.0f;
            }
            DefaultScrollableState defaultScrollableState = DefaultScrollableState.this;
            float floatValue = ((Number) defaultScrollableState.f3153a.invoke(Float.valueOf(f2))).floatValue();
            defaultScrollableState.e.setValue(Boolean.valueOf(floatValue > 0.0f));
            defaultScrollableState.f3156f.setValue(Boolean.valueOf(floatValue < 0.0f));
            return floatValue;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public final MutatorMutex f3155c = new MutatorMutex();
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f3156f;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1] */
    public DefaultScrollableState(l lVar) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        this.f3153a = lVar;
        Boolean bool = Boolean.FALSE;
        f2 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.d = f2;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.e = f3;
        f4 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f3156f = f4;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object b(MutatePriority mutatePriority, p pVar, g gVar) {
        Object J = a.J(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return ((Number) this.f3153a.invoke(Float.valueOf(f2))).floatValue();
    }
}
