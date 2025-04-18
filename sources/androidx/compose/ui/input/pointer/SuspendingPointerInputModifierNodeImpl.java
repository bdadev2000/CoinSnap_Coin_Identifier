package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import b1.a2;
import b1.f0;
import b1.k;
import b1.l;
import d0.b0;
import h0.g;
import h0.m;
import h0.n;
import i0.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {

    /* renamed from: o, reason: collision with root package name */
    public Object f15645o;

    /* renamed from: p, reason: collision with root package name */
    public Object f15646p;

    /* renamed from: q, reason: collision with root package name */
    public Object[] f15647q;

    /* renamed from: r, reason: collision with root package name */
    public p f15648r;

    /* renamed from: s, reason: collision with root package name */
    public a2 f15649s;
    public PointerEvent w;

    /* renamed from: t, reason: collision with root package name */
    public PointerEvent f15650t = SuspendingPointerInputFilterKt.f15643a;

    /* renamed from: u, reason: collision with root package name */
    public final MutableVector f15651u = new MutableVector(new PointerEventHandlerCoroutine[16]);

    /* renamed from: v, reason: collision with root package name */
    public final MutableVector f15652v = new MutableVector(new PointerEventHandlerCoroutine[16]);
    public long x = 0;

    /* loaded from: classes.dex */
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, g {

        /* renamed from: a, reason: collision with root package name */
        public final g f15653a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f15654b;

        /* renamed from: c, reason: collision with root package name */
        public k f15655c;
        public PointerEventPass d = PointerEventPass.f15573b;

        public PointerEventHandlerCoroutine(l lVar) {
            this.f15653a = lVar;
            this.f15654b = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final long A0() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            long L = suspendingPointerInputModifierNodeImpl.L(DelegatableNodeKt.f(suspendingPointerInputModifierNodeImpl).w.e());
            long j2 = suspendingPointerInputModifierNodeImpl.x;
            return SizeKt.a(Math.max(0.0f, Size.d(L) - ((int) (j2 >> 32))) / 2.0f, Math.max(0.0f, Size.b(L) - ((int) (j2 & 4294967295L))) / 2.0f);
        }

        @Override // androidx.compose.ui.unit.Density
        public final int C1(long j2) {
            return this.f15654b.C1(j2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object E1(long r5, q0.p r7, h0.g r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.f15665c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15665c = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f15663a
                i0.a r1 = i0.a.f30806a
                int r2 = r0.f15665c
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.jvm.internal.q.m(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
                goto L3c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.jvm.internal.q.m(r8)
                r0.f15665c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
                java.lang.Object r8 = r4.f1(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
                if (r8 != r1) goto L3c
                return r1
            L3b:
                r8 = 0
            L3c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.E1(long, q0.p, h0.g):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.Density
        public final int F0(float f2) {
            return this.f15654b.F0(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float H(int i2) {
            return this.f15654b.H(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final float I(float f2) {
            return f2 / this.f15654b.getDensity();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float J0(long j2) {
            return this.f15654b.J0(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long L(long j2) {
            return this.f15654b.L(j2);
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final Object L1(PointerEventPass pointerEventPass, g gVar) {
            l lVar = new l(1, f0.r(gVar));
            lVar.p();
            this.d = pointerEventPass;
            this.f15655c = lVar;
            Object o2 = lVar.o();
            a aVar = a.f30806a;
            return o2;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final PointerEvent S0() {
            return SuspendingPointerInputModifierNodeImpl.this.f15650t;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final long a() {
            return SuspendingPointerInputModifierNodeImpl.this.x;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [b1.h1] */
        /* JADX WARN: Type inference failed for: r7v4, types: [b1.h1] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r9v0, types: [q0.p] */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object f1(long r7, q0.p r9, h0.g r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r10
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r6, r10)
            L18:
                java.lang.Object r10 = r0.f15658b
                i0.a r1 = i0.a.f30806a
                int r2 = r0.d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                b1.a2 r7 = r0.f15657a
                kotlin.jvm.internal.q.m(r10)     // Catch: java.lang.Throwable -> L29
                goto L69
            L29:
                r8 = move-exception
                goto L6f
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L33:
                kotlin.jvm.internal.q.m(r10)
                r4 = 0
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 > 0) goto L4c
                b1.k r10 = r6.f15655c
                if (r10 == 0) goto L4c
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r7)
                d0.m r2 = kotlin.jvm.internal.q.d(r2)
                r10.resumeWith(r2)
            L4c:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r10 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                b1.d0 r10 = r10.S1()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r4 = 0
                r2.<init>(r7, r6, r4)
                r7 = 3
                r8 = 0
                b1.a2 r7 = kotlin.jvm.internal.e.v(r10, r4, r8, r2, r7)
                r0.f15657a = r7     // Catch: java.lang.Throwable -> L29
                r0.d = r3     // Catch: java.lang.Throwable -> L29
                java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
                if (r10 != r1) goto L69
                return r1
            L69:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f15545a
                r7.a(r8)
                return r10
            L6f:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f15545a
                r7.a(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.f1(long, q0.p, h0.g):java.lang.Object");
        }

        @Override // h0.g
        public final h0.l getContext() {
            return m.f30726a;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.f15654b.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final ViewConfiguration getViewConfiguration() {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            suspendingPointerInputModifierNodeImpl.getClass();
            return DelegatableNodeKt.f(suspendingPointerInputModifierNodeImpl).w;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final long o(float f2) {
            return this.f15654b.o(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long p(long j2) {
            return this.f15654b.p(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float r(long j2) {
            return this.f15654b.r(j2);
        }

        @Override // h0.g
        public final void resumeWith(Object obj) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (suspendingPointerInputModifierNodeImpl.f15651u) {
                suspendingPointerInputModifierNodeImpl.f15651u.n(this);
            }
            this.f15653a.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        public final long u(float f2) {
            return this.f15654b.u(f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public final float x1() {
            return this.f15654b.x1();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float y1(float f2) {
            return this.f15654b.getDensity() * f2;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, p pVar) {
        this.f15645o = obj;
        this.f15646p = obj2;
        this.f15647q = objArr;
        this.f15648r = pVar;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void J1() {
        M0();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final Object K1(p pVar, g gVar) {
        l lVar = new l(1, f0.r(gVar));
        lVar.p();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(lVar);
        synchronized (this.f15651u) {
            this.f15651u.b(pointerEventHandlerCoroutine);
            new n(a.f30806a, f0.r(f0.j(pointerEventHandlerCoroutine, pointerEventHandlerCoroutine, pVar))).resumeWith(b0.f30125a);
        }
        lVar.z(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        return lVar.o();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final void M0() {
        a2 a2Var = this.f15649s;
        if (a2Var != null) {
            a2Var.a(new CancellationException("Pointer input was reset"));
            this.f15649s = null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        M0();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final void b0() {
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.x = j2;
        if (pointerEventPass == PointerEventPass.f15572a) {
            this.f15650t = pointerEvent;
        }
        if (this.f15649s == null) {
            this.f15649s = e.v(S1(), null, 4, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        e2(pointerEvent, pointerEventPass);
        List list = pointerEvent.f15569a;
        int size = list.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = true;
                break;
            } else if (!PointerEventKt.c((PointerInputChange) list.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (!(!z2)) {
            pointerEvent = null;
        }
        this.w = pointerEvent;
    }

    public final void e2(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        k kVar;
        k kVar2;
        synchronized (this.f15651u) {
            MutableVector mutableVector = this.f15652v;
            mutableVector.c(mutableVector.f14144c, this.f15651u);
        }
        try {
            int ordinal = pointerEventPass.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    MutableVector mutableVector2 = this.f15652v;
                    int i2 = mutableVector2.f14144c;
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        Object[] objArr = mutableVector2.f14142a;
                        do {
                            PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (PointerEventHandlerCoroutine) objArr[i3];
                            if (pointerEventPass == pointerEventHandlerCoroutine.d && (kVar2 = pointerEventHandlerCoroutine.f15655c) != null) {
                                pointerEventHandlerCoroutine.f15655c = null;
                                kVar2.resumeWith(pointerEvent);
                            }
                            i3--;
                        } while (i3 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            MutableVector mutableVector3 = this.f15652v;
            int i4 = mutableVector3.f14144c;
            if (i4 > 0) {
                Object[] objArr2 = mutableVector3.f14142a;
                int i5 = 0;
                do {
                    PointerEventHandlerCoroutine pointerEventHandlerCoroutine2 = (PointerEventHandlerCoroutine) objArr2[i5];
                    if (pointerEventPass == pointerEventHandlerCoroutine2.d && (kVar = pointerEventHandlerCoroutine2.f15655c) != null) {
                        pointerEventHandlerCoroutine2.f15655c = null;
                        kVar.resumeWith(pointerEvent);
                    }
                    i5++;
                } while (i5 < i4);
            }
        } finally {
            this.f15652v.g();
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return DelegatableNodeKt.f(this).f15959u.getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.f(this).w;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        PointerEvent pointerEvent = this.w;
        if (pointerEvent == null) {
            return;
        }
        List list = pointerEvent.f15569a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!(!((PointerInputChange) list.get(i2)).d)) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    PointerInputChange pointerInputChange = (PointerInputChange) list.get(i3);
                    long j2 = pointerInputChange.f15589a;
                    long j3 = pointerInputChange.f15591c;
                    long j4 = pointerInputChange.f15590b;
                    float f2 = pointerInputChange.e;
                    boolean z2 = pointerInputChange.d;
                    arrayList.add(new PointerInputChange(j2, j4, j3, false, f2, j4, j3, z2, z2, 1, 0L));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList, null);
                this.f15650t = pointerEvent2;
                e2(pointerEvent2, PointerEventPass.f15572a);
                e2(pointerEvent2, PointerEventPass.f15573b);
                e2(pointerEvent2, PointerEventPass.f15574c);
                this.w = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void v1() {
        M0();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float x1() {
        return DelegatableNodeKt.f(this).f15959u.x1();
    }
}
