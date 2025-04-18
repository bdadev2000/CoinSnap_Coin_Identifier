package vc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class u extends r {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f26471e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f26472b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f26473c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f26474d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f26471e = hashMap;
    }

    public u(Class cls, t tVar) {
        super(tVar);
        this.f26474d = new HashMap();
        s.a aVar = xc.c.a;
        Constructor j3 = aVar.j(cls);
        this.f26472b = j3;
        xc.c.f(j3);
        String[] l10 = aVar.l(cls);
        for (int i10 = 0; i10 < l10.length; i10++) {
            this.f26474d.put(l10[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f26472b.getParameterTypes();
        this.f26473c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f26473c[i11] = f26471e.get(parameterTypes[i11]);
        }
    }

    @Override // vc.r
    public final Object d() {
        return (Object[]) this.f26473c.clone();
    }

    @Override // vc.r
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f26472b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            s.a aVar = xc.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + xc.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + xc.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + xc.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // vc.r
    public final void f(Object obj, zc.a aVar, q qVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f26474d;
        String str = qVar.f26461c;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object b3 = qVar.f26465g.b(aVar);
            if (b3 == null && qVar.f26466h) {
                StringBuilder o10 = a4.j.o("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                o10.append(aVar.s(false));
                throw new com.google.gson.t(o10.toString());
            }
            objArr[intValue] = b3;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + xc.c.b(this.f26472b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
