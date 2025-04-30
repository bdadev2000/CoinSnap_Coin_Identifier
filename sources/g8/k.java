package g8;

import a.AbstractC0325a;
import a5.C0398b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import u7.AbstractC2829t;
import u7.C2824o;
import u7.C2825p;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final l f20506a = new Object();

    public static final h a(Number number, String str) {
        return new h("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(str, -1)), 1);
    }

    public static final h b(c8.g gVar) {
        G7.j.e(gVar, "keyDescriptor");
        return new h("Value of type '" + gVar.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + gVar.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final h c(int i9, String str) {
        G7.j.e(str, "message");
        if (i9 >= 0) {
            str = "Unexpected JSON token at offset " + i9 + ": " + str;
        }
        return new h(str, 0);
    }

    public static final h d(CharSequence charSequence, int i9, String str) {
        G7.j.e(str, "message");
        G7.j.e(charSequence, "input");
        return c(i9, str + "\nJSON input: " + ((Object) l(charSequence, i9)));
    }

    public static final Map e(c8.g gVar) {
        Object obj;
        String[] names;
        G7.j.e(gVar, "<this>");
        int f9 = gVar.f();
        ConcurrentHashMap concurrentHashMap = null;
        for (int i9 = 0; i9 < f9; i9++) {
            List i10 = gVar.i(i9);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : i10) {
                if (obj2 instanceof f8.s) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() == 1) {
                obj = arrayList.get(0);
            } else {
                obj = null;
            }
            f8.s sVar = (f8.s) obj;
            if (sVar != null && (names = sVar.names()) != null) {
                for (String str : names) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap(gVar.f());
                    }
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, Integer.valueOf(i9));
                    } else {
                        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("The suggested name '", str, "' for property ");
                        n2.append(gVar.g(i9));
                        n2.append(" is already one of the names for property ");
                        n2.append(gVar.g(((Number) AbstractC2829t.W(concurrentHashMap, str)).intValue()));
                        n2.append(" in ");
                        n2.append(gVar);
                        String sb = n2.toString();
                        G7.j.e(sb, "message");
                        throw new IllegalArgumentException(sb);
                    }
                }
            }
        }
        if (concurrentHashMap == null) {
            return C2825p.b;
        }
        return concurrentHashMap;
    }

    public static final c8.g f(c8.g gVar, C0398b c0398b) {
        G7.j.e(gVar, "<this>");
        G7.j.e(c0398b, "module");
        if (G7.j.a(gVar.getKind(), c8.k.f5451d)) {
            M7.b g9 = AbstractC0325a.g(gVar);
            if (g9 != null) {
                c0398b.t(g9, C2824o.b);
                return gVar;
            }
            return gVar;
        }
        if (gVar.h()) {
            return f(gVar.j(0), c0398b);
        }
        return gVar;
    }

    public static final byte g(char c9) {
        if (c9 < '~') {
            return d.b[c9];
        }
        return (byte) 0;
    }

    public static final String h(c8.g gVar, f8.b bVar) {
        G7.j.e(gVar, "<this>");
        G7.j.e(bVar, "json");
        for (Annotation annotation : gVar.e()) {
            if (annotation instanceof f8.g) {
                return ((f8.g) annotation).discriminator();
            }
        }
        return bVar.f20370a.f20393j;
    }

    public static final Object i(f8.i iVar, a8.b bVar) {
        String str;
        f8.y yVar;
        G7.j.e(iVar, "<this>");
        G7.j.e(bVar, "deserializer");
        if ((bVar instanceof a8.f) && !iVar.d().f20370a.f20392i) {
            String h6 = h(bVar.getDescriptor(), iVar.d());
            f8.j l = iVar.l();
            c8.g descriptor = bVar.getDescriptor();
            if (l instanceof f8.v) {
                f8.v vVar = (f8.v) l;
                f8.j jVar = (f8.j) vVar.get(h6);
                String str2 = null;
                if (jVar != null) {
                    if (jVar instanceof f8.y) {
                        yVar = (f8.y) jVar;
                    } else {
                        yVar = null;
                    }
                    if (yVar != null) {
                        str2 = yVar.b();
                    } else {
                        C2.m.l(jVar, "JsonPrimitive");
                        throw null;
                    }
                }
                ((a8.f) bVar).a(iVar);
                if (str2 == null) {
                    str = "missing class discriminator ('null')";
                } else {
                    str = "class discriminator '" + str2 + '\'';
                }
                throw d(vVar.toString(), -1, AbstractC2914a.d("Polymorphic serializer was not found for ", str));
            }
            throw c(-1, "Expected " + G7.s.a(f8.v.class) + " as the serialized body of " + descriptor.a() + ", but had " + G7.s.a(l.getClass()));
        }
        return bVar.deserialize(iVar);
    }

    public static final int j(c8.g gVar, f8.b bVar, String str) {
        G7.j.e(gVar, "<this>");
        G7.j.e(bVar, "json");
        G7.j.e(str, "name");
        int d2 = gVar.d(str);
        if (d2 != -3) {
            return d2;
        }
        if (!bVar.f20370a.l) {
            return d2;
        }
        K2.b bVar2 = bVar.f20371c;
        bVar2.getClass();
        l lVar = f20506a;
        Object a6 = bVar2.a(gVar);
        if (a6 == null) {
            a6 = e(gVar);
            ConcurrentHashMap concurrentHashMap = bVar2.f1645a;
            Object obj = concurrentHashMap.get(gVar);
            if (obj == null) {
                obj = new ConcurrentHashMap(1);
                concurrentHashMap.put(gVar, obj);
            }
            ((Map) obj).put(lVar, a6);
        }
        Integer num = (Integer) ((Map) a6).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int k(c8.g gVar, f8.b bVar, String str, String str2) {
        G7.j.e(gVar, "<this>");
        G7.j.e(bVar, "json");
        G7.j.e(str, "name");
        G7.j.e(str2, "suffix");
        int j7 = j(gVar, bVar, str);
        if (j7 != -3) {
            return j7;
        }
        throw new IllegalArgumentException(gVar.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final CharSequence l(CharSequence charSequence, int i9) {
        String str;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i9 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i10 = i9 - 30;
        int i11 = i9 + 30;
        if (i10 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i11 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder b = AbstractC2965e.b(str);
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (i11 > length2) {
            i11 = length2;
        }
        b.append(charSequence.subSequence(i10, i11).toString());
        b.append(str2);
        return b.toString();
    }

    public static final int m(c8.g gVar, f8.b bVar) {
        G7.j.e(bVar, "<this>");
        G7.j.e(gVar, CampaignEx.JSON_KEY_DESC);
        com.bumptech.glide.c kind = gVar.getKind();
        if (kind instanceof c8.d) {
            return 4;
        }
        if (!G7.j.a(kind, c8.l.f5454e)) {
            if (G7.j.a(kind, c8.l.f5455f)) {
                c8.g f9 = f(gVar.j(0), bVar.b);
                com.bumptech.glide.c kind2 = f9.getKind();
                if (!(kind2 instanceof c8.f) && !G7.j.a(kind2, c8.k.f5452e)) {
                    if (!bVar.f20370a.f20387d) {
                        throw b(f9);
                    }
                } else {
                    return 3;
                }
            } else {
                return 1;
            }
        }
        return 2;
    }

    public static final void n(U7.k kVar, Number number) {
        G7.j.e(kVar, "<this>");
        U7.k.r(kVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String o(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(str2, -1));
    }
}
