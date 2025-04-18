package vc;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r0 extends com.google.gson.c0 {
    public static com.google.gson.p d(zc.a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 5) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 == 8) {
                            aVar.X();
                            return com.google.gson.r.f12122b;
                        }
                        throw new IllegalStateException("Unexpected token: ".concat(vd.e.l(i10)));
                    }
                    return new com.google.gson.u(Boolean.valueOf(aVar.w()));
                }
                return new com.google.gson.u(new uc.h(aVar.Z()));
            }
            return new com.google.gson.u(aVar.Z());
        }
        throw null;
    }

    public static com.google.gson.p e(zc.a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 2) {
                    return null;
                }
                aVar.g();
                return new com.google.gson.s();
            }
            aVar.d();
            return new com.google.gson.o();
        }
        throw null;
    }

    public static void f(com.google.gson.p pVar, zc.b bVar) {
        boolean parseBoolean;
        if (pVar != null && !(pVar instanceof com.google.gson.r)) {
            boolean z10 = pVar instanceof com.google.gson.u;
            if (z10) {
                if (z10) {
                    com.google.gson.u uVar = (com.google.gson.u) pVar;
                    Serializable serializable = uVar.f12126b;
                    if (serializable instanceof Number) {
                        bVar.W(uVar.b());
                        return;
                    }
                    if (serializable instanceof Boolean) {
                        if (serializable instanceof Boolean) {
                            parseBoolean = ((Boolean) serializable).booleanValue();
                        } else {
                            parseBoolean = Boolean.parseBoolean(uVar.c());
                        }
                        bVar.Y(parseBoolean);
                        return;
                    }
                    bVar.X(uVar.c());
                    return;
                }
                throw new IllegalStateException("Not a JSON Primitive: " + pVar);
            }
            boolean z11 = pVar instanceof com.google.gson.o;
            if (z11) {
                bVar.g();
                if (z11) {
                    Iterator it = ((com.google.gson.o) pVar).iterator();
                    while (it.hasNext()) {
                        f((com.google.gson.p) it.next(), bVar);
                    }
                    bVar.p();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + pVar);
            }
            boolean z12 = pVar instanceof com.google.gson.s;
            if (z12) {
                bVar.j();
                if (z12) {
                    Iterator it2 = ((uc.j) ((com.google.gson.s) pVar).f12125b.entrySet()).iterator();
                    while (((uc.k) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((uc.i) it2).next();
                        bVar.r((String) entry.getKey());
                        f((com.google.gson.p) entry.getValue(), bVar);
                    }
                    bVar.q();
                    return;
                }
                throw new IllegalStateException("Not a JSON Object: " + pVar);
            }
            throw new IllegalArgumentException("Couldn't write " + pVar.getClass());
        }
        bVar.t();
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        String str;
        boolean z10;
        com.google.gson.p pVar;
        int b02 = aVar.b0();
        com.google.gson.p e2 = e(aVar, b02);
        if (e2 == null) {
            return d(aVar, b02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.t()) {
                if (e2 instanceof com.google.gson.s) {
                    str = aVar.V();
                } else {
                    str = null;
                }
                int b03 = aVar.b0();
                com.google.gson.p e10 = e(aVar, b03);
                if (e10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e10 == null) {
                    pVar = d(aVar, b03);
                } else {
                    pVar = e10;
                }
                if (e2 instanceof com.google.gson.o) {
                    ((com.google.gson.o) e2).f12121b.add(pVar);
                } else {
                    ((com.google.gson.s) e2).f12125b.put(str, pVar);
                }
                if (z10) {
                    arrayDeque.addLast(e2);
                    e2 = pVar;
                }
            } else {
                if (e2 instanceof com.google.gson.o) {
                    aVar.p();
                } else {
                    aVar.q();
                }
                if (arrayDeque.isEmpty()) {
                    return e2;
                }
                e2 = (com.google.gson.p) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.c0
    public final /* bridge */ /* synthetic */ void c(zc.b bVar, Object obj) {
        f((com.google.gson.p) obj, bVar);
    }
}
