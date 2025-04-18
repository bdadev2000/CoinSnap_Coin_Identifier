package vc;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class v0 implements com.google.gson.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f26484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Class f26485d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.c0 f26486f;

    public /* synthetic */ v0(Class cls, Class cls2, com.google.gson.c0 c0Var, int i10) {
        this.f26483b = i10;
        this.f26484c = cls;
        this.f26485d = cls2;
        this.f26486f = c0Var;
    }

    @Override // com.google.gson.d0
    public final com.google.gson.c0 a(com.google.gson.n nVar, TypeToken typeToken) {
        int i10 = this.f26483b;
        Class cls = this.f26485d;
        com.google.gson.c0 c0Var = this.f26486f;
        Class cls2 = this.f26484c;
        switch (i10) {
            case 0:
                Class cls3 = typeToken.a;
                if (cls3 != cls2 && cls3 != cls) {
                    return null;
                }
                return c0Var;
            default:
                Class cls4 = typeToken.a;
                if (cls4 != cls2 && cls4 != cls) {
                    return null;
                }
                return c0Var;
        }
    }

    public final String toString() {
        int i10 = this.f26483b;
        com.google.gson.c0 c0Var = this.f26486f;
        Class cls = this.f26484c;
        Class cls2 = this.f26485d;
        switch (i10) {
            case 0:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + c0Var + "]";
            default:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + c0Var + "]";
        }
    }
}
