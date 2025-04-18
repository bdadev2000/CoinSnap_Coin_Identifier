package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ReflectClassStructure {
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    private final ClassLiteralValue classLiteralValue(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.areEqual(cls, Void.TYPE)) {
                ClassId classId = ClassId.topLevel(StandardNames.FqNames.unit.toSafe());
                Intrinsics.checkNotNullExpressionValue(classId, "topLevel(StandardNames.FqNames.unit.toSafe())");
                return new ClassLiteralValue(classId, i10);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "get(currentClass.name).primitiveType");
            if (i10 > 0) {
                ClassId classId2 = ClassId.topLevel(primitiveType.getArrayTypeFqName());
                Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(primitiveType.arrayTypeFqName)");
                return new ClassLiteralValue(classId2, i10 - 1);
            }
            ClassId classId3 = ClassId.topLevel(primitiveType.getTypeFqName());
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(primitiveType.typeFqName)");
            return new ClassLiteralValue(classId3, i10);
        }
        ClassId classId4 = ReflectClassUtilKt.getClassId(cls);
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        FqName asSingleFqName = classId4.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "javaClassId.asSingleFqName()");
        ClassId mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(asSingleFqName);
        if (mapJavaToKotlin != null) {
            classId4 = mapJavaToKotlin;
        }
        return new ClassLiteralValue(classId4, i10);
    }

    private final void loadConstructorAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        boolean z10;
        Constructor<?>[] constructorArr;
        int i10;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i11 = 0;
        while (i11 < length) {
            Constructor<?> constructor = declaredConstructors[i11];
            Name name = SpecialNames.INIT;
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(constructor, "constructor");
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(name, signatureSerializer.constructorDesc(constructor));
            if (visitMethod == null) {
                constructorArr = declaredConstructors;
                i10 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
                    processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "parameterAnnotations");
                if (parameterAnnotations.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        Annotation[] annotations = parameterAnnotations[i12];
                        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
                        int length4 = annotations.length;
                        int i13 = 0;
                        while (i13 < length4) {
                            Annotation annotation2 = annotations[i13];
                            Class<?> javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i14 = length;
                            ClassId classId = ReflectClassUtilKt.getClassId(javaClass);
                            int i15 = length2;
                            Intrinsics.checkNotNullExpressionValue(annotation2, "annotation");
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i12 + length2, classId, new ReflectAnnotationSource(annotation2));
                            if (visitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, javaClass);
                            }
                            i13++;
                            declaredConstructors = constructorArr2;
                            length = i14;
                            length2 = i15;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length;
                visitMethod.visitEnd();
            }
            i11++;
            declaredConstructors = constructorArr;
            length = i10;
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            Name identifier = Name.identifier(field.getName());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(field.name)");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(field, "field");
            KotlinJvmBinaryClass.AnnotationVisitor visitField = memberVisitor.visitField(identifier, signatureSerializer.fieldDesc(field), null);
            if (visitField != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
                    processAnnotation(visitField, annotation);
                }
                visitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = declaredMethods[i10];
            Name identifier = Name.identifier(method.getName());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(method.name)");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(method, "method");
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, signatureSerializer.methodDesc(method));
            if (visitMethod == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
                    processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    Annotation[] annotations = annotationArr[i11];
                    Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
                    int length3 = annotations.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        Annotation annotation2 = annotations[i12];
                        Class<?> javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation2));
                        ClassId classId = ReflectClassUtilKt.getClassId(javaClass);
                        Method[] methodArr2 = declaredMethods;
                        Intrinsics.checkNotNullExpressionValue(annotation2, "annotation");
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i11, classId, new ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, javaClass);
                        }
                        i12++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                visitMethod.visitEnd();
            }
            i10++;
            declaredMethods = methodArr;
        }
    }

    private final void processAnnotation(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class<?> javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation));
        if (visitAnnotation != null) {
            INSTANCE.processAnnotationArguments(visitAnnotation, annotation, javaClass);
        }
    }

    private final void processAnnotationArgumentValue(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (Intrinsics.areEqual(cls, Class.class)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            annotationArgumentVisitor.visitClassLiteral(name, classLiteralValue((Class) obj));
            return;
        }
        set = ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT;
        if (set.contains(cls)) {
            annotationArgumentVisitor.visit(name, obj);
            return;
        }
        if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            Intrinsics.checkNotNullExpressionValue(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            Name identifier = Name.identifier(((Enum) obj).name());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier((value as Enum<*>).name)");
            annotationArgumentVisitor.visitEnum(name, classId, identifier);
            return;
        }
        if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "clazz.interfaces");
            Class<?> annotationClass = (Class) ArraysKt.single(interfaces);
            Intrinsics.checkNotNullExpressionValue(annotationClass, "annotationClass");
            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(annotationClass));
            if (visitAnnotation == null) {
                return;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Annotation");
            processAnnotationArguments(visitAnnotation, (Annotation) obj, annotationClass);
            return;
        }
        if (cls.isArray()) {
            KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray = annotationArgumentVisitor.visitArray(name);
            if (visitArray == null) {
                return;
            }
            Class<?> componentType = cls.getComponentType();
            int i10 = 0;
            if (componentType.isEnum()) {
                Intrinsics.checkNotNullExpressionValue(componentType, "componentType");
                ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i10 < length) {
                    Object obj2 = objArr[i10];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                    Name identifier2 = Name.identifier(((Enum) obj2).name());
                    Intrinsics.checkNotNullExpressionValue(identifier2, "identifier((element as Enum<*>).name)");
                    visitArray.visitEnum(classId2, identifier2);
                    i10++;
                }
            } else if (Intrinsics.areEqual(componentType, Class.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                while (i10 < length2) {
                    Object obj3 = objArr2[i10];
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                    visitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                    i10++;
                }
            } else if (Annotation.class.isAssignableFrom(componentType)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr3 = (Object[]) obj;
                int length3 = objArr3.length;
                while (i10 < length3) {
                    Object obj4 = objArr3[i10];
                    Intrinsics.checkNotNullExpressionValue(componentType, "componentType");
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation2 = visitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                    if (visitAnnotation2 != null) {
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                        processAnnotationArguments(visitAnnotation2, (Annotation) obj4, componentType);
                    }
                    i10++;
                }
            } else {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr4 = (Object[]) obj;
                int length4 = objArr4.length;
                while (i10 < length4) {
                    visitArray.visit(objArr4[i10]);
                    i10++;
                }
            }
            visitArray.visitEnd();
            return;
        }
        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
    }

    private final void processAnnotationArguments(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                Intrinsics.checkNotNull(invoke);
                Name identifier = Name.identifier(method.getName());
                Intrinsics.checkNotNullExpressionValue(identifier, "identifier(method.name)");
                processAnnotationArgumentValue(annotationArgumentVisitor, identifier, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(Class<?> klass, KotlinJvmBinaryClass.AnnotationVisitor visitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
            processAnnotation(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void visitMembers(Class<?> klass, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        loadMethodAnnotations(klass, memberVisitor);
        loadConstructorAnnotations(klass, memberVisitor);
        loadFieldAnnotations(klass, memberVisitor);
    }
}
