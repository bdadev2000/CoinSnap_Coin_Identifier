package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n*E\n"})
/* loaded from: classes4.dex */
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    private final NotNullLazyValue allValueArguments$delegate;

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f21053c;
    private final NullableLazyValue fqName$delegate;
    private final boolean isFreshlySupportedTypeUseAnnotation;
    private final boolean isIdeExternalAnnotation;
    private final JavaAnnotation javaAnnotation;
    private final JavaSourceElement source;
    private final NotNullLazyValue type$delegate;

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext c10, JavaAnnotation javaAnnotation, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f21053c = c10;
        this.javaAnnotation = javaAnnotation;
        this.fqName$delegate = c10.getStorageManager().createNullableLazyValue(new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final FqName invoke() {
                JavaAnnotation javaAnnotation2;
                javaAnnotation2 = LazyJavaAnnotationDescriptor.this.javaAnnotation;
                ClassId classId = javaAnnotation2.getClassId();
                if (classId != null) {
                    return classId.asSingleFqName();
                }
                return null;
            }
        });
        this.type$delegate = c10.getStorageManager().createLazyValue(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SimpleType invoke() {
                LazyJavaResolverContext lazyJavaResolverContext;
                JavaAnnotation javaAnnotation2;
                LazyJavaResolverContext lazyJavaResolverContext2;
                JavaAnnotation javaAnnotation3;
                FqName fqName = LazyJavaAnnotationDescriptor.this.getFqName();
                if (fqName == null) {
                    ErrorTypeKind errorTypeKind = ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION;
                    javaAnnotation3 = LazyJavaAnnotationDescriptor.this.javaAnnotation;
                    return ErrorUtils.createErrorType(errorTypeKind, javaAnnotation3.toString());
                }
                JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
                lazyJavaResolverContext = LazyJavaAnnotationDescriptor.this.f21053c;
                ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, lazyJavaResolverContext.getModule().getBuiltIns(), null, 4, null);
                if (mapJavaToKotlin$default == null) {
                    javaAnnotation2 = LazyJavaAnnotationDescriptor.this.javaAnnotation;
                    JavaClass resolve = javaAnnotation2.resolve();
                    if (resolve != null) {
                        lazyJavaResolverContext2 = LazyJavaAnnotationDescriptor.this.f21053c;
                        mapJavaToKotlin$default = lazyJavaResolverContext2.getComponents().getModuleClassResolver().resolveClass(resolve);
                    } else {
                        mapJavaToKotlin$default = null;
                    }
                    if (mapJavaToKotlin$default == null) {
                        mapJavaToKotlin$default = LazyJavaAnnotationDescriptor.this.createTypeForMissingDependencies(fqName);
                    }
                }
                return mapJavaToKotlin$default.getDefaultType();
            }
        });
        this.source = c10.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.allValueArguments$delegate = c10.getStorageManager().createLazyValue(new Function0<Map<Name, ? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<Name, ? extends ConstantValue<?>> invoke() {
                JavaAnnotation javaAnnotation2;
                ConstantValue resolveAnnotationArgument;
                javaAnnotation2 = LazyJavaAnnotationDescriptor.this.javaAnnotation;
                Collection<JavaAnnotationArgument> arguments = javaAnnotation2.getArguments();
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = LazyJavaAnnotationDescriptor.this;
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                    Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                    }
                    resolveAnnotationArgument = lazyJavaAnnotationDescriptor.resolveAnnotationArgument(javaAnnotationArgument);
                    Pair pair = resolveAnnotationArgument != null ? TuplesKt.to(name, resolveAnnotationArgument) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.toMap(arrayList);
            }
        });
        this.isIdeExternalAnnotation = javaAnnotation.isIdeExternalAnnotation();
        this.isFreshlySupportedTypeUseAnnotation = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor createTypeForMissingDependencies(FqName fqName) {
        ModuleDescriptor module = this.f21053c.getModule();
        ClassId classId = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(fqName)");
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(module, classId, this.f21053c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstantValue<?> resolveAnnotationArgument(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return resolveFromEnumValue(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        }
        if (javaAnnotationArgument instanceof JavaArrayAnnotationArgument) {
            JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
            Name name = javaArrayAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            Intrinsics.checkNotNullExpressionValue(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return resolveFromArray(name, javaArrayAnnotationArgument.getElements());
        }
        if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
            return resolveFromAnnotation(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
        }
        if (!(javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument)) {
            return null;
        }
        return resolveFromJavaClassObjectType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType());
    }

    private final ConstantValue<?> resolveFromAnnotation(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f21053c, javaAnnotation, false, 4, null));
    }

    private final ConstantValue<?> resolveFromArray(Name name, List<? extends JavaAnnotationArgument> list) {
        KotlinType arrayType;
        int collectionSizeOrDefault;
        SimpleType type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        if (KotlinTypeKt.isError(type)) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        Intrinsics.checkNotNull(annotationClass);
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = this.f21053c.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        Intrinsics.checkNotNullExpressionValue(arrayType, "DescriptorResolverUtils.…GUMENT)\n                )");
        List<? extends JavaAnnotationArgument> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue<?> resolveAnnotationArgument = resolveAnnotationArgument((JavaAnnotationArgument) it.next());
            if (resolveAnnotationArgument == null) {
                resolveAnnotationArgument = new NullValue();
            }
            arrayList.add(resolveAnnotationArgument);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    private final ConstantValue<?> resolveFromEnumValue(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    private final ConstantValue<?> resolveFromJavaClassObjectType(JavaType javaType) {
        return KClassValue.Companion.create(this.f21053c.getTypeResolver().transformJavaType(javaType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.fqName$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.isFreshlySupportedTypeUseAnnotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }

    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public JavaSourceElement getSource() {
        return this.source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i10 & 4) != 0 ? false : z10);
    }
}
