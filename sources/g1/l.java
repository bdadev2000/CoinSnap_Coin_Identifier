package g1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30622a = b(Throwable.class, -1);

    static {
        try {
            int i2 = m.f30623a;
            h0 h0Var = h0.f30614g;
        } catch (Throwable unused) {
            h0 h0Var2 = h0.f30614g;
        }
    }

    public static final q0.l a(Class cls) {
        Object obj;
        q0.l lVar;
        d0.k kVar;
        k kVar2 = k.f30621a;
        int i2 = 0;
        if (f30622a != b(cls, 0)) {
            return kVar2;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i3];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            int i4 = 7;
            if (length2 != 0) {
                int i5 = 1;
                int i6 = 2;
                if (length2 != 1) {
                    kVar = length2 != 2 ? new d0.k(null, -1) : (p0.a.g(parameterTypes[0], String.class) && p0.a.g(parameterTypes[1], Throwable.class)) ? new d0.k(new i.i(new j(constructor, i2), i4), 3) : new d0.k(null, -1);
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    kVar = p0.a.g(cls2, String.class) ? new d0.k(new i.i(new j(constructor, i5), i4), 2) : p0.a.g(cls2, Throwable.class) ? new d0.k(new i.i(new j(constructor, i6), i4), 1) : new d0.k(null, -1);
                }
            } else {
                kVar = new d0.k(new i.i(new j(constructor, 3), i4), 0);
            }
            arrayList.add(kVar);
            i3++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((d0.k) obj).f30135b).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((d0.k) next).f30135b).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        d0.k kVar3 = (d0.k) obj;
        return (kVar3 == null || (lVar = (q0.l) kVar3.f30134a) == null) ? kVar2 : lVar;
    }

    public static final int b(Class cls, int i2) {
        Object d;
        p0.a.s(cls, "<this>");
        kotlin.jvm.internal.g0.a(cls);
        int i3 = 0;
        do {
            try {
                int length = cls.getDeclaredFields().length;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (!Modifier.isStatic(r2[i5].getModifiers())) {
                        i4++;
                    }
                }
                i3 += i4;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                d = kotlin.jvm.internal.q.d(th);
            }
        } while (cls != null);
        d = Integer.valueOf(i3);
        Object valueOf = Integer.valueOf(i2);
        if (d instanceof d0.m) {
            d = valueOf;
        }
        return ((Number) d).intValue();
    }
}
