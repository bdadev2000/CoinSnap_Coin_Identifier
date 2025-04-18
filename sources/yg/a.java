package yg;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class a implements k {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static void b(Type type, Class cls) {
        Class<?> z10 = a6.k.z(type);
        if (!cls.isAssignableFrom(z10)) {
            return;
        }
        throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + z10.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
    }

    public final l a(Type type, Set set, a0 a0Var) {
        l lVar;
        l lVar2;
        Class<?> cls;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type componentType;
        p6.a cVar;
        Class cls2;
        boolean z10;
        Field[] fieldArr;
        j jVar;
        Class z11;
        Type[] actualTypeArguments;
        Type type2 = type;
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                if (type2 instanceof GenericArrayType) {
                    componentType = ((GenericArrayType) type2).getGenericComponentType();
                } else {
                    componentType = type2 instanceof Class ? ((Class) type2).getComponentType() : null;
                }
                if (componentType == null || !set.isEmpty()) {
                    return null;
                }
                Class z12 = a6.k.z(componentType);
                a0Var.getClass();
                return new b(z12, a0Var.a(componentType, zg.b.a, null)).nullSafe();
            case 1:
                if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                    return null;
                }
                Class z13 = a6.k.z(type);
                if (z13.isInterface() || z13.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (zg.b.d(z13)) {
                    b(type2, List.class);
                    b(type2, Set.class);
                    b(type2, Map.class);
                    b(type2, Collection.class);
                    String str = "Platform " + z13;
                    if (type2 instanceof ParameterizedType) {
                        str = str + " in " + type2;
                    }
                    throw new IllegalArgumentException(eb.j.k(str, " requires explicit JsonAdapter to be registered"));
                }
                if (!z13.isAnonymousClass()) {
                    if (!z13.isLocalClass()) {
                        if (z13.getEnclosingClass() != null && !Modifier.isStatic(z13.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(z13.getName()));
                        }
                        if (!Modifier.isAbstract(z13.getModifiers())) {
                            Class<? extends Annotation> cls3 = zg.b.f28765d;
                            if (!(cls3 != null && z13.isAnnotationPresent(cls3))) {
                                try {
                                    try {
                                        try {
                                            try {
                                                Constructor declaredConstructor2 = z13.getDeclaredConstructor(new Class[0]);
                                                declaredConstructor2.setAccessible(true);
                                                cVar = new c(declaredConstructor2, z13, i10);
                                            } catch (IllegalAccessException unused) {
                                                throw new AssertionError();
                                            } catch (NoSuchMethodException unused2) {
                                                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                                declaredMethod.setAccessible(true);
                                                cVar = new c(declaredMethod, z13, i11);
                                            } catch (InvocationTargetException e2) {
                                                zg.b.g(e2);
                                                throw null;
                                            }
                                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                            declaredMethod2.setAccessible(true);
                                            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                                            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                            declaredMethod3.setAccessible(true);
                                            cVar = new e(declaredMethod3, z13, intValue);
                                        } catch (IllegalAccessException unused4) {
                                            throw new AssertionError();
                                        }
                                    } catch (Exception unused5) {
                                        throw new IllegalArgumentException("cannot construct instances of ".concat(z13.getName()));
                                    }
                                } catch (NoSuchMethodException unused6) {
                                    Class<?> cls4 = Class.forName("sun.misc.Unsafe");
                                    Field declaredField = cls4.getDeclaredField("theUnsafe");
                                    declaredField.setAccessible(true);
                                    cVar = new d(cls4.getMethod("allocateInstance", Class.class), declaredField.get(null), z13);
                                }
                                TreeMap treeMap = new TreeMap();
                                while (type2 != Object.class) {
                                    Class z14 = a6.k.z(type2);
                                    boolean d10 = zg.b.d(z14);
                                    Field[] declaredFields = z14.getDeclaredFields();
                                    int length = declaredFields.length;
                                    int i12 = i10;
                                    while (i10 < length) {
                                        Field field = declaredFields[i10];
                                        int modifiers = field.getModifiers();
                                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !d10)) {
                                            i12 = i11;
                                        }
                                        if (i12 != 0 && ((jVar = (j) field.getAnnotation(j.class)) == null || !jVar.ignore())) {
                                            Type f10 = zg.b.f(type2, z14, field.getGenericType(), new LinkedHashSet());
                                            Annotation[] annotations = field.getAnnotations();
                                            int length2 = annotations.length;
                                            LinkedHashSet linkedHashSet = null;
                                            int i13 = 0;
                                            while (i13 < length2) {
                                                Class cls5 = z14;
                                                Annotation annotation = annotations[i13];
                                                boolean z15 = d10;
                                                Field[] fieldArr2 = declaredFields;
                                                if (annotation.annotationType().isAnnotationPresent(n.class)) {
                                                    if (linkedHashSet == null) {
                                                        linkedHashSet = new LinkedHashSet();
                                                    }
                                                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                                                    linkedHashSet2.add(annotation);
                                                    linkedHashSet = linkedHashSet2;
                                                }
                                                i13++;
                                                z14 = cls5;
                                                d10 = z15;
                                                declaredFields = fieldArr2;
                                            }
                                            cls2 = z14;
                                            z10 = d10;
                                            fieldArr = declaredFields;
                                            Set unmodifiableSet = linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : zg.b.a;
                                            String name = field.getName();
                                            l a = a0Var.a(f10, unmodifiableSet, name);
                                            field.setAccessible(true);
                                            if (jVar != null) {
                                                String name2 = jVar.name();
                                                if (!"\u0000".equals(name2)) {
                                                    name = name2;
                                                }
                                            }
                                            f fVar = (f) treeMap.put(name, new f(name, field, a));
                                            if (fVar != null) {
                                                throw new IllegalArgumentException("Conflicting fields:\n    " + fVar.f28235b + "\n    " + field);
                                            }
                                        } else {
                                            cls2 = z14;
                                            z10 = d10;
                                            fieldArr = declaredFields;
                                        }
                                        i10++;
                                        i12 = 0;
                                        i11 = 1;
                                        z14 = cls2;
                                        d10 = z10;
                                        declaredFields = fieldArr;
                                    }
                                    Class z16 = a6.k.z(type2);
                                    type2 = zg.b.f(type2, z16, z16.getGenericSuperclass(), new LinkedHashSet());
                                    i10 = 0;
                                    i11 = 1;
                                }
                                return new g(cVar, treeMap).nullSafe();
                            }
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + z13.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        }
                        throw new IllegalArgumentException("Cannot serialize abstract class ".concat(z13.getName()));
                    }
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(z13.getName()));
                }
                throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(z13.getName()));
            case 2:
                Class z17 = a6.k.z(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (z17 == List.class || z17 == Collection.class) {
                    Type l10 = a6.k.l(type);
                    a0Var.getClass();
                    return new h(a0Var.a(l10, zg.b.a, null), i10).nullSafe();
                }
                if (z17 != Set.class) {
                    return null;
                }
                Type l11 = a6.k.l(type);
                a0Var.getClass();
                return new h(a0Var.a(l11, zg.b.a, null), i11).nullSafe();
            case 3:
                if (!set.isEmpty() || (z11 = a6.k.z(type)) != Map.class) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else if (Map.class.isAssignableFrom(z11)) {
                    Type f11 = zg.b.f(type2, z11, zg.b.c(type2, z11, Map.class), new LinkedHashSet());
                    actualTypeArguments = f11 instanceof ParameterizedType ? ((ParameterizedType) f11).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                } else {
                    throw new IllegalArgumentException();
                }
                return new x(a0Var, actualTypeArguments[0], actualTypeArguments[1]).nullSafe();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls6 = Boolean.TYPE;
                c0 c0Var = com.bumptech.glide.d.f9626f;
                if (type2 == cls6) {
                    return c0Var;
                }
                Class cls7 = Byte.TYPE;
                c0 c0Var2 = com.bumptech.glide.d.f9627g;
                if (type2 == cls7) {
                    return c0Var2;
                }
                Class cls8 = Character.TYPE;
                c0 c0Var3 = com.bumptech.glide.d.f9628h;
                if (type2 == cls8) {
                    return c0Var3;
                }
                Class cls9 = Double.TYPE;
                c0 c0Var4 = com.bumptech.glide.d.f9629i;
                if (type2 == cls9) {
                    return c0Var4;
                }
                Class cls10 = Float.TYPE;
                c0 c0Var5 = com.bumptech.glide.d.f9630j;
                if (type2 == cls10) {
                    return c0Var5;
                }
                Class cls11 = Integer.TYPE;
                c0 c0Var6 = com.bumptech.glide.d.f9631k;
                if (type2 == cls11) {
                    return c0Var6;
                }
                Class cls12 = Long.TYPE;
                c0 c0Var7 = com.bumptech.glide.d.f9632l;
                if (type2 == cls12) {
                    return c0Var7;
                }
                Class cls13 = Short.TYPE;
                c0 c0Var8 = com.bumptech.glide.d.f9633m;
                if (type2 == cls13) {
                    return c0Var8;
                }
                if (type2 == Boolean.class) {
                    return c0Var.nullSafe();
                }
                if (type2 == Byte.class) {
                    return c0Var2.nullSafe();
                }
                if (type2 == Character.class) {
                    return c0Var3.nullSafe();
                }
                if (type2 == Double.class) {
                    return c0Var4.nullSafe();
                }
                if (type2 == Float.class) {
                    return c0Var5.nullSafe();
                }
                if (type2 == Integer.class) {
                    return c0Var6.nullSafe();
                }
                if (type2 == Long.class) {
                    return c0Var7.nullSafe();
                }
                if (type2 == Short.class) {
                    return c0Var8.nullSafe();
                }
                if (type2 == String.class) {
                    return com.bumptech.glide.d.f9634n.nullSafe();
                }
                if (type2 == Object.class) {
                    return new e0(a0Var).nullSafe();
                }
                Class z18 = a6.k.z(type);
                Set set2 = zg.b.a;
                m mVar = (m) z18.getAnnotation(m.class);
                if (mVar == null || !mVar.generateAdapter()) {
                    lVar = null;
                    lVar2 = null;
                } else {
                    try {
                        try {
                            cls = Class.forName(z18.getName().replace("$", "_") + "JsonAdapter", true, z18.getClassLoader());
                        } catch (ClassNotFoundException e10) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type2, e10);
                        } catch (IllegalAccessException e11) {
                            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type2, e11);
                        } catch (InstantiationException e12) {
                            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type2, e12);
                        } catch (InvocationTargetException e13) {
                            zg.b.g(e13);
                            throw null;
                        }
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        cls = null;
                    }
                    try {
                        if (type2 instanceof ParameterizedType) {
                            Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                            try {
                                declaredConstructor = cls.getDeclaredConstructor(a0.class, Type[].class);
                                objArr = new Object[]{a0Var, actualTypeArguments2};
                            } catch (NoSuchMethodException unused7) {
                                objArr = new Object[]{actualTypeArguments2};
                                declaredConstructor = cls.getDeclaredConstructor(Type[].class);
                            }
                        } else {
                            try {
                                objArr = new Object[]{a0Var};
                                declaredConstructor = cls.getDeclaredConstructor(a0.class);
                            } catch (NoSuchMethodException unused8) {
                                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                                objArr = new Object[0];
                            }
                        }
                        declaredConstructor.setAccessible(true);
                        lVar2 = ((l) declaredConstructor.newInstance(objArr)).nullSafe();
                        lVar = null;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        if (!(type2 instanceof ParameterizedType) && cls.getTypeParameters().length != 0) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type2 + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                        }
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type2, e);
                    }
                }
                return lVar2 != null ? lVar2 : z18.isEnum() ? new d0(z18).nullSafe() : lVar;
        }
    }
}
