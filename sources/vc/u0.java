package vc;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class u0 implements com.google.gson.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f26476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.c0 f26477d;

    public /* synthetic */ u0(Class cls, com.google.gson.c0 c0Var, int i10) {
        this.f26475b = i10;
        this.f26476c = cls;
        this.f26477d = c0Var;
    }

    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        int i10 = this.f26475b;
        Class cls = this.f26476c;
        switch (i10) {
            case 0:
                if (typeToken.a != cls) {
                    return null;
                }
                return this.f26477d;
            default:
                Class<?> cls2 = typeToken.a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return new c(this, cls2);
        }
    }

    public final String toString() {
        int i10 = this.f26475b;
        com.google.gson.c0 c0Var = this.f26477d;
        Class cls = this.f26476c;
        switch (i10) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + c0Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + c0Var + "]";
        }
    }
}
