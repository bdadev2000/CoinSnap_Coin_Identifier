package vc;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class v implements com.google.gson.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.r f26478b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.i f26479c;

    /* renamed from: d, reason: collision with root package name */
    public final uc.f f26480d;

    /* renamed from: f, reason: collision with root package name */
    public final j f26481f;

    /* renamed from: g, reason: collision with root package name */
    public final List f26482g;

    public v(com.bumptech.glide.manager.r rVar, com.google.gson.a aVar, uc.f fVar, j jVar, List list) {
        this.f26478b = rVar;
        this.f26479c = aVar;
        this.f26480d = fVar;
        this.f26481f = jVar;
        this.f26482g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (uc.q.a.a(obj, accessibleObject)) {
        } else {
            throw new com.google.gson.q(eb.j.k(xc.c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + xc.c.c(field) + " and " + xc.c.c(field2) + "\nSee " + c6.c.i("duplicate-fields"));
    }

    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        boolean z10;
        Class cls = typeToken.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        s.a aVar = xc.c.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new com.google.gson.k(this, 2);
        }
        c6.c.p(this.f26482g);
        if (xc.c.a.m(cls)) {
            return new u(cls, d(nVar, typeToken, cls, true));
        }
        return new s(this.f26478b.g(typeToken), d(nVar, typeToken, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b4  */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final vc.t d(com.google.gson.n r31, com.google.gson.reflect.TypeToken r32, java.lang.Class r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.v.d(com.google.gson.n, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):vc.t");
    }

    public final boolean e(Field field, boolean z10) {
        List list;
        boolean z11;
        uc.f fVar = this.f26480d;
        fVar.getClass();
        if ((field.getModifiers() & fVar.f25761c) != 0 || ((fVar.f25760b != -1.0d && !fVar.c((tc.c) field.getAnnotation(tc.c.class), (tc.d) field.getAnnotation(tc.d.class))) || field.isSynthetic() || fVar.b(field.getType(), z10))) {
            z11 = true;
        } else {
            if (z10) {
                list = fVar.f25763f;
            } else {
                list = fVar.f25764g;
            }
            if (!list.isEmpty()) {
                new hb.d(field);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    a4.j.t(it.next());
                    throw null;
                }
            }
            z11 = false;
        }
        return !z11;
    }
}
