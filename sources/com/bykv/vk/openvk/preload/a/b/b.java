package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f12983a = new Type[0];

    /* loaded from: classes.dex */
    public static final class a implements Serializable, GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f12984a;

        public a(Type type) {
            this.f12984a = b.a(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && b.a(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f12984a;
        }

        public final int hashCode() {
            return this.f12984a.hashCode();
        }

        public final String toString() {
            return b.c(this.f12984a) + "[]";
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.a.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0057b implements Serializable, ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f12986a;
        private final Type b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f12987c;

        public C0057b(Type type, Type type2, Type... typeArr) {
            Type a6;
            boolean z8;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z9 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (type == null && !z8) {
                    z9 = false;
                }
                com.bykv.vk.openvk.preload.a.b.a.a(z9);
            }
            if (type == null) {
                a6 = null;
            } else {
                a6 = b.a(type);
            }
            this.f12986a = a6;
            this.b = b.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f12987c = typeArr2;
            int length = typeArr2.length;
            for (int i9 = 0; i9 < length; i9++) {
                com.bykv.vk.openvk.preload.a.b.a.a(this.f12987c[i9]);
                b.e(this.f12987c[i9]);
                Type[] typeArr3 = this.f12987c;
                typeArr3[i9] = b.a(typeArr3[i9]);
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && b.a(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f12987c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f12986a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f12987c) ^ this.b.hashCode()) ^ b.a((Object) this.f12986a);
        }

        public final String toString() {
            int length = this.f12987c.length;
            if (length == 0) {
                return b.c(this.b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.c(this.b));
            sb.append("<");
            sb.append(b.c(this.f12987c[0]));
            for (int i9 = 1; i9 < length; i9++) {
                sb.append(", ");
                sb.append(b.c(this.f12987c[i9]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Serializable, WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f12990a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z8;
            boolean z9;
            if (typeArr2.length <= 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            com.bykv.vk.openvk.preload.a.b.a.a(z8);
            if (typeArr.length == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            com.bykv.vk.openvk.preload.a.b.a.a(z9);
            if (typeArr2.length == 1) {
                com.bykv.vk.openvk.preload.a.b.a.a(typeArr2[0]);
                b.e(typeArr2[0]);
                com.bykv.vk.openvk.preload.a.b.a.a(typeArr[0] == Object.class);
                this.b = b.a(typeArr2[0]);
                this.f12990a = Object.class;
                return;
            }
            com.bykv.vk.openvk.preload.a.b.a.a(typeArr[0]);
            b.e(typeArr[0]);
            this.b = null;
            this.f12990a = b.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && b.a(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.b;
            if (type != null) {
                return new Type[]{type};
            }
            return b.f12983a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f12990a};
        }

        public final int hashCode() {
            int i9;
            Type type = this.b;
            if (type != null) {
                i9 = type.hashCode() + 31;
            } else {
                i9 = 1;
            }
            return i9 ^ (this.f12990a.hashCode() + 31);
        }

        public final String toString() {
            if (this.b != null) {
                return "? super " + b.c(this.b);
            }
            if (this.f12990a == Object.class) {
                return "?";
            }
            return "? extends " + b.c(this.f12990a);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0057b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Class<?> b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                com.bykv.vk.openvk.preload.a.b.a.a(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            } else {
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
            }
        }
        return (Class) type;
    }

    public static String c(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static Type d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static void e(Type type) {
        boolean z8;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z8 = false;
        } else {
            z8 = true;
        }
        com.bykv.vk.openvk.preload.a.b.a.a(z8);
    }

    private static GenericArrayType f(Type type) {
        return new a(type);
    }

    public static boolean a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof WildcardType) {
                    if (!(type2 instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.bykv.vk.openvk.preload.a.b.a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static Type a(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i9 = 0; i9 < length; i9++) {
                    Class<?> cls3 = interfaces[i9];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i9];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i9];
                        superclass = interfaces[i9];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    public static Type a(Type type, Class<?> cls) {
        Type b = b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:2:0x0002->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.b.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }
}
