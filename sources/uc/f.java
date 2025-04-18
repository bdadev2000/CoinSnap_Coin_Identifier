package uc;

import com.google.gson.c0;
import com.google.gson.d0;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f implements d0, Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public static final f f25759h = new f();

    /* renamed from: b, reason: collision with root package name */
    public final double f25760b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    public final int f25761c = 136;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25762d = true;

    /* renamed from: f, reason: collision with root package name */
    public final List f25763f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final List f25764g = Collections.emptyList();

    @Override // com.google.gson.d0
    public final c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        Class cls = typeToken.a;
        boolean b3 = b(cls, true);
        boolean b10 = b(cls, false);
        if (!b3 && !b10) {
            return null;
        }
        return new e(this, b10, b3, nVar, typeToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Class r5, boolean r6) {
        /*
            r4 = this;
            double r0 = r4.f25760b
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L20
            java.lang.Class<tc.c> r0 = tc.c.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            tc.c r0 = (tc.c) r0
            java.lang.Class<tc.d> r2 = tc.d.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            tc.d r2 = (tc.d) r2
            boolean r0 = r4.c(r0, r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            boolean r0 = r4.f25762d
            r2 = 0
            if (r0 != 0) goto L3d
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L39
            s.a r0 = xc.c.a
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L39
            r0 = r1
            goto L3a
        L39:
            r0 = r2
        L3a:
            if (r0 == 0) goto L3d
            return r1
        L3d:
            if (r6 != 0) goto L65
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L65
            s.a r0 = xc.c.a
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L61
            boolean r0 = r5.isAnonymousClass()
            if (r0 != 0) goto L5f
            boolean r5 = r5.isLocalClass()
            if (r5 == 0) goto L61
        L5f:
            r5 = r1
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L65
            return r1
        L65:
            if (r6 == 0) goto L6a
            java.util.List r5 = r4.f25763f
            goto L6c
        L6a:
            java.util.List r5 = r4.f25764g
        L6c:
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L77
            return r2
        L77:
            java.lang.Object r5 = r5.next()
            a4.j.t(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.f.b(java.lang.Class, boolean):boolean");
    }

    public final boolean c(tc.c cVar, tc.d dVar) {
        boolean z10;
        boolean z11;
        double d10 = this.f25760b;
        if (cVar != null && d10 < cVar.value()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (dVar != null && d10 >= dVar.value()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
