package ki;

import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f21025b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f21026c;

    /* renamed from: d, reason: collision with root package name */
    public int f21027d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21028f;

    public u(e0 source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f21025b = source;
        this.f21026c = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21028f) {
            return;
        }
        this.f21026c.end();
        this.f21028f = true;
        this.f21025b.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[SYNTHETIC] */
    @Override // ki.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(ki.i r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
        L5:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L11
            r5 = r4
            goto L12
        L11:
            r5 = 0
        L12:
            if (r5 == 0) goto Lc2
            boolean r5 = r10.f21028f
            r5 = r5 ^ r4
            if (r5 == 0) goto Lb6
            ki.k r5 = r10.f21025b
            java.util.zip.Inflater r6 = r10.f21026c
            if (r3 != 0) goto L20
            goto L89
        L20:
            ki.f0 r3 = r11.t(r4)     // Catch: java.util.zip.DataFormatException -> Laf
            int r4 = r3.f20980c     // Catch: java.util.zip.DataFormatException -> Laf
            int r4 = 8192 - r4
            long r7 = (long) r4     // Catch: java.util.zip.DataFormatException -> Laf
            long r7 = java.lang.Math.min(r12, r7)     // Catch: java.util.zip.DataFormatException -> Laf
            int r4 = (int) r7     // Catch: java.util.zip.DataFormatException -> Laf
            boolean r7 = r6.needsInput()     // Catch: java.util.zip.DataFormatException -> Laf
            if (r7 != 0) goto L35
            goto L51
        L35:
            boolean r7 = r5.exhausted()     // Catch: java.util.zip.DataFormatException -> Laf
            if (r7 == 0) goto L3c
            goto L51
        L3c:
            ki.i r7 = r5.y()     // Catch: java.util.zip.DataFormatException -> Laf
            ki.f0 r7 = r7.f20993b     // Catch: java.util.zip.DataFormatException -> Laf
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.util.zip.DataFormatException -> Laf
            int r8 = r7.f20980c     // Catch: java.util.zip.DataFormatException -> Laf
            int r9 = r7.f20979b     // Catch: java.util.zip.DataFormatException -> Laf
            int r8 = r8 - r9
            r10.f21027d = r8     // Catch: java.util.zip.DataFormatException -> Laf
            byte[] r7 = r7.a     // Catch: java.util.zip.DataFormatException -> Laf
            r6.setInput(r7, r9, r8)     // Catch: java.util.zip.DataFormatException -> Laf
        L51:
            byte[] r7 = r3.a     // Catch: java.util.zip.DataFormatException -> Laf
            int r8 = r3.f20980c     // Catch: java.util.zip.DataFormatException -> Laf
            int r4 = r6.inflate(r7, r8, r4)     // Catch: java.util.zip.DataFormatException -> Laf
            int r7 = r10.f21027d     // Catch: java.util.zip.DataFormatException -> Laf
            if (r7 != 0) goto L5e
            goto L6c
        L5e:
            int r8 = r6.getRemaining()     // Catch: java.util.zip.DataFormatException -> Laf
            int r7 = r7 - r8
            int r8 = r10.f21027d     // Catch: java.util.zip.DataFormatException -> Laf
            int r8 = r8 - r7
            r10.f21027d = r8     // Catch: java.util.zip.DataFormatException -> Laf
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> Laf
            r5.skip(r7)     // Catch: java.util.zip.DataFormatException -> Laf
        L6c:
            if (r4 <= 0) goto L7a
            int r7 = r3.f20980c     // Catch: java.util.zip.DataFormatException -> Laf
            int r7 = r7 + r4
            r3.f20980c = r7     // Catch: java.util.zip.DataFormatException -> Laf
            long r7 = r11.f20994c     // Catch: java.util.zip.DataFormatException -> Laf
            long r3 = (long) r4     // Catch: java.util.zip.DataFormatException -> Laf
            long r7 = r7 + r3
            r11.f20994c = r7     // Catch: java.util.zip.DataFormatException -> Laf
            goto L8a
        L7a:
            int r4 = r3.f20979b     // Catch: java.util.zip.DataFormatException -> Laf
            int r7 = r3.f20980c     // Catch: java.util.zip.DataFormatException -> Laf
            if (r4 != r7) goto L89
            ki.f0 r4 = r3.a()     // Catch: java.util.zip.DataFormatException -> Laf
            r11.f20993b = r4     // Catch: java.util.zip.DataFormatException -> Laf
            ki.g0.a(r3)     // Catch: java.util.zip.DataFormatException -> Laf
        L89:
            r3 = r1
        L8a:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L8f
            return r3
        L8f:
            boolean r1 = r6.finished()
            if (r1 != 0) goto Lac
            boolean r1 = r6.needsDictionary()
            if (r1 == 0) goto L9c
            goto Lac
        L9c:
            boolean r1 = r5.exhausted()
            if (r1 != 0) goto La4
            goto L5
        La4:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        Lac:
            r11 = -1
            return r11
        Laf:
            r11 = move-exception
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lb6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lc2:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k(r11, r12)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.u.read(ki.i, long):long");
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f21025b.timeout();
    }
}
