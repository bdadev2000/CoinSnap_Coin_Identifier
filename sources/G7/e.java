package G7;

import com.adjust.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t7.C2720i;
import u7.AbstractC2817h;
import u7.AbstractC2818i;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public final class e implements M7.b, d {
    public static final Map b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1327c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f1328d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1329a;

    static {
        List B5 = AbstractC2817h.B(F7.a.class, F7.l.class, F7.p.class, F7.q.class, F7.r.class, F7.s.class, F7.t.class, F7.u.class, F7.v.class, F7.w.class, F7.b.class, F7.c.class, F7.d.class, F7.e.class, F7.f.class, F7.g.class, F7.h.class, F7.i.class, F7.j.class, F7.k.class, F7.m.class, F7.n.class, F7.o.class);
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(B5, 10));
        int i9 = 0;
        for (Object obj : B5) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                arrayList.add(new C2720i((Class) obj, Integer.valueOf(i9)));
                i9 = i10;
            } else {
                AbstractC2817h.D();
                throw null;
            }
        }
        b = AbstractC2829t.b0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
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
        hashMap3.put("java.lang.String", "kotlin.String");
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
        j.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb.append(O7.g.Y(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f1327c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2829t.Y(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, O7.g.Y(str2, str2));
        }
        f1328d = linkedHashMap;
    }

    public e(Class cls) {
        j.e(cls, "jClass");
        this.f1329a = cls;
    }

    @Override // G7.d
    public final Class a() {
        return this.f1329a;
    }

    public final String b() {
        String str;
        Class cls = this.f1329a;
        j.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return O7.g.X(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return O7.g.X(simpleName, enclosingConstructor.getName() + '$');
            }
            int I5 = O7.g.I(simpleName, '$', 0, false, 6);
            if (I5 == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(I5 + 1, simpleName.length());
            j.d(substring, "substring(...)");
            return substring;
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f1328d;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && com.facebook.appevents.g.o(this).equals(com.facebook.appevents.g.o((M7.b) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return com.facebook.appevents.g.o(this).hashCode();
    }

    public final String toString() {
        return this.f1329a.toString() + " (Kotlin reflection is not available)";
    }
}
