package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import h0.g;
import q0.l;
import q0.p;
import w0.d;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class SliderState implements DraggableState {

    /* renamed from: a, reason: collision with root package name */
    public final int f11487a;

    /* renamed from: b, reason: collision with root package name */
    public q0.a f11488b;

    /* renamed from: c, reason: collision with root package name */
    public final d f11489c;
    public final ParcelableSnapshotMutableFloatState d;
    public l e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f11490f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11492h;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f11495k;

    /* renamed from: l, reason: collision with root package name */
    public final q0.a f11496l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f11497m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f11498n;

    /* renamed from: o, reason: collision with root package name */
    public final SliderState$dragScope$1 f11499o;

    /* renamed from: p, reason: collision with root package name */
    public final MutatorMutex f11500p;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f11491g = SnapshotIntStateKt.a(0);

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f11493i = PrimitiveSnapshotStateKt.a(0.0f);

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f11494j = PrimitiveSnapshotStateKt.a(0.0f);

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.material3.SliderState$dragScope$1] */
    public SliderState(float f2, int i2, q0.a aVar, d dVar) {
        ParcelableSnapshotMutableState f3;
        this.f11487a = i2;
        this.f11488b = aVar;
        this.f11489c = dVar;
        this.d = PrimitiveSnapshotStateKt.a(f2);
        this.f11490f = SliderKt.j(i2);
        f3 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f11495k = f3;
        this.f11496l = new SliderState$gestureEndAction$1(this);
        this.f11497m = PrimitiveSnapshotStateKt.a(SliderKt.l(Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue(), f2, 0.0f, 0.0f));
        this.f11498n = PrimitiveSnapshotStateKt.a(0.0f);
        this.f11499o = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public final void a(float f4) {
                SliderState.this.b(f4);
            }
        };
        this.f11500p = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object a(p pVar, g gVar) {
        Object J = p0.a.J(new SliderState$drag$2(this, MutatePriority.f2812b, pVar, null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }

    public final void b(float f2) {
        float g2 = this.f11491g.g();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f11494j;
        float f3 = 2;
        float max = Math.max(g2 - (parcelableSnapshotMutableFloatState.c() / f3), 0.0f);
        float min = Math.min(parcelableSnapshotMutableFloatState.c() / f3, max);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = this.f11497m;
        float c2 = parcelableSnapshotMutableFloatState2.c() + f2;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState3 = this.f11498n;
        parcelableSnapshotMutableFloatState2.n(parcelableSnapshotMutableFloatState3.c() + c2);
        parcelableSnapshotMutableFloatState3.n(0.0f);
        float i2 = SliderKt.i(parcelableSnapshotMutableFloatState2.c(), min, max, this.f11490f);
        d dVar = this.f11489c;
        float l2 = SliderKt.l(min, max, i2, Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(dVar.f31405b).floatValue());
        if (l2 == this.d.c()) {
            return;
        }
        l lVar = this.e;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(l2));
        } else {
            d(l2);
        }
    }

    public final float c() {
        d dVar = this.f11489c;
        float floatValue = Float.valueOf(dVar.f31404a).floatValue();
        float f2 = dVar.f31405b;
        return SliderKt.k(floatValue, Float.valueOf(f2).floatValue(), p0.a.z(this.d.c(), Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(f2).floatValue()));
    }

    public final void d(float f2) {
        d dVar = this.f11489c;
        float floatValue = Float.valueOf(dVar.f31404a).floatValue();
        float f3 = dVar.f31405b;
        this.d.n(SliderKt.i(p0.a.z(f2, floatValue, Float.valueOf(f3).floatValue()), Float.valueOf(dVar.f31404a).floatValue(), Float.valueOf(f3).floatValue(), this.f11490f));
    }
}
