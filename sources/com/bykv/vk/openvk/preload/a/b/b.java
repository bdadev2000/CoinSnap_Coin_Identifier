package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class b {
    static final Type[] a = new Type[0];

    /* loaded from: classes.dex */
    public static final class a implements Serializable, GenericArrayType {
        private final Type a;

        public a(Type type) {
            this.a = b.a(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && b.a(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return b.c(this.a) + "[]";
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.a.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0049b implements Serializable, ParameterizedType {
        private final Type a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f9840b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f9841c;

        public C0049b(Type type, Type type2, Type... typeArr) {
            Type a;
            boolean z10;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z11 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (type == null && !z10) {
                    z11 = false;
                }
                com.bykv.vk.openvk.preload.a.b.a.a(z11);
            }
            if (type == null) {
                a = null;
            } else {
                a = b.a(type);
            }
            this.a = a;
            this.f9840b = b.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f9841c = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                com.bykv.vk.openvk.preload.a.b.a.a(this.f9841c[i10]);
                b.e(this.f9841c[i10]);
                Type[] typeArr3 = this.f9841c;
                typeArr3[i10] = b.a(typeArr3[i10]);
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
            return (Type[]) this.f9841c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f9840b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.f9841c) ^ this.f9840b.hashCode()) ^ b.a((Object) this.a);
        }

        public final String toString() {
            int length = this.f9841c.length;
            if (length == 0) {
                return b.c(this.f9840b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(b.c(this.f9840b));
            sb2.append("<");
            sb2.append(b.c(this.f9841c[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(b.c(this.f9841c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Serializable, WildcardType {
        private final Type a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f9844b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10;
            boolean z11;
            if (typeArr2.length <= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.bykv.vk.openvk.preload.a.b.a.a(z10);
            if (typeArr.length == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            com.bykv.vk.openvk.preload.a.b.a.a(z11);
            if (typeArr2.length == 1) {
                com.bykv.vk.openvk.preload.a.b.a.a(typeArr2[0]);
                b.e(typeArr2[0]);
                com.bykv.vk.openvk.preload.a.b.a.a(typeArr[0] == Object.class);
                this.f9844b = b.a(typeArr2[0]);
                this.a = Object.class;
                return;
            }
            com.bykv.vk.openvk.preload.a.b.a.a(typeArr[0]);
            b.e(typeArr[0]);
            this.f9844b = null;
            this.a = b.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && b.a(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f9844b;
            return type != null ? new Type[]{type} : b.a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public final int hashCode() {
            int i10;
            Type type = this.f9844b;
            if (type != null) {
                i10 = type.hashCode() + 31;
            } else {
                i10 = 1;
            }
            return i10 ^ (this.a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f9844b != null) {
                return "? super " + b.c(this.f9844b);
            }
            if (this.a == Object.class) {
                return "?";
            }
            return "? extends " + b.c(this.a);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0049b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
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
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? AbstractJsonLexerKt.NULL : type.getClass().getName()));
            }
        }
        return (Class) type;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static void e(Type type) {
        com.bykv.vk.openvk.preload.a.b.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
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
        Type b3 = b(type, cls, Map.class);
        return b3 instanceof ParameterizedType ? ((ParameterizedType) b3).getActualTypeArguments() : new Type[]{Object.class, Object.class};
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
                for (int i10 = 0; i10 < length; i10++) {
                    Class<?> cls3 = interfaces[i10];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i10];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i10];
                        superclass = interfaces[i10];
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
        Type b3 = b(type, cls, Collection.class);
        if (b3 instanceof WildcardType) {
            b3 = ((WildcardType) b3).getUpperBounds()[0];
        }
        if (b3 instanceof ParameterizedType) {
            return ((ParameterizedType) b3).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    private static Type a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        TypeVariable typeVariable;
        do {
            int i10 = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type a10 = a(type, cls, (Class<?>) cls2);
                    if (a10 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i10 < length) {
                            if (typeVariable.equals(typeParameters[i10])) {
                                type2 = ((ParameterizedType) a10).getActualTypeArguments()[i10];
                            } else {
                                i10++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type a11 = a(type, cls, componentType, collection);
                        return componentType == a11 ? cls3 : f(a11);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type a12 = a(type, cls, genericComponentType, collection);
                    return genericComponentType == a12 ? genericArrayType : f(a12);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type a13 = a(type, cls, ownerType, collection);
                    boolean z10 = a13 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i10 < length2) {
                        Type a14 = a(type, cls, actualTypeArguments[i10], collection);
                        if (a14 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = a14;
                        }
                        i10++;
                    }
                    return z10 ? new C0049b(a13, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z11 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z11) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type a15 = a(type, cls, lowerBounds[0], collection);
                        type3 = wildcardType;
                        if (a15 != lowerBounds[0]) {
                            return new c(new Type[]{Object.class}, a15 instanceof WildcardType ? ((WildcardType) a15).getLowerBounds() : new Type[]{a15});
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type a16 = a(type, cls, upperBounds[0], collection);
                            type3 = wildcardType;
                            if (a16 != upperBounds[0]) {
                                return new c(a16 instanceof WildcardType ? ((WildcardType) a16).getUpperBounds() : new Type[]{a16}, a);
                            }
                        }
                    }
                }
                return type3;
            }
        } while (type2 != typeVariable);
        return type2;
    }
}
