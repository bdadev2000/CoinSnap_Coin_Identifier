package zg;

import androidx.fragment.app.z;
import com.squareup.moshi.internal.Util$GenericArrayTypeImpl;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import com.squareup.moshi.internal.Util$WildcardTypeImpl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.p;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Set a = Collections.emptySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Type[] f28763b = new Type[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Class f28764c;

    /* renamed from: d, reason: collision with root package name */
    public static final Class f28765d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f28766e;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f28765d = cls;
        f28764c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f28766e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new Util$GenericArrayTypeImpl(a(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof Util$ParameterizedTypeImpl) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new Util$ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type instanceof Util$GenericArrayTypeImpl) {
                return type;
            }
            return new Util$GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (type instanceof Util$WildcardTypeImpl) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new Util$WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static Type c(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean d(Class cls) {
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("androidx.") && !name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    public static z e(String str, String str2, p pVar) {
        String format;
        String z10 = pVar.z();
        if (str2.equals(str)) {
            format = String.format("Required value '%s' missing at %s", str, z10);
        } else {
            format = String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, z10);
        }
        return new z(format);
    }

    public static Type f(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z10;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i10 = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (linkedHashSet.contains(typeVariable)) {
                    return type2;
                }
                linkedHashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type c10 = c(type, cls, cls2);
                    if (c10 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i10 < typeParameters.length) {
                            if (typeVariable.equals(typeParameters[i10])) {
                                type2 = ((ParameterizedType) c10).getActualTypeArguments()[i10];
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
                        Type f10 = f(type, cls, componentType, linkedHashSet);
                        if (componentType != f10) {
                            return new Util$GenericArrayTypeImpl(f10);
                        }
                        return cls3;
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type f11 = f(type, cls, genericComponentType, linkedHashSet);
                    if (genericComponentType != f11) {
                        return new Util$GenericArrayTypeImpl(f11);
                    }
                    return genericArrayType;
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type f12 = f(type, cls, ownerType, linkedHashSet);
                    if (f12 != ownerType) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type f13 = f(type, cls, actualTypeArguments[i10], linkedHashSet);
                        if (f13 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = f13;
                        }
                        i10++;
                    }
                    if (z10) {
                        return new Util$ParameterizedTypeImpl(f12, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                }
                boolean z11 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z11) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type f14 = f(type, cls, lowerBounds[0], linkedHashSet);
                        type3 = wildcardType;
                        if (f14 != lowerBounds[0]) {
                            if (f14 instanceof WildcardType) {
                                typeArr2 = ((WildcardType) f14).getLowerBounds();
                            } else {
                                typeArr2 = new Type[]{f14};
                            }
                            return new Util$WildcardTypeImpl(new Type[]{Object.class}, typeArr2);
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type f15 = f(type, cls, upperBounds[0], linkedHashSet);
                            type3 = wildcardType;
                            if (f15 != upperBounds[0]) {
                                if (f15 instanceof WildcardType) {
                                    typeArr = ((WildcardType) f15).getUpperBounds();
                                } else {
                                    typeArr = new Type[]{f15};
                                }
                                return new Util$WildcardTypeImpl(typeArr, f28763b);
                            }
                        }
                    }
                }
                return type3;
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static void g(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (!(targetException instanceof RuntimeException)) {
            if (targetException instanceof Error) {
                throw ((Error) targetException);
            }
            throw new RuntimeException(targetException);
        }
        throw ((RuntimeException) targetException);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static String h(Type type, Set set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static z j(String str, String str2, p pVar) {
        String format;
        String z10 = pVar.z();
        if (str2.equals(str)) {
            format = String.format("Non-null value '%s' was null at %s", str, z10);
        } else {
            format = String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, z10);
        }
        return new z(format);
    }
}
