package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {Opcodes.DCMPL, 158}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public FiniteAnimationSpec f4738a;

    /* renamed from: b, reason: collision with root package name */
    public int f4739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemAnimation f4740c;
    public final /* synthetic */ FiniteAnimationSpec d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4741f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemAnimation f4742a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f4743b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyLayoutItemAnimation lazyLayoutItemAnimation, long j2) {
            super(1);
            this.f4742a = lazyLayoutItemAnimation;
            this.f4743b = j2;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long c2 = IntOffset.c(((IntOffset) ((Animatable) obj).d()).f17489a, this.f4743b);
            int i2 = LazyLayoutItemAnimation.f4708t;
            LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f4742a;
            lazyLayoutItemAnimation.h(c2);
            lazyLayoutItemAnimation.f4711c.invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, long j2, g gVar) {
        super(2, gVar);
        this.f4740c = lazyLayoutItemAnimation;
        this.d = finiteAnimationSpec;
        this.f4741f = j2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.f4740c, this.d, this.f4741f, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r14.f4739b
            long r2 = r14.f4741f
            r4 = 2
            r5 = 1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r6 = r14.f4740c
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.jvm.internal.q.m(r15)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L93
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            androidx.compose.animation.core.FiniteAnimationSpec r1 = r14.f4738a
            kotlin.jvm.internal.q.m(r15)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L62
        L23:
            kotlin.jvm.internal.q.m(r15)
            androidx.compose.animation.core.Animatable r15 = r6.f4721o     // Catch: java.util.concurrent.CancellationException -> L9b
            androidx.compose.animation.core.Animatable r1 = r6.f4721o
            androidx.compose.runtime.ParcelableSnapshotMutableState r15 = r15.d     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r15 = r15.getValue()     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L9b
            boolean r15 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L9b
            androidx.compose.animation.core.FiniteAnimationSpec r7 = r14.d
            if (r15 == 0) goto L43
            boolean r15 = r7 instanceof androidx.compose.animation.core.SpringSpec     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r15 == 0) goto L41
            androidx.compose.animation.core.SpringSpec r7 = (androidx.compose.animation.core.SpringSpec) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L43
        L41:
            androidx.compose.animation.core.SpringSpec r7 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.f4752a     // Catch: java.util.concurrent.CancellationException -> L9b
        L43:
            androidx.compose.runtime.ParcelableSnapshotMutableState r15 = r1.d     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r15 = r15.getValue()     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.util.concurrent.CancellationException -> L9b
            boolean r15 = r15.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r15 != 0) goto L69
            androidx.compose.ui.unit.IntOffset r15 = new androidx.compose.ui.unit.IntOffset     // Catch: java.util.concurrent.CancellationException -> L9b
            r15.<init>(r2)     // Catch: java.util.concurrent.CancellationException -> L9b
            r14.f4738a = r7     // Catch: java.util.concurrent.CancellationException -> L9b
            r14.f4739b = r5     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r15 = r1.e(r15, r14)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r15 != r0) goto L61
            return r0
        L61:
            r1 = r7
        L62:
            q0.a r15 = r6.f4711c     // Catch: java.util.concurrent.CancellationException -> L9b
            r15.invoke()     // Catch: java.util.concurrent.CancellationException -> L9b
            r9 = r1
            goto L6a
        L69:
            r9 = r7
        L6a:
            androidx.compose.animation.core.Animatable r15 = r6.f4721o     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r15 = r15.d()     // Catch: java.util.concurrent.CancellationException -> L9b
            androidx.compose.ui.unit.IntOffset r15 = (androidx.compose.ui.unit.IntOffset) r15     // Catch: java.util.concurrent.CancellationException -> L9b
            long r7 = r15.f17489a     // Catch: java.util.concurrent.CancellationException -> L9b
            long r1 = androidx.compose.ui.unit.IntOffset.c(r7, r2)     // Catch: java.util.concurrent.CancellationException -> L9b
            androidx.compose.animation.core.Animatable r7 = r6.f4721o     // Catch: java.util.concurrent.CancellationException -> L9b
            androidx.compose.ui.unit.IntOffset r8 = new androidx.compose.ui.unit.IntOffset     // Catch: java.util.concurrent.CancellationException -> L9b
            r8.<init>(r1)     // Catch: java.util.concurrent.CancellationException -> L9b
            r10 = 0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1 r11 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$1     // Catch: java.util.concurrent.CancellationException -> L9b
            r11.<init>(r6, r1)     // Catch: java.util.concurrent.CancellationException -> L9b
            r13 = 4
            r15 = 0
            r14.f4738a = r15     // Catch: java.util.concurrent.CancellationException -> L9b
            r14.f4739b = r4     // Catch: java.util.concurrent.CancellationException -> L9b
            r12 = r14
            java.lang.Object r15 = androidx.compose.animation.core.Animatable.c(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r15 != r0) goto L93
            return r0
        L93:
            int r15 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.f4708t     // Catch: java.util.concurrent.CancellationException -> L9b
            r15 = 0
            r6.g(r15)     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.f4713g = r15     // Catch: java.util.concurrent.CancellationException -> L9b
        L9b:
            d0.b0 r15 = d0.b0.f30125a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
