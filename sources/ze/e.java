package ze;

/* loaded from: classes4.dex */
public final class e implements c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28751b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.f28751b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // ze.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(java.util.List r6) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 0
            java.lang.Object r2 = r5.f28751b
            switch(r0) {
                case 0: goto L27;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            goto L36
        L9:
            ze.c[] r2 = (ze.c[]) r2
            int r0 = r2.length
            r3 = 0
        Ld:
            if (r1 >= r0) goto L1f
            r3 = r2[r1]
            java.util.List r3 = r3.a(r6)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto Ld
        L1f:
            if (r3 != 0) goto L26
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L26:
            return r3
        L27:
            ze.c[] r2 = (ze.c[]) r2
            int r0 = r2.length
        L2a:
            if (r1 >= r0) goto L35
            r3 = r2[r1]
            java.util.List r6 = r3.a(r6)
            int r1 = r1 + 1
            goto L2a
        L35:
            return r6
        L36:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L3f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()
            ze.b r1 = (ze.b) r1
            r3 = r2
            ze.f r3 = (ze.f) r3
            boolean r3 = r3.b(r1)
            if (r3 == 0) goto L3f
            r0.add(r1)
            goto L3f
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.e.a(java.util.List):java.util.List");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar) {
        this(fVar, 2);
        this.a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(c[] cVarArr, int i10) {
        this((Object) cVarArr, 0);
        this.a = i10;
        int i11 = 1;
        if (i10 != 1) {
        } else {
            this((Object) cVarArr, i11);
        }
    }
}
