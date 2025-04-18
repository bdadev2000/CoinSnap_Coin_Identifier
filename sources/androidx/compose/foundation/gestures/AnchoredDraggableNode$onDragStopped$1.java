package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {275, 277}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AnchoredDraggableNode$onDragStopped$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public Object f3055a;

    /* renamed from: b, reason: collision with root package name */
    public int f3056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableNode f3057c;
    public final /* synthetic */ long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {280}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public Object f3058a;

        /* renamed from: b, reason: collision with root package name */
        public int f3059b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f3060c;
        public final /* synthetic */ AnchoredDraggableNode d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableNode anchoredDraggableNode, g gVar) {
            super(2, gVar);
            this.d = anchoredDraggableNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, gVar);
            anonymousClass1.f3060c = ((Velocity) obj).f17502a;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(new Velocity(((Velocity) obj).f17502a), (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            AnchoredDraggableNode anchoredDraggableNode;
            long j2;
            a aVar = a.f30806a;
            int i2 = this.f3059b;
            Orientation orientation = Orientation.f3394a;
            AnchoredDraggableNode anchoredDraggableNode2 = this.d;
            if (i2 == 0) {
                q.m(obj);
                long j3 = this.f3060c;
                AnchoredDraggableState anchoredDraggableState = anchoredDraggableNode2.f3046y;
                float c2 = anchoredDraggableNode2.f3047z == orientation ? Velocity.c(j3) : Velocity.b(j3);
                this.f3058a = anchoredDraggableNode2;
                this.f3060c = j3;
                this.f3059b = 1;
                obj = anchoredDraggableState.e(c2, this);
                if (obj == aVar) {
                    return aVar;
                }
                anchoredDraggableNode = anchoredDraggableNode2;
                j2 = j3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = this.f3060c;
                anchoredDraggableNode = (AnchoredDraggableNode) this.f3058a;
                q.m(obj);
            }
            float floatValue = ((Number) obj).floatValue();
            Orientation orientation2 = anchoredDraggableNode.f3047z;
            float f2 = orientation2 == Orientation.f3395b ? floatValue : 0.0f;
            if (orientation2 != orientation) {
                floatValue = 0.0f;
            }
            long a2 = VelocityKt.a(f2, floatValue);
            float d = anchoredDraggableNode2.f3046y.d();
            float d2 = anchoredDraggableNode2.f3046y.b().d();
            if (d >= anchoredDraggableNode2.f3046y.b().f() || d <= d2) {
                j2 = a2;
            }
            return new Velocity(j2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode anchoredDraggableNode, long j2, g gVar) {
        super(2, gVar);
        this.f3057c = anchoredDraggableNode;
        this.d = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new AnchoredDraggableNode$onDragStopped$1(this.f3057c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AnchoredDraggableNode$onDragStopped$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r9.f3056b
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.f3394a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.jvm.internal.q.m(r10)
            goto L93
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            java.lang.Object r0 = r9.f3055a
            androidx.compose.foundation.gestures.AnchoredDraggableNode r0 = (androidx.compose.foundation.gestures.AnchoredDraggableNode) r0
            kotlin.jvm.internal.q.m(r10)
            goto L5d
        L23:
            kotlin.jvm.internal.q.m(r10)
            androidx.compose.foundation.gestures.AnchoredDraggableNode r10 = r9.f3057c
            androidx.compose.foundation.OverscrollEffect r1 = r10.B
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            long r7 = r9.d
            if (r1 != 0) goto L75
            androidx.compose.foundation.gestures.AnchoredDraggableState r1 = r10.f3046y
            boolean r3 = r10.q2()
            if (r3 == 0) goto L3f
            long r5 = androidx.compose.ui.unit.Velocity.f(r7, r6)
            goto L43
        L3f:
            long r5 = androidx.compose.ui.unit.Velocity.f(r7, r5)
        L43:
            androidx.compose.foundation.gestures.Orientation r3 = r10.f3047z
            if (r3 != r2) goto L4c
            float r3 = androidx.compose.ui.unit.Velocity.c(r5)
            goto L50
        L4c:
            float r3 = androidx.compose.ui.unit.Velocity.b(r5)
        L50:
            r9.f3055a = r10
            r9.f3056b = r4
            java.lang.Object r1 = r1.e(r3, r9)
            if (r1 != r0) goto L5b
            return r0
        L5b:
            r0 = r10
            r10 = r1
        L5d:
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            androidx.compose.foundation.gestures.Orientation r0 = r0.f3047z
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.f3395b
            r3 = 0
            if (r0 != r1) goto L6c
            r1 = r10
            goto L6d
        L6c:
            r1 = r3
        L6d:
            if (r0 != r2) goto L70
            goto L71
        L70:
            r10 = r3
        L71:
            androidx.compose.ui.unit.VelocityKt.a(r1, r10)
            goto L93
        L75:
            boolean r2 = r10.q2()
            if (r2 == 0) goto L80
            long r4 = androidx.compose.ui.unit.Velocity.f(r7, r6)
            goto L84
        L80:
            long r4 = androidx.compose.ui.unit.Velocity.f(r7, r5)
        L84:
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            r6 = 0
            r2.<init>(r10, r6)
            r9.f3056b = r3
            java.lang.Object r10 = r1.d(r4, r2, r9)
            if (r10 != r0) goto L93
            return r0
        L93:
            d0.b0 r10 = d0.b0.f30125a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
