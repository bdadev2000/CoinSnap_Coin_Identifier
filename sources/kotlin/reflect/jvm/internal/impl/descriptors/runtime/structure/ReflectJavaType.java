package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes4.dex */
public abstract class ReflectJavaType implements JavaType {
    public static final Factory Factory = new Factory(null);

    /* loaded from: classes4.dex */
    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReflectJavaType create(Type type) {
            ReflectJavaType reflectJavaArrayType;
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    reflectJavaArrayType = new ReflectJavaWildcardType((WildcardType) type);
                } else {
                    reflectJavaArrayType = new ReflectJavaClassifierType(type);
                }
            } else {
                reflectJavaArrayType = new ReflectJavaArrayType(type);
            }
            return reflectJavaArrayType;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.areEqual(getReflectType(), ((ReflectJavaType) obj).getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        Object obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassId classId = ((JavaAnnotation) next).getClassId();
            if (classId != null) {
                obj = classId.asSingleFqName();
            }
            if (Intrinsics.areEqual(obj, fqName)) {
                obj = next;
                break;
            }
        }
        return (JavaAnnotation) obj;
    }

    public abstract Type getReflectType();

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + getReflectType();
    }
}
