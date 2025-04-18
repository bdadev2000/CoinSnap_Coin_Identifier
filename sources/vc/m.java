package vc;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class m extends com.google.gson.c0 {
    public final x a;

    /* renamed from: b, reason: collision with root package name */
    public final x f26452b;

    /* renamed from: c, reason: collision with root package name */
    public final uc.n f26453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f26454d;

    public m(n nVar, com.google.gson.n nVar2, Type type, com.google.gson.c0 c0Var, Type type2, com.google.gson.c0 c0Var2, uc.n nVar3) {
        this.f26454d = nVar;
        this.a = new x(nVar2, c0Var, type);
        this.f26452b = new x(nVar2, c0Var2, type2);
        this.f26453c = nVar3;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int b02 = aVar.b0();
        if (b02 == 9) {
            aVar.X();
            return null;
        }
        Map map = (Map) this.f26453c.b();
        if (b02 == 1) {
            aVar.d();
            while (aVar.t()) {
                aVar.d();
                Object b3 = this.a.b(aVar);
                if (map.put(b3, this.f26452b.b(aVar)) == null) {
                    aVar.p();
                } else {
                    throw new com.google.gson.v(eb.j.j("duplicate key: ", b3));
                }
            }
            aVar.p();
        } else {
            aVar.g();
            while (aVar.t()) {
                wh.a0.f27010c.getClass();
                int i10 = aVar.f28721i;
                if (i10 == 0) {
                    i10 = aVar.k();
                }
                if (i10 == 13) {
                    aVar.f28721i = 9;
                } else if (i10 == 12) {
                    aVar.f28721i = 8;
                } else if (i10 == 14) {
                    aVar.f28721i = 10;
                } else {
                    throw aVar.k0("a name");
                }
                Object b10 = this.a.b(aVar);
                if (map.put(b10, this.f26452b.b(aVar)) != null) {
                    throw new com.google.gson.v(eb.j.j("duplicate key: ", b10));
                }
            }
            aVar.q();
        }
        return map;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String str;
        boolean parseBoolean;
        boolean z10;
        Map map = (Map) obj;
        if (map == null) {
            bVar.t();
            return;
        }
        boolean z11 = this.f26454d.f26456c;
        x xVar = this.f26452b;
        if (!z11) {
            bVar.j();
            for (Map.Entry entry : map.entrySet()) {
                bVar.r(String.valueOf(entry.getKey()));
                xVar.c(bVar, entry.getValue());
            }
            bVar.q();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i10 = 0;
        boolean z12 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            x xVar2 = this.a;
            xVar2.getClass();
            try {
                l lVar = new l();
                xVar2.c(lVar, key);
                ArrayList arrayList3 = lVar.f26449q;
                if (arrayList3.isEmpty()) {
                    com.google.gson.p pVar = lVar.f26451s;
                    arrayList.add(pVar);
                    arrayList2.add(entry2.getValue());
                    pVar.getClass();
                    if (!(pVar instanceof com.google.gson.o) && !(pVar instanceof com.google.gson.s)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 |= z10;
                } else {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
            } catch (IOException e2) {
                throw new com.google.gson.q(e2);
            }
        }
        if (z12) {
            bVar.g();
            int size = arrayList.size();
            while (i10 < size) {
                bVar.g();
                com.facebook.appevents.g.M((com.google.gson.p) arrayList.get(i10), bVar);
                xVar.c(bVar, arrayList2.get(i10));
                bVar.p();
                i10++;
            }
            bVar.p();
            return;
        }
        bVar.j();
        int size2 = arrayList.size();
        while (i10 < size2) {
            com.google.gson.p pVar2 = (com.google.gson.p) arrayList.get(i10);
            pVar2.getClass();
            boolean z13 = pVar2 instanceof com.google.gson.u;
            if (z13) {
                if (z13) {
                    com.google.gson.u uVar = (com.google.gson.u) pVar2;
                    Serializable serializable = uVar.f12126b;
                    if (serializable instanceof Number) {
                        str = String.valueOf(uVar.b());
                    } else if (serializable instanceof Boolean) {
                        if (serializable instanceof Boolean) {
                            parseBoolean = ((Boolean) serializable).booleanValue();
                        } else {
                            parseBoolean = Boolean.parseBoolean(uVar.c());
                        }
                        str = Boolean.toString(parseBoolean);
                    } else if (serializable instanceof String) {
                        str = uVar.c();
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw new IllegalStateException("Not a JSON Primitive: " + pVar2);
                }
            } else if (pVar2 instanceof com.google.gson.r) {
                str = AbstractJsonLexerKt.NULL;
            } else {
                throw new AssertionError();
            }
            bVar.r(str);
            xVar.c(bVar, arrayList2.get(i10));
            i10++;
        }
        bVar.q();
    }
}
