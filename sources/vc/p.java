package vc;

import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class p extends com.google.gson.c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d f26458c = new d(com.google.gson.a0.f12097b, 2);
    public final com.google.gson.n a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.b0 f26459b;

    public p(com.google.gson.n nVar, com.google.gson.b0 b0Var) {
        this.a = nVar;
        this.f26459b = b0Var;
    }

    public static Serializable e(zc.a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 2) {
                    return null;
                }
                aVar.g();
                return new uc.m(true);
            }
            aVar.d();
            return new ArrayList();
        }
        throw null;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        String str;
        boolean z10;
        Serializable serializable;
        int b02 = aVar.b0();
        Object e2 = e(aVar, b02);
        if (e2 == null) {
            return d(aVar, b02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.t()) {
                if (e2 instanceof Map) {
                    str = aVar.V();
                } else {
                    str = null;
                }
                int b03 = aVar.b0();
                Serializable e10 = e(aVar, b03);
                if (e10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e10 == null) {
                    serializable = d(aVar, b03);
                } else {
                    serializable = e10;
                }
                if (e2 instanceof List) {
                    ((List) e2).add(serializable);
                } else {
                    ((Map) e2).put(str, serializable);
                }
                if (z10) {
                    arrayDeque.addLast(e2);
                    e2 = serializable;
                }
            } else {
                if (e2 instanceof List) {
                    aVar.p();
                } else {
                    aVar.q();
                }
                if (arrayDeque.isEmpty()) {
                    return e2;
                }
                e2 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        if (obj == null) {
            bVar.t();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.n nVar = this.a;
        nVar.getClass();
        com.google.gson.c0 c10 = nVar.c(new TypeToken(cls));
        if (c10 instanceof p) {
            bVar.j();
            bVar.q();
        } else {
            c10.c(bVar, obj);
        }
    }

    public final Serializable d(zc.a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 == 8) {
                            aVar.X();
                            return null;
                        }
                        throw new IllegalStateException("Unexpected token: ".concat(vd.e.l(i10)));
                    }
                    return Boolean.valueOf(aVar.w());
                }
                return this.f26459b.a(aVar);
            }
            return aVar.Z();
        }
        throw null;
    }
}
