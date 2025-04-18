package com.google.common.collect;

/* loaded from: classes3.dex */
public final class e2 extends u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final e2 f11936i = new e2(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object f11937f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f11938g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f11939h;

    public e2(Object obj, Object[] objArr, int i10) {
        this.f11937f = obj;
        this.f11938g = objArr;
        this.f11939h = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e A[RETURN] */
    @Override // com.google.common.collect.u0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            goto L1e
        L4:
            r1 = 1
            java.lang.Object[] r2 = r9.f11938g
            int r3 = r9.f11939h
            if (r3 != r1) goto L21
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L1e
            r10 = r2[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L1e:
            r10 = r0
            goto L9c
        L21:
            java.lang.Object r3 = r9.f11937f
            if (r3 != 0) goto L26
            goto L1e
        L26:
            boolean r4 = r3 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L52
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r6 = r3 + (-1)
            int r3 = r10.hashCode()
            int r3 = a6.k.K(r3)
        L39:
            r3 = r3 & r6
            r5 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L42
            goto L1e
        L42:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4f
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4f:
            int r3 = r3 + 1
            goto L39
        L52:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7e
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r6 = r3 + (-1)
            int r3 = r10.hashCode()
            int r3 = a6.k.K(r3)
        L64:
            r3 = r3 & r6
            short r5 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r5 != r7) goto L6e
            goto L1e
        L6e:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7b
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7b:
            int r3 = r3 + 1
            goto L64
        L7e:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r6 = r10.hashCode()
            int r6 = a6.k.K(r6)
        L8a:
            r6 = r6 & r4
            r7 = r3[r6]
            if (r7 != r5) goto L90
            goto L1e
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.e2.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11939h;
    }
}
