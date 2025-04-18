package uc;

import com.google.gson.c0;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class e extends c0 {
    public volatile c0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.n f25756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TypeToken f25757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f25758f;

    public e(f fVar, boolean z10, boolean z11, com.google.gson.n nVar, TypeToken typeToken) {
        this.f25758f = fVar;
        this.f25754b = z10;
        this.f25755c = z11;
        this.f25756d = nVar;
        this.f25757e = typeToken;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006f, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097 A[SYNTHETIC] */
    @Override // com.google.gson.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(zc.a r11) {
        /*
            r10 = this;
            boolean r0 = r10.f25754b
            if (r0 == 0) goto L9
            r11.i0()
            r11 = 0
            return r11
        L9:
            com.google.gson.c0 r0 = r10.a
            if (r0 == 0) goto Lf
            goto L9f
        Lf:
            com.google.gson.n r0 = r10.f25756d
            uc.f r1 = r10.f25758f
            com.google.gson.reflect.TypeToken r2 = r10.f25757e
            r0.getClass()
            java.lang.String r3 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "type must not be null"
            java.util.Objects.requireNonNull(r2, r3)
            vc.j r3 = r0.f12113d
            r3.getClass()
            vc.i r4 = vc.j.f26445d
            r5 = 0
            r6 = 1
            if (r1 != r4) goto L2e
            goto L71
        L2e:
            java.util.concurrent.ConcurrentHashMap r4 = r3.f26447c
            java.lang.Class r7 = r2.a
            java.lang.Object r8 = r4.get(r7)
            com.google.gson.d0 r8 = (com.google.gson.d0) r8
            if (r8 == 0) goto L3d
            if (r8 != r1) goto L73
            goto L71
        L3d:
            java.lang.Class<tc.a> r8 = tc.a.class
            java.lang.annotation.Annotation r8 = r7.getAnnotation(r8)
            tc.a r8 = (tc.a) r8
            if (r8 != 0) goto L48
            goto L73
        L48:
            java.lang.Class r8 = r8.value()
            java.lang.Class<com.google.gson.d0> r9 = com.google.gson.d0.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 != 0) goto L55
            goto L73
        L55:
            com.google.gson.reflect.TypeToken r9 = new com.google.gson.reflect.TypeToken
            r9.<init>(r8)
            com.bumptech.glide.manager.r r8 = r3.f26446b
            uc.n r8 = r8.g(r9)
            java.lang.Object r8 = r8.b()
            com.google.gson.d0 r8 = (com.google.gson.d0) r8
            java.lang.Object r4 = r4.putIfAbsent(r7, r8)
            com.google.gson.d0 r4 = (com.google.gson.d0) r4
            if (r4 == 0) goto L6f
            r8 = r4
        L6f:
            if (r8 != r1) goto L73
        L71:
            r4 = r6
            goto L74
        L73:
            r4 = r5
        L74:
            if (r4 == 0) goto L77
            r1 = r3
        L77:
            java.util.List r3 = r0.f12114e
            java.util.Iterator r3 = r3.iterator()
        L7d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L97
            java.lang.Object r4 = r3.next()
            com.google.gson.d0 r4 = (com.google.gson.d0) r4
            if (r5 != 0) goto L8f
            if (r4 != r1) goto L7d
            r5 = r6
            goto L7d
        L8f:
            com.google.gson.c0 r4 = r4.a(r0, r2)
            if (r4 == 0) goto L7d
            r0 = r4
            goto L9d
        L97:
            if (r5 != 0) goto La4
            com.google.gson.c0 r0 = r0.c(r2)
        L9d:
            r10.a = r0
        L9f:
            java.lang.Object r11 = r0.b(r11)
            return r11
        La4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.e.b(zc.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[SYNTHETIC] */
    @Override // com.google.gson.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(zc.b r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r10.f25755c
            if (r0 == 0) goto L8
            r11.t()
            return
        L8:
            com.google.gson.c0 r0 = r10.a
            if (r0 == 0) goto Le
            goto L9e
        Le:
            com.google.gson.n r0 = r10.f25756d
            uc.f r1 = r10.f25758f
            com.google.gson.reflect.TypeToken r2 = r10.f25757e
            r0.getClass()
            java.lang.String r3 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "type must not be null"
            java.util.Objects.requireNonNull(r2, r3)
            vc.j r3 = r0.f12113d
            r3.getClass()
            vc.i r4 = vc.j.f26445d
            r5 = 0
            r6 = 1
            if (r1 != r4) goto L2d
            goto L70
        L2d:
            java.util.concurrent.ConcurrentHashMap r4 = r3.f26447c
            java.lang.Class r7 = r2.a
            java.lang.Object r8 = r4.get(r7)
            com.google.gson.d0 r8 = (com.google.gson.d0) r8
            if (r8 == 0) goto L3c
            if (r8 != r1) goto L72
            goto L70
        L3c:
            java.lang.Class<tc.a> r8 = tc.a.class
            java.lang.annotation.Annotation r8 = r7.getAnnotation(r8)
            tc.a r8 = (tc.a) r8
            if (r8 != 0) goto L47
            goto L72
        L47:
            java.lang.Class r8 = r8.value()
            java.lang.Class<com.google.gson.d0> r9 = com.google.gson.d0.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 != 0) goto L54
            goto L72
        L54:
            com.google.gson.reflect.TypeToken r9 = new com.google.gson.reflect.TypeToken
            r9.<init>(r8)
            com.bumptech.glide.manager.r r8 = r3.f26446b
            uc.n r8 = r8.g(r9)
            java.lang.Object r8 = r8.b()
            com.google.gson.d0 r8 = (com.google.gson.d0) r8
            java.lang.Object r4 = r4.putIfAbsent(r7, r8)
            com.google.gson.d0 r4 = (com.google.gson.d0) r4
            if (r4 == 0) goto L6e
            r8 = r4
        L6e:
            if (r8 != r1) goto L72
        L70:
            r4 = r6
            goto L73
        L72:
            r4 = r5
        L73:
            if (r4 == 0) goto L76
            r1 = r3
        L76:
            java.util.List r3 = r0.f12114e
            java.util.Iterator r3 = r3.iterator()
        L7c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r3.next()
            com.google.gson.d0 r4 = (com.google.gson.d0) r4
            if (r5 != 0) goto L8e
            if (r4 != r1) goto L7c
            r5 = r6
            goto L7c
        L8e:
            com.google.gson.c0 r4 = r4.a(r0, r2)
            if (r4 == 0) goto L7c
            r0 = r4
            goto L9c
        L96:
            if (r5 != 0) goto La2
            com.google.gson.c0 r0 = r0.c(r2)
        L9c:
            r10.a = r0
        L9e:
            r0.c(r11, r12)
            return
        La2:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.e.c(zc.b, java.lang.Object):void");
    }
}
