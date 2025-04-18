package u7;

import com.google.common.collect.z1;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class m {
    public final com.google.common.collect.r0 a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25588b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f25589c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f25590d;

    public m(z1 z1Var) {
        this.a = z1Var;
        n nVar = n.f25592e;
        this.f25590d = false;
    }

    public final n a(n nVar) {
        if (!nVar.equals(n.f25592e)) {
            int i10 = 0;
            while (true) {
                com.google.common.collect.r0 r0Var = this.a;
                if (i10 < r0Var.size()) {
                    p pVar = (p) r0Var.get(i10);
                    n a = pVar.a(nVar);
                    if (pVar.isActive()) {
                        v8.u0.m(!a.equals(n.f25592e));
                        nVar = a;
                    }
                    i10++;
                } else {
                    return nVar;
                }
            }
        } else {
            throw new o(nVar);
        }
    }

    public final boolean b() {
        if (this.f25590d && ((p) this.f25588b.get(this.f25589c.length - 1)).isEnded()) {
            if (!this.f25589c[r0.length - 1].hasRemaining()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return !this.f25588b.isEmpty();
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void d(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = r0
        L2:
            if (r1 == 0) goto L87
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            java.nio.ByteBuffer[] r4 = r9.f25589c
            int r5 = r4.length
            int r5 = r5 + (-1)
            if (r3 > r5) goto L84
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L18
            goto L81
        L18:
            java.util.ArrayList r4 = r9.f25588b
            java.lang.Object r5 = r4.get(r3)
            u7.p r5 = (u7.p) r5
            boolean r6 = r5.isEnded()
            if (r6 == 0) goto L43
            java.nio.ByteBuffer[] r5 = r9.f25589c
            r5 = r5[r3]
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L81
            java.nio.ByteBuffer[] r5 = r9.f25589c
            int r5 = r5.length
            int r5 = r5 + (-1)
            if (r3 >= r5) goto L81
            int r5 = r3 + 1
            java.lang.Object r4 = r4.get(r5)
            u7.p r4 = (u7.p) r4
            r4.queueEndOfStream()
            goto L81
        L43:
            if (r3 <= 0) goto L4c
            java.nio.ByteBuffer[] r4 = r9.f25589c
            int r6 = r3 + (-1)
            r4 = r4[r6]
            goto L56
        L4c:
            boolean r4 = r10.hasRemaining()
            if (r4 == 0) goto L54
            r4 = r10
            goto L56
        L54:
            java.nio.ByteBuffer r4 = u7.p.a
        L56:
            int r6 = r4.remaining()
            long r6 = (long) r6
            r5.queueInput(r4)
            java.nio.ByteBuffer[] r8 = r9.f25589c
            java.nio.ByteBuffer r5 = r5.getOutput()
            r8[r3] = r5
            int r4 = r4.remaining()
            long r4 = (long) r4
            long r6 = r6 - r4
            r4 = 0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L7f
            java.nio.ByteBuffer[] r4 = r9.f25589c
            r4 = r4[r3]
            boolean r4 = r4.hasRemaining()
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            r4 = r1
            goto L80
        L7f:
            r4 = r0
        L80:
            r2 = r2 | r4
        L81:
            int r3 = r3 + 1
            goto L7
        L84:
            r1 = r2
            goto L2
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.m.d(java.nio.ByteBuffer):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        com.google.common.collect.r0 r0Var = this.a;
        if (r0Var.size() != mVar.a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < r0Var.size(); i10++) {
            if (r0Var.get(i10) != mVar.a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
