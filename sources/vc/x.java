package vc;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class x extends com.google.gson.c0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26487b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26488c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26489d;

    public x(com.google.gson.n nVar, com.google.gson.c0 c0Var, Type type) {
        this.a = 0;
        this.f26487b = nVar;
        this.f26488c = c0Var;
        this.f26489d = type;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int i10 = this.a;
        Object obj = this.f26488c;
        switch (i10) {
            case 0:
                return ((com.google.gson.c0) obj).b(aVar);
            default:
                if (aVar.b0() == 9) {
                    aVar.X();
                    return null;
                }
                String Z = aVar.Z();
                Enum r02 = (Enum) ((Map) this.f26487b).get(Z);
                if (r02 == null) {
                    return (Enum) ((Map) obj).get(Z);
                }
                return r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if ((r2 instanceof vc.r) == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(zc.b r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.a
            java.lang.Object r1 = r4.f26489d
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L4d
        L8:
            java.lang.Object r0 = r4.f26488c
            com.google.gson.c0 r0 = (com.google.gson.c0) r0
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            if (r6 == 0) goto L1d
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 != 0) goto L18
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            if (r2 == 0) goto L1d
        L18:
            java.lang.Class r2 = r6.getClass()
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == r1) goto L49
            java.lang.Object r1 = r4.f26487b
            com.google.gson.n r1 = (com.google.gson.n) r1
            com.google.gson.reflect.TypeToken r3 = new com.google.gson.reflect.TypeToken
            r3.<init>(r2)
            com.google.gson.c0 r1 = r1.c(r3)
            boolean r2 = r1 instanceof vc.r
            if (r2 != 0) goto L32
            goto L48
        L32:
            r2 = r0
        L33:
            boolean r3 = r2 instanceof vc.w
            if (r3 == 0) goto L43
            r3 = r2
            vc.w r3 = (vc.w) r3
            com.google.gson.c0 r3 = r3.d()
            if (r3 != r2) goto L41
            goto L43
        L41:
            r2 = r3
            goto L33
        L43:
            boolean r2 = r2 instanceof vc.r
            if (r2 != 0) goto L48
            goto L49
        L48:
            r0 = r1
        L49:
            r0.c(r5, r6)
            return
        L4d:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto L53
            r6 = 0
            goto L5b
        L53:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L5b:
            r5.X(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.x.c(zc.b, java.lang.Object):void");
    }

    public x(Class cls) {
        this.a = 1;
        this.f26487b = new HashMap();
        this.f26488c = new HashMap();
        this.f26489d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new d1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                tc.b bVar = (tc.b) field.getAnnotation(tc.b.class);
                Object obj = this.f26487b;
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((Map) obj).put(str2, r42);
                    }
                }
                ((Map) obj).put(name, r42);
                ((Map) this.f26488c).put(str, r42);
                ((Map) this.f26489d).put(r42, name);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
