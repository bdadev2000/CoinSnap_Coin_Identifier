package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes3.dex */
public final class AnchoredDraggableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l f3061a = null;

    /* renamed from: b, reason: collision with root package name */
    public final a f3062b = null;

    /* renamed from: c, reason: collision with root package name */
    public final AnimationSpec f3063c = null;
    public final DecayAnimationSpec d = null;
    public final l e = null;

    /* renamed from: f, reason: collision with root package name */
    public final MutatorMutex f3064f = new MutatorMutex();

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f3065g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f3066h;

    /* renamed from: i, reason: collision with root package name */
    public final State f3067i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f3068j;

    /* renamed from: k, reason: collision with root package name */
    public final State f3069k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f3070l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f3071m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f3072n;

    /* renamed from: o, reason: collision with root package name */
    public final AnchoredDraggableState$anchoredDragScope$1 f3073o;

    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public AnchoredDraggableState(Object obj) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        f2 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f3065g = f2;
        f3 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.f3066h = f3;
        this.f3067i = SnapshotStateKt.e(new AnchoredDraggableState$targetValue$2(this));
        this.f3068j = PrimitiveSnapshotStateKt.a(Float.NaN);
        this.f3069k = SnapshotStateKt.d(SnapshotStateKt.m(), new AnchoredDraggableState$progress$2(this));
        this.f3070l = PrimitiveSnapshotStateKt.a(0.0f);
        f4 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f3071m = f4;
        f5 = SnapshotStateKt.f(new MapDraggableAnchors(new MutableObjectFloatMap()), StructuralEqualityPolicy.f14078a);
        this.f3072n = f5;
        this.f3073o = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r6, androidx.compose.foundation.MutatePriority r7, q0.r r8, h0.g r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f3082b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            androidx.compose.foundation.gestures.AnchoredDraggableState r6 = r0.f3081a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L2a
            goto L54
        L2a:
            r7 = move-exception
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.jvm.internal.q.m(r9)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r5.b()
            boolean r9 = r9.c(r6)
            if (r9 == 0) goto L62
            androidx.compose.foundation.MutatorMutex r9 = r5.f3064f     // Catch: java.lang.Throwable -> L5a
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5a
            r0.f3081a = r5     // Catch: java.lang.Throwable -> L5a
            r0.d = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r9.b(r7, r2, r0)     // Catch: java.lang.Throwable -> L5a
            if (r6 != r1) goto L53
            return r1
        L53:
            r6 = r5
        L54:
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r6.f3071m
            r6.setValue(r4)
            goto L7a
        L5a:
            r7 = move-exception
            r6 = r5
        L5c:
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r6.f3071m
            r6.setValue(r4)
            throw r7
        L62:
            q0.l r7 = r5.e
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7a
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r5.f3066h
            r7.setValue(r6)
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r5.f3065g
            r7.setValue(r6)
        L7a:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.a(java.lang.Object, androidx.compose.foundation.MutatePriority, q0.r, h0.g):java.lang.Object");
    }

    public final DraggableAnchors b() {
        return (DraggableAnchors) this.f3072n.getValue();
    }

    public final float c(float f2) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f3068j;
        return p0.a.z((Float.isNaN(parcelableSnapshotMutableFloatState.c()) ? 0.0f : parcelableSnapshotMutableFloatState.c()) + f2, b().d(), b().f());
    }

    public final float d() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f3068j;
        if (!Float.isNaN(parcelableSnapshotMutableFloatState.c())) {
            return parcelableSnapshotMutableFloatState.c();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r9, h0.g r10) {
        /*
            r8 = this;
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r8.f3065g
            java.lang.Object r0 = r0.getValue()
            float r1 = r8.d()
            androidx.compose.foundation.gestures.DraggableAnchors r2 = r8.b()
            float r3 = r2.e(r0)
            q0.a r4 = r8.f3062b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L7f
        L23:
            boolean r5 = java.lang.Float.isNaN(r3)
            if (r5 == 0) goto L2a
            goto L7f
        L2a:
            float r5 = java.lang.Math.abs(r9)
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r5 = 0
            r6 = 1
            r7 = 0
            if (r4 < 0) goto L4a
            float r3 = java.lang.Math.signum(r9)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L42
            r5 = r6
        L42:
            java.lang.Object r1 = r2.a(r1, r5)
            p0.a.p(r1)
            goto L82
        L4a:
            float r4 = r1 - r3
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L51
            r5 = r6
        L51:
            java.lang.Object r4 = r2.a(r1, r5)
            p0.a.p(r4)
            float r2 = r2.e(r4)
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            q0.l r5 = r8.f3061a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = java.lang.Math.abs(r2)
            float r3 = r3 - r1
            float r1 = java.lang.Math.abs(r3)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L81
        L7f:
            r1 = r0
            goto L82
        L81:
            r1 = r4
        L82:
            q0.l r2 = r8.e
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L95
            java.lang.Object r9 = androidx.compose.foundation.gestures.AnchoredDraggableKt.c(r8, r1, r9, r10)
            return r9
        L95:
            java.lang.Object r9 = androidx.compose.foundation.gestures.AnchoredDraggableKt.c(r8, r0, r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.e(float, h0.g):java.lang.Object");
    }
}
