package g1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30629a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30630b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30631c = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_removedRef");

    @Nullable
    private volatile Object _next = this;

    @Nullable
    private volatile Object _prev = this;

    @Nullable
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((g1.w) r6).f30640a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g1.p m() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = g1.p.f30630b
            java.lang.Object r1 = r0.get(r9)
            g1.p r1 = (g1.p) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = g1.p.f30629a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.w()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof g1.v
            if (r7 == 0) goto L38
            g1.v r6 = (g1.v) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof g1.w
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            g1.w r6 = (g1.w) r6
            g1.p r6 = r6.f30640a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            g1.p r3 = (g1.p) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            p0.a.q(r6, r4)
            r4 = r6
            g1.p r4 = (g1.p) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.p.m():g1.p");
    }

    public final void n(p pVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30630b;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(pVar);
            if (q() != pVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(pVar, pVar2, this)) {
                if (atomicReferenceFieldUpdater.get(pVar) != pVar2) {
                    break;
                }
            }
            if (w()) {
                pVar.m();
                return;
            }
            return;
        }
    }

    public final Object q() {
        while (true) {
            Object obj = f30629a.get(this);
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).a(this);
        }
    }

    public String toString() {
        return new kotlin.jvm.internal.a0(this, b1.f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + b1.f0.o(this);
    }

    public final p v() {
        p pVar;
        Object q2 = q();
        w wVar = q2 instanceof w ? (w) q2 : null;
        if (wVar != null && (pVar = wVar.f30640a) != null) {
            return pVar;
        }
        p0.a.q(q2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (p) q2;
    }

    public boolean w() {
        return q() instanceof w;
    }
}
