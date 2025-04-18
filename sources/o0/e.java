package o0;

import java.io.File;

/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f31190b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f31191c;
    public int d;
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File file) {
        super(file);
        p0.a.s(file, "rootDir");
        this.e = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0.length == 0) goto L22;
     */
    @Override // o0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a() {
        /*
            r5 = this;
            boolean r0 = r5.f31190b
            java.io.File r1 = r5.f31195a
            o0.f r2 = r5.e
            if (r0 != 0) goto L11
            o0.h r0 = r2.d
            r0.getClass()
            r0 = 1
            r5.f31190b = r0
            return r1
        L11:
            java.io.File[] r0 = r5.f31191c
            r3 = 0
            if (r0 == 0) goto L25
            int r4 = r5.d
            p0.a.p(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L1f
            goto L25
        L1f:
            o0.h r0 = r2.d
            r0.getClass()
            return r3
        L25:
            java.io.File[] r0 = r5.f31191c
            if (r0 != 0) goto L46
            java.io.File[] r0 = r1.listFiles()
            r5.f31191c = r0
            if (r0 != 0) goto L36
            o0.h r0 = r2.d
            r0.getClass()
        L36:
            java.io.File[] r0 = r5.f31191c
            if (r0 == 0) goto L40
            p0.a.p(r0)
            int r0 = r0.length
            if (r0 != 0) goto L46
        L40:
            o0.h r0 = r2.d
            r0.getClass()
            return r3
        L46:
            java.io.File[] r0 = r5.f31191c
            p0.a.p(r0)
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.e.a():java.io.File");
    }
}
