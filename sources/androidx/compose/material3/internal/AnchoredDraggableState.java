package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import d0.b0;
import e0.x;
import h0.g;
import i1.d;
import kotlin.jvm.internal.r;
import q0.l;

@Stable
/* loaded from: classes2.dex */
public final class AnchoredDraggableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l f12820a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f12821b;

    /* renamed from: c, reason: collision with root package name */
    public final AnimationSpec f12822c;
    public final l d;
    public final InternalMutatorMutex e = new InternalMutatorMutex();

    /* renamed from: f, reason: collision with root package name */
    public final AnchoredDraggableState$draggableState$1 f12823f = new AnchoredDraggableState$draggableState$1(this);

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12824g;

    /* renamed from: h, reason: collision with root package name */
    public final State f12825h;

    /* renamed from: i, reason: collision with root package name */
    public final State f12826i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12827j;

    /* renamed from: k, reason: collision with root package name */
    public final State f12828k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f12829l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12830m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12831n;

    /* renamed from: o, reason: collision with root package name */
    public final AnchoredDraggableState$anchoredDragScope$1 f12832o;

    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1] */
    public AnchoredDraggableState(Object obj, l lVar, q0.a aVar, FiniteAnimationSpec finiteAnimationSpec, l lVar2) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        this.f12820a = lVar;
        this.f12821b = aVar;
        this.f12822c = finiteAnimationSpec;
        this.d = lVar2;
        f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f12824g = f2;
        this.f12825h = SnapshotStateKt.e(new AnchoredDraggableState$targetValue$2(this));
        this.f12826i = SnapshotStateKt.e(new AnchoredDraggableState$closestValue$2(this));
        this.f12827j = PrimitiveSnapshotStateKt.a(Float.NaN);
        this.f12828k = SnapshotStateKt.d(SnapshotStateKt.m(), new AnchoredDraggableState$progress$2(this));
        this.f12829l = PrimitiveSnapshotStateKt.a(0.0f);
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f12830m = f3;
        f4 = SnapshotStateKt.f(new MapDraggableAnchors(x.f30219a), StructuralEqualityPolicy.f14078a);
        this.f12831n = f4;
        this.f12832o = new AnchoredDragScope() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1
            @Override // androidx.compose.material3.internal.AnchoredDragScope
            public final void a(float f5, float f6) {
                AnchoredDraggableState anchoredDraggableState = AnchoredDraggableState.this;
                anchoredDraggableState.f12827j.n(f5);
                anchoredDraggableState.f12829l.n(f6);
            }
        };
    }

    public static void l(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors) {
        Object value;
        boolean isNaN = Float.isNaN(anchoredDraggableState.f12827j.c());
        State state = anchoredDraggableState.f12825h;
        if (isNaN) {
            value = state.getValue();
        } else {
            value = ((MapDraggableAnchors) draggableAnchors).b(anchoredDraggableState.f12827j.c());
            if (value == null) {
                value = state.getValue();
            }
        }
        anchoredDraggableState.k(draggableAnchors, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.MutatePriority r7, q0.q r8, h0.g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f12834b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            androidx.compose.material3.internal.AnchoredDraggableState r7 = r0.f12833a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r8 = move-exception
            goto L95
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.jvm.internal.q.m(r9)
            androidx.compose.material3.internal.InternalMutatorMutex r9 = r6.e     // Catch: java.lang.Throwable -> L93
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L93
            r5 = 0
            r2.<init>(r6, r5, r8)     // Catch: java.lang.Throwable -> L93
            r0.f12833a = r6     // Catch: java.lang.Throwable -> L93
            r0.d = r4     // Catch: java.lang.Throwable -> L93
            r9.getClass()     // Catch: java.lang.Throwable -> L8f
            androidx.compose.material3.internal.InternalMutatorMutex$mutate$2 r8 = new androidx.compose.material3.internal.InternalMutatorMutex$mutate$2     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r7 = p0.a.J(r8, r0)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = r6
        L54:
            androidx.compose.material3.internal.DraggableAnchors r8 = r7.e()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r9 = r7.f12827j
            float r0 = r9.c()
            java.lang.Object r8 = r8.b(r0)
            if (r8 == 0) goto L8a
            float r9 = r9.c()
            androidx.compose.material3.internal.DraggableAnchors r0 = r7.e()
            float r0 = r0.e(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8a
            q0.l r9 = r7.d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r7.h(r8)
        L8a:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        L8d:
            r8 = r7
            goto L91
        L8f:
            r7 = move-exception
            goto L8d
        L91:
            r7 = r6
            goto L95
        L93:
            r8 = move-exception
            goto L91
        L95:
            androidx.compose.material3.internal.DraggableAnchors r9 = r7.e()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r0 = r7.f12827j
            float r1 = r0.c()
            java.lang.Object r9 = r9.b(r1)
            if (r9 == 0) goto Lcb
            float r0 = r0.c()
            androidx.compose.material3.internal.DraggableAnchors r1 = r7.e()
            float r1 = r1.e(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lcb
            q0.l r0 = r7.d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcb
            r7.h(r9)
        Lcb:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.a(androidx.compose.foundation.MutatePriority, q0.q, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7, androidx.compose.foundation.MutatePriority r8, q0.r r9, h0.g r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f12844b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            androidx.compose.material3.internal.AnchoredDraggableState r7 = r0.f12843a
            kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L2c:
            r8 = move-exception
            goto La1
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.jvm.internal.q.m(r10)
            androidx.compose.material3.internal.DraggableAnchors r10 = r6.e()
            boolean r10 = r10.c(r7)
            if (r10 == 0) goto Ldb
            androidx.compose.material3.internal.InternalMutatorMutex r10 = r6.e     // Catch: java.lang.Throwable -> L9f
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> L9f
            r0.f12843a = r6     // Catch: java.lang.Throwable -> L9f
            r0.d = r5     // Catch: java.lang.Throwable -> L9f
            r10.getClass()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.material3.internal.InternalMutatorMutex$mutate$2 r7 = new androidx.compose.material3.internal.InternalMutatorMutex$mutate$2     // Catch: java.lang.Throwable -> L9b
            r7.<init>(r8, r10, r2, r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r7 = p0.a.J(r7, r0)     // Catch: java.lang.Throwable -> L9b
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r7 = r6
        L5f:
            r7.i(r3)
            androidx.compose.material3.internal.DraggableAnchors r8 = r7.e()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r9 = r7.f12827j
            float r10 = r9.c()
            java.lang.Object r8 = r8.b(r10)
            if (r8 == 0) goto Lde
            float r9 = r9.c()
            androidx.compose.material3.internal.DraggableAnchors r10 = r7.e()
            float r10 = r10.e(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto Lde
            q0.l r9 = r7.d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lde
            r7.h(r8)
            goto Lde
        L99:
            r8 = r7
            goto L9d
        L9b:
            r7 = move-exception
            goto L99
        L9d:
            r7 = r6
            goto La1
        L9f:
            r8 = move-exception
            goto L9d
        La1:
            r7.i(r3)
            androidx.compose.material3.internal.DraggableAnchors r9 = r7.e()
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r10 = r7.f12827j
            float r0 = r10.c()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto Lda
            float r10 = r10.c()
            androidx.compose.material3.internal.DraggableAnchors r0 = r7.e()
            float r0 = r0.e(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Lda
            q0.l r10 = r7.d
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lda
            r7.h(r9)
        Lda:
            throw r8
        Ldb:
            r6.h(r7)
        Lde:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.b(java.lang.Object, androidx.compose.foundation.MutatePriority, q0.r, h0.g):java.lang.Object");
    }

    public final Object c(float f2, float f3, Object obj) {
        Object a2;
        DraggableAnchors e = e();
        float e2 = e.e(obj);
        float floatValue = ((Number) this.f12821b.invoke()).floatValue();
        if (e2 == f2 || Float.isNaN(e2)) {
            return obj;
        }
        l lVar = this.f12820a;
        if (e2 < f2) {
            if (f3 >= floatValue) {
                Object a3 = e.a(f2, true);
                p0.a.p(a3);
                return a3;
            }
            a2 = e.a(f2, true);
            p0.a.p(a2);
            if (f2 < Math.abs(Math.abs(((Number) lVar.invoke(Float.valueOf(Math.abs(e.e(a2) - e2)))).floatValue()) + e2)) {
                return obj;
            }
        } else {
            if (f3 <= (-floatValue)) {
                Object a4 = e.a(f2, false);
                p0.a.p(a4);
                return a4;
            }
            a2 = e.a(f2, false);
            p0.a.p(a2);
            float abs = Math.abs(e2 - Math.abs(((Number) lVar.invoke(Float.valueOf(Math.abs(e2 - e.e(a2))))).floatValue()));
            if (f2 < 0.0f) {
                if (Math.abs(f2) < abs) {
                    return obj;
                }
            } else if (f2 > abs) {
                return obj;
            }
        }
        return a2;
    }

    public final float d(float f2) {
        float f3 = f(f2);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f12827j;
        float c2 = Float.isNaN(parcelableSnapshotMutableFloatState.c()) ? 0.0f : parcelableSnapshotMutableFloatState.c();
        parcelableSnapshotMutableFloatState.n(f3);
        return f3 - c2;
    }

    public final DraggableAnchors e() {
        return (DraggableAnchors) this.f12831n.getValue();
    }

    public final float f(float f2) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f12827j;
        return p0.a.z((Float.isNaN(parcelableSnapshotMutableFloatState.c()) ? 0.0f : parcelableSnapshotMutableFloatState.c()) + f2, e().d(), e().f());
    }

    public final float g() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f12827j;
        if (!Float.isNaN(parcelableSnapshotMutableFloatState.c())) {
            return parcelableSnapshotMutableFloatState.c();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void h(Object obj) {
        this.f12824g.setValue(obj);
    }

    public final void i(Object obj) {
        this.f12830m.setValue(obj);
    }

    public final Object j(float f2, g gVar) {
        Object value = this.f12824g.getValue();
        Object c2 = c(g(), f2, value);
        boolean booleanValue = ((Boolean) this.d.invoke(c2)).booleanValue();
        b0 b0Var = b0.f30125a;
        if (booleanValue) {
            Object d = AnchoredDraggableKt.d(this, c2, f2, gVar);
            return d == i0.a.f30806a ? d : b0Var;
        }
        Object d2 = AnchoredDraggableKt.d(this, value, f2, gVar);
        return d2 == i0.a.f30806a ? d2 : b0Var;
    }

    public final void k(DraggableAnchors draggableAnchors, Object obj) {
        if (p0.a.g(e(), draggableAnchors)) {
            return;
        }
        this.f12831n.setValue(draggableAnchors);
        AnchoredDraggableState$trySnapTo$1 anchoredDraggableState$trySnapTo$1 = new AnchoredDraggableState$trySnapTo$1(this, obj);
        d dVar = this.e.f12992b;
        boolean e = dVar.e(null);
        if (e) {
            try {
                anchoredDraggableState$trySnapTo$1.invoke();
            } finally {
                dVar.f(null);
            }
        }
        if (e) {
            return;
        }
        i(obj);
    }
}
