package b9;

import a9.l;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class i implements a9.i {
    public final ArrayDeque a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2403b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f2404c;

    /* renamed from: d, reason: collision with root package name */
    public g f2405d;

    /* renamed from: e, reason: collision with root package name */
    public long f2406e;

    /* renamed from: f, reason: collision with root package name */
    public long f2407f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a.add(new g());
        }
        this.f2403b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f2403b.add(new h(new androidx.core.app.h(this, 26)));
        }
        this.f2404c = new PriorityQueue();
    }

    @Override // w7.e
    public final void a(l lVar) {
        boolean z10;
        if (lVar == this.f2405d) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        g gVar = (g) lVar;
        if (gVar.d()) {
            gVar.e();
            this.a.add(gVar);
        } else {
            long j3 = this.f2407f;
            this.f2407f = 1 + j3;
            gVar.f2401m = j3;
            this.f2404c.add(gVar);
        }
        this.f2405d = null;
    }

    public abstract j b();

    public abstract void c(g gVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return null;
     */
    @Override // w7.e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a9.m dequeueOutputBuffer() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.f2403b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r12.f2404c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            b9.g r3 = (b9.g) r3
            int r4 = n9.h0.a
            long r3 = r3.f26892h
            long r5 = r12.f2406e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            b9.g r1 = (b9.g) r1
            r3 = 4
            boolean r4 = r1.c(r3)
            java.util.ArrayDeque r5 = r12.a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            a9.m r0 = (a9.m) r0
            r0.a(r3)
            r1.e()
            r5.add(r1)
            return r0
        L41:
            r12.c(r1)
            boolean r3 = r12.e()
            if (r3 == 0) goto L66
            b9.j r9 = r12.b()
            java.lang.Object r0 = r0.pollFirst()
            a9.m r0 = (a9.m) r0
            long r7 = r1.f26892h
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.f(r7, r9, r10)
            r1.e()
            r5.add(r1)
            return r0
        L66:
            r1.e()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.i.dequeueOutputBuffer():a9.m");
    }

    @Override // w7.e
    public final Object dequeueInputBuffer() {
        boolean z10;
        if (this.f2405d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f2405d = gVar;
        return gVar;
    }

    public abstract boolean e();

    @Override // w7.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f2407f = 0L;
        this.f2406e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f2404c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = h0.a;
            gVar.e();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f2405d;
        if (gVar2 != null) {
            gVar2.e();
            arrayDeque.add(gVar2);
            this.f2405d = null;
        }
    }

    @Override // w7.e
    public void release() {
    }

    @Override // a9.i
    public final void setPositionUs(long j3) {
        this.f2406e = j3;
    }
}
