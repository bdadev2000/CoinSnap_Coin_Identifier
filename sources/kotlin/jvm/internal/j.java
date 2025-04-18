package kotlin.jvm.internal;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j implements x0.c, i {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f30933b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f30934c;
    public static final LinkedHashMap d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f30935a;

    static {
        int i2 = 0;
        List v2 = b1.f0.v(q0.a.class, q0.l.class, q0.p.class, q0.q.class, q0.r.class, q0.s.class, q0.t.class, q0.u.class, q0.v.class, q0.w.class, q0.b.class, q0.c.class, q0.d.class, q0.e.class, q0.f.class, q0.g.class, q0.h.class, q0.i.class, q0.j.class, q0.k.class, q0.m.class, q0.n.class, q0.o.class);
        ArrayList arrayList = new ArrayList(e0.q.M(v2, 10));
        for (Object obj : v2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b1.f0.D();
                throw null;
            }
            arrayList.add(new d0.k((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f30933b = e0.e0.w(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put(ImpressionLog.w, "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put(com.safedk.android.utils.k.e, "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        p0.a.r(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            p0.a.p(str);
            sb.append(z0.m.u1(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f30933b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f30934c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.g(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, z0.m.u1(str2, '.', str2));
        }
        d = linkedHashMap;
    }

    public j(Class cls) {
        p0.a.s(cls, "jClass");
        this.f30935a = cls;
    }

    @Override // kotlin.jvm.internal.i
    public final Class a() {
        return this.f30935a;
    }

    public final String b() {
        String str;
        Class cls = this.f30935a;
        p0.a.s(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap hashMap = f30934c;
        if (!isArray) {
            String str3 = (String) hashMap.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    public final String c() {
        String str;
        Class cls = this.f30935a;
        p0.a.s(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return z0.m.t1(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return z0.m.t1(simpleName, enclosingConstructor.getName() + '$');
        }
        int W0 = z0.m.W0(simpleName, '$', 0, false, 6);
        if (W0 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(W0 + 1, simpleName.length());
        p0.a.r(substring, "substring(...)");
        return substring;
    }

    public final boolean d(Object obj) {
        Class cls = this.f30935a;
        p0.a.s(cls, "jClass");
        Map map = f30933b;
        p0.a.q(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return e.r(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = p0.a.j0(g0.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && p0.a.g(p0.a.j0(this), p0.a.j0((x0.c) obj));
    }

    public final int hashCode() {
        return p0.a.j0(this).hashCode();
    }

    public final String toString() {
        return this.f30935a.toString() + " (Kotlin reflection is not available)";
    }
}
