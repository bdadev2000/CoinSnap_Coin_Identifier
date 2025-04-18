package a9;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class g implements i, w7.e {
    public final j4.b a;

    /* renamed from: f, reason: collision with root package name */
    public final w7.j[] f396f;

    /* renamed from: h, reason: collision with root package name */
    public int f398h;

    /* renamed from: i, reason: collision with root package name */
    public w7.i f399i;

    /* renamed from: j, reason: collision with root package name */
    public j f400j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f401k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f402l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f392b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f393c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f394d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final w7.i[] f395e = new l[2];

    /* renamed from: g, reason: collision with root package name */
    public int f397g = 2;

    public g() {
        m[] mVarArr = new m[2];
        for (int i10 = 0; i10 < this.f397g; i10++) {
            this.f395e[i10] = new l();
        }
        this.f396f = mVarArr;
        this.f398h = 2;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 >= this.f398h) {
                break;
            }
            this.f396f[i11] = new d(this, z10 ? 1 : 0);
            i11++;
        }
        j4.b bVar = new j4.b(this);
        this.a = bVar;
        bVar.start();
        int i12 = this.f397g;
        w7.i[] iVarArr = this.f395e;
        u0.m(i12 == iVarArr.length);
        for (w7.i iVar : iVarArr) {
            iVar.g(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    @Override // w7.e
    public final void a(l lVar) {
        boolean z10;
        synchronized (this.f392b) {
            try {
                j jVar = this.f400j;
                if (jVar == null) {
                    boolean z11 = true;
                    if (lVar == this.f399i) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0.d(z10);
                    this.f393c.addLast(lVar);
                    if (this.f393c.isEmpty() || this.f398h <= 0) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f392b.notify();
                    }
                    this.f399i = null;
                } else {
                    throw jVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract h b(byte[] bArr, int i10, boolean z10);

    public final j c(w7.i iVar, w7.j jVar, boolean z10) {
        l lVar = (l) iVar;
        m mVar = (m) jVar;
        try {
            ByteBuffer byteBuffer = lVar.f26890f;
            byteBuffer.getClass();
            mVar.f(lVar.f26892h, b(byteBuffer.array(), byteBuffer.limit(), z10), lVar.f403l);
            mVar.f26867c &= Integer.MAX_VALUE;
            return null;
        } catch (j e2) {
            return e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f392b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.f402l     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r7.f393c     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1a
            int r1 = r7.f398h     // Catch: java.lang.Throwable -> L17
            if (r1 <= 0) goto L1a
            r1 = r3
            goto L1b
        L17:
            r1 = move-exception
            goto Lb1
        L1a:
            r1 = r2
        L1b:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r7.f392b     // Catch: java.lang.Throwable -> L17
            r1.wait()     // Catch: java.lang.Throwable -> L17
            goto L3
        L23:
            boolean r1 = r7.f402l     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto Lad
        L2a:
            java.util.ArrayDeque r1 = r7.f393c     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L17
            w7.i r1 = (w7.i) r1     // Catch: java.lang.Throwable -> L17
            w7.j[] r4 = r7.f396f     // Catch: java.lang.Throwable -> L17
            int r5 = r7.f398h     // Catch: java.lang.Throwable -> L17
            int r5 = r5 - r3
            r7.f398h = r5     // Catch: java.lang.Throwable -> L17
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L17
            boolean r5 = r7.f401k     // Catch: java.lang.Throwable -> L17
            r7.f401k = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = 4
            boolean r6 = r1.c(r0)
            if (r6 == 0) goto L4b
            r4.a(r0)
            goto L84
        L4b:
            boolean r0 = r1.d()
            if (r0 == 0) goto L56
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.a(r0)
        L56:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.c(r0)
            if (r6 == 0) goto L61
            r4.a(r0)
        L61:
            a9.j r0 = r7.c(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L66 java.lang.RuntimeException -> L6f
            goto L78
        L66:
            r0 = move-exception
            a9.j r5 = new a9.j
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L77
        L6f:
            r0 = move-exception
            a9.j r5 = new a9.j
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L77:
            r0 = r5
        L78:
            if (r0 == 0) goto L84
            java.lang.Object r5 = r7.f392b
            monitor-enter(r5)
            r7.f400j = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            goto Lad
        L81:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            java.lang.Object r2 = r7.f392b
            monitor-enter(r2)
            boolean r0 = r7.f401k     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L8f
            r4.e()     // Catch: java.lang.Throwable -> Lae
            goto L9e
        L8f:
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L99
            r4.e()     // Catch: java.lang.Throwable -> Lae
            goto L9e
        L99:
            java.util.ArrayDeque r0 = r7.f394d     // Catch: java.lang.Throwable -> Lae
            r0.addLast(r4)     // Catch: java.lang.Throwable -> Lae
        L9e:
            r1.e()     // Catch: java.lang.Throwable -> Lae
            int r0 = r7.f397g     // Catch: java.lang.Throwable -> Lae
            int r4 = r0 + 1
            r7.f397g = r4     // Catch: java.lang.Throwable -> Lae
            w7.i[] r4 = r7.f395e     // Catch: java.lang.Throwable -> Lae
            r4[r0] = r1     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lae
            r2 = r3
        Lad:
            return r2
        Lae:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lae
            throw r0
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.g.d():boolean");
    }

    @Override // w7.e
    public final Object dequeueInputBuffer() {
        boolean z10;
        w7.i iVar;
        synchronized (this.f392b) {
            try {
                j jVar = this.f400j;
                if (jVar == null) {
                    if (this.f399i == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0.m(z10);
                    int i10 = this.f397g;
                    if (i10 == 0) {
                        iVar = null;
                    } else {
                        w7.i[] iVarArr = this.f395e;
                        int i11 = i10 - 1;
                        this.f397g = i11;
                        iVar = iVarArr[i11];
                    }
                    this.f399i = iVar;
                } else {
                    throw jVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // w7.e
    public final Object dequeueOutputBuffer() {
        synchronized (this.f392b) {
            try {
                j jVar = this.f400j;
                if (jVar == null) {
                    if (this.f394d.isEmpty()) {
                        return null;
                    }
                    return (w7.j) this.f394d.removeFirst();
                }
                throw jVar;
            } finally {
            }
        }
    }

    @Override // w7.e
    public final void flush() {
        synchronized (this.f392b) {
            this.f401k = true;
            w7.i iVar = this.f399i;
            if (iVar != null) {
                iVar.e();
                int i10 = this.f397g;
                this.f397g = i10 + 1;
                this.f395e[i10] = iVar;
                this.f399i = null;
            }
            while (!this.f393c.isEmpty()) {
                w7.i iVar2 = (w7.i) this.f393c.removeFirst();
                iVar2.e();
                int i11 = this.f397g;
                this.f397g = i11 + 1;
                this.f395e[i11] = iVar2;
            }
            while (!this.f394d.isEmpty()) {
                ((w7.j) this.f394d.removeFirst()).e();
            }
        }
    }

    @Override // w7.e
    public final void release() {
        synchronized (this.f392b) {
            this.f402l = true;
            this.f392b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // a9.i
    public final void setPositionUs(long j3) {
    }
}
